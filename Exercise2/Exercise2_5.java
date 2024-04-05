package Exercise2;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise2_5
 * 概要 二つの実数値の和と平均を求めて表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_5 {
	/* 
	 * 関数名  main
	 * 概要 二つの実数値の和と平均を求めて表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//xの値の入力を促す。x表記は教本準拠。
		System.out.print("xの値：");
		//xに実数値を読み込む。
		double x = standerdInput.nextDouble();
			
		//yの値の入力を促す。y表記は教本準拠。
		System.out.print("yの値：");
		//yに実数値を読み込む。
		double y = standerdInput.nextDouble();
		
		//xとyの合計を表示するため、xとyを足す。
		System.out.println("合計は" + ( x + y ) + "です。");
		//xとyの平均を表示するため、xとyの合計を2で割る。
		System.out.println("平均は" + ( x + y ) / 2 + "です。");
	

	}

}
