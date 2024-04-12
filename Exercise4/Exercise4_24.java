package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_24
 * 概要 読み込んだ値が素数かどうかを判定する
 * 作成者 Y.Saeki
 * 作成日 2024/04/12
 */
public class Exercise4_24 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ値が素数かどうかを判定する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int firstInteger = 0;
		//素数ではない1を除外するための定数1を設定。
		final int CONSTANT_ONE = 1;
		
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= CONSTANT_ONE;) {
			//整数値の入力を促す。
			System.out.print("整数値：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= CONSTANT_ONE) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("1より大きい正の整数値を入力してください。");
			}
		}
		//素数かどうかを判断する変数を設定。
		int primeJudge = 0;
		//素数ではないことを表す定数1を設定。
		final int NOT_PRIME = 1;
		//1を除外して計算を始めるための定数2を設定.
		final int CONSTANT_TWO = 2;
		
		//整数値が素数ではないことを判断する
		for (int i = CONSTANT_TWO; i < firstInteger; i++) {
			//整数値を割り切れる数が存在する場合
			if (firstInteger % i == 0) {
				//素数を判断する変数に素数でないことを表す定数1を代入
				primeJudge = NOT_PRIME;
				//繰り返しを終了
				break;
			}
		}
		//素数を判断する変数に素数でないことを表す変数が入力されている場合
		if (primeJudge == NOT_PRIME) {
			//素数でないことを表示。
			System.out.println(firstInteger + "は素数ではありません。");
		}
		//そうでない場合
		else {
			//素数であることを表示。
			System.out.println(firstInteger + "は素数です。");
		}
		
	}
	
}