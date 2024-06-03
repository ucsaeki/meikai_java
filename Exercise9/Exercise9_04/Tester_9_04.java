package Exercise9.Exercise9_04;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_9_04
 * 概要 人間の情報を入力して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/20
 */
public class Tester_9_04 {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);
	/* 
	 * 関数名 inputWihinZeroNumber
	 * 概要 0以上の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 0以上の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public static int inputWihinZeroNumber(String targetSubject) {
		//入力された値を表す変数を設定(int)
		int variableNumber = 0;
		//0以上の値を入力をさせる
		while (true) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standerdInput.nextInt();
			//入力された値が0未満だった場合
			if (variableNumber < 0) {
				//0以上の整数値の入力を求めるエラー文を表示
				System.out.println("0以上の整数値を入力してください。");
				//0以上の整数値が入力された場合
			} else {
				//繰り返しを終了
				break;
			}
		} //入力された値を返却
		return variableNumber;
	}

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
			variableNumber = standerdInput.nextInt();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 inputRealNumber
	 * 概要 double型の正の実数値を入力させる
	 * 引数 入力させたいdouble型実数値の内容を表すString型の文章
	 * 返り値 double型の正の実数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static double inputRealNumber(String targetSubject) {
		//入力された値を表すdouble型変数を設定
		double variableNumber = 0;
		//正の実数値で入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standerdInput.nextDouble();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の実数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 isLeapYear
	 * 概要 対象の年が閏年かどうかを判断する
	 * 引数 年(int)
	 * 返り値 true、false(boolean)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public static boolean isLeapYear(int variableYear) {
		//閏年かどうかを判定する変数にfalseを初期値として入力(boolean)
		boolean leapJudge = false;
		//対象の年が4で割り切れる場合
		if (variableYear % 4 == 0) {
			//閏年を判定する変数にtrueを代入
			leapJudge = true;
			//対象の年が100で割り切れる場合
			if (variableYear % 100 == 0) {
				//閏年を判定する変数にfalseを代入
				leapJudge = false;
				//対象の年が400で割り切れる場合
				if (variableYear % 400 == 0) {
					//閏年を判定する変数にtrueを代入
					leapJudge = true;
				}
			}
		}
		//閏年を判定する変数を返却
		return leapJudge;
	}

	/* 
	 * 関数名 inputMonth
	 * 概要 月を入力させる
	 * 引数 なし
	 * 返り値 月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int inputMonth() {
		//入力された月を表す変数を設定(int)
		int variableMonth = 0;
		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;

		//1～12月までの値を入力させる
		while (variableMonth < MONTH_JANUARY || variableMonth > MONTH_DECEMBER) {
			//変数に正の整数値を入力させる(int)
			variableMonth = inputIntegralNumber("月：");
			//入力値が12より大きい場合
			if (variableMonth > MONTH_DECEMBER) {
				//1～12までの値での入力を求めるエラー文章を表示
				System.out.println("1～12までの整数で入力してください。");
			}
		}
		//入力された月の値を返却する
		return variableMonth;
	}

	/* 
	 * 関数名 monthMaximumDays
	 * 概要 引数の年と月に応じた月の最大日数を求めて返却する
	 * 引数 年(int)、月(int)
	 * 返り値 月の最大日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int monthMaximumDays(int variableYear, int variableMonth) {
		//各月の最大日数を入力した配列を生成
		final int[] monthMaximumDaysArray = { 31, (isLeapYear(variableYear) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31 };
		//月の最大日数を表す変数に、配列内の対応する月の定数を代入
		int maximumDays = monthMaximumDaysArray[--variableMonth];
		//月の最大日数を表す変数を返却
		return maximumDays;
	}

	/* 
	 * 関数名 inputDate
	 * 概要 年と月に応じた日を入力させる
	 * 引数 年(int)、月(int)
	 * 返り値 日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int inputDate(int variableYear, int variableMonth) {
		//関数を用いて、入力可能な日付の上限を求める
		int limitDate = monthMaximumDays(variableYear, variableMonth);
		//日を表す変数を設定
		int variableDate = 0;

		//1からその月の最大値までの値を入力させる
		while (variableDate <= 0 || variableDate > limitDate) {
			//変数に正の整数値を入力させる(int)
			variableDate = inputIntegralNumber("日：");
			//入力値がその月より大きい場合
			if (variableDate > limitDate) {
				//1～12までの値での入力を求めるエラー文章を表示
				System.out.println("1～" + limitDate + "までの整数で入力してください。");
			}
		}
		//入力された日を返却
		return variableDate;
	}

	/* 
	 * 関数名 main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public static void main(String[] args) {
		//1人目の情報の入力を促す
		System.out.println("あなたの情報を入力してください。");
		//名前の入力を促す
		System.out.print("名前：");
		//String型の変数に入力を読み込む
		String peopleName = standerdInput.next();
		//double型の正の実数で身長を入力させる
		double peopleHeight = inputRealNumber("身長(mm)：");
		//double型の正の実数で体重を入力させる
		double peopleWeight = inputRealNumber("体重(kg)：");
		//int型の正の整数で年齢を入力させる
		int peopleAge = inputWihinZeroNumber("年齢：");
		//性別の入力を促す
		System.out.print("性別：");
		//String型の変数に入力を読み込む
		String peopleGender = standerdInput.next();

		//誕生日の入力を促す
		System.out.print("誕生日・");
		//年を表す変数を設定し、関数を用いて正の数で入力させる(int)
		int yearBirthday = inputIntegralNumber("年：");
		//月を表す変数を設定し、関数を用いて月の範囲内で入力させる(int)
		int monthBirthday = inputMonth();
		//入力された日を表す変数を設定し、年、月に対応した範囲内で入力させる(int)
		int dateBirthday = inputDate(yearBirthday, monthBirthday);
		//入力された年、月、日を用いてインスタンスを作成(Day)
		Day yourBirthday = new Day(yearBirthday, monthBirthday, dateBirthday);
		//入力された情報を用いて、Human型のインスタンスを作成
		Human yourHuman = new Human(peopleName,peopleHeight,peopleWeight,peopleAge,peopleGender,yourBirthday);
		//入力された情報を表示
		System.out.println(yourHuman);

	}

}
