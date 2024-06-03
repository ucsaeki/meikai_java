package Exercise9.Exercise9_03;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 TesterClass_9_03
 * 概要 口座の利用者情報を登録し、入金と出金を行う
 * 作成者 Y.Saeki
 * 作成日 2024/05/20
 */
public class TesterClass_9_03 {

	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputLongNumber
	 * 概要 0以上の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 0以上の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public static long inputLongNumber(String targetSubject) {
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
	 * 概要 正の整数値を入力させる
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
	 * 概要 口座の利用者情報を登録し、入金と出金を行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */

	public static void main(String[] args) {
		//利用者の情報入力を促す
		System.out.println("あなたの情報を入力してください。");

		//名前の入力を促す(String)
		System.out.print("口座名義：");
		//入力を読み込む
		String yourName = standerdInput.next();
		//利用者番号の入力を促す(String)
		System.out.print("口座番号：");
		//入力を読み込む
		String yourNumber = standerdInput.next();
		//預金残高を0以上の整数値で入力させる(long)
		long yourBalance = inputLongNumber("預金残高：");

		//口座開設日の入力を促す
		System.out.print("口座開設日・");
		//年を表す変数を設定し、関数を用いて正の数で入力させる(int)
		int SubjectYear = inputIntegralNumber("年：");
		//月を表す変数を設定し、関数を用いて月の範囲内で入力させる(int)
		int SubjectMonth = inputMonth();
		//入力された日を表す変数を設定し、年、月に対応した範囲内で入力させる(int)
		int SubjectDate = inputDate(SubjectYear, SubjectMonth);

		//入力された年、月、日を用いてインスタンスを作成(Day)
		Day userAccountOpendDate = new Day(SubjectYear, SubjectMonth, SubjectDate);
		//入力された情報を使用してインスタンスを作成(Account)
		Account yourAccount = new Account(yourName, yourNumber, yourBalance, userAccountOpendDate);

		//情報を表示することを予告
		System.out.println("入力された情報を表示します。");
		//インスタンスの情報を表示
		System.out.println(yourAccount);

		//入金することを表す定数を設定
		final int MONEY_DEPOSIT = 1;
		//出金することを表す定数を設定
		final int MONEY_WITHDRAW = 2;
		//プログラムを終了させることを表す定数を設定
		final int EXIT_ROOP = 0;

		outer: while (true) {
			//行動の選択肢を表示
			System.out.print("何を行いますか。1…入金/2…出金/0…終了:");
			//行動を表す変数を設定
			long bankJudge = standerdInput.nextInt();
			//0～2までの値を入力させる
			for (; bankJudge < EXIT_ROOP || bankJudge > MONEY_WITHDRAW;) {
				//入力された値が2より大きい場合
				if (bankJudge > MONEY_WITHDRAW) {
					//0～2までの値を入力させる
					System.out.println("0～2までの値を入力してください。");
					//関数を用いて0以上の整数を入力させる。
					bankJudge = inputLongNumber("1…入金/2…出金/0…終了");
				}
			}
			//1が選択された場合
			if (bankJudge == MONEY_DEPOSIT) {
				//入金額を正の数で入力させる
				long depositAmount = inputLongNumber("入金する金額：");
				//預金残高に指定された金額を足す
				yourAccount.depositMoney(depositAmount);
				//入金後の預金残高を表示
				System.out.println("入金しました。");
				//入金後の利用者情報を表示
				System.out.println(yourAccount);

			//2が選択された場合
			} else if (bankJudge == MONEY_WITHDRAW) {
				//出金額を表す変数を設定
				long depositAmount = 0;
				//預金残高の範囲内の金額を入力させる
				Inner: while (true) {
					//出金額を正の数で入力させる
					depositAmount = inputLongNumber("出金する金額：");
					//出金額が預金残高を越える場合
					if (depositAmount > yourAccount.getBalance()) {
						//預金残高以下の値を入力するよう求めるエラー文章を表示
						System.out.println("引き出せません。" + yourAccount.getBalance() + "円以下の値を入力してください。");
						//預金残高の範囲内の金額が入力された場合
					} else {
						//繰り返しを終了
						break Inner;
					}
				}
				//預金残高から指定された金額を引く
				yourAccount.withdrawMoney(depositAmount);
				//出金後の預金残高を表示
				System.out.println("出金しました。");
				//出金後の利用者情報を表示
				System.out.println(yourAccount);
			//0が選択された場合
			} else {
				//繰り返しを終了
				break outer;
			}
		}
		//プログラムの終了を表示
		System.out.println("終了しました。");

	}

}
