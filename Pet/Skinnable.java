package Pet;
/* 
 * クラス名 Skinnable
 * 概要 肌の色を変更するためのインターフェース
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public interface Skinnable {
	//黒を表す定数を設定
	int BLACK_COLER = 0;
	//赤を表す定数を設定
	int RED_COLER = 1;
	//緑を表す定数を設定
	int GREEN_COLER = 2;
	//青を表す定数を設定
	int BLUE_COLER = 3;
	//豹柄を表す定数を設定
	int LEOPARD_COLER = 4;
	
	/* 
	 * 関数名 changeSkinn
	 * 概要 ペットの柄を変更する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	void changeSkinn();
			
	

}
