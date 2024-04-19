package Exercise5;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise5_04
 * 概要 入力した3つの整数値の合計と平均を実数値で表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/15
 */
public class Exercise5_04 {
	/* 
	 * 関数名  main
	 * 概要 入力した3つの整数値の合計と平均を実数値で表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数値の入力を促す。
		System.out.print("整数値１：");
		//入力を読み込む。
		int firstInteger = standerdInput.nextInt();
		//整数値の入力を促す。
		System.out.print("整数値２：");
		//入力を読み込む。
		int secondInteger = standerdInput.nextInt();
		//整数値の入力を促す。
		System.out.print("整数値３：");
		//入力を読み込む。
		int thirdInteger = standerdInput.nextInt();
		//3つの値の平均を実数値で求めるための定数を設定
		final double CONSTANT_THREE = 3.0;
		//変数に三つの値の合計を設定
		int totalNumber = firstInteger + secondInteger + thirdInteger;
		//変数に三つの値の平均を実数値で設定
		double averageNumber = (firstInteger + secondInteger + thirdInteger) / CONSTANT_THREE;

		//合計を表示。
		System.out.println("合計は" + totalNumber + "です。");
		//平均を表示。
		System.out.println("平均は" + averageNumber + "です。");

	}

}
