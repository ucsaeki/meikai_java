package Exercise9.Exercise9_05;

import java.util.Scanner;

/* 
 * クラス名 Tester_9_05
 * 概要 開始日と終了日を入力させて表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/21
 */
public class Tester_9_05 {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 正の整数値を入力させるメソッド
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 正の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表す変数を設定(int)
		int variableNumber = 0;
		//正の整数値で入力させる
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
	 * 関数名 isLeapYear
	 * 概要 対象の年が閏年かどうかを判断するメソッド
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
	 * 概要 月を入力させるメソッド
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
	 * 概要 引数の年と月に応じた月の最大日数を求めて返却するメソッド
	 * 引数 年(int)、月(int)
	 * 返り値 月の最大日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int monthMaximumDays(int variableYear, int variableMonth) {
		//各月の最大日数を入力した配列を生成
		final int[] monthMaximumDaysArray = { 31, (isLeapYear(variableYear) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30,
				31 };
		//月の最大日数を表す変数に、配列内の対応する月の定数を代入
		int maximumDays = monthMaximumDaysArray[--variableMonth];
		//月の最大日数を表す変数を返却
		return maximumDays;
	}

	/* 
	 * 関数名 inputDate
	 * 概要 年と月に応じた日を入力させるメソッド
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
	 * 概要 開始日と終了日を入力させ、表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public static void main(String[] args) {

		//日付の入力を促す
		System.out.println("開始日を入力してください。");
		//年を表す変数を設定し、正の数で入力させる(int)
		int startYear = inputIntegralNumber("年：");
		//月を表す変数を設定し、月の範囲内で入力させる(int)
		int startMonth = inputMonth();
		//日を表す変数を設定し、年、月に対応した範囲内で入力させる(int)
		int startDate = inputDate(startYear, startMonth);
		//開始日を表すDay型のインスタンスを作成
		Day startDay = new Day(startYear, startMonth, startDate);

		//終了日の入力を促す
		System.out.println("終了日を入力してください。");
		//終了日の年数を表す変数を設定(int)
		int endYear = 0;
		//終了日の月数を表す変数を設定(int)
		int endMonth = 0;
		//終了日の日数を表す変数を設定(int)
		int endDate = 0;
		
		//開始日以後の月数を入力させる
		for (; endYear < startYear;) {
			//終了日の年数を入力させる
			endYear = inputIntegralNumber("年：");
			//終了日の年数が開始日の年数より前の場合
			if (endYear < startYear) {
				//開始日以後の日付の入力を求めるエラー文章を表示
				System.out.println(startYear + "以後の年数を入力してください。");
			}
		}
		
		//開始日と終了日の年数が同じ場合
		if (startYear == endYear) {
			//開始日の月以後の月を入力させる
			for (; endMonth < startMonth;) {
				//終了日の月を表す変数に入力
				endMonth = inputMonth();
				//終了日の月が開始日の月より前の場合
				if (endMonth < startMonth) {
					//開始日の月以後の月の入力を求めるエラー文章を表示
					System.out.println(startMonth + "～12月までの月数を入力してください。");
				}
			}
			//終了日を表す変数に入力させる
			endDate = inputDate(endYear, endMonth);
			//開始日の日数以後の日数を入力させる
			for (;endDate < startDate;)
			//終了日の日数が開始日の日数より前の場合
			if( endDate < startDate) {
				//開始日以後の日数の入力を求めるエラー文章を表示
				System.out.println(startDate + "以後の日数を入力してください。");
				//終了日の日数を表す変数に入力させる
				endDate = inputDate(endYear, endMonth);
			}
			
		//開始日と終了日の年数が異なる場合
		}else {
			//終了日の月を表す変数に入力
			endMonth = inputMonth();
			//終了日の日数を表す変数に入力
			endDate = inputDate(endYear, endMonth);
		}
		
		//終了日を表すDay型のインスタンスを作成
		Day endDay = new Day(endYear, endMonth, endDate);
		//開始日と終了日を格納したPeriod型のインスタンスを作成
		Period variablePeriod = new Period(startDay, endDay);

		//開始日と終了日を表示することを予告
		System.out.println("開始日と終了日を表示します。");
		//開始日と終了日を表示
		System.out.println(variablePeriod);

	}

}
