package Exercise6;

/* 
 * クラス名 Exercise6_03
 * 概要 double型で要素数が5の配列の要素が先頭から1.1,2.2,3.3,4.4,5.5となるように代入して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/16
 */
public class Exercise6_03 {
	/* 
	 * 関数名  main
	 * 概要 double型で要素数が5の配列の要素が先頭から1.1,2.2,3.3,4.4,5.5となるように代入して表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/16
	 */

	public static void main(String[] args) {
		//要素数を表す定数を設定。
		final int CONSTANT_NUMBER = 5;
		//計算で使用する定数を設定
		final int CONSTANT_TEN = 10;
		//計算で使用する実数値の定数を設定
		final double CONSTANT_ONE = 1.0;
		
		//要素数が5のdouble型配列を生成
		double[] variableArray = new double[CONSTANT_NUMBER];
		//計算回数を表す変数を生成し、初期値1を代入。
		double variableNumber = CONSTANT_ONE;

		//全てのインデックスに入力させる
		for (int i = 0; i < variableArray.length; i++) {
			//それぞれのインデックスに計算した値を代入
			variableArray[i] = variableNumber + variableNumber / CONSTANT_TEN;
			//計算回数に1加算
			variableNumber++;
		}
		//全てのインデックスを表示する
		for (int i = 0; i < variableArray.length; i++) {
			//それぞれのインデックスの値を表示
			System.out.println("a[" + i + "] = " + variableArray[i]);
		}

	}

}
