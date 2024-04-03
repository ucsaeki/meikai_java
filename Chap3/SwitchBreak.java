package Chap3;

import java.util.Scanner;

public class SwitchBreak {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数を入力せよ：");
		int n = stdIn.nextInt();
		
		switch ( n ) {
		case 0 : System.out.println("A");
				 System.out.println("B");
				 break;
		case 2 : System.out.println("C");
		case 5 : System.out.println("D");
				 break;
		case 6 :
		case 7 : System.out.println("E");
				 break;
		default: System.out.println("F");
				 break;
		}
		System.out.println();
		
	}

}
