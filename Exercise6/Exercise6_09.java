package Exercise6;

//Randomクラスをインポート.
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_09
 * 概要 全要素に1～10までの乱数を入力する
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_09 {
	/* 
	 * 関数名  main
	 * 概要 全要素に1～10までの乱数を入力する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/19
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomRand = new Random();
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int elementNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; elementNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("要素数：");
			//入力を読み込む。
			elementNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (elementNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値で入力してください。");
			}

		} //乱数の上限を表すための定数を設定
		final int CONSTANT_TEN = 10;
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;

		//入力された値を要素数とする配列を宣言
		int[] variableArray = new int[elementNumber];
		//全要素に乱数を入力する。
		for (int i = 0; i < elementNumber; i++) {
			//要素に1～10の乱数を入力する。
			variableArray[i] = randomRand.nextInt(CONSTANT_TEN) + CONSTANT_ONE;
		}
		//全ての要素を表示する
		for (int i = 0; i < elementNumber; i++) {
			//インデックスの値と、そこに格納された要素の値を表示
			System.out.println("variableArray[" + i + "] = " + variableArray[i]);
			
		}
	}

}
