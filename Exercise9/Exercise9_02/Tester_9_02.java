package Exercise9.Exercise9_02;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_9_02
 * 概要 入力された年、月、日を5つのコンストラクタを使用して作成したインスタンスを用いてそれぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/17
 */
public class Tester_9_02 {
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
			if (variableMonth > 12) {
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
	public static int monthMaximumDays(int year, int month) {
		//各月の最大日数を入力した配列を生成
		final int[] monthMaximumDaysArray = {31,(isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//月の最大日数を表す変数に、配列内の対応する月の定数を代入
		int maximumDays = monthMaximumDaysArray[--month];
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
	public static int inputDate(int year, int month) {
		//関数を用いて、入力可能な日付の上限を求める
		int limitDate = monthMaximumDays(year, month);
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
	 * 概要 入力された年、月、日を5つのコンストラクタを使用して作成したインスタンスを用いてそれぞれ表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static void main(String[] args) {
		//日付の入力を促す
		System.out.println("日付を入力してください。");
		//年を表す変数を設定し、関数を用いて正の数で入力させる(int)
		int SubjectYear = inputIntegralNumber("年：");
		//月を表す変数を設定し、関数を用いて月の範囲内で入力させる(int)
		int SubjectMonth = inputMonth();
		//入力された日を表す変数を設定し、年、月に対応した範囲内で入力させる(int)
		int SubjectDate = inputDate(SubjectYear, SubjectMonth);

		//日付の入力を促す
		System.out.println("転写の確認に使用する日付を入力してください。");
		//年を表す変数を設定し、関数を用いて正の数で入力させる(int)
		int originalYear = inputIntegralNumber("年：");
		//月を表す変数を設定し、関数を用いて月の範囲内で入力させる(int)
		int originalMonth = inputMonth();
		//入力された日を表す変数を設定し、年、月に対応した範囲内で入力させる(int)
		int originalDate = inputDate(originalYear, originalMonth);

		//5つのインスタンスの表示を予告
		System.out.println("5つのコンストラクタを用いて作成したインスタンスをそれぞれ表示します。");

		//引数を用いないコンストラクタを使用したことを表示
		System.out.println("① 引数を用いないコンストラクタを使用したインスタンス。");
		//引数なしの場合のコンストラクタを用いてインスタンスを作成(Day)
		Day firstDay = new Day();
		//1つ目のインスタンスを表示
		System.out.println("Day = " + firstDay);

		//年を引数とするコンストラクタを使用したことを表示
		System.out.println("② 年を引数とするコンストラクタを使用したインスタンス。");
		//年のみを引数とした場合のコンストラクタを用いてインスタンスを作成(Day)
		Day secondDay = new Day(SubjectYear);
		//2つ目のインスタンスを表示
		System.out.println("Day = " + secondDay);

		//1つ目のコンストラクタを使用したことを表示
		System.out.println("③ 年と月を引数とするコンストラクタを使用したインスタンス。");
		//年と月を引数とするコンストラクタを用いてインスタンスを作成(Day)
		Day thirdDay = new Day(SubjectYear, SubjectMonth);
		//3つ目のインスタンスを表示
		System.out.println("Day = " + thirdDay);

		//年と月と日を引数とするコンストラクタを使用したことを表示
		System.out.println("④ 年と月と日を引数とするコンストラクタを使用したインスタンス。");
		//年、月、日を引数とした場合のコンストラクタを用いてインスタンスを作成(Day)
		Day fourthDay = new Day(SubjectYear, SubjectMonth, SubjectDate);
		//4つ目のインスタンスを表示
		System.out.println("Day = " + fourthDay);

		//別のインスタンスを引数とするコンストラクタを使用したことを表示
		System.out.println("⑤ 別のインスタンスを引数とするコンストラクタを使用したインスタンス。");
		//別のインスタンスを使用したインスタンスを作成(Day)
		Day originalDay = new Day(originalYear, originalMonth, originalDate);
		//別のインスタンスを使用したインスタンスを表示
		System.out.println("originalDay = " + originalDay);
		//別のインスタンスを引数とするコンストラクタを用いてインスタンスを作成(Day)
		Day fifthDay = new Day(originalDay);
		//5つ目のインスタンスを表示
		System.out.println("cloneDay = " + fifthDay);

	}

}
