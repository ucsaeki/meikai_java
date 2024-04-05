package Chap2;

import java.util.Scanner;

public class Arithint {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("xとyを加減乗除します。");
		
		System.out.print("xの値：");
		int x = stdIn.nextInt();
		
		System.out.print("yの値：");
		int y = stdIn.nextInt();

		System.out.println("x + y =" + (x + y));
		System.out.println("x - y =" + (x - y));
		System.out.println("x * y =" + (x * y));
		System.out.println("x / y =" + (x / y));
		System.out.println("x % y =" + (x % y));
		
	}

}
