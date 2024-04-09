package Exercise4;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_9 {
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//変数に初期値として0を設定。
		int variableNumber = 0;
		//変数に初期値として0を設定。
		int incremaentNumber = 1;

		//繰り返し
		do {
			//整数値の入力を促す。nは教本準拠。
			System.out.print("nの値:");
			//入力した値を読み込む。
			variableNumber = standerdInput.nextInt();
			//変数が0未満の場合
			if (variableNumber <= 0)
				//文章を表示
				System.out.print("正の整数値を入力してください。");
			//変数が0以下の場合繰り返す。
		} while (variableNumber <= 0);
		
		//変数が0より大きい場合繰り返す。
		while (variableNumber > 0) {
			//変数同士をかける。
			incremaentNumber *= variableNumber;
			//変数から1減算。
			variableNumber--;
		}
		//文章を表示。
		System.out.println("その値は" + incremaentNumber + "です。");

	}

}
