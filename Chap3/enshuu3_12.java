package Chap3;

import java.util.Scanner;

public class enshuu3_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a");//整数の入力を促す。
		int a = stdIn.nextInt();//aに入力する。

		System.out.print("整数b");//整数の入力を促す。
		int b = stdIn.nextInt();//bに入力する。
		
		System.out.print("整数c");//整数の入力を促す。
		int c = stdIn.nextInt();//cに入力する。
	
		int min = a;//minにaを代入。
		if ( b < min ) 
			min = b;//bがminより小さい場合、minにbを代入。
		if( c < min )
			min = c;//cがminより小さい場合、minにcを代入。
		
		System.out.print("最小値は" + min + "です。");//minの値を表示。
	}

}
