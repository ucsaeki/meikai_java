package Chap3;

import java.util.Scanner;

public class enshuu3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A：");//整数値の入力を促す。
		int a = stdIn.nextInt();//aに実数値を読み込む。
		System.out.print("整数B：");//整数値の入力を促す。
		int b = stdIn.nextInt();//bに実数値を読み込む。
		
		int c = a / b;//cはa/bの値を示す。

		if ( c >= 0 )
			System.out.println("BはAの約数です。");//a/bが正の整数、もしくは0の場合に文字を表示する。
		else
			System.out.println("BはAの約数ではありません。");//a/bが負の場合に文字を表示する。
	}

}
