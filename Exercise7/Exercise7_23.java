package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_23
 * 概要 作成した配列内の、指定した値が格納されているインデックスの値で構成された配列を作成して表示する。
 * 作成者 Y.Saeki
 * 作成日 2024/05/02
 */
public class Exercise7_23 {

	/* 
	 * 関数名 countTarget
	 * 概要 配列内の捜索する要素の個数を数えて返却するメソッド。
	 * 引数 配列、配列の要素から捜索する値
	 * 返り値 発見した指定の要素の個数
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	static int countTarget(int[] a, int x) {
		//配列内の捜索する要素の個数を数える変数を設定
		int indexCount = 0;

		//入力された配列の全要素から指定した値のインデックスの値を抽出し、新しい配列の要素に代入する。
		for (int i = 0; i < a.length; i++) {
			//要素が指定した値と同じだった場合
			if (a[i] == x) {
				//要素の個数を数える変数に1加算
				indexCount++;
			}
		}
		//数えた個数を返却
		return indexCount;
	}

	/* 
	 * 関数名 arraySrchIdx
	 * 概要 入力された配列の、指定された要素の値が含まれているインデックスの値が入力された配列を作成するメソッド
	 * 引数 配列、配列内から探す要素の値
	 * 返り値 指定した要素が格納されているインデックスの値が入力された配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	static int[] arraySrchIdx(int[] a, int x) {
		//新たに作成した配列の要素を表す変数を設定
		int indexCount = 0;

		//入力された配列の全要素から指定した値のインデックスの値を抽出し、新しい配列の要素に代入する。
		for (int i = 0; i < a.length; i++) {
			//要素が指定した値と同じだった場合
			if (a[i] == x) {
				//指定された要素の個数を表す変数に1加算
				indexCount++;
			}
		}
		//指定した値が格納されているインデックスの値を入力するための配列を作成
		int[] targetIndexArray = new int[indexCount];
		//新しい配列の格納する要素のインデックスの値を表す変数を設定
		int indexNumber = 0;

		for (int i = 0; i < a.length; i++) {
			//もとの配列の要素が指定した値と同じだった場合
			if (a[i] == x) {
				//新しい配列の要素に代入
				targetIndexArray[indexNumber] = i;
				//代入するインデックスの値を表す変数に1加算
				indexNumber++;
			}
		}
		//新たに作成した配列を返却
		return targetIndexArray;

	}

	/* 
	 * 関数名 printArray
	 * 概要 配列の全ての要素を表示するメソッド
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
	 * 概要 作成した配列内の、指定した値が入力されている要素のインデックスの値が入力された配列を作成して表示する。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//配列の要素数を表す変数を設定
		int elementNumber = 0;

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

		//要素の入力を促す
		System.out.println("要素を入力してください。");
		//入力された要素数を持つ配列を生成
		int[] variableArray = new int[elementNumber];
		//配列の全要素に入力させる
		for (int i = 0; i < elementNumber; i++) {
			//配列への入力を促す
			System.out.print("variableArray[" + i + "] ：");
			//配列に入力を読み込む
			variableArray[i] = standerdInput.nextInt();
		}

		//捜索する要素の値を表す変数を設定
		int targetNumber = 0;
		//捜索したい要素の値の入力を求める。
		System.out.print("捜索する要素の値：");
		//入力された値を読み込む
		targetNumber = standerdInput.nextInt();

		//探索によって発見した要素の個数を表す変数を設定
		int variableCount = 0;
		//関数を用いて、要素の個数を表す変数に発見した要素の個数を代入
		variableCount = countTarget(variableArray, targetNumber);

		//探索によって目的の値を発見した場合
		if (variableCount > 0) {
			//もとの配列の表示を予告
			System.out.print("variableArray = ");
			//関数を用いて入力した配列を表示
			printArray(variableArray);

			//探索によって作成した配列の表示を予告
			System.out.print("targetIndexArray = ");
			//関数を用いて作成した要素の値が含まれている配列を表示
			printArray(arraySrchIdx(variableArray, targetNumber));
		}
		//目的の値を発見できなかった場合
		else {
			//指定した値が配列に含まれていないことを表示
			System.out.println("指定した値は配列内に含まれていません。");
		}

	}

}
