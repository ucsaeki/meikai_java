package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_07
 * 概要 左下が直角の三角形を入力された値の段数で表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/24
 */
public class Exercise7_07 {
	/* 
	 * 関数名  perChars
	 * 概要 指定された記号を段数に対応した個数表示するメソッド
	 * 引数 表示したい記号、記号を表示する段数
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	static void perChars(char c, int n) {
		//段数に対応した個数の記号を表示
		while (n-- > 0) {
			//指定された記号を表示
			System.out.print(c);
		}
	}

	/* 
	 * 関数名  main
	 * 概要 左下が直角の三角形を入力された値の段数で表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//三角形を表示することを示す文章を表示
		System.out.println("左下直角の三角形を表示します。");
		//段数を表す変数を設定
		int stageNumber = 0;

		//正の整数を入力させる
		while (stageNumber <= 0) {
			//段数の入力を促す/////
			System.out.print("段数は：");
			//入力を読み込む
			stageNumber = standerdInput.nextInt();
			//入力された値が0より小さい場合
			if (stageNumber <= 0) {
				//正の整数値の入力を求めるエラー文を表示
				System.out.print("正の整数値を入力してください");
			}
		}

		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//入力された段数の三角形を表示
		for (int i = 0; i < stageNumber; i++) {
			//関数を用いて段数に対応した数の記号を表示
			perChars('*', i + CONSTANT_ONE);
			//一段分表示したら改行する
			System.out.println();
		}

	}

}
