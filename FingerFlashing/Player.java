package FingerFlashing;

/* 
 * クラス名 Player
 * 概要 じゃんけんを管理する抽象クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/30
 */
public abstract class Player {
	//グーの手を表す静的フィールドを宣言
	protected static final int ROCK_HAND = 0;
	//チョキの手を表す静的フィールドを宣言
	protected static final int SCISSORS_HAND = 1;
	//パーの手を表す静的フィールドを宣言
	protected static final int PAPER_HAND = 2;
	//グーの文字列を表す静的フィールドを宣言
	protected static final String CHAR_ROCK = "グー";
	//グーの文字列を表す静的フィールドを宣言
	protected static final String CHAR_SCISSORS = "チョキ";
	//グーの文字列を表す静的フィールドを宣言
	protected static final String CHAR_PAPER = "パー";

	//じゃんけんの手を表す文字列を格納した配列を生成(String) 
	//選択肢と配列の要素の値をそろえるため、先頭の要素にnullを代入
	protected static final String[] handCharStrage = new String[] { CHAR_ROCK, CHAR_SCISSORS, CHAR_PAPER };

	//じゃんけんの手を表すフィールドを宣言
	protected int variableHand = 0;
	//じゃんけんの手を表す文字列を表すフィールドを宣言
	protected String handChar = "";

	/* 
	 * 関数名 getHand
	 * 概要 派生クラスで手を取得する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public abstract int getHand();

	/* 
	 * 関数名 setHand
	 * 概要 派生クラスで手を代入する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public abstract void setHand();

	/* 
	 * 関数名 toString
	 * 概要 派生クラスで手を出力する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public abstract String toString();

}
