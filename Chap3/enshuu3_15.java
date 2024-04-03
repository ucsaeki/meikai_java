package Chap3;

import java.util.Scanner;

public class enshuu3_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:");//整数の入力を促す。
		int a = stdIn.nextInt();//aに入力する。
		System.out.print("整数b:");//整数の入力を促す。
		int b = stdIn.nextInt();//bに入力する。
		
		if ( a < b ) {//bがaより大きいときのみ。
			int t = a;//aをtに一時保存。
			a = b;//aにbを代入。
			b = t;//bに、tに保存してあったaを代入。
		}
		
		System.out.println("降順にソートしました。");//文章を表示。
		System.out.println("整数a:" + a );//aを表示。
		System.out.println("整数b:" + b );//bを表示。
	}

}
