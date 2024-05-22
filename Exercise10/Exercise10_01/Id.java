package Exercise10.Exercise10_01;

/* 
 * クラス名 Id
 * 概要 識別番号を管理する連番クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/21
 */
public class Id {
	//識別番号を与えた回数を表す非公開のフィールドを宣言(int)
	static int counter = 0;
	//インスタンスごとに異なる識別番号を表すフィールドを宣言(int)
	private int id;

	/* 
	 * コンストラクタ名 Id
	 * 概要 識別番号を識別番号を与えた回数の値で初期化
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public Id() {
		//識別番号を表すフィールドを識別番号を与えた回数の値で初期化
		id = ++counter;
	}
	/* 
	 * 関数名 getId
	 * 概要 識別番号を返却する
	 * 引数 なし
	 * 返り値 識別番号(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public int getId() {
		//識別番号を返却
		return id;
	}

	/* 
	 * 関数名 getMaxId
	 * 概要 最後に与えた識別番号を返却する
	 * 引数 なし
	 * 返り値 最後に与えた識別番号(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public int getMaxId() {
		//最後に与えた識別番号として識別番号を与えた回数の値を返却
		return counter;
	}

}
