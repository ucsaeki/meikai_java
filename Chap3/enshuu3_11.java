package Chap3;

import java.util.Scanner;

public class enshuu3_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a");//整数の入力を促す。
		int a = stdIn.nextInt();//aに入力する。

		System.out.print("整数b");//整数の入力を促す。
		int b = stdIn.nextInt();//bに入力する。
		
		int min = ( a > b ? a - b : b - a );
		//minはaがbより大きいときa-bの値、そうでないときはb-aの値を代入。
		
		if( min >= 11 )
			System.out.print("それらの差は11以上です。");//minが11以上の場合表示。
		else
			System.out.print("それらの差は10以下です。");//minが11以上でない場合表示。
	}

}
