package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_16
 * 概要 配列の全要素の値の最小値を求めて表示する。
 * 作成者 Y.Saeki
 * 作成日 2024/04/30
 */
public class Exercise7_16 {
	/* 
	 * 関数名 min0f
	 * 概要 配列の要素の値の最小値を求めるメソッド
	 * 引数 配列
	 * 返り値 配列の要素の値の最小値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */

	static int min0f(int[] a) {
		//要素の最小値を表す変数を設定し、初期値として配列の先頭の値を入力。
		int mimumumNumber = a[0];

		//配列を線形探索し、要素の最小値を求める。
		for (int i = 0; i < a.length; i++) {
			//現在の最小値の値より小さい要素の値が発見された場合
			if (mimumumNumber > a[i]) {
				//その要素の値を最小値を表す変数に代入
				mimumumNumber = a[i];
			}
		} //求めた最小値を返却する
		return mimumumNumber;
	}

	/* 
	 * 関数名 main
	 * 概要 配列の要素数と全要素の値を入力させ、要素の最小値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
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
			//入力された値が0未満または31より大きい値だった場合
			if (elementNumber <= 0) {
				//0以上の数値での入力を求めるエラー文を表示
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
		//関数を用いて配列の全要素の合計を表示する
		System.out.println("配列の全要素の最小値は" + min0f(variableArray) + "です。");

	}

}
