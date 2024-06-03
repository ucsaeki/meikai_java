package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_04
 * 概要 1から入力した値までの全ての整数値を合計した値を関数を用いて表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/24
 */
public class Exercise7_04 {
	/* 
	 * 関数名  sumUp
	 * 概要 1から引数の値までの全ての整数値の和を求めるメソッド
	 * 引数 正の整数値
	 * 返り値 1から引数までの全ての整数値の和
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	static int sumUp(int n) {
		//整数値の合計を表す変数の初期値に入力された値を設定
		int variableSum = n;
		//整数値を1まで減算して、各値を足し合わせていく
		while (n-- > 0) {
			//合計を表す変数に整数値を加算した値を代入。
			variableSum += n;
		}
		//整数値の合計を返す。
		return variableSum;
	}

	/* 
	 * 関数名  main
	 * 概要 1から入力した値までの全ての整数値を合計した値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//入力した値を表す変数を設定
		int limitNumber = 0;

		//正の整数を入力させる
		while (limitNumber <= 0) {
			//整数値の入力を促す
			System.out.print("整数値：");
			//入力を読み込む
			limitNumber = standerdInput.nextInt();
			//入力された値が0より小さい場合
			if (limitNumber <= 0) {
				//正の整数値の入力を求めるエラー文を表示
				System.out.print("正の整数値を入力してください");
			}
		}
		//関数を用いて1から入力した値までの全ての整数値の合計を求めて表示する。
		System.out.println("1から入力した値までの合計は" + sumUp(limitNumber) + "です。");

	}

}
