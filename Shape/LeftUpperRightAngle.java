package Shape;

/* 
 * クラス名 LeftUpperRightAngle
 * 概要 直角が左上に来る直角三角形の情報を管理するIsoscelesRightTriangleの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class LeftUpperRightAngle extends IsoscelesRightTriangle {

	/* 
	 * コンストラクタ名 LeftUpperRightAngle
	 * 概要 隣辺のフィールドを引数の値で初期化
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public LeftUpperRightAngle(int adjacentLength) {
		//隣辺のフィールドを引数の値で初期化
		super(adjacentLength);
	}

	/* 
	 * 関数名 toString
	 * 概要 直角が左上に来る直角二等辺三角形の情報を表示する
	 * 引数 なし
	 * 返り値 直角が左上に来る直角二等辺三角形の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//直角が左上に来る直角二等辺三角形の情報を表す文字列を返却
		return "LeftUpperRIghtAngle(adjacentLength:" + getAdjacentLength() + ")";
	}

	/* 
	 * 関数名 drawShape
	 * 概要 直角が左上に来る直角三角形を表示し、使用した記号の個数を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void drawShape() {
		//隣辺の段数だけ記号を表示する
		for (int i = 0; i < getAdjacentLength(); i++) {
			//隣辺の数だけ記号を表示する
			for (int j = getAdjacentLength() - i; j > 0; j--) {
				//記号を表示する
				System.out.print('*');
				//記号を表示した個数に1加算
				symbolCounet++;
			}
			//改行する
			System.out.println();
		}
		//使用した記号の数を表示
		System.out.println("使用した記号の数は" + symbolCounet + "個です。");
	}

}
