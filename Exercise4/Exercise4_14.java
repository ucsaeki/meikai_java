package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_14
 * 概要 1から入力した正の整数値までの和を式で表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/10
 */
public class Exercise4_14 {
	/* 
	 * 関数名  main
	 * 概要 1から入力した正の整数値までの和を式で表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//正の整数値を表す変数に0を代入。nは教本準拠。
		int integerNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; integerNumber <= 0;) {
			//入力を促す。
			System.out.print("nの値：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が負の数の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正しく入力してください。");
			}
		}
		//計算で使用する定数に1を設定。
		final int CONSTANT_ONE = 1;
		//整数値が1の場合
		if (integerNumber == CONSTANT_ONE) {
			//1 = 1であることを表示。
			System.out.println(CONSTANT_ONE + " = " + CONSTANT_ONE);
			//そうでない場合
		} else {
			//整数値の和を表す変数に0を設定。
			int sumNumber = 0;
			//入力された整数値-1までの和を計算
			for (int i = CONSTANT_ONE; i < integerNumber; i++) {
				//和にiを加算
				sumNumber += i;
				//足した数と記号を表示。
				System.out.print(i + " + ");
			}
			//和の変数にそれまでの和＋入力された整数値を代入
			sumNumber = sumNumber + integerNumber;
			//1から入力された値までの和を表示。
			System.out.println(integerNumber + " = " + sumNumber);
		}
	}

}
