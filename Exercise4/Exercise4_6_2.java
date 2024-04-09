package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_6_2
 * 概要 List4-8を読み込んだ値が1未満の場合改行文字を出力しないように書き換えたメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_6_2 {
	/* 
	 * 関数名  main
	 * 概要 List4-8を読み込んだ値が1未満の場合改行文字を出力しないように書き換えたメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数の入力を促す。
		System.out.print("何個*を表示しますか:");
		//入力した値を読み込む。nは教本準拠。
		int n = standerdInput.nextInt();
		//変数に0を入力。iは教本準拠。
		int i = 1;

		//変数が0より大きい場合。
		if (n > 0) {
			//変数が入力値の
			while (i <= n) {
				//文字リテラルを表示
				System.out.print('*');
				//iに1加算
				i++;
			}
			//改行する
			System.out.println();
		}
		
	}

}
