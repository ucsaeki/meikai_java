package Exercise4;
//Scannerクラスをインポート。

import java.util.Scanner;

/* 
 * クラス名 Exercise4_22
 * 概要 入力した値の段数のピラミッドを表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/12
 */
public class Exercise4_22 {
	/* 
	 * 関数名  main
	 * 概要 入力した値の段数のピラミッドを表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int firstInteger = 0;
		//段数に対して増加する記号の数を表した定数2を設定。
		final int CONSTANT_TWO = 2;
		//計算で使用する値である定数1を設定。
		final int CONSTANT_ONE = 1;

		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("ピラミッドの段数は：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//段数を表す変数に入力値を設定。
		int decreaseDown = firstInteger;
		//右下に直角部分をもつ三角形を表示。
		for (int i = 1; i <= firstInteger; i++) {
			//段数に対応した個数の空白を表示する
			for (int j = firstInteger - i; j > 0; --j) {
				//空白を表示。
				System.out.print(' ');
			} //段数に対応する順番の奇数の数だけ記号を表示する。
			for (int k = 1; k <= i * CONSTANT_TWO - CONSTANT_ONE; k++) {
				//記号を表示。
				System.out.print('*');
			} //段数に対応した個数の空白を表示する。
			
			//改行する
			System.out.println();
			//残りの段数を1減少させる
			decreaseDown--;

		}

	}

}
