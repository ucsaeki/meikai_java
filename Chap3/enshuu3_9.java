package Chap3;

import java.util.Scanner;

public class enshuu3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("実数a");//実数の入力を促す。
		int a = stdIn.nextInt();//aに入力する。

		System.out.print("実数b");//実数の入力を促す。
		int b = stdIn.nextInt();//bに入力する。
		
		System.out.println("大きいほうの値は" + ( a > b ? a : b) + "です。");
		//aのほうが大きければaを表示し、bの方が大きければbを表示する。
	}

}
