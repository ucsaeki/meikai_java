package Chap3;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if( n > 0 ) System.out.println("その値は正です。");

	}

}
