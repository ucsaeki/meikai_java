package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_19
 * 概要 作成した配列から指定したインデックスから指定した個数分要素を削除した配列を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/01
 */
public class Exercise7_19 {

	//要素数と最大のインデックスの値の差を解消するための定数を設定。
	static final int FILL_ONE = 1;
	//計算で使用する定数を設定
	static final int CONSTANT_ONE = 1;
	//削除したいインデックスの値を表す定数を設定。
	static int removeNumber = 0;

	/* 
	 * 関数名 aryRmvN
	 * 概要 指定されたインデックスから指定された個数分の要素を削除し、残った要素を並べた配列を作成するメソッド
	 * 引数 配列、削除したいインデックスの値、削除する要素の個数
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/01
	 */
	static void aryRmvN(int[] a, int idx, int n) {
		//	
		for (int i = 0; i < n; i++) {
			//削除後参照する要素が存在しない場合
			if ( (i + idx) + n > a.length - FILL_ONE) {
				//繰り返しを終了
				break;
			}//参照先が存在する場合
			else {
				//削除した要素に参照先の値を代入する
				a[(i + idx)] = a[(i + idx) + n];
			}
		}
	}

	/* 
	 * 関数名 main
	 * 概要 配列の削除したいインデックスの値と削除する要素の個数を入力させ、
	 * 削除を行った配列を表示する
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

		//削除するインデックスの値の入力を促す
		System.out.print("削除したいインデックス：");
		//入力を読み込む
		removeNumber = standerdInput.nextInt();

		//削除するインデックスの値を存在する配列の範囲内で入力させる
		for (; removeNumber > elementNumber - FILL_ONE - CONSTANT_ONE;) {
			//入力された値が配列の範囲を越える場合
			if (removeNumber > elementNumber - FILL_ONE - CONSTANT_ONE) {
				//範囲内に収まるインデックスの値を入力するようにエラー表示を出す。
				System.out.println((elementNumber - FILL_ONE - CONSTANT_ONE) + "以下の値を入力してください");
				//削除するインデックスの値の入力を促す
				System.out.print("削除したいインデックス：");
				//入力を読み込む
				removeNumber = standerdInput.nextInt();
			}

		}
		//削除する要素の個数を表す定数を設定
		int removePieces = 0;

		//削除したい要素の個数の入力を促す
		System.out.print("削除したい要素の個数：");
		//入力を読み込む
		removePieces = standerdInput.nextInt();

		//配列の要素数を超えない範囲で、削除する個数の値を入力させる。
		for (; removePieces < 0 || removePieces > elementNumber - FILL_ONE - removeNumber;) {
			//入力された値が要素数の範囲を越える場合
			if (removePieces < 0 ||removePieces > elementNumber - FILL_ONE - removeNumber) {
				//要素数の存在する範囲内での入力を促す。
				System.out.println("0より大きく、" + (elementNumber - FILL_ONE - removeNumber)
						+ "より小さい値を入力してください。");
				//削除したい要素の個数の入力を促す
				System.out.print("削除したい要素の個数：");
				//入力を読み込む
				removePieces = standerdInput.nextInt();
			}
		}
		
		//関数を用いて、削除したい要素を削除した配列を作成
		aryRmvN(variableArray, removeNumber, removePieces);

		//配列を表示することを表示
		System.out.println("該当のインデックスに格納されていた値を削除した配列を表示します。");

		//配列内の全ての要素を表示する。
		for (int i = 0; i < elementNumber; i++) {
			//配列のインデックスと要素を表示する。
			System.out.println("variableArray[" + i + "] = " + variableArray[i]);
		}

	}

}
