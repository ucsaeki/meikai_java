package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_2
 * 概要 後に入力した整数が先に入力した整数の約数であるかを判定するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise3_2 {
	/* 
	 * 関数名  main
	 * 概要 後に入力した整数が先に入力した整数の約数であるかを判定するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//整数値の入力を促す。
		System.out.print("整数A：");
		//入力を読み込む。
		int firstVariabale = standerdInput.nextInt();
		//整数値の入力を促す。
		System.out.print("整数B：");
		//入力を読み込む。
		int secondVariable = standerdInput.nextInt();
		
		//変数に整数A÷整数Bの値を設定。
		int diviserVariable = firstVariabale / secondVariable;

		//変数が0以上のとき
		if ( diviserVariable >= 0 )
			//BがAの約数であることを表示。
			System.out.println("BはAの約数です。");
		//そうでないとき。
		else
			//BがAの約数ではないことを表示。
			System.out.println("BはAの約数ではありません。");

	}

}
