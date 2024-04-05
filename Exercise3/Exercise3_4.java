package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise3_4 {
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//aの入力を促す。変数aは教本準拠。
		System.out.print("a：");
		//入力を読み込む。
		int a = standerdInput.nextInt();
		//bの入力を促す。変数bは教本準拠。
		System.out.print("b：");
		//入力を促す。
		int b = standerdInput.nextInt();
		
		//もしaがbより大きい場合。
		if ( a > b )
			//文章を表示。
			System.out.println("aのほうが大きいです。");
		//bがaよりも大きい場合
		else if ( a < b )
			//文章を表示する
			System.out.println("bのほうが大きいです。");
		//それ以外の場合
		else
			//文章を表示
			System.out.println("aとbは同じ値です。");
	}

}
