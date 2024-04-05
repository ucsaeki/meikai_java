package Exercise3;
//Randomクラスをインポート。
import java.util.Random;
/* 
 * クラス名 Exercise3_17
 * 概要 ジャンケンの手をランダムに表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_17 {
	/* 
	 * 関数名  main
	 * 概要 ジャンケンの手をランダムに表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomNumber = new Random();
		//変数に0～2のランダムな数字を代入。
		int randomThree = randomNumber.nextInt(3);
		//生成した乱数を表示。
		System.out.println(randomThree);
		
		//変数によって分岐。
		switch ( randomThree ) {
		//変数が0の場合、文章を表示して分岐を終了。
		case 0: System.out.println("グー"); break;
		//変数が1の場合、文章を表示して分岐を終了。
		case 1: System.out.println("チョキ"); break;
		//変数が2の場合、文章を表示して分岐を終了。
		case 2: System.out.println("パー"); break;
		}

	}

}
