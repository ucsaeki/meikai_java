package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_33
 * 概要 作成した配列と行列の全ての要素をそれぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/09
 */
public class Exercise7_33 {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	//符号を反転させる計算で使用する定数を設定
	static final int SIGN_REVERSE = -1;
	//マイナスの符号分、桁数を増減させるために使用する定数を設定
	static final int ADJUSTMENT_SIGN_MINUS = 10;

	/* 
	 * 関数名 printArray
	 * 概要 配列の全ての要素を表示するメソッド
	 * 引数 配列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	static void printArray(int[] a) {
		//配列の全ての要素を表示する
		for (int i = 0; i < a.length; i++) {
			//対象の要素と空白を表示
			System.out.print(a[i] + " ");
		}
		//改行する
		System.out.println();
	}

	/* 
	 * 関数名 searchMuximumDigits
	 * 概要 行列の列の中で最も大きい桁数を探し、その桁数を返却する
	 * 引数 行列、対象の列数
	 * 返り値 対象の列に含まれる値の最も大きい桁数
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static int searchMuximumDigits(int[][] a, int x) {
		//最大の桁数を持つ値を表す変数を設定
		int muximumDigits = 0;
		//行列の対象の縦の要素を全て探索する
		for (int i = 0; i < a.length; i++) {
			//対象の要素が存在しない場合
			if ((a[i].length - 1) < x) {
				//この行の探索を終了し、次の行へ移る
				continue;
			}
			//対象の値が負の数の場合
			if (a[i][x] < 0) {
				//対象の値を表す変数を設定し、対象の値の絶対値を代入する
				int subjectNumber = a[i][x] * SIGN_REVERSE;
				//マイナスの符号分、桁数を1つ増やすために10倍する
				subjectNumber *= ADJUSTMENT_SIGN_MINUS;
				//桁数を表す変数を設定
				int variableDigits = 0;
				//桁数を求める
				for (; subjectNumber > 0; variableDigits++) {
					//対象の値の桁数を1つ下げる
					subjectNumber /= ADJUSTMENT_SIGN_MINUS;
				}
				//桁数の値が最大の桁数を表す変数より大きい場合
				if (variableDigits > muximumDigits) {
					//最大の桁数を表す変数に桁数の値を代入
					muximumDigits = variableDigits;
				}
				//対象が正の数の場合
			} else {
				//対象の値を表す変数に、対象の値を代入
				int subjectNumber = a[i][x];
				//桁数を表す変数を設定
				int variableDigits = 0;
				//桁数を求める
				for (; subjectNumber > 0; variableDigits++) {
					//対象の値の桁数を1つ下げる
					subjectNumber /= ADJUSTMENT_SIGN_MINUS;
				}
				//桁数の値が最大の桁数を表す変数より大きい場合
				if (variableDigits > muximumDigits) {
					//最大の桁数を表す変数に桁数の値を代入
					muximumDigits = variableDigits;
				}
			}

		}//求めた最大の桁数を返却
		return muximumDigits;

	}

	/* 
	 * 関数名 printArray
	 * 概要 行列の全ての要素を表示するメソッド
	 * 引数 行列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	static void printArray(int[][] a) {

		//配列の全ての要素の値を表示する
		for (int i = 0; i < a.length; i++) {

			//一列分の要素の値を表示する
			for (int j = 0; j < a[i].length; j++) {
				
				//対象の要素を表示する
				System.out.print(a[i][j]);

				//関数を用いて、対象の列の最大の桁数を求める
				int digitsNumber = searchMuximumDigits(a, j);
				//余白を作るために最大の桁数に1加算
				digitsNumber++;
				//空白の個数を表す変数を設定
				int blankCount = 0;
				
				//対象の値を表す変数に対象の値を設定
				int subjectNumber = a[i][j];
				//対象の値が負の数の場合
				if (subjectNumber < 0) {
					//対象の値の絶対値を代入
					subjectNumber *= SIGN_REVERSE;
					//マイナスの符号分、桁数を1つ増やすために10倍する
					subjectNumber *= ADJUSTMENT_SIGN_MINUS;
				}

				//対象の値の桁数を求める
				for (; subjectNumber > 0; blankCount++) {
					//対象の値の桁数を1つ下げる
					subjectNumber /= ADJUSTMENT_SIGN_MINUS;
				}
				//表示する空白の個数を求める
				blankCount = digitsNumber - blankCount;
				//空白の個数を表す変数の値の回数だけ空白を表示
				for (; blankCount > 0; blankCount--) {
					System.out.print(' ');
				}
			}
			//改行する
			System.out.println();
		}
	}

	/* 
	 * 関数名 main
	 * 概要 配列と行列を作成し、それぞれの全ての要素を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	public static void main(String[] args) {
		//一次元配列の作成を予告
		System.out.println("一次元配列を作成します。");
		//配列の要素数を表す変数を設定
		int elementNumber = 0;

		//配列の要素数を正の整数値で入力させる
		for (; elementNumber <= 0;) {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力された値を読み込む
			elementNumber = standerdInput.nextInt();
			//入力された値が0以下だった場合
			if (elementNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		}

		//入力された要素数を持つ配列を生成
		int[] oneDimentionArray = new int[elementNumber];
		//要素の入力を促す
		System.out.println("要素を入力してください。");
		//配列の全要素に入力させる
		for (int i = 0; i < elementNumber; i++) {
			//配列への入力を促す
			System.out.print("variableArray[" + i + "] ：");
			//配列の各要素に入力を読み込む
			oneDimentionArray[i] = standerdInput.nextInt();
		}

		//二次元配列の作成を予告
		System.out.println("二次元配列を作成します。");
		//配列の行数を表す変数を設定
		int variableLine = 0;

		//正の整数値で行数を入力させる
		for (; variableLine <= 0;) {
			//行数の入力を促す文章を表示
			System.out.print("行数：");
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
		int[][] tweDimentionArray = new int[variableLine][];

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
					tweDimentionArray[i] = new int[variableColumn];
				}
			}
		}
		//要素の入力を促す文章を表示
		System.out.println("要素の値を入力してください。");

		//行列の全要素に入力させる
		for (int i = 0; i < tweDimentionArray.length; i++) {
			//ひとつの列の要素を入力させる
			for (int j = 0; j < tweDimentionArray[i].length; j++) {
				//入力する要素を表示
				System.out.print("[" + i + "][" + j + "] :");
				//要素に入力を読み込む
				tweDimentionArray[i][j] = standerdInput.nextInt();
			}
		}
		//配列の要素を表示することを予告
		System.out.println("一次元配列の全要素を表示します。");
		//関数を用いて、配列の全ての要素を表示
		printArray(oneDimentionArray);
		//行列の要素を表示することを予告
		System.out.println("二次元配列の全要素を表示します。");
		//関数を用いて、行列の全ての要素を表示
		printArray(tweDimentionArray);
	}

}
