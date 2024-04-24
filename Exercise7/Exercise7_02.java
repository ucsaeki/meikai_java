package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_02
 * 概要 入力した3つの値の最小値を求める
 * 作成者 Y.Saeki
 * 作成日 2024/04/23
 */
public class Exercise7_02 {
	/* 
	 * 関数名  min
	 * 概要 3つの引数の最小値を求めて返すメソッド
	 * 引数 入力された3つの整数
	 * 返り値 最小値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/23
	 */
	static int min(int a, int b, int c) {
		//最小値を表す変数を設定
		int minumumNumber = a;
		//変数が最小値より小さい場合
		if (minumumNumber > b) {
			//変数を最小値に代入
			minumumNumber = b;
		} //変数が最小値より小さい場合
		if (minumumNumber > c) {
			//変巣を最小値に代入
			minumumNumber = c;
		}
		//求めた最小値を返す
		return minumumNumber;
	}

	/* 
	 * 関数名  main
	 * 概要 入力した3つの値の最小値を求める
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/23
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//入力を促す
		System.out.print("1つ目の整数値：");
		//入力を読み込む
		int firstNumber = standerdInput.nextInt();
		//入力を促す
		System.out.print("2つ目の整数値：");
		//入力を読み込む
		int secondNumber = standerdInput.nextInt();
		//入力を促す
		System.out.print("3つ目の整数値：");
		//入力を読み込む
		int thirdNumber = standerdInput.nextInt();
		//関数を用いて求めた最小値を表示
		System.out.println("最小値は" + min(firstNumber,secondNumber,thirdNumber) + "です。");

	}

}
