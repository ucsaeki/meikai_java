package Exercise4;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise4_11
 * 概要 入力された値から0までカウントダウンする
 * 作成者 Y.Saeki
 * 作成日 2024/04/10
 */
public class Exercise4_11 {
	/* 
	 * 関数名  main
	 * 概要 入力された値から0までカウントダウンする
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//文章を表示。
		System.out.println("カウントダウンします。");
		//入力された整数値を表す変数に0を設定。
		int integerNumber = 0;
		//正の整数値が入力されるまで繰り返す。
		for (; integerNumber <= 0;) {
			//入力を促す。
			System.out.print("正の整数値：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が負の数の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正しく入力してください。");
			}
		}
		//整数値が0以上の場合整数値-1を繰り返す。
		for (; integerNumber >= 0; --integerNumber) {
			//整数値を表示。
			System.out.println(integerNumber);
		}

	}

}
