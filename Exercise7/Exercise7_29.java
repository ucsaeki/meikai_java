package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_29
 * 概要 作成した行列と全く同じ行列を作複製して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/08
 */
public class Exercise7_29 {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 createMatrix
	 * 概要 入力させた行数と列数を持つ行列を作成し返却するメソッド
	 * 引数 なし
	 * 返り値 入力された行数と列数を持つ配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */

	static int[][] createMatrix() {
		//配列の行数を表す変数を設定
		int variableLine = 0;

		//正の整数値で行数を入力させる
		for (; variableLine <= 0;) {
			//行数の入力を促す文章を表示
			System.out.print("コピー元の行列の行数：");
			//入力を読み込む
			variableLine = standerdInput.nextInt();
			//0以下の値が入力された場合
			if (variableLine <= 0) {
				//正の整数値の入力を求めるエラー文章を表示
				System.out.println("正の整数を入力してください。");
			}
		}
		//配列の要素数とインデックスの値の差を解消するための定数を設定
		final int FILL_ONE = 1;

		//入力された行数を持つ行列を作成
		int[][] variableArray = new int[variableLine][];

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
	 * 関数名 aryClone2
	 * 概要 コピーしたい行列の全ての要素にコピー元の行列の全ての要素を代入する
	 * 引数 コピー元の行列
	 * 返り値 コピーが完了した行列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */
	static int[][] aryClone2(int[][] a) {

		//1つ目の行列と同じ行数を持つ行列を作成する
		int[][] copyArray = new int[a.length][];
		//3つ目の行列の全ての列数を入力する
		for (int i = 0; i < a.length; i++) {
			//対応する1つ目の行列の列数を代入する
			copyArray[i] = new int[a[i].length];
		}

		//コピーしたい配列の全ての要素にコピー元の対応する要素を代入する
		for (int i = 0; i < a.length; i++) {
			//ひとつの列の要素を入力させる
			for (int j = 0; j < a[i].length; j++) {
				//コピーしたい行列の要素に対応した要素を代入
				copyArray[i][j] = a[i][j];
			}
		}
		//コピーが完了した行列を返却
		return copyArray;
	}

	/* 
	 * 関数名 inputArray
	 * 概要 行列の全要素に入力させて返却する
	 * 引数 行列
	 * 返り値 入力が完了した配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */
	static int[][] inputArray(int[][] emptyArray) {
		//要素の値の入力を促す文章を表示
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
	 * 概要 コピー元の行列を作成し、その行列と同じ行列を作成して表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */
	public static void main(String[] args) {

		//コピー元となる行列を作成する
		int originalArray[][] = createMatrix();
		//行列の全要素に入力する
		originalArray = inputArray(originalArray);

		//関数を用いて、コピー元の行列と全く同じ行列を作成。
		int[][] cloneArray = aryClone2(originalArray);
		//改行する
		System.out.println();

		//行った動作についての文章を表示
		System.out.println("行列を複製しました。");

		//コピー元の行列の表示を予告
		System.out.println("元の行列");
		//関数を用いて、コピー元の行列を表示
		printMatrix(originalArray);

		//コピーした行列の表示を予告
		System.out.println("コピーした行列");
		//関数を用いて、コピーした行列を表示
		printMatrix(cloneArray);
	}

}
