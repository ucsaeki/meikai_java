package Exercise10.Exercise10_02;

/* 
 * クラス名 ExId
 * 概要 識別番号を管理する連番クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/21
 */
public class ExId {

	//最後に与えた識別番号を表す非公開のフィールドを宣言(int)
	private static int counter = 0;
	//インスタンスごとの識別番号の値を表すフィールドを宣言(int)
	private int id = 0;
	
	/* 
	 * コンストラクタ名 ExId
	 * 概要 最後に与えた識別番号を表すフィールドに識別番号を増加させたい個数を加算して代入
	 * 引数 識別番号を増加させたい個数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public ExId(int increaseNumber) {
		//最後に与えた識別番号を表すフィールドに識別番号を増加させたい個数を加算して代入
		counter += increaseNumber;
		//識別番号を表すフィールドに最後に与えた識別番号を表すフィールドの値を代入
		id = counter;
	}
	
	/* 
	 * 関数名 getId
	 * 概要 コンストラクタの識別番号を返却する
	 * 引数 なし
	 * 返り値 識別番号(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public int getId() {
		//コンストラクタの識別番号を返却
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
		//最後に与えた識別番号の値を返却
		return counter;
	}
	
}
