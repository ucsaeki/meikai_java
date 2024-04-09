package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_1
 * 概要 List3-5を好きなだけ何度も繰り返すことができるメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise4_1 {
	/* 
	 * 関数名  main
	 * 概要 List3-5を好きなだけ何度も繰り返すことができるメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//繰り返しを確認する変数に初期値0を設定。
		int retryJudge = 0;

		//繰り返し
		do {
			//整数値の入力を促す。
			System.out.print("整数値：");
			//入力を読み込む。
			int integerNumber = standerdInput.nextInt();

			//変数が0より大きい場合
			if (integerNumber > 0) {
				//正であることを表示。
				System.out.println("その値は正です。");
				//変数が0未満の場合
			} else if (integerNumber < 0) {
				//負であることを表示。
				System.out.println("その値は負です。");
				//そうでないとき
			} else {
				//0であることを表示。
				System.out.println("その値は0です。");
			}
			//繰り返しの継続を確認する文章を表示。
			System.out.print("もう一度入力しますか？　Yes…1／No…0:");
			//入力を読み込む。
			retryJudge = standerdInput.nextInt();
			//変数が1ではない場合
			if (retryJudge != 1) {
				//繰り返し
				do {
					//変数が0の場合
					if (retryJudge == 0) {
						//繰り返しを終了する。
						break;
						//そうではない場合
					} else {
						//繰り返しの継続を確認する文章を表示。
						System.out.print("1か0で入力してください。"
								+ "\nもう一度入力しますか？　Yes…1／No…0:");
						//入力を読み込む。
						retryJudge = standerdInput.nextInt();
						//変数に1以外が入力されるまで繰り返す。
					}
				} while (retryJudge != 1);
				//変数に1が入力されたら繰り返す。
			}
		} while (retryJudge == 1);
		//変数に0が入力された場合
		if (retryJudge == 0) {
			//終了の文章を表示。
			System.out.println("終了します。");
		}

	}

}
