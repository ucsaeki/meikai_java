package Chap2;

import java.util.Scanner;

public class ArithDouble {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("xとyを加減乗除します。");
		
		System.out.print("xの値：");
		double x = stdIn.nextDouble();
		
		System.out.print("yの値：");
		double y = stdIn.nextDouble();
		
		System.out.println("x + y =" + ( x + y ));
		System.out.println("x - y =" + ( x - y ));
		System.out.println("x * y =" + ( x * y ));
		System.out.println("x / y =" + ( x / y ));
		System.out.println("x % y =" + ( x % y ));
	}

}
