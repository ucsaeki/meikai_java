package Exercise13.Exercise13_03;

//Scannerクラスをインポート
import java.util.Scanner;

//ComputerPlayerクラスをインポート
import FingerFlashing.ComputerPlayer;
//HumanPlayerクラスをインポート
import FingerFlashing.HumanPlayer;
//Playerクラスをインポート
import FingerFlashing.Player;

/* 
 * クラス名 TesterFingerFlashingHumanVSComputer
 * 概要 選択されたモードでじゃんけんを行い、その結果を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/30
 */
public class TesterFingerFlashingHumanVSComputer {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

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

	/* 
	 * 関数名 main
	 * 概要 選択されたモードでじゃんけんを行い、その結果を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/30
	 */
	public static void main(String[] args) {
		//人間対人間を表す定数を設定
		final int HUMAN_VS_HUMAN = 1;
		//人間対コンピュータを表す定数を設定
		final int HUMAN_VS_COMPUTER = 2;
		//コンピュータ対コンピュータを表す定数を設定
		final int COMPUTER_VS_COMPUTER = 3;

		//選択範囲の最小値を表す定数を設定
		final int RANGE_MINIMUM = 1;
		//選択範囲の最大値を表す定数を設定
		final int RANGE_MAXIMUM = 3;
		//対戦形式を入力させる
		System.out.print("どのように対戦しますか(人間VS人間…1/人間VSコンピュータ…2/コンピュータVSコンピュータ…3)");
		//対戦形式を表す変数に選択肢の範囲内の値を入力させる
		int modeSelect = choseInRange(RANGE_MINIMUM, RANGE_MAXIMUM);

		//選択されたモードによって分岐
		switch (modeSelect) {

		//人間対人間が選択された場合
		case HUMAN_VS_HUMAN:
			//一人目の人間の手を表すインスタンスを生成
			HumanPlayer firsthumanHand = new HumanPlayer();
			//一人目の手のインスタンスを表示する
			System.out.println(firsthumanHand);
			//二人目の人間の手を表すインスタンスを生成
			HumanPlayer secondhumanHand = new HumanPlayer();
			//二人目の手のインスタンスを表示する
			System.out.println(secondhumanHand);
			//二人の人間の手を比較した結果を表示する
			Player.judgeWinner(firsthumanHand, secondhumanHand);
			//分岐を脱出
			break;

		//人間対コンピュータが選択された場合
		case HUMAN_VS_COMPUTER:
			//人間の手を表すインスタンスを生成
			HumanPlayer humanHand = new HumanPlayer();
			//人間の手のインスタンスを表示する
			System.out.println(humanHand);
			//ランダムな手を持つコンピュータの手を表すインスタンスを生成
			ComputerPlayer computerHand = new ComputerPlayer();
			//コンピュータの手のインスタンスを表示する
			System.out.println(computerHand);
			//人間の手とコンピュータの手を比較した結果を表示する
			Player.judgeWinner(humanHand, computerHand);
			//分岐を脱出
			break;

		//コンピュータ対コンピュータが選択された場合
		case COMPUTER_VS_COMPUTER:
			//ランダムな手を持つコンピュータの手を表すインスタンスを生成
			ComputerPlayer firstComputerHand = new ComputerPlayer();
			//コンピュータの手のインスタンスを表示する
			System.out.println(firstComputerHand);
			//ランダムな手を持つコンピュータの手を表すインスタンスを生成
			ComputerPlayer secondComputerHand = new ComputerPlayer();
			//コンピュータの手のインスタンスを表示する
			System.out.println(secondComputerHand);
			//二つのコンピュータの手を比較した結果を表示する
			Player.judgeWinner(firstComputerHand, secondComputerHand);
			//分岐を脱出
			break;

		}

	}

}
