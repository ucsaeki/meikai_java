package FingerFlashing;
//Randomクラスをインポート
import java.util.Random;

/* 
 * クラス名 ComputerPlayer
 * 概要 コンピュータの手を管理するPlayerの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/30
 */
public class ComputerPlayer extends Player{
	/* 
	 * コンストラクタ名 ComputerPlayer
	 * 概要 コンピュータの手を表すフィールドを初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	public ComputerPlayer() {
		//コンピュータの手と手の文字列を表すフィールドをランダムな手で初期化
		setHand();
	}

	/* 
	 * 関数名 getHand
	 * 概要 コンピュータの手を表すフィールドを取得する
	 * 引数 なし
	 * 返り値 コンピュータの手(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	@Override
	public int getHand() {
		//コンピュータの手を表すフィールドを返却
		return variableHand;
	}
	/* 
	 * 関数名 setHand
	 * 概要 コンピュータの手と手を表す文字列をフィールドに代入する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	@Override
	public void setHand() {
		//じゃんけんの手の個数を表す定数を設定
		final int HAND_NUMBER = 3;
		//ランダムな手を表すインスタンスを生成(Random)
		Random randomHand = new Random();
		//コンピュータの手を表すフィールドにランダムに生成された手を表す値を代入
		this.variableHand = randomHand.nextInt(HAND_NUMBER);
		//コンピュータの手を表す文字列を表すフィールドを、生成された手に対応する文字列で初期化
		this.handChar = Player.handCharStrage[variableHand];
	}
	/* 
	 * 関数名 toString
	 * 概要 選択されたコンピュータの手を表す文字列を表示する
	 * 引数 なし
	 * 返り値 選択されたコンピュータの手を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	@Override
	public String toString() {
		//コンピュータの手を表す文字列を表示
		return String.format("コンピュータの手は、%sです。", handChar);
	}


}
