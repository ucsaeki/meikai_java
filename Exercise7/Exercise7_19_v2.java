package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_19_v2
 * 概要 作成した配列の指定した要素に値を挿入し、挿入後の配列を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/02
 */
public class Exercise7_19_v2 {
	//配列の要素数とインデックスの値を調整するための定数を設定
	static final int FILL_ONE = 1;
	/* 
	 * 関数名 aryRmvN
	 * 概要 配列の指定されたインデックスに指定された値を挿入した配列を作成するメソッド
	 * 引数 配列、挿入したいインデックスの値、そのインデックスに挿入する値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/02
	 */

	static void aryRmvN(int[] a, int idx, int n) {
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//元の配列からずらすことができる要素がなくなるまで削除された個数分前にずらす
		for (int i = idx; (i + n - CONSTANT_ONE) < a.length - FILL_ONE; i++) {
			//指定した要素から削除する個数分後ろにずらした要素の値を代入する
			a[i] = a[i + n];
		}
	}

	/* 
	 * 関数名 main
	 * 概要 作成した配列に、挿入する箇所と値を入力し、挿入後の全ての要素と要素の値を表示する。
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

		//インデックスの値の範囲外の定数を設定
		final int OUT_RANGE_NUMBER = -1;
		//削除するインデックスの値を表す変数を設定し、インデックスの値の範囲外の値を初期値として入力
		int removeNumber = OUT_RANGE_NUMBER;

		//削除するインデックスの値を存在する配列の範囲内で入力させる
		for (; removeNumber < 0 || removeNumber > variableArray.length - FILL_ONE;) {
			//削除するインデックスの値の入力を促す
			System.out.print("削除したいインデックス：");
			//入力を読み込む
			removeNumber = standerdInput.nextInt();
			//入力された値が配列の範囲を越える場合
			if (removeNumber < 0 || removeNumber > variableArray.length - FILL_ONE) {
				//範囲内に収まるインデックスの値を入力するようにエラー表示を出す。
				System.out.println("0以上、" + (variableArray.length - FILL_ONE) + "以下の値を入力してください");
			}
		}

		//削除する要素の個数を表す変数を設定
		int removePieces = 0;

		//削除する要素の個数を要素数の範囲内で入力させる
		for (; removePieces <= 0 || removePieces > variableArray.length - removeNumber;) {
			//削除するインデックスの値の入力を促す
			System.out.print("削除したい要素の個数：");
			//入力を読み込む
			removePieces = standerdInput.nextInt();

			//入力された値が配列の範囲を越える場合
			if (removePieces <= 0 || removePieces > variableArray.length - removeNumber) {
				//範囲内に収まるインデックスの値を入力するようにエラー表示を出す。
				System.out.println("1以上、" + (variableArray.length - removeNumber) + "以下の値を入力してください");
			}
		}
		//要素数が1の場合を判別するための定数を設定
		final int CONSTANT_ONE = 1;
		
		//要素数が1の場合
		if (elementNumber == CONSTANT_ONE) {
			//インデックス0の要素を削除したことを表示
			System.out.println("variableArray[0]に格納されていた値を削除しました。");
		}
		//要素数が1ではない場合
		else {
			//関数を用いて削除したい要素の値を削除した配列を生成
			aryRmvN(variableArray, removeNumber, removePieces);

			//削除後の配列を表示することを表示
			System.out.println("該当のインデックスに格納されていた値を削除した配列を表示します。");

			//配列内の全ての要素を表示する。
			for (int i = 0; i < elementNumber; i++) {
				//配列のインデックスと要素を表示する。
				System.out.println("variableArray[" + i + "] = " + variableArray[i]);
			}
		}

	}

}
