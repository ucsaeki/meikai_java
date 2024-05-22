package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_15
 * 概要 配列の全要素の合計を求める関数を作成し、求めた合計を表示する。
 * 作成者 Y.Saeki
 * 作成日 2024/04/30
 */
public class Exercise7_15 {
	/* 
	 * 関数名 sum0f
	 * 概要 配列の全要素を合計した値を求める
	 * 引数 配列
	 * 返り値 配列の全要素の合計値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */
	static int sum0f(int[] a) {
		//要素の合計を表す変数を設定
		int amountNumber = 0;
		//配列の全要素の合計を求める
		for ( int i = 0; i < a.length; i++) {
			//配列の全要素の合計を表す変数に配列内の値を加算
			amountNumber += a[i];
		}
		//求めた全要素の合計を返却する
		return amountNumber;

	}
	/* 
	 * 関数名 main
	 * 概要 配列に要素を入力させ、要素の合計値を表示する。
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
		for (; elementNumber <= 0 ;) {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力された値を読み込む
			elementNumber = standerdInput.nextInt();
			//入力された値が負の数だった場合///////
			if ( elementNumber <= 0) {
				//0以上の数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		}
		//入力された要素数を持つ配列を生成
		int[] variableArray = new int[elementNumber];
		//配列の全要素に入力させる
		for (int i = 0; i < elementNumber; i++ ) {
			//配列への入力を促す
			System.out.print("variableArray[" + i + "] ：");
			//配列に入力を読み込む
			variableArray[i] = standerdInput.nextInt();
		}
		//関数を用いて配列の全要素の合計を表示する
		System.out.println("配列の全要素の合計は" + sum0f(variableArray) + "です。");
		
		

	}

}
