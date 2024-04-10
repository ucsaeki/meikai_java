package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_3
 * 概要 読み込んだ二つの整数値の小さい数以上大きい数以下の全整数を順番に表示させるメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_3 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ二つの整数値の小さい数以上大きい数以下の全整数を順番に表示させるメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数の入力を促す。
		System.out.print("整数A:");
		//入力した値を読み込む。
		int firstNumber = standerdInput.nextInt();
		//整数の入力を促す。
		System.out.print("整数B:");
		//入力した値を読み込む。
		int secondNumber = standerdInput.nextInt();
		//二つの変数の大きいほうを最大値として変数に設定。
		int maximumNumber = (firstNumber > secondNumber ? firstNumber : secondNumber);
		//二つの変数の小さいほうを新たな変数に設定。
		int variableNumber = (firstNumber > secondNumber ? secondNumber : firstNumber);
		//計算に使用するための定数1を宣言。
		final int CONSTANT_ONE = 1;
		//文章を表示。
		System.out.print(variableNumber);
		//繰り返し
		do {
			//最大値と変数が異なる場合
			if (maximumNumber != variableNumber) {
				//文章を表示。
				System.out.print(" " + (variableNumber + CONSTANT_ONE ));
				//変数に変数+1を設定。
				variableNumber = variableNumber + 1;
				//最大値と変数が異なる場合繰り返す。
			}
		} while (variableNumber != maximumNumber);

	}

}
