package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_12
 * 概要 入力された整数値を指定した値だけ左右にビット回転させた値を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/25
 */
public class Exercise7_12 {

	/* 
	 * 関数名  rRotate
	 * 概要 入力された整数値を指定した回数だけ右にビット回転させた値を返却するメソッド
	 * 引数 入力された整数値、ビット回転する回数
	 * 返り値 指定回数右にビット回転させた後の値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */

	static int rRotate(int x, int n) {
		//指定された回数右にビット回転させる
		for (int i = n; i > 0; i--) {
			//整数値を指定した回数右シフトした末尾の値が1の場合
			if (((x >>> i & 1) == 1)) {
				//整数値を表す変数を右に一回シフトさせた値を変数に代入。
				x = (x >> 1) ;
			//整数値を指定した回数右シフトした末尾の値が0の場合
			} else {
				
				x >>>= 1;
			}
		}
		return x;

	}

	/* 
	 * 関数名  lRotate
	 * 概要 入力された整数値を指定した値だけ左にビット回転させた値を返却するメソッド
	 * 引数 入力された整数値、ビット回転する回数
	 * 返り値 左にビット回転させた後の値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */

	static int lRotate(int x, int n) {

		for (int i = n; i > 0; i--) {

			if (((x >>> i & 1) == 1)) {

				x = ~(2147483647) + ( x << 1);
				
			} else {

				x <<= 1;
			}
		}
		return x;
	}

	/* 
	 * 関数名 printBits
	 * 概要 10進数の整数値を32桁の2進数で表示するメソッド
	 * 引数 10進数の整数値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */
	
	static void printBits( int x) {
		//ビットの桁数を表す定数を設定
		final int BITE_DIGITS = 31;
		
		System.out.println( x + "を二進数で表示します。");
		//対象の整数値を32桁の2進数で表示する
		for ( int i = BITE_DIGITS; i >= 0; i--) {
			//整数値を繰り返しの回数に応じた回数右にシフトし、末尾が1の場合1を、0の場合0を表示する。
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}
	
	static void test( int x, int y) {
		System.out.println("test");
		
		final int MINIMUM_BIT = -2147483648;
		
		int afterRightShift =0;
		
		int afterRightRotate = 0;
		
		afterRightRotate = x >> 1;
		
		afterRightShift =
				
				afterRightRotate | MINIMUM_BIT;
		
		
		printBits(x);
		System.out.println();
		
		
		
		printBits(MINIMUM_BIT);
		System.out.println();
		
		printBits(afterRightRotate);
		System.out.println();
	
		
		
	
		printBits(afterRightShift);
		System.out.println();
		
		printBits(x);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された整数値を表す変数を設定
		int integerNumber = 0;
		//ビット回転を行う回数を表す変数を設定
		int rotateTimes = 0;
		
		//ビット回転させたい整数値の入力を促す文章を表示
		System.out.print("ビット回転させたい整数値：");
		//入力された整数値を読み込む
		integerNumber = standerdInput.nextInt();
		
		//1以上の回転回数を入力させる
		for (; rotateTimes <= 0;) {
			//ビット回転させる回数の入力を促す
			System.out.print("ビット回転の回数：");
			//入力された値を読み込む
			rotateTimes = standerdInput.nextInt();
			//入力された回転回数が0回以下だった場合
			if ( rotateTimes <= 0) {
				//1以上の数値での入力を求めるエラー文を表示
				System.out.println("回転数は1以上の値で入力してください。");
			}
		}
		
		
		System.out.println("整数値をビットで表します。");
		
		printBits(integerNumber);
		
		System.out.println();
		
		//関数を用いて、入力された整数値を指定された回数右にビット回転させた値を表示。
		System.out.println("右にビット回転させた値は" + rRotate(integerNumber, rotateTimes) + "です。");
		
		System.out.println("右にビット回転させた値をビットで表します。");
		
		printBits(rRotate(integerNumber, rotateTimes));
		
		System.out.println();
		
		//関数を用いて、入力された整数値を指定された回数左にビット回転させた値を表示。
		System.out.println("左にビット回転させた値は" + lRotate(integerNumber, rotateTimes) + "です。");
		
		System.out.println("左にビット回転させた値をビットで表します。");
		
		printBits(lRotate(integerNumber, rotateTimes));
		
		System.out.println();
		System.out.println();
		
		test(integerNumber,rotateTimes);
	
	}

}