package Exercise13.Exercise13_02;

/* 
 * クラス名 LeftUnderRIghtAngle
 * 概要 直角が左下に来る直角二等辺三角形の情報を管理するIsoscelesRightTriangleの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class LeftUnderRIghtAngle extends IsoscelesRightTriangle {

	/* 
	 * コンストラクタ名 LeftUnderRIghtAngle
	 * 概要 隣辺のフィールドを引数の値で初期化
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public LeftUnderRIghtAngle(int adjacentLength) {
		//隣辺のフィールドを引数の値で初期化
		super(adjacentLength);
	}

	/* 
	 * 関数名 toString
	 * 概要 直角が左下に来る直角二等辺三角形の情報を表示する
	 * 引数 なし
	 * 返り値 直角が左下に来る直角二等辺三角形の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//直角が左下に来る直角二等辺三角形の情報を表す文字列を返却
		return "LeftUnderRIghtAngle(adjacentLength:" + getAdjacentLength() + ")";
	}

	/* 
	 * 関数名 drawShape
	 * 概要 直角が左下に来る直角三角形を表示
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void drawShape() {
		//隣辺の段数だけ記号を表示する
		for (int i = 0; i < getAdjacentLength(); i++) {
			//隣辺の数だけ記号を表示する
			for (int j = 0; j <= i; j++) {
				//記号を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		} 
	}

}
