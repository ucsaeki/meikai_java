package Exercise4;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_10 {
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
		//整数の入力を促す。
		System.out.println("何個*を表示しますか：");
		//変数を設定。xは教科書準拠。
		int n = standerdInput.nextInt();
		
		for ( int i = 0; i < n; i++)
			System.out.print('*');
		System.out.println();

	}

}
