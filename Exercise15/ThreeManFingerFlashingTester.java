package Exercise15;

//Scannerクラスをインポート
import java.util.Scanner;

//ComputerPlayerクラスをインポート
import FingerFlashing.ComputerPlayer;
//HumanPlayerクラスをインポート
import FingerFlashing.HumanPlayer;
//Playerクラスをインポート
import FingerFlashing.Player;

/* 
 * クラス名 ThreeManFingerFlashingTester
 * 概要 人間とコンピュータ2人の計3人でじゃんけんを行う
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class ThreeManFingerFlashingTester {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 judgeWinnerOfThree
	 * 概要 3人の手を比較して勝者と敗者を表示する
	 * 引数 3人のプレイヤー(Player)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void judgeWinnerOfThree(Player firstPlayer, Player secondOlayer, Player thirdPlayer) {
		//じゃんけんを行う人数を表す定数を設定
		final int PEOPLE_NUMBER = 3;
		
		//3人の手を表す値の合計が3で割り切れる場合(全員の手が同じ、または全員の手が異なる場合)
		if ((firstPlayer.getHand() + secondOlayer.getHand() + thirdPlayer.getHand()) % PEOPLE_NUMBER == 0) {
			//3人があいこであることを表示
			System.out.println("3人はあいこです。");
			//3人の手を表す値の合計÷3の余りが1の場合(勝者が二人の場合)
		} else if ((firstPlayer.getHand() + secondOlayer.getHand() + thirdPlayer.getHand()) % PEOPLE_NUMBER == 1) {
			//人間とコンピュータ1の手が同じ場合
			if (firstPlayer.getHand() == secondOlayer.getHand()) {
				//人間とコンピュータ1が勝利したことを表示
				System.out.println("あなたとコンピュータ1の勝利です。");
				//コンピュータ2が敗北したことを表示
				System.out.println("コンピュータ2の敗北です。");
				//コンピュータ1とコンピュータ2の手が同じ場合
			} else if (secondOlayer.getHand() == thirdPlayer.getHand()) {
				//コンピュータ1とコンピュータ2が勝利したことを表示
				System.out.println("コンピュータ1とコンピュータ2の勝利です。");
				//人間が敗北したことを表示
				System.out.println("あなたの敗北です。");
				//人間とコンピュータ2の手が同じ場合
			} else {
				//人間とコンピュータ2が勝利したことを表示
				System.out.println("あなたとコンピュータ2の勝利です。");
				//コンピュータ1が敗北したことを表示
				System.out.println("コンピュータ1の敗北です。");
			}
			//3人の手を表す値÷3の値が2の場合(勝者が一人の場合)
		} else if ((firstPlayer.getHand() + secondOlayer.getHand() + thirdPlayer.getHand()) % PEOPLE_NUMBER == 2) {
			//人間とコンピュータ1の手が同じ場合
			if (firstPlayer.getHand() == secondOlayer.getHand()) {
				//コンピュータ2が勝利したことを表示
				System.out.println("コンピュータ2の勝利です。");
				//人間とコンピュータ1が敗北したことを表示
				System.out.println("あなたとコンピュータ1の敗北です。");
				//コンピュータ1とコンピュータ2の手が同じ場合
			} else if (secondOlayer.getHand() == thirdPlayer.getHand()) {
				//人間が勝利したことを表示
				System.out.println("あなたの勝利です。");
				//コンピュータ1とコンピュータ2が敗北したことを表示
				System.out.println("コンピュータ1とコンピュータ2の敗北です。");
				//人間とコンピュータ2の手が同じ場合
			} else {
				//コンピュータ1が勝利したことを表示
				System.out.println("コンピュータ1の勝利です。");
				//人間とコンピュータ2が敗北したことを表示
				System.out.println("あなたとコンピュータ2の敗北です。");
			}
		}
	}

	/* 
	 * 関数名 main
	 * 概要 人間とコンピュータ2人の計3人でじゃんけんを行い、結果を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void main(String[] args) {
		//人間の手を表すインスタンスを生成
		HumanPlayer humanHand = new HumanPlayer();
		//人間の手のインスタンスを表示する
		System.out.println(humanHand);

		//ランダムな手を持つコンピュータの手を表すインスタンスを生成
		ComputerPlayer firstComputerHand = new ComputerPlayer();
		//1つ目のコンピュータの手のインスタンスを表示する
		System.out.println(firstComputerHand);

		//ランダムな手を持つコンピュータの手を表すインスタンスを生成
		ComputerPlayer secondComputerHand = new ComputerPlayer();
		//2つ目のコンピュータの手のインスタンスを表示する
		System.out.println(secondComputerHand);

		//3人の手から勝者と敗者を判断して表示する
		judgeWinnerOfThree(humanHand, firstComputerHand, secondComputerHand);

	}

}
