package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_31
 * 概要 入力された値の絶対値を求めて表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/09
 */
public class Exercise7_31 {
	//符号を反転させる計算で使用する定数を設定
	static final int SIGN_REVERSE = -1;

	/* 
	 * 関数名 absolute
	 * 概要 int型の整数の絶対値を求めて返却する
	 * 引数 int型の整数
	 * 返り値 int型の整数の絶対値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static int absolute(int x) {
		//対象の値が負の数の場合
		if (x < 0) {
			//値に符号を反転させる定数をかけて正の数に変換する
			x = x * SIGN_REVERSE;
		}
		//求めた絶対値を返却する
		return x;
	}

	/* 
	 * 関数名 absolute
	 * 概要 long型の整数の絶対値を求めて返却する
	 * 引数 long型の整数
	 * 返り値 long型の整数の絶対値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static long absolute(long x) {
		//対象の値が負の数の場合
		if (x < 0) {
			//値に符号を反転させる定数をかけて正の数に変換する
			x = x * SIGN_REVERSE;
		}
		//求めた絶対値を返却する
		return x;
	}
	/* 
	 * 関数名 absolute
	 * 概要 float型の実数の絶対値を求めて返却する
	 * 引数 float型の実数
	 * 返り値 float型の実数の絶対値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	static float absolute(float x) {
		//対象の値が負の数の場合
		if (x < 0) {
			//値に符号を反転させる定数をかけて正の数に変換する
			x = x * SIGN_REVERSE;
		}
		//求めた絶対値を返却する
		return x;
	}

	/* 
	 * 関数名 absolute
	 * 概要 double型の実数の絶対値を求めて返却する
	 * 引数 double型の実数
	 * 返り値 double型の実数の絶対値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	static double absolute(double x) {
		//対象の値が負の数の場合
		if (x < 0) {
			//値に符号を反転させる定数をかけて正の数に変換する
			x = x * SIGN_REVERSE;
		}
		//求めた絶対値を返却する
		return x;
	}

	/* 
	 * 関数名 main
	 * 概要 int型、long型の整数、float型、double型の実数を入力させ、それぞれの値の絶対値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//int型の整数を表す変数を設定
		int firstInteger = 0;
		//long型の整数を表す変数を設定
		long secondInteger = 0;
		//float型の実数を表す変数を設定
		float firstReal = 0;
		//double型の実数を表す変数を設定
		double secondReal = 0;

		//int型の整数値の入力を促す
		System.out.print("int型の整数a：");
		//入力された値を読み込む
		firstInteger = standerdInput.nextInt();

		//long型の整数値の入力を促す
		System.out.print("long型の整数b：");
		//入力された値を読み込む
		secondInteger = standerdInput.nextLong();

		//float型の実数値の入力を促す
		System.out.print("float型の実数c：");
		//入力された値を読み込む
		firstReal = standerdInput.nextFloat();

		//double型の実数値の入力を促す
		System.out.print("double型の実数d：");
		//入力された値を読み込む
		secondReal = standerdInput.nextDouble();

		//絶対値を表示することを予告
		System.out.println("入力された値の絶対値を表示します。");
		//関数を用いて、int型の整数の絶対値を表示
		System.out.println("整数aの絶対値は " + absolute(firstInteger) + " です。");
		//関数を用いて、long型の整数の絶対値を表示
		System.out.println("整数bの絶対値は " + absolute(secondInteger) + " です。");
		//関数を用いて、float型の実数の絶対値を表示
		System.out.println("実数cの絶対値は " + absolute(firstReal) + " です。");
		//関数を用いて、double型の実数の絶対値を表示
		System.out.println("実数dの絶対値は " + absolute(secondReal) + " です。");
	}

}
