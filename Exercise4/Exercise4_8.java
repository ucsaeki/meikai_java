package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_8
 * 概要 読み込んだ正の整数値の桁数を出力するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_8 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ正の整数値の桁数を出力するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数値を表す変数に初期値として0を設定。
		int variableNumber = 0;
		//計算で使用する変数に初期値として0を設定。
		int incremaentNumber = 0;

		//正の整数値が入力されるまで繰り返し。
		do {
			//整数値の入力を促す。
			System.out.print("整数値:");
			//入力された値を読み込む。
			variableNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (variableNumber <= 0) {/////////////
				//正の整数値の入力を促す文章を表示。
				System.out.println("正の整数値を入力してください。");
			}
		//入力された整数値が0以下の場合繰り返す。
		} while (variableNumber <= 0);

		//整数値を10で割り桁を一つ小さくするための定数10を宣言。
		final int CONSTANT_TEN = 10;
		//正の整数値が0より大きい場合繰り返す。
		while (variableNumber > 0) {
			//桁を一つ小さくするために整数値を10で割る。
			variableNumber /= CONSTANT_TEN;
			//桁数を表す変数に1加算。
			incremaentNumber++;
		}
		//文章を表示。
		System.out.println("その値は" + incremaentNumber + "桁です。");

	}

}
