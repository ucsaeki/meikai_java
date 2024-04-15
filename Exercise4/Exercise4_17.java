package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_17
 * 概要 入力した整数値の全ての約数と約数の個数を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_17 {
	/* 
	 * 関数名  main
	 * 概要 入力した整数値の全ての約数と約数の個数を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int integerNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; integerNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("整数値：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		} //約数の個数を表す変数に0を代入。
		int countNumber = 0;
		//入力された値の全ての約数を表示するまで繰り返す
		for (int i = 1; i <= integerNumber; i++) {
			//入力値÷計算回数の余りが0になる場合
			if (integerNumber % i == 0) {
				//約数を表示。
				System.out.println(i);
				//約数の個数に1加算
				countNumber++;
			}
		} //約数の個数を表示。
		System.out.println("約数は" + countNumber + "個です。");

	}

}
