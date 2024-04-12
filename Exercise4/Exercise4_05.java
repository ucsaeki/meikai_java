package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_5
 * 概要 List4-5のx--が--xに変化した場合の出力を確認するテスト。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_05 {
	/* 
	 * 関数名  main
	 * 概要 List4-5のx--が--xに変化した場合の出力を確認するテスト。
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
			//xの値を表示してデクリメントして改行する。
			//前置減分演算子に変更したため、-1が行われた後の値が生成される。
			//そのため、カウントダウンが入力値-1から始まり、終了時点の表示が０ではなく-1に変化した。
			System.out.println(--x);
		}
	}

}
