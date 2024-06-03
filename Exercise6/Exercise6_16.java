package Exercise6;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_16
 * 概要 4行3列の行列と3行4列の行列の積を求める
 * 作成者 Y.Saeki
 * 作成日 2024/04/22
 */
public class Exercise6_16 {
	/* 
	 * 関数名  main
	 * 概要 4行3列の行列と3行4列の行列の積を求める
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/22
	 */

	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//行列作成に使用する定数を設定
		final int CONSTANT_THREE = 3;
		//行列作成に使用する定数を設定
		final int CONSTANT_FOUR = 4;
		//4行3列の行列を生成
		int[][] firstArray = new int[CONSTANT_FOUR][CONSTANT_THREE];
		//3行4列の行列を生成
		int[][] secondArray = new int[CONSTANT_THREE][CONSTANT_FOUR];

		//要素の値の入力を促す。
		System.out.println("4行3列の行列の要素の値を入力してください。");
		//4行分の要素を入力させる
		for (int i = 0; i < CONSTANT_FOUR; i++) {
			//3列分の要素を入力させる
			for (int j = 0; j < CONSTANT_THREE; j++) {
				//対応する行列に入力を促す
				System.out.print("[" + i + "][" + j + "] :");
				//入力された値を読み込む
				firstArray[i][j] = standerdInput.nextInt();
			}
		}
		//要素の値の入力を促す
		System.out.println("3行4列の行列の要素の値を入力してください。");
		//3行分の要素を入力させる
		for (int i = 0; i < CONSTANT_THREE; i++) {
			//4列分の要素を入力させる
			for (int j = 0; j < CONSTANT_FOUR; j++) {
				//対応する行列に入力を促す
				System.out.print("[" + i + "][" + j + "] :");
				//入力された値を読み込む
				secondArray[i][j] = standerdInput.nextInt();

			}
		}
		//改行する
		System.out.println();
		//文章を表示
		System.out.println("二つの行列の積は");
		//改行する
		System.out.println();
		
		//二つの行列の積を表す変数を設定
		int matrixSum = 0;

		//二つの行列の積を計算して表示する
		for (int i = 0; i < CONSTANT_FOUR; i++) {
			//行列をくくるための記号を表示
			System.out.print("{");
			//一つ目の行列の4行の要素を用いて計算
			for (int j = 0; j < CONSTANT_FOUR; j++) {
				//二つの行列のそれぞれ3列と3行の値に対応する要素を入力させる
				for (int k = 0; k < CONSTANT_THREE; k++) {
					//二つの行列の対応する値をかけ、行列の値を表す変数に加算する
					matrixSum += (firstArray[i][k] * secondArray[k][j]);
				}
				//行列の積の値を表示
				System.out.printf("%4d", matrixSum);
				//次のループでの計算に使用するため、行列の値を表す変数を0にリセットする。
				matrixSum = 0;
			}
			//行列をくくるための記号を表示
			System.out.print("}");
			//改行する
			System.out.println();

		}

	}

}
