package Chap3;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a");
		int a = stdIn.nextInt();

		System.out.print("整数b");
		int b = stdIn.nextInt();
		
		System.out.print("整数c");
		int c = stdIn.nextInt();
		
		int max = a;
		if ( b > max ) 
			max = b;
		if( c > max )
			max = c;
		
		System.out.print("最大値は" + max + "です。");
	}

}
