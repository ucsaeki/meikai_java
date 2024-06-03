package Exercise9.Exercise9_02;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 TesterClass_9_02
 * 概要 2つの日付を入力して表示し、それぞれの日付と2つ目の日付をコピーした日付が同じかどうかを表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/16
 */
public class TesterClass_9_02 {

	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 正の整数値を入力させるメソッド(int)
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
	 * 概要 月の値(int)を入力させる
	 * 引数 なし
	 * 返り値 月の値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int inputMonth() {
		//入力された月を表す変数を設定(int)
		int variableMonth = 0;
		//1～12月までの値を入力させる
		while (variableMonth <= 0 || variableMonth > 12) {
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
	 * 関数名 inputDate
	 * 概要 年と月に応じた日を入力させる(int)
	 * 引数 年(int)、月(int)
	 * 返り値 日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int inputDate(int year, int month) {

		//入力された日を表す変数を設定(int)
		int variableDate = 0;
		//日の最大値を表す変数を設定(int)
		int limitDate = 0;

		//入力された月が2月の場合
		if (month == 2) {
			//対象の年が閏年の場合
			if (isLeapYear(year) == true) {
				//日の最大値に29日を代入
				limitDate = 29;
				//閏年でない場合
			} else {
				//日の最大値に28日を代入
				limitDate = 28;
			}
			//入力された月が4月、6月、9月、11月のいずれかだった場合
		} else if (month == 4 || month == 6 || month == 9
				|| month == 11) {
			//日の最大値に30日を代入
			limitDate = 30;
			//それ以外の月が入力された場合
		} else {
			//日の最大値に31日を代入
			limitDate = 31;
		}

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
	 * 概要 2つの日付を入力して表示し、それぞれの日付と2つ目の日付をコピーした日付が同じかどうかを表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public static void main(String[] args) {
		//入力を行っていくインスタンスを作成(Day)
		Day firstDay = new Day();
		//インスタンスに代入されている値を表示
		System.out.println("firstDay = " + firstDay);

		//日付の入力を促す
		System.out.println("1つ目の日付を入力してください。");
		//年を表す変数を設定し、正の数で入力させる(int)
		int firstSubjectYear = inputIntegralNumber("年：");
		//インスタンスメソッドを用いて年を表す変数を代入
		firstDay.setYear(firstSubjectYear);
		//現在のフィールドに代入されている値を表示
		System.out.println("firstDay = " + firstDay);

		//関数を用いて月の値を入力させる(int)
		int firstSubjectMonth = inputMonth();
		//インスタンスメソッドを用いて年を表す変数を代入
		firstDay.setMonth(firstSubjectMonth);
		//インスタンスに代入されている値を表示
		System.out.println("firstDay = " + firstDay);

		//入力された日を表す変数を設定(int)
		int firstSubjectDate = inputDate(firstSubjectYear, firstSubjectMonth);
		//インスタンスメソッドを用いて年を表す変数を代入
		firstDay.setDate(firstSubjectDate);
		//インスタンスに代入されている値を表示
		System.out.println("firstDay = " + firstDay);

		
		//日付の入力を促す
		System.out.println("2つ目の日付を入力してください。");

		//入力を行っていくインスタンスを作成(Day)
		Day secondDay = new Day();
		//インスタンスに代入されている値を表示
		System.out.println("secondDay = " + secondDay);

		//年を表す変数を設定し、正の数で入力させる(int)
		int secondSubjectYear = inputIntegralNumber("年：");
		//関数を用いて月の値を入力させる(int)
		int secondSubjectMonth = inputMonth();
		//入力された日を表す変数を設定(int)
		int secondSubjectDate = inputDate(secondSubjectYear, secondSubjectMonth);

		//インスタンスメソッドを用いて、インスタンスに年、月、日を代入
		secondDay.setAllDate(secondSubjectYear, secondSubjectMonth, secondSubjectDate);
		//インスタンスに代入されている値を表示
		System.out.println("secondDay = " + secondDay);

		
		//2日目の日付をコピーしたことを表示
		System.out.println("2つ目の日付をコピーしました。");
		//2日目をコピーした新たなインスタンスを作成(Day)
		Day cloneDay = new Day(secondDay);
		//コピーしたインスタンスに代入されている値を表示
		System.out.println("cloneDay = " + cloneDay);

		//1つ目の日付がコピーした日付と同じ場合
		if (firstDay.equalTo(cloneDay)) {
			//コピーした日付と1つ目の日付が同じであることを表示
			System.out.println("コピーした日付は1つ目の日付と同じです。");
			//1つ目の日付がコピーした日付と異なる場合
		} else {
			//コピーした日付と1つ目の日付が同じではないことを表示
			System.out.println("コピーした日付は1つ目の日付と同じではありません。");
		}

		//2つ目の日付がコピーした日付と同じ場合
		if (secondDay.equalTo(cloneDay)) {
			//コピーした日付と2つ目の日付が同じであることを表示
			System.out.println("コピーした日付は2つ目の日付と同じです。");
			//2つ目の日付がコピーした日付と異なる場合
		} else {
			//コピーした日付と2つ目の日付が同じではないことを表示
			System.out.println("コピーした日付は2つ目の日付と同じではありません。");
		}

	}

}
