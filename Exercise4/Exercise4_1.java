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
		Scanner standerdInputn = new Scanner(System.in);
		//繰り返しを確認する変数に初期値0を設定。
		int retryJudge = 0;
		
		//繰り返し
		do {
			//整数値の入力を促す。
			System.out.print("整数値：");
			//入力を読み込む。
			int integerNumber = standerdInputn.nextInt();
			//変数が0より大きいとき。
			
			if ( integerNumber > 0 )
				//文章を表示。
				System.out.println("その値は正です。");
			//変数が0未満の場合
			else if ( integerNumber < 0 )
				//文章を表示。
				System.out.println("その値は負です。");
			//そうでないとき
			else
				//文章を表示。
				System.out.println("その値は０です。");
			//繰り返しの継続を確認する文章を表示。
			System.out.print("もう一度？　1…Yes／2…No:");
			//入力を読み込む。
			retryJudge = standerdInputn.nextInt();
			//変数が1の場合、｛｝内を繰り返す。
		} while ( retryJudge == 1);

	}

}
