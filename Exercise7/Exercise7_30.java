package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_30
 * 概要 二つの整数値、三つの整数、配列の要素の値それぞれの最小値を求めて表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/09
 */
public class Exercise7_30 {
	/* 
	 * 関数名 min
	 * 概要 二つの引数の最小値を求めて返却するメソッド
	 * 引数 二つの整数
	 * 返り値 二つの整数の最小値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static int min(int a, int b) {
		//最小値を表す変数を設定
		int minumumNumber = 0;
		//最小値を表す変数に、一つ目の値の方が小さい場合その値を、そうでない場合二つ目の値を代入
		minumumNumber = (a < b ? a : b);
		//最小値を表す変数を返却
		return minumumNumber;
	}

	/* 
	 * 関数名 min
	 * 概要 三つの引数の最小値を求めて返却するメソッド
	 * 引数 三つの整数
	 * 返り値 三つの整数の最小値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static int min(int a, int b, int c) {
		//最小値を表す変数を設定
		int minumumNumber = 0;
		//一つ目の値が他の二つの値より小さい場合
		if (a < b && a < c) {
			//最小値を表す変数に一つ目の値を代入
			minumumNumber = a;
		}
		//二つ目の値が他の二つの値より小さい場合
		else if (b < a && b < c) {
			//最小値を表す変数に二つ目の値を代入
			minumumNumber = b;
		}
		//三つ目の値が他の二つの値より小さい場合
		else {
			//最小値を表す変数に三つ目の値を代入
			minumumNumber = c;
		}
		//最小値を表す変数を返却
		return minumumNumber;
	}

	/* 
	 * 関数名 min
	 * 概要 配列の要素の値の最小値を求めて返却するメソッド
	 * 引数 配列
	 * 返り値 配列の要素の値の最小値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */
	static int min(int[] a) {
		//最小値を表す変数を設定
		int minumumNumber = 0;
		//最小値を表す変数に配列の先頭の要素を代入しておく
		minumumNumber = a[0];

		//配列内の全ての要素の最小値を求める
		for (int i = 0; i < a.length; i++) {
			//対象の要素が最小値よりも小さい場合
			if (a[i] < minumumNumber) {
				//最小値に対象の要素を代入
				minumumNumber = a[i];
			}
		}
		//最小値を表す変数を返却する
		return minumumNumber;
	}
	/* 
	 * 関数名 main
	 * 概要 三つの整数値と配列に入力させ、二つの整数値、三つの整数値、配列の要素の値のそれぞれの最小値を求めて表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/09
	 */

	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//一つ目の整数値を表す変数を設定
		int firstInteger = 0;
		//二つ目の整数値を表す変数を設定
		int secondInteger = 0;
		//三つ目の整数値を表す変数を設定
		int thirdInteger = 0;

		//一つ目の整数値の入力を促す
		System.out.print("整数a：");
		//入力された値を読み込む
		firstInteger = standerdInput.nextInt();
		//二つ目の整数値の入力を促す
		System.out.print("整数b：");
		//入力された値を読み込む
		secondInteger = standerdInput.nextInt();
		//三つ目の整数値の入力を促す
		System.out.print("整数c：");
		//入力された値を読み込む
		thirdInteger = standerdInput.nextInt();

		//配列の要素数を表す変数を設定
		int elementNumber = 0;

		//配列の要素数を正の整数値で入力させる
		for (; elementNumber <= 0;) {
			//要素数の入力を促す
			System.out.print("配列の要素数：");
			//入力された値を読み込む
			elementNumber = standerdInput.nextInt();
			//入力された値が0以下だった場合
			if (elementNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		}
		//入力された要素数を持つ配列を生成
		int[] variableArray = new int[elementNumber];
		//要素の入力を促す
		System.out.println("要素を入力してください。");
		//配列の全要素に入力させる
		for (int i = 0; i < elementNumber; i++) {
			//配列への入力を促す
			System.out.print("variableArray[" + i + "] ：");
			//配列の各要素に入力を読み込む
			variableArray[i] = standerdInput.nextInt();
		}
		//一つ目と二つ目の整数の最小値を表示
		System.out.println("整数aと整数bの最小値は " + min(firstInteger,secondInteger) + " です。");
		//三つの整数の最小値を表示
		System.out.println("整数aと整数bと整数cの最小値は "+ min(firstInteger,secondInteger,thirdInteger) + " です。");
		//配列の要素の最小値を表示
		System.out.println("配列の要素の最小値は " + min(variableArray) + " です。");

	}

}
