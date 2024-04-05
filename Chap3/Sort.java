package Chap3;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("変数a");
		int a = stdIn.nextInt();
		System.out.print("変数b");
		int b = stdIn.nextInt();
		
		if ( a > b ) {
			int t = a;
			a = b;
			b = t;
		}
		
		System.out.println("a≦bとなるようにソートしました。");
		System.out.print("変数aは" + a + "です。");
		System.out.print("変数bは" + b + "です。");

	}

}
