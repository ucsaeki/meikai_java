package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_28
 * 概要 2つの配列の合計を代入した配列の全要素を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/08
 */
public class Exercise7_28 {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);
	/* 
	 * 関数名 createMatrix
	 * 概要 入力させた行数と列数を持つ行列を作成し返却するメソッド
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
	 * 関数名 addMatrix
	 * 概要 2つの行列と同じ行数と列数を持つ行列を作成し、2つの行列の合計を代入して返却するメソッド
	 * 引数 合計したい2つの行列
	 * 返り値 2つの配列の合計が入力された行列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */

	static int[][] addMatrix(int[][] x, int[][] y) {
		//1つ目の行列と同じ行数を持つ行列を作成する
		int[][] arraySum = new int[x.length][];
		//3つ目の行列の全ての列数を入力する
		for (int i = 0; i < x.length; i++) {
			//対応する1つ目の行列の列数を代入する
			arraySum[i] = new int[x[i].length];
		}

		//合計を入力したい配列の全ての要素に2つの行列の合計を代入
		for (int i = 0; i < x.length; i++) {
			//ひとつの列の全ての要素を入力する
			for (int j = 0; j < x[i].length; j++) {
				//作成した行列の要素に引数の2つの行列の対応する要素の合計を代入
				arraySum[i][j] = x[i][j] + y[i][j];
			}
		}
		//作成した行列を返却
		return arraySum;
	}

	/* 
	 * 関数名 inputArray
	 * 概要 行列の全要素に入力させて返却するメソッド
	 * 引数 行列、その行列の番号
	 * 返り値 入力が完了した配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/08
	 */
	static int[][] inputArray(int[][] emptyArray, int arrayNumber) {
		//要素の値の入力を促す文章を表示
		System.out.println(arrayNumber + "つ目の要素の値を入力してください。");

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
	 * 関数名 main
	 * 概要 作成した2つの配列の合計を持つ配列を作成し、そのすべての要素を表示する
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

		//関数を用いて、1つ目の行列を作成する
		int firstArray[][] = createMatrix(ARRAY_ONE);
		//1つ目の行列の全要素に入力する
		firstArray = inputArray(firstArray, ARRAY_ONE);

		//1つ目の行列と同じ行数を持つ行列を作成
		int secondArray[][] = new int[firstArray.length][];
		//2つ目の行列の全ての列数を入力する
		for (int i = 0; i < firstArray.length; i++) {
			//対応する1つ目の行列の列数を代入する
			secondArray[i] = new int[firstArray[i].length];
		}
		//2つ目の行列の全要素に入力する
		secondArray = inputArray(secondArray, ARRAY_TWE);
		
		//関数を用いて、1つ目と2つ目の行列を合計した行列を設定
		int[][] sumArray = addMatrix(firstArray, secondArray);

		//改行する
		System.out.println();
		//2つの行列を合計した3つ目の行列の表示を予告
		System.out.println("2つの行列を合計した行列を表示します。");

		//3つ目の配列の全ての要素の値を表示する
		for (int i = 0; i < sumArray.length; i++) {
			//一列分の要素の値を表示する
			for (int j = 0; j < sumArray[i].length; j++) {
				//要素の値を表示する
				System.out.printf("%3d",sumArray[i][j]);
			}
			//改行する
			System.out.println();
		}

	}

}
