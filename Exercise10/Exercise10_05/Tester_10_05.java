package Exercise10.Exercise10_05;
//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_10_05
 * 概要 入力された口座情報を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/27
 */
public class Tester_10_05 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

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
	 * 関数名 isYes
	 * 概要 Yesが選択されたかどうかを判定する
	 * 引数 回答させたい内容(String)
	 * 返り値 Yes(true)、No(false)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public static boolean isYes(String targetSubject) {
		//Yesを選択したことを表す変数にtrueを代入(boolean)
		boolean yesChoose = true;
		//入力された値を表す変数を設定(int)
		int variableNumber = 0;
		//Yesを選んだことを表す定数を設定(int)
		final int CHOOSE_YES = 1;
		//Noを選んだことを表す定数を設定(int)
		final int CHOOSE_NO = 0;

		//YesかNoで回答させる
		while (true) {
			//回答させたい内容を表示
			System.out.print(targetSubject + "Yes…1/No…0：");
			//入力された値を読み込む
			variableNumber = standardInput.nextInt();
			//入力された値がYesNoを表す定数以外だった場合
			if (variableNumber != CHOOSE_YES && variableNumber != CHOOSE_NO) {
				//正しい数値での入力を求めるエラー文を表示
				System.out.println("0か1を入力してください。");
				//Noが回答された場合
			} else if (variableNumber == CHOOSE_NO) {
				//Yesを入力したことを表す変数にfalseを代入
				yesChoose = false;
				//繰り返しを終了する
				break;
				//Yesが選択された場合
			} else {
				//繰り返しを終了する
				break;
			}
		} //回答を返却
		return yesChoose;
	}

	/* 
	 * 関数名 main
	 * 概要 入力された口座情報を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public static void main(String[] args) {
		//口座開設の継続を判断する変数がtrueの間、口座開設を行う
		while (true) {
			//利用者の情報入力を促す
			System.out.println("あなたの情報を入力してください。");

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
			//改行する
			System.out.println();
			
			//入力された情報を使用してインスタンスを作成(Account)
			Account yourAccount = new Account(yourName, yourNumber, yourBalance);

			//情報を表示することを予告
			System.out.println("入力された個人情報を表示します。");
			//インスタンスの情報を表示
			System.out.println(yourAccount);

			//口座開設の継続が選択された場合
			if (isYes("口座開設を継続しますか。")) {
				//もう一度繰り返す
				continue;
				//開設終了が選択された場合
			} else {
				//繰り返しを終了する
				break;
			}
		}
		//口座開設終了を表示。
		System.out.println("入力を終了します。");

	}

}
