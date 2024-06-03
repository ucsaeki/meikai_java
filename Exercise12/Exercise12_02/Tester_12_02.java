package Exercise12.Exercise12_02;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_12_02
 * 概要 三つの口座を作成し、一つ目と二つ目、一つ目と三つ目の総預金残高を比較した結果をそれぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/28
 */
public class Tester_12_02 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	//一つ目の預金額の方が大きい場合を表す定数を設定
	final static int FIRST_BIGGER = 1;
	//二つの預金額が同じ場合を表す定数を設定
	final static int FIRST_EQUAL_SECOND = 0;
	//二つ目の預金額の方が大きい場合を表す定数を設定
	final static int SECOND_BIGGER = -1;

	/* 
	 * 関数名 compBalance
	 * 概要 二つの銀行口座の総預金残高を比較し、結果に応じた値を返却する
	 * 引数 比較する二つの銀行口座(Account)
	 * 返り値 一つ目の方が大きい場合1、二つ目の方が大きい場合-1、同じ場合0(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public static int compBalance(Account firstAccount, Account secondAccount) {
		//一つ目の口座に定期預金があるか確認し、ある場合全額普通預金に移す。
		judgeTimeAccount(firstAccount);
		//二つ目の口座に定期預金があるか確認し、ある場合全額普通預金に移す。
		judgeTimeAccount(secondAccount);

		//二つの金額を比較した結果を表す変数を設定
		int comperisonBalance = 0;

		//二つの口座の預金残高と定期預金残高の合計金額が同じ場合
		if (firstAccount.getBalance() == secondAccount.getBalance()) {
			//比較した結果を表す変数に0を代入
			comperisonBalance = FIRST_EQUAL_SECOND;
			//預金残高と定期預金残高の合計金額が異なる場合
		} else {
			//合計金額が高いほうに応じた値を、比較の結果を表す変数に代入
			comperisonBalance = (firstAccount.getBalance() > secondAccount.getBalance() ? FIRST_BIGGER : SECOND_BIGGER);
		}
		//比較の結果を表す変数を返却
		return comperisonBalance;
	}

	/* 
	 * 関数名 judgeTimeAccount
	 * 概要 銀行口座が定期預金を持つかどうかを判定し、定期預金を持つ場合それを解約して全額普通預金に移す
	 * 引数 判定したい銀行口座(Account)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public static void judgeTimeAccount(Account vriableAccount) {
		//銀行口座が定期預金を持つ場合
		if (vriableAccount instanceof TimeAccount) {
			//定期預金を解約して普通預金に全額加算する
			((TimeAccount) vriableAccount).cancelTimeBalance();
		}
	}

	/* 
	 * 関数名 printCompareResalt
	 * 概要 二つの口座を比較し、口座残高が大きいほうの口座を表示する
	 * 引数 比較する二つの口座(Account)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public static void printCompareResalt(Account firstAccount, Account secondAccount) {
		//二つの銀行口座の情報を比較し、預金残高に応じて返却された数値に応じて分岐
		switch (compBalance(firstAccount, secondAccount)) {
		
		//引数に一つ目の口座残高の方が大きいことを表す定数が渡された場合
		case FIRST_BIGGER:
			//一つ目の残高の方が大きいことを表示
			System.out.println(firstAccount.getName() + "の方が残高が大きいです。");
			//分岐を脱出
			break;

		//引数に二つの口座残高が同じであることを表す定数が渡された場合
		case FIRST_EQUAL_SECOND:
			//二つの口座の残高は同じことを表示
			System.out.println(firstAccount.getName() + "と" + secondAccount.getName() + "の口座残高は同じです。");
			//分岐を脱出
			break;

		//引数に二つ目の口座残高の方が大きいことを表す定数が渡された場合
		case SECOND_BIGGER:
			//二つ目の残高の方が大きいことを表示
			System.out.println(secondAccount.getName() + "の方が残高が大きいです。");
			//分岐を脱出
			break;
		}
	}

	/* 
	 * 関数名 inputLongNumber
	 * 概要 0以上の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 0以上の整数値(long)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public static long inputLongNumber(String targetSubject) {
		//入力された値を表す変数を設定(long)
		long variableNumber = 0;
		//0以上の値を入力をさせる
		while (true) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standardInput.nextLong();
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
	 * 関数名 inputAccount
	 * 概要 銀行口座の情報を入力させる
	 * 引数 なし
	 * 返り値 作成した銀行口座のインスタンス(Account)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public static Account inputAccount() {
		//名前の入力を促す(String)
		System.out.print("口座名義：");
		//入力を読み込む
		String yourName = standardInput.next();
		//利用者番号の入力を促す(String)
		System.out.print("口座番号：");
		//入力を読み込む
		String yourNumber = standardInput.next();
		//預金残高を0以上の整数値で入力させる(long)
		long yourBalance = inputLongNumber("預金残高：");

		//入力された情報を使用してインスタンスを作成(Account)
		Account yourAccount = new Account(yourName, yourNumber, yourBalance);
		//作成したインスタンスを返却
		return yourAccount;
	}

	/* 
	 * 関数名 inputAccountFull
	 * 概要 定期預金残高を含む銀行口座の情報を入力させる
	 * 引数 なし
	 * 返り値 作成した定期預金残高を含む銀行口座のインスタンス(BalanceAccount)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public static TimeAccount inputAccountFull() {
		//名前の入力を促す(String)
		System.out.print("口座名義：");
		//入力を読み込む
		String yourName = standardInput.next();
		//利用者番号の入力を促す(String)
		System.out.print("口座番号：");
		//入力を読み込む
		String yourNumber = standardInput.next();
		//預金残高を0以上の整数値で入力させる(long)
		long yourBalance = inputLongNumber("預金残高：");
		//定期預金残高を0以上の整数値で入力させる
		long yourTimeDeposit = inputLongNumber("定期預金残高：");

		//入力された情報を使用してインスタンスを作成(Account)
		TimeAccount yourAccount = new TimeAccount(yourName, yourNumber, yourBalance, yourTimeDeposit);
		//作成したインスタンスを返却
		return yourAccount;

	}

	/* 
	 * 関数名 main
	 * 概要 三つの口座を作成し、一つ目と二つ目、一つ目と三つ目の預金残高を比較した結果をそれぞれ表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public static void main(String[] args) {
		//一人目の銀行口座情報の入力を促す
		System.out.println("一人目の口座情報を入力してください(定期預金あり)。");
		//一人目の銀行口座の情報を入力させ、インスタンスを作成
		TimeAccount firstAccount = inputAccountFull();
		//二人目の銀行口座情報の入力を促す
		System.out.println("二人目の口座情報を入力してください(定期預金あり)。");
		//一人目の銀行口座の情報を入力させ、インスタンスを作成
		TimeAccount secondAccount = inputAccountFull();
		//三人目の銀行口座情報の入力を促す
		System.out.println("三人目の口座情報を入力してください(定期預金なし)。");
		//一人目の銀行口座の情報を入力させ、インスタンスを作成
		Account thirdAccount = inputAccount();
		//三人目の銀行口座情報の入力を促す
		System.out.println("四人目の口座情報を入力してください(定期預金なし)。");
		//一人目の銀行口座の情報を入力させ、インスタンスを作成
		Account fourthAccount = inputAccount();

		//一人目の口座情報を表示
		System.out.println("一人目の口座情報" + firstAccount);
		//改行する
		System.out.println();
		//二人目の口座情報を表示
		System.out.println("二人目の口座情報" + secondAccount);
		//改行する
		System.out.println();
		//三人目の口座情報を表示
		System.out.println("三人目の口座情報" + thirdAccount);
		//改行する
		System.out.println();
		//四人目の口座情報を表示
		System.out.println("四人目の口座情報" + fourthAccount);
		//改行する
		System.out.println();

		//一人目と二人目の比較を行うことを予告
		System.out.println("一人目と二人目の口座残高の比較を行いました(定期預金あり×あり)。");
		//二つの口座の預金残高が多いほうを表示
		printCompareResalt(firstAccount, secondAccount);

		//一人目と三人目の比較を行うことを予告
		System.out.println("一人目と三人目の口座残高の比較を行いました(定期預金あり×なし)。");
		//二つの口座の預金残高が多いほうを表示
		printCompareResalt(firstAccount, thirdAccount);

		//三人目と四人目の比較を行うことを予告
		System.out.println("三人目と四人目の口座残高の比較を行いました(定期預金なし×なし)。");
		//二つの口座の預金残高が多いほうを表示
		printCompareResalt(thirdAccount, fourthAccount);

	}

}
