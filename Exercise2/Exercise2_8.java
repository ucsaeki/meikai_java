package Exercise2;
//randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Execise2_8
 * 概要 読み込んだ整数値±5の範囲の整数値をランダムに表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_8 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ整数値±5の範囲の整数値をランダムに表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブScanner stdIn = new Scanner(System.in);
		//Randomクラスに変数を設定。
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//NUMBER_ELEVENに11を設定して確定。
		final int NUMBER_ELEVEN = 11;
		
		//変数に0～11の乱数を設定。
		int randomEleven = randomNumber.nextInt(NUMBER_ELEVEN);
		
		//整数値の入力を促す。
		System.out.print("整数値:");
		//入力を読み込む。
		int firstValiable = standerdInput.nextInt();
		
		//入力値±5の値を表示するため、入力された値-5に0～10の乱数を足す。
		System.out.println("その値の±5の乱数を生成しました。"
				+ "それは" + ( firstValiable + ( randomEleven - 5 )) +  "です。");
	}

}
