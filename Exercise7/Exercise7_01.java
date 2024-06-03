package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_01
 * 概要 関数を用いて、入力された整数値の符号に応じた定数を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/23
 */
public class Exercise7_01 {
	/* 
	 * 関数名  sigh0f(関数名は教本準拠)
	 * 概要 引数の符号に対応する定数を出力するメソッド
	 * 引数 整数値
	 * 返り値 符号に対応した定数
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/23
	 */

	//引数の正、負の判定を行う関数を宣言
	static int sigh0f(int n) {
		//返り値で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//返り値で使用する定数を設定
		final int MINUS_ONE = -1;
		
		//引数が0の場合
		if (n == 0) {
			//返り値0を返す
			return 0;
		}
		//引数が0より大きい場合
		else if (n > 0) {
			//返り値1を返す
			return CONSTANT_ONE;
		}
		//そうでない場合
		else {
			//返り値-1を返す。
			return MINUS_ONE;
		}
	}
	/* 
	 * 関数名  main
	 * 概要 入力した値の符号を関数を用いて判定し、その返り値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/23
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力を促す
		System.out.print("整数値：");
		//入力を読み込む
		int variableNumber = standerdInput.nextInt();
		//関数を使用し、返り値の値を確認する。
		System.out.println("入力した値の返り値は" + sigh0f(variableNumber) + "です。");

	}

}
