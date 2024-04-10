package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_7
 * 概要 読み込んだ値の個数だけ記号文字を出力するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_7 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ値の個数だけ記号文字を出力するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//個数の入力を促す。
		System.out.print("何個表示しますか:");
		//入力した値を読み込む。
		int variableNumber = standerdInput.nextInt();
		//変数に初期値0を入力。
		int incremaentNumber = 0;
		
		//繰り返し
		do {
			//入力した値が0以上の場合
			if (variableNumber <= 0) {
				//正の値の入力を促す
				System.out.println("正の値を入力してください。\n何個表示しますか:");
				//入力した値を読み込む。
				variableNumber = standerdInput.nextInt();
			}
			//変数が0以下の場合繰り返す。
		} while (variableNumber <= 0);

		//計算に使用するための定数2と1を宣言。
		final int PER_TWO = 2, REMINDER_ONE = 1;
		
		//変数が1の場合
		if (variableNumber == 1) {
			//文章を表示。
			System.out.print('*');
			//変数が1より大きい場合。
		}if (variableNumber > 1) {
			//変数が入力された値より小さい場合
			while (incremaentNumber < variableNumber) {
				//変数÷2の余りが1である場合
				if (incremaentNumber % PER_TWO == REMINDER_ONE) {
					//文字を表示。
					System.out.print('+');
					//変数に1加算する。
					incremaentNumber++;
					//そうでない場合
				} else {
					//文字を表示。
					System.out.print('*');
					//変数に1加算する。
					incremaentNumber++;
				}
			}
		}

	}

}
