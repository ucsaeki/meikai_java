package Exercise7;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_10_v2
 * 概要 ランダムに生成した3つの3桁の値を、ランダムに4パターンの計算問題として表示して回答させる
 * 作成者 Y.Saeki
 * 作成日 2024/04/25
 */
public class Exercise7_10_v2 {
	//Randomクラスに変数を設定。
	static Random randomRand = new Random();
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */

	
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */

	
	
	/* 
	 * 関数名  confirmRetry
	 * 概要 問題の表示を継続して行うかどうかを確認するメソッド
	 * 引数 なし
	 * 返り値 trueならば問題の継続、falseならば問題終了
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	static boolean confirmRetry() {
		//問題の継続を確認するための変数を設定
		int continueQuiz = 0;
		//問題を継続する場合に入力される値を表す定数を設定
		final int CONSTANT_CONTINUE = 1;
		//継続の確認を行う
		do {
			//継続を判断する変数への入力を促す。
			System.out.print("もう一度？＜Yes…1/No…0＞：");
			//入力を継続を判断する変数に読み込む
			continueQuiz = standerdInput.nextInt();
			//入力された値が0もしくは1以外の場合継続する
		} while (continueQuiz != 0 && continueQuiz != CONSTANT_CONTINUE);
		//継続を判断する変数が1の場合、trueを返却する。
		return continueQuiz == CONSTANT_CONTINUE;
	}
	public static void main(String[] args) {

	}

}
