package Shape;

/* 
 * クラス名 Rectangle
 * 概要 長方形を管理するShapeの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class Rectangle extends Shape implements SymbolPrintCount, Plane2D {
	//長方形の幅を表すフィールドを宣言
	private int widthLength;
	//長方形の高さを表すフィールドを宣言
	private int heightLength;
	//表示した記号の個数を表す静的フィールドを宣言
	private int symbolCounet = 0;

	/* 
	 * コンストラクタ名 Rectangle
	 * 概要 長方形の幅と高さを表すフィールドを初期化
	 * 引数 幅、高さ(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public Rectangle(int widthLength, int heightLength) {
		//幅のフィールドを引数の値で初期化
		this.widthLength = widthLength;
		//高さのフィールドを引数の値で初期化
		this.heightLength = heightLength;
	}

	/* 
	 * 関数名 toString
	 * 概要 長方形の情報を表示する
	 * 引数 なし
	 * 返り値 長方形の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//長方形の情報を表す文字列を返却
		return "Rectangle(width:" + widthLength + ", height:" + heightLength + ")";
	}

	/* 
	 * 関数名 getCountSymbol
	 * 概要 記号を表示した個数を取得する
	 * 引数 なし
	 * 返り値 記号を表示した個数
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	public int getCountSymbol() {
		//記号を表示した個数を返却する
		return symbolCounet;
	}

	/* 
	 * 関数名 getArea
	 * 概要 長方形の面積を取得する
	 * 引数 なし
	 * 返り値 長方形の面積(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public int getArea() {
		//長方形の面積を返却
		return widthLength * heightLength;
	}

	/* 
	 * 関数名 drawShape
	 * 概要 長方形を描写し、使用した記号の個数を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void drawShape() {
		//インスタンスの高さ、幅を持つ長方形の形に記号を表示する
		for (int i = 0; i < heightLength; i++) {
			//幅の個数分記号の表示を行う
			for (int j = 0; j < widthLength; j++) {
				//記号を表示
				System.out.print('*');
				//記号を表示した個数に1加算
				symbolCounet++;
			}
			//改行する
			System.out.println();
		}
		//使用した記号の数を表示
		System.out.println("使用した記号の数は" + symbolCounet + "個です。");
		//図形の面積を表示
		System.out.println("面積は" + getCountSymbol() + "です。");
	}
}
