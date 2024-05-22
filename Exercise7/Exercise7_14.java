package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_14
 * 概要 入力された整数値の指定された桁から指定された桁数分のビットを1、0、反転させた値を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/30
 */
public class Exercise7_14 {

	//指定された桁のビット数を1に変更した後の数値を表す変数を設定
	static int oneChanged = 0;
	//指定された桁のビット数を0に変更した後の数値を表す変数を設定
	static int zeroChanged = 0;
	//指定された桁のビット数を反転させた後の数値を表す変数を設定
	static int inverseChanged = 0;

	/* 
	 * 関数名 setN
	 * 概要 整数値を指定された桁から指定された桁数分のビットを1にして返却するメソッド
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */
	static int setN(int x, int pos, int n) {

		//計算で使用するための定数を設定
		final int CONSTANT_ONE = 1;
		//指定された範囲の桁にのみ1と表示される値を表す変数を設定
		int wordCount = 0;

		//ビットの指定された桁から指定された個数分1を表示した値を作成
		for (int i = 0; i < n; i++) {
			//1を指定された桁数左シフトした値を変数に代入
			wordCount += CONSTANT_ONE << (pos + i);
		}
		//整数値を表す変数に、整数値の指定された桁のビット数の値を1に変更した値を代入
		x = x | wordCount;
		//求めた整数値を、指定した箇所を1に変更した後の変数に代入
		oneChanged = x;
		//求めた整数値を返却する。
		return oneChanged;
	}

	/* 
	 * 関数名 resetN
	 * 概要 整数値を指定された桁から指定された桁数分のビットを0にして返却するメソッド
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */

	static int resetN(int x, int pos, int n) {
		//計算で使用するための定数を設定
		final int CONSTANT_ONE = 1;
		//ビット数の全ての値が1となる定数を設定。
		final int ALL_ONE_BITS = -1;
		//0に変換したい桁にのみ0と表示される値を表す変数を設定
		int wordCount = 0;

		//ビットの指定された桁から指定された桁数分1を表示した値を作成
		for (int i = 0; i < n; i++) {
			//1を指定された桁数左シフトした値を変数に代入
			wordCount += CONSTANT_ONE << (pos + i);
		}
		//排他的論理和を用いて、ビット数を0に変換したい桁だけ0と表示される値を生成。
		wordCount = wordCount ^ ALL_ONE_BITS;
		//論理積を用いて変更したいビット数を0に変更した値を生成。
		x = x & wordCount;

		//求めた整数値を、指定した箇所を0に変更した後の変数に代入
		zeroChanged = x;
		//求めた整数値を返却する。
		return zeroChanged;
	}

