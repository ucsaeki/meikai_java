package Shape;

/* 
 * クラス名 Parallelogram
 * 概要 平行四辺形を管理するShapeの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/30
 */
public class Parallelogram extends Shape implements SymbolPrintCount,Plane2D {
	//平行四辺形の底辺を表すフィールドを宣言
	private int bottomLength = 0;
	//平行四辺形の高さを表すフィールドを宣言
	private int heightLength = 0;
	//表示した記号の個数を表す静的フィールドを宣言
	private int symbolCounet = 0;

	/* 
	 * コンストラクタ名 Rectangle
	 * 概要 平行四辺形の底辺と高さを表すフィールドを初期化
	 * 引数 底辺、高さ(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public Parallelogram(int bottomLength, int heightLength) {
		//底辺のフィールドを引数の値で初期化
		this.bottomLength = bottomLength;
		//高さのフィールドを引数の値で初期化
		this.heightLength = heightLength;
	}

	/* 
	 * 関数名 toString
	 * 概要 平行四辺形の情報を表示する
	 * 引数 なし
	 * 返り値 平行四辺形の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//平行四辺形の情報を表す文字列を返却
		return "Rectangle(bottom:" + bottomLength + ", height:" + heightLength + ")";
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
	 * 関数名 getArea
	 * 概要 平行四辺形の面積を取得する
	 * 引数 なし
	 * 返り値 平行四辺形の面積(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public int getArea() {
		//平行四辺形の面積を返却
		return bottomLength * heightLength;
	}

	/* 
	 * 関数名 drawShape
	 * 概要 平行四辺形を描写し、使用した記号の個数を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void drawShape() {
		//インスタンスの高さ、幅を持つ長方形の形に記号を表示する
		for (int i = 0; i < heightLength; i++) {
			//空白を表示する
			for (int j = 0; j < i; j++) {
				//空白を表示する
				System.out.print(' ');
			}

			//底辺の個数分記号の表示を行う
			for (int k = 0; k < bottomLength; k++) {
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
