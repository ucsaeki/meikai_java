package Shape;

/* 
 * クラス名 HorizontalLine
 * 概要 水平直線を管理するAbstLineの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class HorizontalLine extends AbstractLine {
	/* 
	 * コンストラクタ名 HorizontalLine
	 * 概要 水平直線の長さを表すフィールドを入力された値で初期化
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public HorizontalLine(int variableLength) {
		//上位クラスのコンストラクタを用いて直線を表すフィールドを水平直線の値で初期化
		super(variableLength);
	}

	/* 
	 * 関数名 toString
	 * 概要 水平直線を表す文字列を表示する
	 * 引数 なし
	 * 返り値 水平直線の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//水平直線の情報を表す文字列を返却
		return "HorzLIne(length:" + getLength() + ")";
	}

	/* 
	 * 関数名 drawShape
	 * 概要 水平直線を描写する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void drawShape() {
		//指定された長さの個数分記号の表示を行う
		for (int i = 0; i < getLength(); i++) {
			//記号を表示する
			System.out.print('-');
		}
		//改行する
		System.out.println();

	}

}
