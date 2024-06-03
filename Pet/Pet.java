package Pet;
/* 
 * クラス名 Pet
 * 概要 ペットの情報を管理する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class Pet {
	//ペットの名前を表すフィールドを宣言
	protected String petName = "";
	//飼い主の名前を表すフィールドを宣言
	protected String masterName ="";
	
	/* 
	 * コンストラクタ名 Pet
	 * 概要 ペットの飼い主の名前をそれぞれ引数で初期化する
	 * 引数 ペット、飼い主の名前(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public Pet(String petName, String masterName) {
		//ペットの名前を表すフィールドを引数で初期化
		this.petName = petName;
		//飼い主の名前を表すフィールドを引数で初期化
		this.masterName = masterName;
	}
	/* 
	 * 関数名 getPetName
	 * 概要 ペットの名前を取得する
	 * 引数 なし
	 * 返り値 ペットの名前
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public String getPetName() {
		//ペットの名前を返却
		return petName;
	}
	/* 
	 * 関数名 getMasterName
	 * 概要 飼い主の名前を取得する
	 * 引数 なし
	 * 返り値 飼い主の名前
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public String getMasterName() {
		//飼い主の名前を返却
		return masterName;
	}
	/* 
	 * 関数名 introduceMyself
	 * 概要 自己紹介の文章を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public void introduceMyself() {
		//ペットの名前を表示
		System.out.println("■僕の名前は" + petName + "です。");
		//飼い主の名前を表示
		System.out.println("■ご主人様は" + masterName + "です。");
	}
	

}