	/* 
	 * 関数名 inverseN
	 * 概要 整数値を指定された桁から指定された桁数分のビットを反転して返却するメソッド
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */
	static int inverseN(int x, int pos, int n) {
		//0から数えたビットの桁数を表す定数を設定
		final int BIT_DIGITS = 32;
		//ビット数の全ての値が1となる定数を設定。
		final int ALL_ONE_BITS = -1;
		//0に変換したい桁にのみ0と表示される値を表す変数を設定
		int wordCount = 0;
		//変更するビットの桁と桁数が0の場合
		if (pos == 0 && n == 0) {
			//計算が不要なので、反転させた後の値を表す変数にそのままの値を代入。
			inverseChanged = x;
		} else {
			//全てのビット数が1の整数値を指定された桁分右にシフト
			wordCount = ALL_ONE_BITS >>> pos;
			//全体から変換したい桁数分を引いた値だけ左にシフト
			wordCount = wordCount << (BIT_DIGITS - n);
			//1が反転させたい箇所に合うように右にシフト
			wordCount = wordCount >>> (BIT_DIGITS - (pos + n));

			//排他的論理和を用いて、反転させたい箇所を反転させる。
			x = x ^ wordCount;
			//求めた整数値を、指定した箇所を反転させた後の変数に代入
			inverseChanged = x;
		}
		//求めた整数値を返却する。
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
	 * 概要 整数値と、変更したいビットの桁、変更したい桁数を入力させ、変更後の値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//0から数えたビットの桁数を表す定数を設定
		final int BIT_DIGITS = 31;
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//入力された整数値を表す変数を設定
		int variableNumber = -1;
		//ビット数を変更したい桁数を表す変数を設定し、入力の範囲外の値を初期値として設定する。
		int variableCount = -1;
		//変更する桁数を表す変数を設定
		int digitNumber = -1;

		//整数値の入力を促す
		System.out.print("整数値：");
		//整数値の入力を読み込む
		variableNumber = standerdInput.nextInt();

		//変更するビットの最下位の桁を入力させる
		while (variableCount < 0 || variableCount > BIT_DIGITS) {
			//順番の入力を促す
			System.out.print("変更するビットの桁：");
			//入力された値を読み込む
			variableCount = standerdInput.nextInt();
			//入力された値が0より小さい、または31より大きい場合
			if (variableCount < 0 || variableCount > BIT_DIGITS) {
				//0以上31以下の数値での入力を求めるエラー文を表示
				System.out.println("0以上31以下の値を入力してください。");
			}
		}
		//入力された値がビットの最大桁数の場合
		if (variableCount == BIT_DIGITS) {
			//変更できる桁数が1しかないことを表示。
			System.out.println("最大の桁が入力されているので1桁しか変更できません。");
			//変更する桁数を表す変数に1を代入。
			digitNumber = CONSTANT_ONE;
		}

		//変更したいビットの桁数を、ビットの最大桁数以内で入力させる
		while (digitNumber < 0 || digitNumber > (BIT_DIGITS - variableCount + CONSTANT_ONE)) {
			//順番の入力を促す
			System.out.print("変更するビットの桁数：");
			//入力された値を読み込む
			digitNumber = standerdInput.nextInt();
			//入力された値が表す変更したい範囲がビットの桁数の上限を超える場合
			if (digitNumber < 0 || digitNumber > (BIT_DIGITS - variableCount + CONSTANT_ONE)) {
				//0以上32未満の数値での入力を求めるエラー文を表示
				System.out.println("1以上" + (BIT_DIGITS - variableCount + CONSTANT_ONE) + "以下の値を入力してください。");
			}
		}

		//整数値のビットを表示することを提示
		System.out.println("整数値をビットで表します。");
		//関数を用いて、入力された整数値のビット構成を表示
		printBits(variableNumber);
		//改行する
		System.out.println();

		//関数を用いて、整数値の指定された桁のビット数を1に変更した値を表示する。
		System.out.println(variableCount + "ビット目から" + digitNumber + "桁分の値を1に変更した値は"
				+ setN(variableNumber, variableCount, digitNumber) + "です。");

		//直前に表示した値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、整数値の指定された桁のビット数を1に変更した値をビットで表示
		printBits(oneChanged);
		//改行する
		System.out.println();

		//関数を用いて、整数値の指定された桁のビット数を0に変更した値を表示する。
		System.out.println(variableCount + "ビット目から" + digitNumber + "桁分の値を0に変更した値は"
				+ resetN(variableNumber, variableCount, digitNumber) + "です。");

		//直前に表示した値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、整数値の指定された桁のビット数を0に変更した値をビットで表示
		printBits(zeroChanged);
		//改行する
		System.out.println();

		//関数を用いて、整数値の指定された桁のビット数を反転した値を表示する。
		System.out.println(variableCount + "ビット目から" + digitNumber + "桁分の値を反転した値は"
				+ inverseN(variableNumber, variableCount, digitNumber) + "です。");

		//直前に表示した値をビットで表示することを提示
		System.out.println("ビットで表します。");
		//関数を用いて、整数値の指定された桁のビット数を反転した値をビットで表示
		printBits(inverseChanged);
		//改行する
		System.out.println();

	}

}
