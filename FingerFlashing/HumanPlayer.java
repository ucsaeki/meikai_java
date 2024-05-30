package FingerFlashing;
//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 HumanPlayer
 * 概要 人間の手を管理するPlayerの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/30
 */
public class HumanPlayer extends Player {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * コンストラクタ名 HumanPlayer
	 * 概要 人間の手と手を表す文字列を表すフィールドを初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	public HumanPlayer() {
		//人間の手と手を表す文字列を表すフィールドを引数で初期化
		setHand();
	}

	/* 
	 * 関数名 getHand
	 * 概要 人間の手を表すフィールドを取得する
	 * 引数 なし
	 * 返り値 人間の手(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	@Override
	public int getHand() {
		//人間の手を表すフィールドを返却
		return variableHand;
	}

	/* 
	 * 関数名 setHand
	 * 概要 人間の手と手を表す文字列をフィールドに代入する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	@Override
	public void setHand() {
		//選択範囲の最小値を表す定数を設定
		final int RANGE_MINIMUM = 1;
		//選択範囲の最大値を表す定数を設定
		final int RANGE_MAXIMUM = 3;
		//図形の選択を促す文章を表示(String)
		System.out.print("手を入力してください(1…グー/2…チョキ/3…パー)：");
		//選択された図形を表す変数を設定し、選択肢の範囲内の値で図形を選択させる
		int choosedHand = (choseInRange(RANGE_MINIMUM, RANGE_MAXIMUM));
		//人間の手を表すフィールドに引数を代入
		this.variableHand = choosedHand;
		//人間の手を表す文字列を表すフィールドを、引数に対応する文字列で初期化
		this.handChar = Player.handCharStrage[this.variableHand];
	}

	/* 
	 * 関数名 toString
	 * 概要 選択された人間の手を表す文字列を表示する
	 * 引数 なし
	 * 返り値 選択された人間の手を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	@Override
	public String toString() {
		//人間の手を表す文字列を表示
		return String.format("選んだ手は、%sです。", handChar);
	}

	/* 
	 * 関数名 choseInRange
	 * 概要 指定された範囲内の値を入力させる
	 * 引数 範囲の下限、上限(int)
	 * 返り値 範囲内の値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	public static int choseInRange(int rangeMinimum, int rangeMuximum) {
		//入力された値を表す変数に入力を読み込む
		int chooseNumber = standardInput.nextInt();

		//選択された図形を表す変数に範囲外の値が入力された場合
		for (; chooseNumber < rangeMinimum || chooseNumber > rangeMuximum;) {
			//範囲内の値の入力を促すエラー文章を表示
			System.out.println(rangeMinimum + "から" + rangeMuximum + "までの値を入力してください。");
			//選択された図形を表す変数に入力を読み込む
			chooseNumber = standardInput.nextInt();
		}
		//入力された範囲内の値を返却
		return chooseNumber;
	}
}
