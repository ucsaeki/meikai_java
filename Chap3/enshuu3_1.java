package Chap3;

import java.util.Scanner;

public class enshuu3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");//整数値の入力を促す。
		int n = stdIn.nextInt();//nに実数値を読み込む。

		if ( n > 0 )
			System.out.println("その絶対値は" + n + "です。");//nが0より大きいときの絶対値を表示する。
		else
			System.out.println("その絶対値は" + n * -1 + "です。");//nが0以下のときの絶対値を表示する。
	}

}
