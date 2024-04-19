package Exercise6;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_13
 * 概要 配列aの全要素を配列bに逆順にコピーする
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_13 {
	/* 
	 * 関数名  main
	 * 概要 配列aの全要素を配列bに逆順にコピーする
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/19
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int elementNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; elementNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("要素数：");
			//入力を読み込む。
			elementNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (elementNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値で入力してください。");
			}
		}

		//入力された値だけ要素数を持つ配列を生成。aは教本準拠。
		int[] a = new int[elementNumber];
		//全ての要素を入力させる
		for (int i = 0; i < elementNumber; i++) {
			//要素の入力を促す
			System.out.print("a[" + i + "] = :");
			//入力を読み込む
			a[i] = standerdInput.nextInt();
		}

		//操作の内容を表示。
		System.out.println("aの要素をbに逆順にコピーしました。");

		//計算に使用する定数を設定
		final int MINUS_ONE = -1;
		//配列を逆順にコピーする配列を生成。bは教本準拠。
		int[] b = new int[elementNumber];
		//全ての要素に代入して表示する
		for (int j = 0; j < elementNumber; j++) {
			//逆順に要素をコピーして代入
			b[j] = a[elementNumber + MINUS_ONE - j];
			//インデックスと要素の値を表示
			System.out.println("b[" + j + "] = " + b[j]);
		}

	}

}
