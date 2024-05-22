package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_27
 * 概要 3つの配列の要素数が等しい場合のみ和の計算を行い、その行列を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/07
 */
public class Exercise7_27 {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 createMatrix
	 * 概要 入力させた行数と列数を持つ行列を作成し返却する
	 * 引数 作成する配列の番号
	 * 返り値 入力された行数と列数を持つ配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */

	static int[][] createMatrix(int arrayCount) {
		//配列の行数を表す変数を設定
		int variableLine = 0;

		//正の整数値で行数を入力させる
		for (; variableLine <= 0;) {
			//行数の入力を促す文章を表示
			System.out.print("行列" + arrayCount + "の行数：");
			//入力を読み込む
			variableLine = standerdInput.nextInt();
			//0以下の値が入力された場合
			if (variableLine <= 0) {
				//正の整数値の入力を求めるエラー文章を表示
				System.out.println("正の整数を入力してください。");
			}
		}

		//入力された行数を持つ行列を作成
		int[][] variableArray = new int[variableLine][];
		//配列の要素数とインデックスの値の差を解消するための定数を設定
		final int FILL_ONE = 1;

		//全ての行の列数をそれぞれ入力させる
		for (int i = 0; i < variableLine; i++) {

			//行列の列数を表す変数を設定
			int variableColumn = 0;

			//正の整数値で列数を入力させる
			for (; variableColumn <= 0;) {
				//行数の入力を促す文章を表示
				System.out.print((i + FILL_ONE) + "行目の列数：");
				//入力を読み込む
				variableColumn = standerdInput.nextInt();
				//0以下の値が入力された場合
				if (variableColumn <= 0) {
					//正の整数値の入力を求めるエラー文章を表示
					System.out.println("正の整数を入力してください。");
					//正の整数が入力された場合
				} else {
					//行列内に、入力された列数を持つ配列を作成
					variableArray[i] = new int[variableColumn];
				}
			}
		}

		//作成した行列を返却
		return variableArray;
	}

	/* 
	 * 関数名 inputArray
	 * 概要 行列の全要素に入力させて返却する
	 * 引数 行列
	 * 返り値 全要素に入力を行った行列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */
	static int[][] inputArray(int[][] emptyArray) {
		//要素の入力を促す文章を表示
		System.out.println("要素の値を入力してください。");

		//行列の全要素に入力させる
		for (int i = 0; i < emptyArray.length; i++) {
			//ひとつの列の要素を入力させる
			for (int j = 0; j < emptyArray[i].length; j++) {
				//入力する要素を表示
				System.out.print("[" + i + "][" + j + "] :");
				//要素に入力を読み込む
				emptyArray[i][j] = standerdInput.nextInt();
			}
		}
		//作成した行列を返却する
		return emptyArray;
	}

	/* 
	 * 関数名 addMatrix
	 * 概要 3つの配列の行数と列数が等しければ計算を行ってtrueを返却し、異なっていれば計算を行わずにfalseを返却するメソッド
	 * 引数 異なる3つの行列
	 * 返り値 true、false
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/07
	 */

	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		//3つの配列の行数と列数が等しいかどうかを表す変数を設定し、初期値としてfalseを代入
		boolean equalElementNumber = false;

		//3つの行列の行数と列数が同じ場合、1つ目と2つ目の行列の合計を3つ目の行列に代入する
		outer: if (x.length == y.length && x.length == z.length) {

			//3つの行列の対応する列数が全て同じことを確認する
			for (int i = 0; i < x.length; i++) {
				//それぞれの列数が異なる場合、繰り返しを終了する
				if (x[i].length != y[i].length || x[i].length != z[i].length) {
					//繰り返しを終了する
					break outer;
				}
			}
			//3つの配列の要素数が等しいかどうかを表す変数にtrueを代入
			equalElementNumber = true;

			//2つの行列の要素数を全て加算し、3つ目の行列に代入する
			for (int j = 0; j < x.length; j++) {
				//要素数の数だけ繰り返す
				for (int k = 0; k < x[j].length; k++) {
					//3つ目の配列の要素に1つ目と2つ目の配列の合計の要素を代入する
					z[j][k] = x[j][k] + y[j][k];
				}
			}
		}
		//3つの配列の要素数が等しいかどうかを表す変数を返却する
		return equalElementNumber;
	}

	/* 
	 * 関数名 printMatrix
	 * 概要 入力された行列の全ての要素の値を表示する
	 * 引数 行列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/07
	 */
	static void printMatrix(int[][] m) {
		//配列の全ての要素の値を表示する
		for (int i = 0; i < m.length; i++) {
			//一列分の要素の値を表示する
			for (int j = 0; j < m[i].length; j++) {
				//要素の値を表示する
				System.out.printf("%3d",m[i][j]);
			}
			//改行する
			System.out.println();
		}
	}

	/* 
	 * 関数名 main
	 * 概要 3つの行列を作成し、それぞれの行数と列数が同じであれば行列の加算と表示を行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */
	public static void main(String[] args) {

		//1つ目の行列であることを表す定数を設定
		final int ARRAY_ONE = 1;
		//2つ目の行列であることを表す定数を設定
		final int ARRAY_TWE = 2;
		//3つ目の行列であることを表す定数を設定
		final int ARRAY_THREE = 3;

		//関数を用いて、1つ目の行列を作成する
		int firstArray[][] = createMatrix(ARRAY_ONE);
		//1つ目の行列の全要素に入力する
		firstArray = inputArray(firstArray);

		//関数を用いて、2つ目の行列を作成する
		int secondArray[][] = createMatrix(ARRAY_TWE);
		//2つ目の行列の全要素に入力する
		secondArray = inputArray(secondArray);

		//関数を用いて、3つ目の行列を作成する
		int thirdArray[][] = createMatrix(ARRAY_THREE);

		//改行する
		System.out.println();

		//関数を用いて、3つの行列の行数と列数が同じ場合true、異なる場合falseを表示。
		System.out.println("addMatrix =" + addMatrix(firstArray, secondArray, thirdArray));

		//3つの行列の行数と列数が同じ場合
		if (addMatrix(firstArray, secondArray, thirdArray)) {
			//要素数が同じであることを表示。
			System.out.println("要素数が同じであったため、加算を行いました。");
			//行列の名前を表示
			System.out.println("行列1");
			//1つ目の行列を表示
			printMatrix(firstArray);
			//行列の名前を表示
			System.out.println("行列2");
			//2つ目の行列を表示
			printMatrix(secondArray);
			//行列の名前を表示
			System.out.println("行列3");
			//3つ目の行列を表示
			printMatrix(thirdArray);	
		} 
		//3つの行列の行数と列数が異なる場合
		else {
			//要素数が異なることを表示。
			System.out.println("要素数が異なるため、加算は行いませんでした。");
		}

	}

}
