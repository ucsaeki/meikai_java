package Chap3;

import java.util.Scanner;

public class Min2Cond {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a");
		int a = stdIn.nextInt();

		System.out.print("整数b");
		int b = stdIn.nextInt();
		
		int min = a < b ? a : b ;
		System.out.println("小さいほうの値は" + min + "です。");

	}

}
