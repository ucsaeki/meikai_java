package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_22
 * 概要 作成した配列と同じ配列を作成し、それぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/02
 */
public class Exercise7_22 {
	/* 
	 * 関数名 arrayClone
	 * 概要 入力された配列と同じ配列を作るメソッド
	 * 引数 配列
	 * 返り値 複製した配列
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	static int[] arrayClone(int[] a) {
		//入力された配列と同じ要素数を持つ配列を作成
		int[] cloneArray = new int[a.length];
		//複製先の配列に全ての要素を入力する
		for (int i = 0; i < a.length; i++) {
			//複製先の配列の要素にもとの配列の対応した要素を代入
			cloneArray[i] = a[i];
		}
		//複製した配列を返却
		return cloneArray;

	}

	/* 
	 * 関数名 printArray
	 * 概要 もとの配列の全ての要素と要素の値を表示するメソッド
	 * 引数 配列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	static void printArray(int[] a) {
		//配列内の全ての要素と要素の値を表示する。
		for (int i = 0; i < a.length; i++) {
			//配列の要素とその値を表示する。
			System.out.println("variableArray[" + i + "] = " + a[i]);
		}
		//表示が終わったら改行する
		System.out.println();
	}

	/* 
	 * 関数名 printCloneArray
	 * 概要 複製した配列の全ての要素と要素の値を表示するメソッド
	 * 引数 配列
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */
	static void printCloneArray(int[] a) {
		//配列内の全ての要素と要素の値を表示する。
		for (int i = 0; i < a.length; i++) {
			//配列の要素とその値を表示する。
			System.out.println("cloneArray[" + i + "] = " + a[i]);
		}
		//表示が終わったら改行する
		System.out.println();
	}

	/* 
	 * 関数名 main
	 * 概要 作成した配列と同じ配列を作成して表示する
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
		//改行する
		System.out.println();

		//関数を用いて複製した配列を作成
		int[] cloneArray = arrayClone(variableArray);
		//もとの配列を表示することを表示
		System.out.println("もとの配列を表示します。");
		//関数を用いてもとの配列の要素を表示
		printArray(variableArray);
		//複製した配列を表示することを表示
		System.out.println("複製した配列を表示します。");
		//関数を用いて複製した配列の要素を表示
		printCloneArray(cloneArray);

	}
}