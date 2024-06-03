package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_03
 * 概要 関数を用いて入力した三つの値の中央値を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/24
 */
public class Exercise7_03 {
	/* 
	 * 関数名  med
	 * 概要 三つの引数の中央値を求めて返り値として出力するメソッド
	 * 引数 三つの整数値
	 * 返り値 三つの整数値の中央値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	//medは教本準拠
	static int med(int a, int b, int c) {
		//一つ目の値が二つ目の値より大きい場合
		if (a >= b) {
			//二つ目の値が三つ目の値より大きい場合
			if (b >= c) {
				//二つ目の値を返す。
				return b;
			//一つ目の値が三つ目の値より大きい場合
			} else if (a >= c) {
				//三つ目の値を返す。
				return c;
			//一つ目の値より三つ目の値が大きい場合
			} else {
				//一つ目の値を返す。
				return a;
			}
		//二つ目の値が三つ目の値より大きい場合
		} else if (b >= c) {
			//一つ目の値が三つ目の値より大きい場合
			if (a >= c) {
				//一つ目の値を返す。
				return a;
			//一つ目の値より三つ目の値が大きい場合
			} else {
				//三つ目の値を返す。
				return c;
			}
		//二つ目の値より三つ目の値の方が大きい場合
		} else {
			//二つ目の値を返す。
			return b;
		}
	}

	/* 
	 * 関数名  main
	 * 概要 入力した三つの値から中央値を求めて表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("1つ目の整数値：");
		//入力を読み込む
		int firstNumber = standerdInput.nextInt();
		//整数値の入力を促す
		System.out.print("2つ目の整数値：");
		//入力を読み込む
		int secondNumber = standerdInput.nextInt();
		//整数値の入力を促す
		System.out.print("3つ目の整数値：");
		//入力を読み込む
		int thirdNumber = standerdInput.nextInt();
		//関数を用いて求めた中央値を表示
		System.out.println("最小値は" + med(firstNumber, secondNumber, thirdNumber) + "です。");

	}

}
