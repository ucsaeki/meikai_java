package Chap2;

import java.util.Scanner;

public class Minus {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数値");
		int a = stdIn.nextInt();
		
		int b = -a;
		System.out.println(a + "の符号を反転した値は" + b + "です。");
		
		
	}

}
