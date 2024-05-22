package Exercise7;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise7_08
 * 概要 入力された2つの値の範囲内の乱数を生成して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/24
 */

public class Exercise7_08 {
	/* 
	 * 関数名  random
	 * 概要 a以上b未満の範囲内の乱数を生成するメソッド
	 * 引数 生成する乱数の最低値と最高値
	 * 返り値 a以上b未満の範囲内の乱数、もしくはa
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	static int random(int a, int b) {
		//Randomクラスに変数を設定。
		Random randomRand = new Random();
		//生成した乱数を表す変数を設定
		int randomNumber = 0;
		//後に入力した値の方が小さい場合
		if( b < a ) {
			//先に入力した値をそのまま返却する
			return a;
		}
		
		//入力された最低値以上、最高値未満の乱数を生成するまで繰り返し
		while ( randomNumber < a || randomNumber >= b) {
		//0以上、最高値未満の乱数を生成
		randomNumber = randomRand.nextInt(b);
		}
		//生成した乱数を返却する。
		return randomNumber;
	}
	/* 
	 * 関数名  main
	 * 概要 最低値と最高値を入力し、その2つの間の範囲の乱数を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//最初に入力した値を表す変数を設定
		int firstVariable = 0;
		//次に入力した値を表す変数を設定
		int secondVariable = 0;
		
		//生成する数値の説明を表示
		System.out.println("A以上B未満の乱数を生成します。");
		//整数値の入力を促す
		System.out.print("A：");
		//入力を読み込む
		firstVariable = standerdInput.nextInt();
		//整数値の入力を促す
		System.out.print("B：");
		//入力を読み込む
		secondVariable = standerdInput.nextInt();
		//関数を用いて生成した乱数を表示
		System.out.println("生成した乱数は" + random(firstVariable,secondVariable) + "です。");
		

	}

}
