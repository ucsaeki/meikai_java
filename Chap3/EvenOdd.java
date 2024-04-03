package Chap3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int n = stdIn.nextInt();
		
		if ( n > 0 )
			if ( n % 2 == 0 )
				System.out.print("その値は偶数です。");
			else
				System.out.print("その値は奇数です。");
		else
			System.out.print("正でない値が入力されました。");
		
	}

}
