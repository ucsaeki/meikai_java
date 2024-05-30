package Exercise13.Exercise13_02;

/* 
 * クラス名 Point
 * 概要 点に関する情報を管理するShapeの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class Point extends Shape {
	/* 
	 * コンストラクタ名 Point
	 * 概要 初期値で初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public Point() {

	}

	/* 
	 * 関数名 toString
	 * 概要 点であることを表す文字列を返却する
	 * 引数 なし
	 * 返り値 点であることを表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//文字列を返却する
		return "point";
	}

	/* 
	 * 関数名 drawShape
	 * 概要 点を描写する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void drawShape() {
		//記号を描写する
		System.out.println('+');
	}

}
