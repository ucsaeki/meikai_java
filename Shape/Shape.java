package Shape;

/* 
 * クラス名 Shape
 * 概要 図形を管理する抽象クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public abstract class Shape {
	/* 
	 * 関数名 toString
	 * 概要 図形の情報を表す抽象メソッド
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public abstract String toString();

	/* 
	 * 関数名 drawShape
	 * 概要 図形を描画する抽象メソッド
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public abstract void drawShape();

	/* 
	 * 関数名 printShape
	 * 概要 図形情報の表示と図形の表示を行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void printShape() {
		//図形の情報を表示
		System.out.println(toString());
		//図形を描画する
		drawShape();
	}

}