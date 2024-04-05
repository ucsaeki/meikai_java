package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_
 * 概要 入力した整数値の絶対値を表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise3_1 {
	/* 
	 * 関数名  main
	 * 概要 入力した整数値の絶対値を表示するメソッド。
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
		//入力を読み込む。
		int valiableNumber = standerdInput.nextInt();

		//もし変数が0より大きい場合。
		if ( valiableNumber > 0 ) {
			//絶対値を表示する。
			System.out.println("その絶対値は" + valiableNumber + "です。");
		//そうでない場合。
		}else
			//負の値を正の値に変換して絶対値を表示するため、変数に-1をかける。
			System.out.println("その絶対値は" + valiableNumber * -1 + "です。");
	}

}
