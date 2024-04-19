package Exercise6;
/* 
 * クラス名 Exercise6_02
 * 概要 int型で要素数が5の配列で、先頭から順に5,4,3,2,1を代入して出力する
 * 作成者 Y.Saeki
 * 作成日 2024/04/16
 */
public class Exercise6_02 {
	/* 
	 * 関数名  main
	 * 概要 int型で要素数が5の配列で、先頭から順に5,4,3,2,1を代入して出力する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/16
	 */
	public static void main(String[] args) {
		//要素数を表す定数を設定
		final int CONSTANT_NUMBER = 5;
		//要素数が5の配列を生成
		int [] variableArray = new int [CONSTANT_NUMBER];
		//変数に配列の長さを設定
		int variableNumber = variableArray.length;
		
		//全ての要素が入力されるまで繰り返す
		for (int i = 0; i < variableArray.length; i++) {
			//インデックスに変数を代入
			variableArray[i] = variableNumber;
			//変数から1引減算
			variableNumber--;
		}
		//要素数の値を全て表示する
		for ( int i = 0; i < variableArray.length; i++) {
			//それぞれのインデックスの値を表示
			System.out.println("a[" + i + "] = " + variableArray[i]);
		}

	}

}
