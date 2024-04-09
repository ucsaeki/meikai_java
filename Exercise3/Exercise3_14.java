package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_14
 * 概要 入力した二つの値の大きい方と小さい方を表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_14 {
	/* 
	 * 関数名  main
	 * 概要 入力した二つの値の大きい方と小さい方を表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数の入力を促す。
		System.out.print("整数a:");
		//入力を読み込む。aは教本準拠。
		int a = standerdInput.nextInt();
		//整数の入力を促す。
		System.out.print("整数b:");
		//入力を読み込む。bは教本準拠。
		int b = standerdInput.nextInt();
		
		//二つの変数が同じ場合
		if ( a == b ) {
			//文章を表示。
			System.out.print("二つの値は同じです.");
		//aがbより小さい場合
		}else if ( a < b ) {
			//文章を表示。
			System.out.println("小さいほうの値は" + a + "です。");
			//文章を表示。
			System.out.println("大きいほうの値は" + b + "です。");
		//そうでない場合
		}else {
			//文章を表示。
			System.out.println("小さいほうの値は" + b + "です。");
			//文章を表示。
			System.out.println("大きいほうの値は" + a + "です。");
		}
	}

}
