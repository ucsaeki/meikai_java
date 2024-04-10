package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_10
 * 概要 入力された値だけ記号を繰り返す
 * 作成者 Y.Saeki
 * 作成日 2024/04/10
 */
public class Exercise4_10 {
	/* 
	 * 関数名  main
	 * 概要 入力された値だけ記号を繰り返す
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された整数値を表す変数に0を代入。
		int integerNumber = 0;
		//入力された整数値が0以下の場合、警告表示と入力の催促を繰り返す。
		for (; integerNumber <= 0;) {
			//入力を促す。
			System.out.print("何個*を表示しますか：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が負の数の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//記号を表示する個数を計算
		for (int i = 0; i < integerNumber; i++) {
			//記号を表示する。
			System.out.print('*');
		} //改行する。
		System.out.println();

	}

}
