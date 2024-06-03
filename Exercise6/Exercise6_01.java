package Exercise6;
/* 
 * クラス名 Exercise6_01
 * 概要 要素型がdouble型で要素数が5の配列を生成し、その全要素を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/16
 */
public class Exercise6_01 {
	/* 
	 * 関数名  main
	 * 概要 要素型がdouble型で要素数が5の配列を生成し、その全要素を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/16
	 */
	public static void main(String[] args) {
		//double型で要素数5の配列を設定
		double [] variableArray = new double [5];
		//インデックス1に37を設定
		variableArray[1] = 37;
		//インデックス2に51を設定
		variableArray[2] = 51;
		//インデックス4にインデックス1に2をかけた値を設定
		variableArray[4] = variableArray[1] * 2;
		
		//インデックス0の値を表示
		System.out.println("a[" + 0 + "] = " + variableArray[0]);
		//インデックス1の値を表示
		System.out.println("a[" + 1 + "] = " + variableArray[1]);
		//インデックス2の値を表示
		System.out.println("a[" + 2 + "] = " + variableArray[2]);
		//インデックス3の値を表示
		System.out.println("a[" + 3 + "] = " + variableArray[3]);
		//インデックス4の値を表示
		System.out.println("a[" + 4 + "] = " + variableArray[4]);

	}

}
