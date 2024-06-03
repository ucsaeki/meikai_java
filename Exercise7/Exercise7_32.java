package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_32
 * 概要 入力されたbyte型、short型、int型、long型の値をそれぞれビット構成で表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/09
 */
public class Exercise7_32 {
	//ビット構成の桁数のズレを調整するための定数を設定
	static final int FILL_ONE = 1;
	//対象の値を1で割る計算で使用する定数を設定
	static final int DIVISION_ONE = 1;
	//対象の値を1で割った余りを表す定数を設定。
	static final int REMINDER_ONE = 1;

	/* 
	 * 関数名 printBits
	 * 概要 byte型の整数値をビット構成で表示するメソッド
	 * 引数 byte型の整数値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static void printBits(byte x) {
		//byte型のビット構成の桁数を表す定数を設定
		final int BYTE_DIDITS = 8;
		//byte型のビット構成を表示する
		for (int i = (BYTE_DIDITS - FILL_ONE); i >= 0; i--) {
			//対象の桁のを割った余りが1になる場合1と表示し、そうでない場合0と表示する
			System.out.print(((x >>> i & DIVISION_ONE) == REMINDER_ONE) ? '1' : '0');
		}
		//改行する
		System.out.println();
	}

	/* 
	 * 関数名 printBits
	 * 概要 short型の整数値をビット構成で表示するメソッド
	 * 引数 short型の整数値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static void printBits(short x) {
		//short型のビット構成の桁数を表す定数を設定
		final int SHORT_DIDITS = 16;
		//short型のビット構成を表示する
		for (int i = (SHORT_DIDITS - FILL_ONE); i >= 0; i--) {
			//対象の桁のを割った余りが1になる場合1と表示し、そうでない場合0と表示する
			System.out.print(((x >>> i & DIVISION_ONE) == REMINDER_ONE) ? '1' : '0');
		}
		//改行する
		System.out.println();
	}
	/* 
	 * 関数名 printBits
	 * 概要 int型の整数値をビット構成で表示するメソッド
	 * 引数 int型の整数値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	static void printBits(int x) {
		//int型のビット構成の桁数を表す定数を設定
		final int INT_DIDITS = 32;
		//int型のビット構成を表示する
		for (int i = (INT_DIDITS - FILL_ONE); i >= 0; i--) {
			//対象の桁のを割った余りが1になる場合1と表示し、そうでない場合0と表示する
			System.out.print(((x >>> i & DIVISION_ONE) == REMINDER_ONE) ? '1' : '0');
		}
		//改行する
		System.out.println();
	}

	/* 
	 * 関数名 printBits
	 * 概要 long型の整数値をビット構成で表示するメソッド
	 * 引数 long型の整数値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	static void printBits(long x) {
		//long型のビット構成の桁数を表す定数を設定
		final int LONG_DIDITS = 64;
		//long型のビット構成を表示する
		for (int i = (LONG_DIDITS - FILL_ONE); i >= 0; i--) {
			//対象の桁のを割った余りが1になる場合1と表示し、そうでない場合0と表示する
			System.out.print(((x >>> i & 1) == REMINDER_ONE) ? '1' : '0');
		}
		//改行する
		System.out.println();

	}

	/* 
	 * 関数名 main
	 * 概要 byte型、short型、int型、long型の値をそれぞれビット構成で表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//byte型の整数を表す変数を設定
		byte firstInteger = 0;
		//short型の整数を表す変数を設定
		short secondInteger = 0;
		//int型の整数を表す変数を設定
		int thirdInteger = 0;
		//long型の整数を表す変数を設定
		long fourthInteger = 0;

		//int型の整数値の入力を促す
		System.out.print("byte型の整数a：");
		//入力された値を読み込む
		firstInteger = standerdInput.nextByte();

		//int型の整数値の入力を促す
		System.out.print("short型の整数b：");
		//入力された値を読み込む
		secondInteger = standerdInput.nextShort();

		//int型の整数値の入力を促す
		System.out.print("int型の整数c：");
		//入力された値を読み込む
		thirdInteger = standerdInput.nextInt();

		//int型の整数値の入力を促す
		System.out.print("longの整数d：");
		//入力された値を読み込む
		fourthInteger = standerdInput.nextLong();

		//改行する
		System.out.println();

		//入力された値のビット構成を表示することを予告
		System.out.println("入力した値をビット構成で表示します。");
		//byte型の整数値を表示することを予告
		System.out.println("整数a");
		//関数を用いて、byte型のビット構成を表示
		printBits(firstInteger);
		//byte型の整数値を表示することを予告
		System.out.println("整数ｂ");
		//関数を用いて、byte型のビット構成を表示
		printBits(secondInteger);
		//byte型の整数値を表示することを予告
		System.out.println("整数c");
		//関数を用いて、byte型のビット構成を表示
		printBits(thirdInteger);
		//byte型の整数値を表示することを予告
		System.out.println("整数d");
		//関数を用いて、byte型のビット構成を表示
		printBits(fourthInteger);

	}

}
