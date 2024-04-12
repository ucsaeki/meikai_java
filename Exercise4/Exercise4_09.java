package Exercise4;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise4_9
 * 概要 1から読み込んだ値までの積を求めるメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_09 {
	/* 
	 * 関数名  main
	 * 概要 1から読み込んだ値までの積を求めるメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された整数値を宣言し、初期値として0を設定。
		int variableNumber = 0;
		//積を表すための変数に初期値として1を設定。
		int incrementNumber = 1;

		//正の整数値が入力されるまで繰り返し。
		do {
			//整数値の入力を促す。
			System.out.print("nの値:");
			//整数値を読み込む。
			variableNumber = standerdInput.nextInt();
			//入力された値が0以下の場合
			if (variableNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
			//入力された値が0以下の場合繰り返す。
		} while (variableNumber <= 0);
		
		//計算に使用する変数を宣言し、初期値に正の整数値を代入。
		int multipleNumber = variableNumber;
		
		//変数が0より大きい場合繰り返す。
		while ( multipleNumber > 0) {
			//積を表す変数と計算に使用する変数をかける。
			incrementNumber *= multipleNumber;
			//計算に使用する変数から1減算。
			multipleNumber--;
		}
		//文章を表示。
		System.out.println("1から" + variableNumber + "までの積は" + incrementNumber + "です。");

	}

}
