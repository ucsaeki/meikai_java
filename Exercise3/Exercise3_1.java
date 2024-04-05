package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise3_1 {
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//整数値の入力を促す。
		System.out.print("整数値：");
		//valiableNumberに整数値を読み込む。
		int valiableNumber = standerdInput.nextInt();

		//もし整数値が0より大きいとき。
		if ( valiableNumber > 0 )
			//絶対値を表示する。
			System.out.println("その絶対値は" + valiableNumber + "です。");
		//そうでないとき。
		else
			//絶対値を表示するために、変数に-1をかけて負の値を正の値に変換する。
			System.out.println("その絶対値は" + valiableNumber * -1 + "です。");
	}

}
