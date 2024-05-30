package Shape;

/* 
 * クラス名 IsoscelesRightTriangle
 * 概要 直角三角形を管理するShapeの派生の抽象クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public abstract class IsoscelesRightTriangle extends Shape implements SymbolPrintCount{
	//直角三角形の隣辺を表すフィールドを宣言(int)
	private int adjacentLength = 0;
	//表示した記号の個数を表すフィールドを宣言
	protected int symbolCounet = 0;
	

	/* 
	 * コンストラクタ名 IsoscelesRightTriangle
	 * 概要 隣辺の長さをこのクラスの派生クラスのインスタンスに入力する
	 * 引数 隣辺(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public IsoscelesRightTriangle(int adjacentLength) {
		//隣辺の長さをこのクラスの派生クラスのインスタンスに入力する
		setLength(adjacentLength);
	}

	/* 
	 * 関数名 getAdjacentLength
	 * 概要 隣辺の長さを取得する
	 * 引数 なし
	 * 返り値 隣辺(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public int getAdjacentLength() {
		//隣辺の長さを返却する
		return adjacentLength;
	}

	/* 
	 * 関数名 setLength
	 * 概要 隣辺の値をフィールドに代入する
	 * 引数 隣辺(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void setLength(int adjacentLength) {
		//隣辺のフィールドに引数の値を代入
		this.adjacentLength = adjacentLength;

	}
	/* 
	 * 関数名 getCountSymbol
	 * 概要 表示した記号の個数を取得する
	 * 引数 なし
	 * 返り値 表示した記号の個数
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	public int getCountSymbol() {
		//表示した記号の個数を返却する
		return symbolCounet;
	}

	/* 
	 * 関数名 toString
	 * 概要 直角二等辺三角形の情報を表示する
	 * 引数 なし
	 * 返り値 直角二等辺三角形の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//直角二等辺三角形の情報を表す文字列を返却
		return "IsoscelesRightTriangle(adjacentLength:" + adjacentLength + ")";
	}

}
