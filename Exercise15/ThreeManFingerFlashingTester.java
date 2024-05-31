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
	 * 概要 
	 * 引数 
	 * 返り値 
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void judgeWinnerOfThree(Player firstPlayer,Player secondOlayer, Player thirdPlayer) {
		
		int judgeWin = 
	}
	
	/* 
	 * 関数名 main
	 * 概要 人間とコンピュータ2人の計3人でじゃんけんを行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void main(String[] args) {
		//ランダムな手を持つコンピュータの手を表すインスタンスを生成
		ComputerPlayer firstComputerHand = new ComputerPlayer();
		//ランダムな手を持つコンピュータの手を表すインスタンスを生成
		ComputerPlayer secondComputerHand = new ComputerPlayer();
		
		//人間の手を表すインスタンスを生成
		HumanPlayer humanHand = new HumanPlayer();
		//人間の手のインスタンスを表示する
		System.out.println(humanHand);
		//1つ目のコンピュータの手のインスタンスを表示する
		System.out.println(firstComputerHand);
		//2つ目のコンピュータの手のインスタンスを表示する
		System.out.println(secondComputerHand);
		
		int judge
		
	}

}
