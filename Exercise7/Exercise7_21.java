package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;
/* 
 * クラス名 Exercise7_21
 * 概要 二つの配列を作成し、その配列の値を入れ替えてそれぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/01
 */

public class Exercise7_21 {
	/* 
	 * 関数名 aryExchng
	 * 概要 二つの配列の要素の値を入れ替えるメソッド
	 * 引数 要素を入れ替えたい二つの配列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	static void aryExchng(int[] a, int[] b) {
		//入れ替えの際に一時保存するための変数を設定
		int variableContain = 0;
		//二つの配列の要素数の入れ替えを、要素数が少ないほうの要素を全て入れ替えるまで行う。
		for (int i = 0; i < b.length; i++) {
			//一方の要素の値を一時保存しておく変数に代入
			variableContain = a[i];
			//一方の配列の要素をもう片方の配列の要素に代入
			a[i] = b[i];
			//代入し終わった要素に保存しておいたもう一方の配列の要素を代入
			b[i] = variableContain;

		}

	}

	/* 
	 * 関数名 printArray
	 * 概要 配列の全ての要素と要素の値を表示するメソッド
	 * 引数 配列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */

	static void printArray(int[] a) {
		//配列の要素数と末尾のインデックスの値のズレを解消するための定数を設定。
		final int FILL_ONE = 1;

		//冒頭の中カッコを表示
		System.out.print("{");
		//配列内の全要素を表示する
		for (int i = 0; i < a.length; i++) {
			//対象が末尾の要素ではない場合
			if (i != a.length - FILL_ONE) {
				//要素の値と空白を表示
				System.out.print(a[i] + " ");

				//末尾の要素である場合
			} else {
				//要素の値と閉じカッコを表示
				System.out.print(a[i] + "}");
			}
		} //改行する
		System.out.println();
	}

	/* 
	 * 関数名 main
	 * 概要 二つの配列の要素数と要素の値をそれぞれ入力させ、その全要素を入れ替えた配列を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//配列を作成する個数を表す定数を設定
		final int CONSTANT_TWE = 2;
		//配列の要素数を表す変数を設定
		int elementNumber = 0;
		//一つ目の配列を設定
		int[] firstArray = new int[0];
		//二つ目の配列を設定
		int[] secondArray = new int[0];

		//二つの配列の要素と要素数を入力させる
		for (int i = 0; i < CONSTANT_TWE; i++) {
			//これから作成する配列の名前を表示し、要素数の入力を促す
			System.out.println("配列" + (i + CONSTANT_ONE) + "の要素数を入力してください。");

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

			//配列の名前を表示し、その配列の要素の入力を促す
			System.out.println("配列" + (i + CONSTANT_ONE) + "の要素の値を入力してください。");
			//入力するのが配列1の場合
			if (i == 0) {
				//入力された要素数を持つ配列1を生成
				firstArray = new int[elementNumber];
				//配列の全要素に入力させる
				for (int j = 0; j < elementNumber; j++) {
					//配列への入力を促す
					System.out.print("firstArray[" + j + "] ：");
					//配列に入力を読み込む
					firstArray[j] = standerdInput.nextInt();
				}
				//入力するのが配列2の場合
			} else {
				//入力された要素数を持つ配列2を生成
				secondArray = new int[elementNumber];
				//配列の全要素に入力させる
				for (int j = 0; j < elementNumber; j++) {
					//配列への入力を促す
					System.out.print("secondArray[" + j + "] ：");
					//配列に入力を読み込む
					secondArray[j] = standerdInput.nextInt();
				}

			} //次のループで使用するため、要素数を表す変数に0を代入。
			elementNumber = 0;

		}
		//一つ目の配列の方が要素数が多い場合
		if (firstArray.length >= secondArray.length) {
			//関数を用いて二つの配列の全要素を入れ替える
			aryExchng(firstArray, secondArray);
			//二つ目の配列の方が要素数が多い場合
		} else {
			//関数を用いて二つの配列の全要素を入れ替える
			aryExchng(secondArray, firstArray);
		}

		//配列の入れ替えを行ったことを表示。
		System.out.println("配列1と配列2の全要素の値を交換しました。");
		//改行する
		System.out.println();
		//もとの配列の表示を予告
		System.out.print("firstArray = ");
		//関数を用いてもとの配列を表示
		printArray(firstArray);

		//削除を行った後の配列の表示を予告
		System.out.print("secondArray = ");
		//関数を用いて削除を行った後の配列を表示
		printArray(secondArray);

	}

}
