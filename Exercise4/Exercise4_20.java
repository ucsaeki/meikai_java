package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_20
 * 概要 入力した値の正方形を記号によって表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_20 {
	/* 
	 * 関数名  main
	 * 概要 入力した値の正方形を記号によって表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int integerNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; integerNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("nの値：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//入力された値の数だけ記号を縦と横に表示する			
		for (int i = 1; i <= integerNumber; i++) {
			//入力された値の数だけ記号を横に表示する
			for (int j = 1; j <= integerNumber; j++) {
				//記号を表示。
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}

	}

}
