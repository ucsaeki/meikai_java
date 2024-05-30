package Exercise10.Exercise10_04;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Ex10_04
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/05/22
 */
public class Ex10_04 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 int型の正の整数値を入力させる
	 * 引数 入力させたいint型の整数値の内容を表すString型の文章
	 * 返り値 int型の正の整数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表すint型変数を設定
		int variableNumber = 0;
		//int型の正の整数値で入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standardInput.nextInt();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 inputMonth
	 * 概要 月を入力させ、範囲外の値が入力された場合に修正する
	 * 引数 なし
	 * 返り値 月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public static int inputMonth() {
		//入力された月を表す変数を設定(int)
		int variableMonth = 0;
		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;
		//月の値の入力を促す
		System.out.print("月：");
		//入力を読み込む
		variableMonth = standardInput.nextInt();
		//入力をされた値が1未満の場合
		if (variableMonth < MONTH_JANUARY) {
			//値を1月に修正
			variableMonth = MONTH_JANUARY;
			//入力された値が12より大きい場合
		} else if (variableMonth > MONTH_DECEMBER) {
			//値を12に修正
			variableMonth = MONTH_DECEMBER;
		}
		//入力された月の値を返却する
		return variableMonth;
	}

	/* 
	 * 関数名 inputDate
	 * 概要 年と月に応じた日を入力させる
	 * 引数 年(int)、月(int)
	 * 返り値 日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public static int inputDate(int variableYear, int variableMonth) {
		//関数を用いて、入力可能な日付の上限を求める
		int limitDate = getMonthMaximumDays(variableYear, variableMonth);
		//日を表す変数を設定
		int variableDate = 0;
		//日の入力を促す
		System.out.print("日：");
		//入力を読み込む
		variableDate = standardInput.nextInt();
		//値が1より小さい場合
		if (variableDate < 1) {
			//値を1日に修正
			variableDate = 1;
			//値がその月の最大日数より大きい場合
		} else if (variableDate > limitDate) {
			//値を月の最大日数に修正
			variableDate = limitDate;
		} //値を返却する
		return variableDate;
	}

	/* 
	 * 関数名 inputDay
	 * 概要 日付を入力させる
	 * 引数 日付を表す文字列(String)
	 * 返り値 日付(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */

	public static Day inputDay(String targetSubject) {
		//入力させたい値の内容を表示
		System.out.println(targetSubject);
		//年を表す変数を設定し、関数を用いて正の数で入力させる(int)
		int variableYear = inputIntegralNumber("年：");
		//月を表す変数を設定し、関数を用いて月の範囲内で入力させる(int)
		int variableMonth = inputMonth();
		//入力された日を表す変数を設定し、年、月に対応した範囲内で入力させる(int)
		int variableDate = inputDate(variableYear, variableMonth);
		//入力された年、月、日を用いてインスタンスを作成(Day)
		Day variableDay = new Day(variableYear, variableMonth, variableDate);
		//作成した日付を返却
		return variableDay;
	}

	/* 
	 * 関数名 isLeap
	 * 概要 対象の年が閏年かどうかを判断するメソッド
	 * 引数 年(int)
	 * 返り値 閏年の場合true、そうでない場合false(boolean)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public static boolean isLeap(int variableYear) {
		//対象の年が閏年の条件に当てはまる場合true、そうでない場合falseを返却する
		return (variableYear % 4 == 0 && (variableYear % 100 != 0 || variableYear % 400 == 0) ? true : false);
	}

	/* 
	 * 関数名 monthMaximumDays
	 * 概要 引数の年と月に応じた月の最大日数を求めて返却する
	 * 引数 年(int)、月(int)
	 * 返り値 月の最大日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int getMonthMaximumDays(int variableYear, int variableMonth) {
		//各月の最大日数を入力した配列を生成
		final int[] monthMaximumDaysArray = { 31, (isLeap(variableYear) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31 };
		//月の最大日数を表す変数に、配列内の対応する月の定数を代入
		int maximumDays = monthMaximumDaysArray[--variableMonth];
		//月の最大日数を表す変数を返却
		return maximumDays;
	}

	/* 
	 * 関数名 main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static void main(String[] args) {
		//引数を入力しない変数を設定(Day)
		Day nothingArgment = new Day();
		//引数を設定しないDay型変数を表示
		System.out.println("引数なしで作成したインスタンス：" + nothingArgment);

		//指定された日付までの年内の経過日数の表示を予告し、宣言した日付を表す変数に入力させる(Day)
		Day alreadyGoesOnDaysInYear = new Day(inputDay("年内の経過日数を表示するための日付を入力してください。"));
		//年始からの経過日数を求める関数を用いて経過日数を表示
		System.out.println("年始からの経過日数は "
				+ alreadyGoesOnDaysInYear.countDateFromThisYearStarting(alreadyGoesOnDaysInYear) + "日です。");

		//指定された日付から年内の残り日数の表示を予告し、宣言した日付を表す変数に入力させる(Day)
		Day DaysStillLeftInYear = new Day(inputDay("年内の残り日数を表示するための日付を入力してください。"));
		//年内の残り日数を表示
		System.out.println("年始からの経過日数は " + DaysStillLeftInYear.countDateUntilNextYear(DaysStillLeftInYear) + "日です。");

		
		
		//対象の日付と他の日付の前後関係の表示を予告
		System.out.println("対象の日付と他の日付の前後関係を表示します。");
		//対象の日付を表すインスタンスを宣言し、入力させる。(Day)
		Day targetDay = new Day(inputDay("対象の日付を入力してください。"));
		//他の日付を表すインスタンスを宣言し、入力させる。(Day)
		Day anotherDay = new Day(inputDay("他の日付を入力してください。"));
		//対象の日付と他の日付の前後関係を表示
		targetDay.daysRelation("対象の日付", anotherDay, "他の日付");

		//二つの日付の前後関係を表示することを予告
		System.out.println("二つの日付の前後関係を表示します。");
		//一つ目の日付を表すインスタンスを設定し、入力させる(Day)
		Day firstDay = new Day(inputDay("一つ目の日付を入力してください。"));
		//二つ目の日付を表すインスタンスを設定し、入力させる(Day)
		Day secondDay = new Day(inputDay("二つ目の日付を入力してください。"));
		//二つの日付の前後関係を表示
		Day.daysRelation(firstDay, "一つ目の日付", secondDay, "二つ目の日付");

		
		
		//一つ後ろに進めたい日付を表すインスタンスを設定し、入力させる(Day)
		Day fewDownDay = new Day(inputDay("一つ後ろに進めたい日付を入力してください。"));
		//インスタンスに一つ後ろに進めた日付をセットする
		fewDownDay.setDayAfter(fewDownDay);
		//一つ後ろに進めた日付をセットしたインスタンスを表示。
		System.out.println("一つ後ろに進めた日付は、" + fewDownDay + "です。");

		//次の日の日付を表示したい日付を表すインスタンスを宣言し、入力させる(Day)
		Day nextDay = new Day(inputDay("次の日の日付を求めたい日付を入力してください。"));
		//次の日の日付を表示。
		System.out.println("次の日の日付は" + nextDay.goAfterDay() + "です。");

		
		
		//一つ前に戻したい日付を表すインスタンスを設定し、入力させる(Day)
		Day fewUpDay = new Day(inputDay("一つ前に戻したい日付を入力してください。"));
		//インスタンスに一つ前に戻した日付をセットする
		fewUpDay.setDayBefore(fewUpDay);
		//一つ前に戻した日付をセットしたインスタンスを表示。
		System.out.println("一つ後ろに進めた日付は、" + fewUpDay + "です。");

		//前の日の日付を表示したい日付を表すインスタンスを宣言し、入力させる(Day)
		Day beforeDay = new Day(inputDay("前の日の日付を求めたい日付を入力してください。"));
		///前の日の日付を表示。
		System.out.println("前の日の日付は" + beforeDay.goBeforeDay() + "です。");

		
		
		//指定した日数分進めたい日付を表すインスタンスを設定し、入力させる(Day)
		Day multipleDownDay = new Day(inputDay("後ろに進めたい日付を入力してください。"));
		//後ろに進めたい日数を入力させる
		int moveOnDate = inputIntegralNumber("進めたい日数：");
		//インスタンスに指定された日数後ろに進めた日付をセットする
		multipleDownDay.setMultipulAfterDay(multipleDownDay, moveOnDate);
		///後ろに進めた日付をセットしたインスタンスを表示。
		System.out.println( moveOnDate + "日分後ろに進めた日付は、" + multipleDownDay + "です。");

		//指定した日数分経過した日付を表示したい日付を表すインスタンスを宣言し、入力させる(Day)
		Day multipulAfterDay = new Day(inputDay("もとの日付を入力してください。"));
		//経過させる日数を入力させる
		moveOnDate = inputIntegralNumber("経過させる日数：");
		//指定された日数分経過させた日付を表示。
		System.out.println("もとの日付の" + moveOnDate + "日後の日付は"
				+ multipulAfterDay.goMultipulAfterDay(multipulAfterDay, moveOnDate) + "です。");

		
		
		
		//指定した日数分前に戻したい日付を表すインスタンスを設定し、入力させる(Day)
		Day multipleUpDay = new Day(inputDay("前に戻したい日付を入力してください。"));
		//前に戻したい日数を入力させる
		int turnBackDate = inputIntegralNumber("戻したい日数：");
		//インスタンスに指定された日数前に戻した日付をセットする
		multipleUpDay.setMultipulAfterDay(multipleUpDay, turnBackDate);
		//前に戻した日付をセットしたインスタンスを表示。
		System.out.println(turnBackDate + "日数分前に戻した日付は、" + multipleUpDay + "です。");
		
		//指定した日数分さかのぼった日付を表示したい日付を表すインスタンスを宣言し、入力させる(Day)
		Day multipulBeforeDay = new Day(inputDay("もとの日付を入力してください。"));
		//さかのぼりたい日数を入力させる
		turnBackDate = inputIntegralNumber("さかのぼる日数：");
		//指定された日数分さかのぼった日付を表示。
		System.out.println("もとの日付の" + turnBackDate + "日前の日付は"
					+ multipulBeforeDay.goMultipulAfterDay(multipulBeforeDay, turnBackDate) + "です。");

		
		
		
		
		System.out.println();
	}

}
