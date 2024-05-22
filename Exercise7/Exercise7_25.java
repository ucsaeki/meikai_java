package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_25
 * 概要 作成した配列の指定した要素から指定した数の要素を削除した配列を作成して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/07
 */

public class Exercise7_25 {

	//配列の要素数と末尾のインデックスの値のズレを解消するための定数を設定。
	static final int FILL_ONE = 1;
	
	/* 
	 * 関数名 arrayRmv0fN
	 * 概要 入力された配列の指定された要素から指定された個数の要素を削除した配列を作成して返却する
	 * 引数 配列、削除を開始する要素、要素を削除する個数
	 * 返り値 削除を行った後の配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/07
	 */

	static int[] arrayRmv0fN(int[] a, int idx, int n) {
		//入力された配列から、削除する要素の個数を引いた要素数を持つ配列を作成
		int[] removedArray = new int[a.length - n];
		//削除したい要素の1つ前までの要素を新たに作成した配列に代入
		for (int i = 0; i < idx; i++) {
			//新しく作成した配列の要素に入力された配列の要素を代入
			removedArray[i] = a[i];
		}
		//削除する要素より後ろの値を全て作成した配列の要素に代入
		for (int i = idx; i < removedArray.length; i++) {
			//削除する要素より後ろの要素を前にずらして配列に代入
			removedArray[i] = a[i + n];
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
	 * 概要 作成した配列の削除する先頭の要素と削除する要素の個数を入力させ、
	 * 削除をおこなった後の配列を表示する
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

		//削除したい要素を表す変数を設定。
		int removeNumber = 0;
		//削除する要素の入力を促す
		System.out.print("削除したい要素：");
		//入力を読み込む
		removeNumber = standerdInput.nextInt();

		//存在する要素を入力させる
		for (; removeNumber < 0 || removeNumber > elementNumber - FILL_ONE;) {
			//入力された要素が要素の個数より大きかった場合
			if (removeNumber < 0 || removeNumber > elementNumber - FILL_ONE) {
				//存在する要素を選択するようにエラー表示を出す。
				System.out.println("0以上" + (elementNumber - FILL_ONE) + "以下の値を入力してください");
				//削除する要素の入力を促す
				System.out.print("削除したい要素：");
				//入力を読み込む
				removeNumber = standerdInput.nextInt();
			}
		}
		//削除個数を表す変数を設定
		int removePieces = 0;

		//削除する要素の入力を促す
		System.out.print("削除したい要素の個数：");
		//入力を読み込む
		removePieces = standerdInput.nextInt();

		//削除する個数を1から削除可能な範囲内で入力させる
		for (; removePieces <= 0 || removePieces > (elementNumber - removeNumber);) {

			//入力された要素が0以下、または削除可能な範囲外の値だった場合
			if (removePieces <= 0 || removePieces > (elementNumber - removeNumber)) {
				//存在する要素を選択するようにエラー表示を出す。
				System.out.println("1以上" + (elementNumber - removeNumber) + "以下の値を入力してください");
				//削除可能な要素の入力を促す
				System.out.print("削除したい要素の個数：");
				//入力を読み込む
				removePieces = standerdInput.nextInt();
			}
		}

		//要素数が1の場合を表す定数を設定
		final int ELEMENT_ONE = 1;
		//要素数が1の場合
		if (elementNumber == ELEMENT_ONE) {
			//削除を行ったことを表示。
			System.out.print("入力された要素を削除しました。");

			//作成した配列の要素数と削除する要素の個数が同じ場合
		} else if (elementNumber == removePieces) {
			//全ての要素の削除を行ったことを表示。
			System.out.print("入力された全ての要素を削除しました。");

		} else {
			//もとの配列の表示を予告
			System.out.print("variableArray = ");
			//関数を用いてもとの配列を表示
			printArray(variableArray);

			//削除を行った後の配列の表示を予告
			System.out.print("removedArray = ");
			//関数を用いて削除を行った後の配列を表示
			printArray(arrayRmv0fN(variableArray, removeNumber, removePieces));

		}

	}
}
