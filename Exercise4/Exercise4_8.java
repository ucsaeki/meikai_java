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
		//変数に初期値として0を設定。
		int variableNumber = 0;
		//変数に初期値として0を設定。
		int incremaentNumber = 0;

		//繰り返し
		do {
			//整数値の入力を促す。
			System.out.print("整数値:");
			//入力した値を読み込む。
			variableNumber = standerdInput.nextInt();
			//変数が0未満の場合
			if ( variableNumber <= 0 )
				//文章を表示
				System.out.print("正の整数値を入力してください。");
			//変数が0以下の場合繰り返す。
		} while (variableNumber <= 0);
		//変数が0より大きい場合繰り返す。
		while (variableNumber > 0) {
			//桁を一つ小さくするために変数を10で割る。
			variableNumber /= 10;
			//変数に1加算。
			incremaentNumber++;
		}
		//文章を表示。
		System.out.println("その値は" + incremaentNumber + "です。");

	}

}
