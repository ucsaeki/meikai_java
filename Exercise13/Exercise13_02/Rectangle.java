package Exercise13.Exercise13_02;

/* 
 * クラス名 Rectangle
 * 概要 長方形を管理するShapeの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class Rectangle extends Shape {
	//長方形の幅を表すフィールドを宣言
	private int widthLength;
	//長方形の高さを表すフィールドを宣言
	private int heightLength;

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
	 * 関数名 drawShape
	 * 概要 長方形を描写する
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
			}
			//改行する
			System.out.println();
		}
	}
}

