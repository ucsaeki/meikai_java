package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_16
 * 概要 入力された値の数*を5個毎に改行して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_16 {
	/* 
	 * 関数名  main
	 * 概要 入力された値の数*を5個毎に改行して表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された整数値を表す変数に0を設定。
		int integerNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; integerNumber <= 0;) {
			//入力を促す。
			System.out.print("何個*を表示しますか：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.println("正の整数値を入力してください。");
			}
		}
		//記号を5個毎に改行するための定数5を宣言。
		final int CONSTANT_FIVE = 5;
		//入力された値÷5の値を変数に設定。
		int variableFive = integerNumber / CONSTANT_FIVE;
		//入力された値÷5の余りを変数に設定。
		int variableOne = integerNumber % CONSTANT_FIVE;
		//記号を5個表示する回数を計算
		for (; variableFive > 0; variableFive--) {
			//記号を5つ表示。
			System.out.println("*****");
		} //記号を表示する個数を計算
		for (; variableOne > 0; variableOne--) {
			//記号を表示。
			System.out.print("*");
		}

	}

}
