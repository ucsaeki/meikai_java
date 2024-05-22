package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise7_18
 * 概要 配列から指定した要素を削除する
 * 作成者 Y.Saeki
 * 作成日 2024/05/01
 */

public class Exercise7_18 {
	//要素数と最大のインデックスの値の差を解消するための定数を設定。
	static final int FILL_ONE = 1;
	//計算で使用する定数を設定
	static final int CONSTANT_ONE = 1;
	//削除したいインデックスの値を表す定数を設定。
	static int removeNumber = 0;

	/* 
	 * 関数名 aryRmv
	 * 概要 渡された配列から削除したい値が格納されたインデックスを抜いて配列を並べ直すメソッド
	 * 引数 配列、削除したいインデックスの値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/01
	 */
	static void aryRmv(int[] a, int idx) {
		//削除したい値が格納されているインデックスより後ろの値を一つ前のインデックスに格納する
		for (int i = idx; i < (a.length - FILL_ONE); i++) {
			//ひとつ後ろの要素をひとつ前の要素に代入する
			a[i] = a[(i + CONSTANT_ONE)];
		}
	}

	/* 
	 * 関数名 main
	 * 概要 入力された要素数の配列を作成し、指定したインデックスの値を削除した配列を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/01
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
		System.out.println("要素をを入力してください。");
		//入力された要素数を持つ配列を生成
		int[] variableArray = new int[elementNumber];
		//配列の全要素に入力させる
		for (int i = 0; i < elementNumber; i++) {
			//配列への入力を促す
			System.out.print("variableArray[" + i + "] ：");
			//配列に入力を読み込む
			variableArray[i] = standerdInput.nextInt();
		}

		//削除するインデックスの値の入力を促す
		System.out.print("削除したいインデックス：");
		//入力を読み込む
		removeNumber = standerdInput.nextInt();

		//存在するインデックスの値を入力させる
		for (; removeNumber < 0 || removeNumber > elementNumber - FILL_ONE;) {
			//入力されたインデックスの値が要素数より大きかった場合
			if (removeNumber < 0 || removeNumber > elementNumber - FILL_ONE) {
				//存在するインデックスを選択するようにエラー表示を出す。
				System.out.println("0以上" + (elementNumber - FILL_ONE) + "以下の値を入力してください");
				//削除するインデックスの値の入力を促す
				System.out.print("削除したいインデックス：");
				//入力を読み込む
				removeNumber = standerdInput.nextInt();
			}
		}

		//要素数が1の場合
		if (elementNumber == CONSTANT_ONE) {
			//インデックス0の要素を削除したことを表示
			System.out.println("variableArray[0]に格納されていた値を削除しました。");
			
		}//要素数が2以上の場合
		else {
			//関数を用いて、削除したいインデックスの値を削除した配列を生成
			aryRmv(variableArray, removeNumber);

			//該当のインデックスの値を削除した配列の表示を行うことを表示。
			System.out.println("該当のインデックスに格納されていた値を削除した配列を表示します。");

			//配列内の全ての要素を表示する。
			for (int i = 0; i < elementNumber; i++) {
				//配列のインデックスと要素を表示する。
				System.out.println("variableArray[" + i + "] = " + variableArray[i]);
			}
		}

	}

}