package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_4
 * 概要 List4-4の終了時にxが-1であることを確認するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_04 {
	/* 
	 * 関数名  main
	 * 概要 List4-4の終了時にxが-1であることを確認するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数の入力を促す。
		System.out.println("カウントダウンします。");
		//変数を設定。xは教科書準拠。
		int x;
		//繰り返し
		do {
			//文章を表示。
			System.out.print("正の整数値：");
			//入力を読み込む
			x = standerdInput.nextInt();
			//変数が0以下の場合繰り返す。
		} while (x <= 0);
		//変数が0以上の場合。
		while (x >= 0) {
			//文章を表示。
			System.out.println(x);
			//変数-1
			x--;
		}
		//繰り返し終了時のxの値を表示。x=-1になっていることが確認できる。
		System.out.println("終了時のxは" + x + "です。");

	}

}
