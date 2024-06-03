package Exercise13.Exercise13_01;

/* 
 * クラス名 VirtLine
 * 概要 垂直直線を管理するAbstLineの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class VirtLine extends AbstLine {
	/* 
	 * コンストラクタ名 VirtLine
	 * 概要 垂直直線の長さを表すフィールドを入力された値で初期化
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public VirtLine(int length) {
		//上位クラスのコンストラクタを用いて直線を表すフィールドを垂直直線の値で初期化
		super(length);
	}

	/* 
	 * 関数名 toString
	 * 概要 垂直直線を表す文字列を表示する
	 * 引数 なし
	 * 返り値 垂直直線の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public String toString() {
		//垂直直線の情報を表す文字列を返却
		return "VirtLine(length:" + getLength() + ")";
	}

	/* 
	 * 関数名 draw
	 * 概要 垂直直線を描写する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public void draw() {
		//指定された長さの個数分記号の表示を行う
		for (int i = 1; i <= getLength(); i++) {
			//記号を表示する
			System.out.println('|');
		}
	}
}
