package Exercise7;
//Scannerクラスをインポート。

import java.util.Scanner;
/* 
 * クラス名 Exercise7_11_true
 * 概要 入力した整数値を左右にシフトした値と、2のべき乗での乗算や除算した値を比較する
 * 作成者 Y.Saeki
 * 作成日 2024/04/25
 */

public class Exercise7_11_true {
	/* 
	 * 関数名  main
	 * 概要 入力した整数値を左右にシフトした値と、2のべき乗での乗算や除算した値を比較する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//計算で使用する定数を設定
		final int MINUS_ONE = -1;
		//シフトの対象となる整数値を表す変数を設定
		int variableNumber = 0;
		//べき乗の回数を表す変数を設定し、入力範囲外の値を代入しておく。
		int shiftNumber = MINUS_ONE;
		//0から数えたビットの桁数を表す定数を設定
		final int CONSTANT_BITS = 31;

		//0より大きい整数値を入力させる
		while (variableNumber <= 0) {
			//整数値の入力を促す文章を表示
			System.out.print("整数値：");
			//入力を読み込む
			variableNumber = standerdInput.nextInt();
			//入力された値が0以下の場合
			if (variableNumber <= 0) {
				//0より大きい値の入力を求めるエラー文を表示
				System.out.println("0より大きい値を入力してください。");
			}

		} //0以上32より小さい整数値を入力させる
		while (shiftNumber < 0 || shiftNumber > CONSTANT_BITS) {
			//シフトする個数の入力を促す文章を表示
			System.out.print("シフトする個数：");
			//入力を読み込む
			shiftNumber = standerdInput.nextInt();
			//入力された値が0以下の場合
			if (shiftNumber < 0 || shiftNumber > CONSTANT_BITS) {
				//0より大きい値の入力を求めるエラー文を表示
				System.out.println("0以上32未満の値を入力してください。");
			}

		}
		//入力された整数値をシフトする個数分左にシフトさせた値を表示
		System.out.println("整数値を左にシフトした値は" + (variableNumber << shiftNumber) + "です。");
		//入力された整数値をシフトする個数分右にシフトさせた値を表示
		System.out.println("整数値を右にシフトした値は" + (variableNumber >> shiftNumber) + "です。");

		//べき乗した値を表す変数の初期値に1を設定
		int exponentNumber = 1;
		//べき乗の計算に使用する定数を設定	
		final int CONSTANT_TWO = 2;
		//入力されたシフトする個数分2のべき乗を行う。
		for (int i = shiftNumber; i > 0; i--) {
			//変数に2をかけた値を代入。
			exponentNumber *= CONSTANT_TWO;

		}
		//整数値を指定回数べき乗した値とかけた値を表示
		System.out.println("2をシフトする個数分べき乗した値に整数値をかけた値は" + (variableNumber * exponentNumber) + "です。");
		//整数値を指定回数べき乗した値で割った値を表示
		System.out.println("2をシフトする個数分べき乗した値で整数値を割った値は" + (variableNumber / exponentNumber) + "です。");

	}

}
