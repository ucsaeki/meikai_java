package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_13
 * 概要 入力された整数値の指定された桁のビット数を1、0、反転させた値にそれぞれ変換した値を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/26
 */
public class Exercise7_13 {
	//指定された桁のビット数を1に変更した後の数値を表す変数を設定
	static int oneChanged = 0;
	//指定された桁のビット数を0に変更した後の数値を表す変数を設定
	static int zeroChanged = 0;
	//指定された桁のビット数を反転させた後の数値を表す変数を設定
	static int inverseChanged = 0;

	/* 
	 * 関数名 set
	 * 概要 整数値の指定された桁のビット数の値を1にして返却するメソッド
	 * 引数 入力された整数値、ビット数を変更する桁を指定する整数値
	 * 返り値 指定された桁のビット数を1に変換した整数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/26
	 */
	static int set(int x, int pos) {
		//計算で使用するための定数を設定
		final int CONSTANT_ONE = 1;
		//指定された桁にのみ1と表示される値を表す変数を設定
		int wordCount = 0;
		//1を指定された桁数左シフトした値を変数に代入。
		wordCount = CONSTANT_ONE << pos;
		//整数値を表す変数に、整数値の指定された桁のビット数の値を1に変更した値を代入
		x = x | wordCount;
		//指定されたビット数を1に変更した後の整数値を変数に代入
		oneChanged = x;
		//変更した値を返却する。
		return oneChanged;

	}

	/* 
	 * 関数名 reset
	 * 概要 整数値の指定された桁のビット数の値を0にして返却するメソッド
	 * 引数 入力された整数値、ビット数を変更する桁を指定する整数値
	 * 返り値 指定された桁のビット数を1に変換した整数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/26
	 */

	static int reset(int x, int pos) {
		//計算で使用するための定数を設定
		final int CONSTANT_ONE = 1;
		//指定された桁にのみ1と表示される値を表す変数を設定
		int wordCount = 0;
		//1を指定された桁数左シフトした値を変数に代入。
		wordCount = CONSTANT_ONE << pos;

		//変更したいビット数の値が1だった場合
		if (((x >>> pos & CONSTANT_ONE) == CONSTANT_ONE)) {
			//排他的論理和演算子を用いて変更したいビット数を0に変更する
			x = x ^ wordCount;
		}
		//指定したビット数を0に変更した後の整数値を変数に代入
		zeroChanged = x;
		//変更した値を返却する。
		return zeroChanged;
	}

	/* 
	 * 関数名 inverse
	 * 概要 整数値の指定された桁のビット数の値を反転して返却するメソッド
	 * 引数 入力された整数値、ビット数を変更する桁を指定する整数値
	 * 返り値 指定された桁のビット数を反転した整数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/26
	 */
	static int inverse(int x, int pos) {
		//計算で使用するための定数を設定
		final int CONSTANT_ONE = 1;
		//指定された桁にのみ1と表示される値を表す変数を設定
		int wordCount = 0;
		//1を指定された桁数左シフトした値を変数に代入。
		wordCount = CONSTANT_ONE << pos;

		//変更したいビット数の値が1だった場合
		if (((x >>> pos & CONSTANT_ONE) == CONSTANT_ONE)) {
			//排他的論理和を用いて変更したいビット数を0に変更する
			x = x ^ wordCount;
		} //変更したいビット数の値が0だった場合
		else {
			//指定したビット数の値を1に変更した値を代入
			x = x | wordCount;
		}
		//指定したビット数を反転した後の整数値を変数に代入
		inverseChanged = x;
		//変更した値を返却する。
		return inverseChanged;
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

		//0から数えたビットの桁数を表す定数を設定
		final int BIT_DIGITS = 31;
		//計算に使用する定数を設定
		final int CONSTANT_ONE = 1;

		//整数値のビット構成を表示する
		for (int i = BIT_DIGITS; i >= 0; i--) {
			//ビット中の対象の桁の値が1の場合1を、0の場合0を表示する。
			System.out.print(((x >>> i & CONSTANT_ONE) == CONSTANT_ONE) ? '1' : '0');
		} //表示が終わったら改行する
		System.out.println();
	}

	/* 
	 * 関数名 main
	 * 概要 入力された整数値の指定された桁のビット数をそれぞれの関数を用いて変換した値を表示する
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
		//0から数えたビットの桁数を表す定数を設定
		final int BIT_DIGITS = 31;
		//入力された整数値を表す変数を設定
		int variableNumber = 0;
		//ビット数を変更したい桁数を表す変数を設定し、入力の範囲外の値を初期値として設定する。
		int variableCount = MINUS_ONE;

		//整数値の入力を促す
		System.out.print("整数値：");
		//整数値の入力を読み込む
		variableNumber = standerdInput.nextInt();

		//変更したい桁数の値を0以上32未満の値で入力させる
		for (; variableCount < 0 || variableCount > BIT_DIGITS;) {
			//順番の入力を促す
			System.out.print("変更したいビットの桁数：");
			//入力された値を読み込む
			variableCount = standerdInput.nextInt();
			//入力された値が0未満または31より大きい値だった場合
			if (variableCount < 0 || variableCount > BIT_DIGITS) {
				//0以上の数値での入力を求めるエラー文を表示
				System.out.println("0以上32未満の値を入力してください。");
			}
		}

		//整数値のビットを表示することを提示
		System.out.println("整数値をビットで表します。");
		//関数を用いて、入力された整数値のビット構成を表示
		printBits(variableNumber);
		//改行する
		System.out.println();

		//関数を用いて、整数値の指定された桁のビット数を1に変更した値を表示する。
		System.out.println(variableCount + "ビット目の値を1に変更した値は" + set(variableNumber, variableCount) + "です。");
		//直前に表示した値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、整数値の指定された桁のビット数を1に変更した値をビットで表示
		printBits(oneChanged);
		//改行する
		System.out.println();

		//関数を用いて、整数値の指定された桁のビット数を0に変更した値を表示する。
		System.out.println(variableCount + "ビット目の値を0に変更した値は" + reset(variableNumber, variableCount) + "です。");
		//直前に表示した値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、整数値の指定された桁のビット数を0に変更した値をビットで表示
		printBits(zeroChanged);
		//改行する
		System.out.println();

		//関数を用いて、整数値の指定された桁のビット数を反転した値を表示する。
		System.out.println(variableCount + "ビット目の値を反転した値は" + inverse(variableNumber, variableCount) + "です。");
		//直前に表示した値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、整数値の指定された桁のビット数を反転した値をビットで表示
		printBits(inverseChanged);
		//改行する
		System.out.println();

	}

}
