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

	/* 
	 * 関数名 judgeWinner
	 * 概要 2人の手を比べて評価を表示する
	 * 引数 2人のそれぞれの手(Player)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public static void judgeWinner(Player firstPlayer, Player secondPlayer) {

		switch (firstPlayer.getHand()) {
		//一人目の手がグーの場合
		case ROCK_HAND:
			//二人目の手がグーの場合
			if (secondPlayer.getHand() == ROCK_HAND) {
				//あいこであることを表示
				System.out.println("あいこです。");
				//二人目の手がチョキの場合
			} else if (secondPlayer.getHand() == SCISSORS_HAND) {
				//一人目の勝ちであることを表示
				System.out.println("一人目の勝ちです。");
				//二人目の手がパーの場合
			} else if (secondPlayer.getHand() == PAPER_HAND) {
				//二人目の勝ちであることを表示
				System.out.println("二人目の勝ちです。");
			}
			//分岐を脱出
			break;
			
		//一人目の手がチョキの場合
		case SCISSORS_HAND:
			//コンピュータの手がグーの場合
			if (secondPlayer.getHand() == ROCK_HAND) {
				//二人目の勝ちであることを表示
				System.out.println("二人目の勝ちです。");
				//二人目の手がチョキの場合
			} else if (secondPlayer.getHand() == SCISSORS_HAND) {
				//あいこであることを表示
				System.out.println("あいこです。");
				//二人目の手がパーの場合
			} else if (secondPlayer.getHand() == PAPER_HAND) {
				//一人目の勝ちであることを表示
				System.out.println("一人目の勝ちです。");
			}
			//分岐を脱出
			break;

		//一人目の手がパーの場合
		case PAPER_HAND:
			//二人目の手がグーの場合
			if (secondPlayer.getHand() == ROCK_HAND) {
				//一人目の勝ちであることを表示
				System.out.println("一人目の勝ちです。");
				//二人目の手がチョキの場合
			} else if (secondPlayer.getHand() == SCISSORS_HAND) {
				//二人目の勝ちであることを表示
				System.out.println("二人目の勝ちです。");
				//二人目の手がパーの場合
			} else if (secondPlayer.getHand() == PAPER_HAND) {
				//あいこであることを表示
				System.out.println("あいこです。");
			}
			//分岐を脱出
			break;
		}
	}

}
