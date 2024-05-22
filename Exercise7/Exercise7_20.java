package Exercise7;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise7_20
 * 概要 作成した配列の指定した要素に値を挿入し、挿入後の配列を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/01
 */
public class Exercise7_20 {
	//要素数と最大のインデックスの値の差を解消するための定数を設定。
		static final int FILL_ONE = 1;
	/* 
	 * 関数名 aryIns
	 * 概要 配列の指定されたインデックスに指定された値を挿入した配列を作成するメソッド
	 * 引数 配列、挿入したいインデックスの値、そのインデックスに挿入する値
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/01
	 */
	static void aryIns(int[] a, int idx, int x) {
		//挿入したい値を表す変数を設定
		int insertNumber = 0;
		//要素の値を後方にずらすために一時保存するための変数を設定
		int variableContain = 0;
		//挿入したい値を変数に代入。
		insertNumber = x;

		//挿入した要素より後ろの要素を1つずつ後ろにずらす。
		for (int i = idx; i < a.length; i++) {
			//挿入したい要素の値を一時保存するための変数に代入
			variableContain = a[i];
			//挿入したい箇所に値を挿入。
			a[i] = insertNumber;
			//保存した値を挿入したい値に代入
			insertNumber = variableContain;
		}
	}

	/* 
	 * 関数名 main
	 * 概要 作成した配列に、挿入する箇所と値を入力し、挿入後の全ての要素と要素の値を表示する。
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
		
		
		
		//インデックスの値の範囲外の定数を設定
		final int MINUS_ONE = -1;
		//挿入したい箇所のインデックスの値を設定し、要素の範囲外の値を初期値として入力。
		int insertNumber = MINUS_ONE;
		//存在するインデックスの値の範囲内で挿入する箇所の入力を行わせる
		for (; insertNumber < 0 || insertNumber > variableArray.length - FILL_ONE;) {
			//挿入したい箇所の入力を促す
			System.out.print("挿入したい要素のインデックスの値：");
			//入力を読み込む
			insertNumber = standerdInput.nextInt();
			//入力された値が0より小さい、もしくは配列の最大のインデックスの値より大きい場合
			if (insertNumber < 0 || insertNumber > variableArray.length - FILL_ONE) {
				//範囲内の値の入力を求めるエラー文を表示
				System.out.println("0から" + (variableArray.length - FILL_ONE) + "までの値を入力してください。");
			}
		}
		//配列の要素に挿入する値を設定
		int variableInsert = 0;
		//挿入する値の入力を促す。
		System.out.print("挿入する値：");
		//入力を読み込む
		variableInsert = standerdInput.nextInt();

		//関数を利用し、配列への挿入を行う。
		aryIns(variableArray, insertNumber, variableInsert);

		//配列を表示することを表示
		System.out.println("入力された値を挿入した配列を表示します。");

		//配列内の全ての要素と要素の値を表示する。
		for (int i = 0; i < elementNumber; i++) {
			//配列の要素とその値を表示する。
			System.out.println("variableArray[" + i + "] = " + variableArray[i]);
		}

	}

}
