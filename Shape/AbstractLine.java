package Shape;

/* 
 * クラス名 AbstLine
 * 概要 直線を管理するShapeから派生した抽象クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public abstract class AbstractLine extends Shape {
	//直線を表すフィールドを宣言(int)
	private int variableLength = 0;

	/* 
	 * コンストラクタ名 AbstLine
	 * 概要 直線の長さを表すフィールドを初期化する
	 * 引数 直線の長さ(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public AbstractLine(int variableLength) {
		//直線の長さを表すフィールドを引数の値で初期化
		setLength(variableLength);
	}

	/* 
	 * 関数名 getLength
	 * 概要 直線の長さを取得する
	 * 引数 なし
	 * 返り値 直線の長さ(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public int getLength() {
		//直線の長さを返却する
		return variableLength;
	}

	/* 
	 * 関数名 setLength
	 * 概要 直線の長さを設定する
	 * 引数 直線の長さ(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void setLength(int variableLength) {
		//直線の長さを表すフィールドに長さを代入
		this.variableLength = variableLength;
	}

	/* 
	 * 関数名 toString
	 * 概要 直線の内容を表す文字列を表示する
	 * 引数 なし
	 * 返り値 直線の内容を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//直線の内容を表す文字列を返却
		return "AbstLine(length:" + variableLength + ")";
	}

}
