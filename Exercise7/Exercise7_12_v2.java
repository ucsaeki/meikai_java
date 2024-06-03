package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_12_v2
 * 概要 入力された整数値を指定した値だけ左右にビット回転させた値を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/26
 */
public class Exercise7_12_v2 {
	//計算で使用するため、32ビットの先頭が1、その他が全て0となる値を定数として設定
	static final int MINIMUM_BIT = -2147483648;
	//右へのビット回転が完了した値を表す変数を設定
	static int rotatedRight = 0;
	//左へのビット回転が完了した値を表す変数を設定
	static int rotatedLeft = 0;

	/* 
	 * 関数名  rRotate
	 * 概要 入力された整数値を指定した回数だけ右にビット回転させた値を返却するメソッド
	 * 引数 入力された整数値、ビット回転する回数
	 * 返り値 指定回数右にビット回転させた後の値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/26
	 */
	static int rRotate(int x, int n) {
		
		//計算で使用するための定数を設定
		final int CONSTANT_ONE = 1;

		//入力された整数値を指定された回数右にビット回転させる
		for (int i = n; i > 0; i--) {
			//二進数で表した整数値の末尾の値が1の場合
			if (((x & CONSTANT_ONE) == CONSTANT_ONE)) {
				//整数値を右に1回シフトさせ、はじき出された末尾の1を先頭に付け加える。
				x = (x >> CONSTANT_ONE) | MINIMUM_BIT;
				//二進数で表した整数値の末尾の値が0の場合
			} else {
				//右に1回シフトさせる
				x >>>= CONSTANT_ONE;
			}
		}
		//計算で求めた整数値を右へのビット回転が完了した値を表す変数に代入。
		rotatedRight = x;
		//ビット回転が終了した値を返却する。
		return rotatedRight;
	}

	/* 
	 * 関数名  lRotate
	 * 概要 入力された整数値を指定した値だけ左にビット回転させた値を返却するメソッド
	 * 引数 入力された整数値、ビット回転する回数
	 * 返り値 左にビット回転させた後の値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/26
	 */

	static int lRotate(int x, int n) {
		
		//計算で使用するための定数を設定
		final int CONSTANT_ONE = 1;

		//入力された整数値を指定された回数左にビット回転させる
		for (int i = n; i > 0; i--) {
			//二進数で表した整数値の先頭の値が1の場合
			if (((x & MINIMUM_BIT) == MINIMUM_BIT)) {
				//整数値を左に1回シフトさせ、はじき出された先頭の1を末尾に付け加える。
				x = (x << CONSTANT_ONE) | CONSTANT_ONE;
			//二進数で表した整数値の末尾の値が0の場合
			} else {
				//左に1回シフトさせる
				x <<= CONSTANT_ONE;
			}
		} //計算で求めた整数値を左へのビット回転が完了した値を表す変数に代入。
		rotatedLeft = x;
		//ビット回転が終了した値を返す。
		return rotatedLeft;

	}
	/* 
	 * 関数名 printBits
	 * 概要 整数値をビットで表示するメソッド
	 * 引数 整数値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/26
	 */

	static void printBits(int x) {
		
		//ビットの桁数を表す定数を設定
		final int BITE_DIGITS = 31;
		//計算に使用する定数を設定
		final int CONSTANT_ONE = 1;
		
		//整数値のビット構成を表示する
		for (int i = BITE_DIGITS; i >= 0; i--) {
			//ビット中の対象の行の値が1の場合1を、0の場合0を表示する。
			System.out.print(((x >>> i & CONSTANT_ONE) == CONSTANT_ONE) ? '1' : '0');
		}//表示が終わったら改行する
		System.out.println();
	}

	/* 
	 * 関数名 main
	 * 概要 ビット回転させたい値とさせる回数を入力させ、左右にビット回転を行った値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/26
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//計算で使用するための定数を設定
		final int MINUS_ONE = -1;
		//入力された整数値を表す変数を設定
		int integerNumber = 0;
		//ビット回転を行う回数を表す変数を設定し、入力範囲外の値を代入
		int rotateTimes = MINUS_ONE;

		//ビット回転させたい整数値の入力を促す文章を表示
		System.out.print("整数値：");
		//入力された整数値を読み込む
		integerNumber = standerdInput.nextInt();
		//-1より大きい回転回数を入力させる
		for (; rotateTimes < 0;) {
			//ビット回転させる回数の入力を促す
			System.out.print("ビット回転の回数：");
			//入力された値を読み込む
			rotateTimes = standerdInput.nextInt();
			//入力された回転回数が-1以下だった場合
			if (rotateTimes < 0) {
				//0以上の数値での入力を求めるエラー文を表示
				System.out.println("0以上の値を入力してください。");
			}
		}
		
		//整数値のビットを表示することを提示
		System.out.println("整数値をビットで表します。");
		//関数を用いて、入力された整数値のビット構成を表示
		printBits(integerNumber);
		//改行する
		System.out.println();

		//関数を用いて、入力された整数値を指定された回数右にビット回転させた値を表示。
		System.out.println("右に" + rotateTimes + "回ビット回転させた値は" + rRotate(integerNumber, rotateTimes) + "です。");
		//右にビット回転させた値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、右にビット回転させた値のビット構成を表示
		printBits(rotatedRight);
		//改行する
		System.out.println();

		//関数を用いて、入力された整数値を指定された回数左にビット回転させた値を表示。
		System.out.println("左に" + rotateTimes + "回ビット回転させた値は" + lRotate(integerNumber, rotateTimes) + "です。");
		//左にビット回転させた値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、左にビット回転させた値のビット構成を表示
		printBits(rotatedLeft);

	}

}
