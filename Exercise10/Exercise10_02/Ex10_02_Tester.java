package Exercise10.Exercise10_02;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Ex10_01_Tester
 * 概要 入力した人数分の識別番号を発行し、それを表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/21
 */
public class Ex10_02_Tester {

	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 正の整数値を入力させる
	 * 引数 入力させたいint型の整数値の内容を表す文章(String)
	 * 返り値 正の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表す変数を設定(int)
		int variableNumber = 0;
		//正の整数値を入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表す文字列を表示
			System.out.print(targetSubject);
			//入力を読み込む
			variableNumber = standerdInput.nextInt();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//正の整数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
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
			variableNumber = standerdInput.nextInt();
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
	 * 概要 入力した人数分、指定した数ずつ増える識別番号を発行し、それを表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public static void main(String[] args) {
		//識別番号を発行する人数を正の整数値で入力させる
		int peopleNumber = inputIntegralNumber("識別番号を発行する人数：");
		//インスタンスの作成ごとに識別番号を増加させる個数の初期値を表す定数を設定
		final int INITIAL_INCREASE = 1;
		//識別番号を増加させる個数を表す変数を設定し、初期値を表す定数を入力
		int increaseNumber = INITIAL_INCREASE;
		
		//指定された人数分識別番号を発行する
		for (int i = 0; i < peopleNumber; i++) {
			//名前の入力を促す
			System.out.println("現在の識別番号増加個数は" + increaseNumber + "です。");
			//識別番号を増加させる個数を変更するかどうかを返答させる。
			if (isYes("識別番号を増加させる個数を変更しますか。")) {
				//識別番号を増加させる個数を変更する。
				increaseNumber = inputIntegralNumber("増加させる個数：");
			}
			//名前の入力を促す
			System.out.print("発行する人の名前：");
			//入力を読み込む
			String peopleName = standerdInput.next();
			//ExIdクラスのインスタンスを作成
			ExId issueNumber = new ExId(increaseNumber);
			//個人のインスタンスに対して発行された識別番号を表示
			System.out.println(peopleName + "さんの識別番号：" + issueNumber.getId());
			//最後に与えた識別番号を表示
			System.out.println("最後に与えた識別番号は、" + issueNumber.getMaxId() + "です。");
			
			
		}

	}

}
