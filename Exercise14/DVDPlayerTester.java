package Exercise14;

//Scannerクラスをインポート
import java.util.Scanner;

//DVDPlayerクラスをインポート
import Player.DVDPlayer;

/* 
 * クラス名 DVDPlayerTester
 * 概要 DVDを再生、スロー再生する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */

public class DVDPlayerTester {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

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
	 * 概要 DVDを再生、スロー再生する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void main(String[] args) {
		//DVDを見ることを予告
		System.out.println("DVDを見ます。");
		//DVDのインスタンスを作成
		DVDPlayer DVDPlay = new DVDPlayer();
		//DVDを再生する。
		DVDPlay.play();
		
		//スロー再生に切り替えるかどうかを入力させ、切り替えるが選ばれた場合
		if (isYes("スロー再生に切り替えますか。")) {
			//DVDをスロー再生する。
			DVDPlay.slow();
			//スロー再生していることを表示
			System.out.println("スロー再生します。");
		} else {
			//スロー再生しなかったことを表示
			System.out.println("通常の速度で再生しています。");
		}
		
		//DVDを停止する
		DVDPlay.stop();
		//DVDの停止を表示
		System.out.println("DVDを停止しました。");

	}

}
