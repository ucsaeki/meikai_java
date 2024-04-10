package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_13
 * 概要 1から入力した値までの和を式で表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/10
 */
public class Exercise4_13 {
	/* 
	 * 関数名  main
	 * 概要 1から入力した値までの和を式で表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された整数値を表す変数に0を設定。
		int integerNumber = 0;
		//文章を表示。
		System.out.println("1からnまでの和を求めます。");
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; integerNumber <= 0;) {
			//入力を促す。
			System.out.print("nの値：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が負の数の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正しく入力してください。");
			}
		}
		//整数値の和を表す変数に0を設定。
		int sumNumber = 0;
		//1から入力された値までの和を計算。
		for (int i = 0; i <= integerNumber; ++i) {
			//整数値の和に繰り返しの回数を加算
			sumNumber += i;
		}
		//1から入力された値までの和を表示。
		System.out.println("1から" + integerNumber + "までの和は" + sumNumber + "です。");
	}

}
