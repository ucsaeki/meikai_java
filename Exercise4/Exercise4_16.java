package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/04/10
 */
public class Exercise4_16 {
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//*の個数の入力を促す。
		System.out.print("何個*を表示しますか：");
		//変数に入力された整数値を設定。nは教科書準拠。
		int n = standerdInput.nextInt();

		//nが1以上の場合
		if (n >= 1) {
			//記号を表示する個数を計算
			for (int i = 0; i < n; i++) {
				//記号を表示する。
				System.out.print('*');

				if (i % 5 == 0) {
					//改行する。
					System.out.println();
				}
			}
		}

	}

}
