package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;
/* 
 * クラス名 Exercise7_26
 * 概要 作成した配列の指定した要素に指定した値を挿入した配列を作成して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/07
 */

public class Exercise7_26 {

	//配列の要素数と末尾のインデックスの値のズレを解消するための定数を設定。
	static final int FILL_ONE = 1;

	/* 
	 * 関数名 arrayIns0f
	 * 概要 入力された配列の指定された要素に指定された値を代入した配列を作成するメソッド
	 * 引数 配列、挿入したい要素、挿入する値
	 * 返り値 挿入した後の配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/07
	 */
	static int[] arrayIns0f(int[] a, int idx, int x) {
		
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;

		//入力された配列の要素数に1加えた要素数を持つ配列を生成
		int[] insertedArray = new int[a.length + CONSTANT_ONE];

		//挿入する要素の1つ前までの要素を新たに作成した配列に代入
		for (int i = 0; i < idx; i++) {
			//新しく作成した配列の要素に入力された配列の要素を代入
			insertedArray[i] = a[i];
		}
		//新しく作成した配列の挿入したい箇所に挿入したい値を代入
		insertedArray[idx] = x;

		//挿入したい箇所より後ろの要素の値を1つ後ろにずらすように代入
		for (int i = idx; i < a.length; i++) {
			//挿入した箇所から1つ後ろにずらした要素に要素の値を代入
			insertedArray[i + CONSTANT_ONE] = a[i];
		}
		//作成した配列を返却
		return insertedArray;
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
	 * 概要 作成した配列の指定した要素に、指定した値を挿入するメソッド。
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
		
		//挿入する要素を表す変数を設定。
		int insertIndex = 0;

		//挿入する要素の入力を促す
		System.out.print("挿入する要素：");
		//入力を読み込む
		insertIndex = standerdInput.nextInt();

		//存在する要素を入力させる
		for (; insertIndex < 0 || insertIndex > elementNumber - FILL_ONE;) {
			//入力された要素が0より小さい、または要素の個数より大きい場合
			if (insertIndex < 0 || insertIndex > elementNumber - FILL_ONE) {
				//存在する要素を選択するようにエラー表示を出す。
				System.out.println("0以上" + (elementNumber - FILL_ONE) + "以下の値を入力してください");
				//挿入する要素の入力を促す
				System.out.print("挿入する要素：");
				//入力を読み込む
				insertIndex = standerdInput.nextInt();
			}
		}

		//挿入したい値を表す変数を設定
		int insertNumber = 0;

		//挿入したい値の入力を促す
		System.out.print("挿入したい値：");
		//入力を読み込む
		insertNumber = standerdInput.nextInt();

		
		//もとの配列の表示を予告
		System.out.print("variableArray = ");
		//関数を用いてもとの配列を表示
		printArray(variableArray);

		//挿入を行った後の配列の表示を予告
		System.out.print("insertedArray = ");
		//関数を用いて挿入を行った後の配列を表示
		printArray(arrayIns0f(variableArray, insertIndex, insertNumber));

	}

}
