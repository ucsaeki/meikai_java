package Chap3;

import java.util.Scanner;

public class enshuu3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:");//整数の入力を促す。
		int a = stdIn.nextInt();//aに入力する。
		System.out.print("整数b:");//整数の入力を促す。
		int b = stdIn.nextInt();//bに入力する。
		
		if ( a == b ) {
			System.out.print("二つの値は同じです.");//aとbが同じときのみ表示。
		}else if ( a < b ) {
			System.out.println("小さいほうの値は" + a + "です。");//aがbより小さいときのみaを表示。
			System.out.println("大きいほうの値は" + b + "です。");//aがbより小さいときのみ/bを表示。
		}else {
			System.out.println("小さいほうの値は" + b + "です。");//aがbより小さくないときのみbを表示。
			System.out.println("大きいほうの値は" + a + "です。");//aがbより小さくないときのみaを表示。
		}
	}

}
