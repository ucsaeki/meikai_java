package Exercise7;

import java.util.Scanner;

public class Exercise7_33_memo {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 searchMuximumDigits
	 * 概要 配列の中で最も大きい桁数を探し、その桁数を返却する
	 * 引数 行列、対象の列数
	 * 返り値 配列の要素の最も大きい桁数
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	static int searchMuximumDigits(int[][] a) {
		//最大の桁数を持つ値を表す変数を設定
		int muximumDigits = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if ((a.length - 1) < j) {

					continue;
				}

				if (a[i][j] < 0) {

					int absoluteNumber = a[i][j] * -1;

					absoluteNumber *= 10;

					int variableDigits = 0;

					for (; absoluteNumber > 1; variableDigits++) {
						//対象の値の桁数を1つ下げる
						absoluteNumber /= 10;
					}
					if (variableDigits > muximumDigits) {

						muximumDigits = variableDigits;
					}
				} else {

					int y = a[i][j];

					int variableDigits = 0;

					for (; y >= 1; variableDigits++) {
						//対象の値の桁数を1つ下げる
						y /= 10;
					}
					if (variableDigits > muximumDigits) {

						muximumDigits = variableDigits;
					}
				}

			}

		}
		return muximumDigits;

	}

	static void printArray(int[][] a) {

		//配列の全ての要素の値を表示する
		for (int i = 0; i < a.length; i++) {

			//一列分の要素の値を表示する
			for (int j = 0; j < a[i].length; j++) {

				//関数を用いて、対象の列の最大の桁数を求める
				int digitsNumber = searchMuximumDigits(a);

				//余白を作るために最大の桁数に1加算
				digitsNumber += 1;
				//対象の要素を表示する
				System.out.print(a[i][j]);
				//空白の個数を表す変数を設定
				int blankCount = 0;
				//対象の値の桁数を求める
				for (; a[i][j] > 0; blankCount++) {
					//対象の値の桁数を1つ下げる
					a[i][j] /= 10;
				}
				blankCount = digitsNumber - blankCount;

				for (; blankCount > 0; blankCount--) {
					System.out.print(' ');
				}
			}
			//改行する
			System.out.println();
		}
	}

	public static void main(String[] args) {
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

		//二次元配列の全要素に入力させる
		for (int i = 0; i < tweDimentionArray.length; i++) {
			//ひとつの列の要素を入力させる
			for (int j = 0; j < tweDimentionArray[i].length; j++) {
				//入力する要素を表示
				System.out.print("[" + i + "][" + j + "] :");
				//要素に入力を読み込む
				tweDimentionArray[i][j] = standerdInput.nextInt();
			}
		}
		System.out.println("二次元配列の全要素を表示します。");

		printArray(tweDimentionArray);

	}

}
