package Exercise4;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise4_26
 * 概要 入力された値を負の値を除いて加算する
 * 作成者 Y.Saeki
 * 作成日 2024/04/12
 */
public class Exercise4_26 {
	/* 
	 * 関数名  main
	 * 概要 入力された値を負の値を除いて加算する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//文章を表示。
		System.out.println("整数を加算します。");
		//入力された値を表す変数を設定
		int firstInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("何個加算しますか：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		
		//合計を表す変数を設定
		int firstSum = 0;
		//負の数を含めて計算した回数を表す変数を設定
		int timesNumberOne = 0;
		//正の数を加算した回数を表す変数を設定
		int timesNumberTwo = 0;
		
		//入力された値を既定の回数加算し続ける
		for (; timesNumberOne < firstInteger; timesNumberOne++) {
			//入力を促す文章を表示。
			System.out.print("整数 :");
			//入力を読み込む。
			int firstVariable = standerdInput.nextInt();
			//0未満の値が入力された場合
			if (firstVariable  < 0) {
				//文章を表示。
				System.out.println("負の数は加算しません");
				//以後の処理を行わずに繰り返しを
				continue;
			}
			//合計を表す変数に入力された値を加算して代入
			firstSum += firstVariable;
			//加算した回数を表す変数に1加算
			timesNumberTwo++;
		}
		//合計を表示
		System.out.println("合計は" + firstSum + "です。");
		//平均を表示
		System.out.println("平均は" + firstSum / timesNumberTwo + "です。");
	}

}
