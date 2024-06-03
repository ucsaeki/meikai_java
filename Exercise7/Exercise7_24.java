package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_24
 * 概要 作成した配列から指定した要素を削除する
 * 作成者 Y.Saeki
 * 作成日 2024/05/07
 */
public class Exercise7_24 {

	//配列の要素数と末尾のインデックスの値のズレを解消するための定数を設定。
	static final int FILL_ONE = 1;

	/* 
	 * 関数名 arrayRm0f
	 * 概要 配列の指定された要素を削除した配列を作成し返却するメソッド
	 * 引数 配列、削除する要素
	 * 返り値 削除を行った配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/07
	 */
	static int[] arrayRmv0f(int[] a, int idx) {
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//入力された配列より要素数が1小さい配列を作成
		int[] removedArray = new int[a.length - CONSTANT_ONE];

		//削除したい要素の1つ前までの要素を新たに作成した配列に代入
		for (int i = 0; i < idx; i++) {
			//新しく作成した配列の要素に入力された配列の要素を代入
			removedArray[i] = a[i];
		}
		//指定された要素を削除した要素をそれぞれ新しく作成した配列の要素に代入する
		for (int i = idx; i < removedArray.length; i++) {
			//削除された要素のひとつ前にずらした要素の値を代入する
			removedArray[i] = a[i + CONSTANT_ONE];
		}
		//新しく作成した配列を返却する
		return removedArray;
	}

	/* 
	 * 関数名 printArray
	 * 概要 配列の全ての要素を表示するメソッド
	 * 引数 配列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/07
	 */

	static void printArray(int[] a) {

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
	 * 概要 配列を作成し、その配列の指定した要素を削除した配列を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/07
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

		//削除したい要素を表す定数を設定。
		int removeNumber = 0;

		//削除する要素の入力を促す
		System.out.print("削除したい要素：");
		//入力を読み込む
		removeNumber = standerdInput.nextInt();

		//存在する要素を入力させる
		for (; removeNumber < 0 || removeNumber > elementNumber - FILL_ONE;) {
			//入力された要素が要素の数より大きかった場合
			if (removeNumber < 0 || removeNumber > elementNumber - FILL_ONE) {
				//存在する要素を選択するようにエラー表示を出す。
				System.out.println("0以上" + (elementNumber - FILL_ONE) + "以下の値を入力してください");
				//削除する要素の入力を促す
				System.out.print("削除したいインデックス：");
				//入力を読み込む
				removeNumber = standerdInput.nextInt();
			}
		}
		//要素数が1の場合を表す定数を設定
		final int ELEMENT_ONE = 1;
		//要素数が1の場合
		if (elementNumber == ELEMENT_ONE) {
			//削除を行ったことを表示。
			System.out.print("入力された要素を削除しました。");

		} //要素数が1より大きい場合
		else {
			//もとの配列の表示を予告
			System.out.print("variableArray = ");
			//関数を用いてもとの配列を表示
			printArray(variableArray);

			//削除を行った後の配列の表示を予告
			System.out.print("removedArray = ");
			//関数を用いて削除を行った後の配列を表示
			printArray(arrayRmv0f(variableArray, removeNumber));
		}

	}

}
