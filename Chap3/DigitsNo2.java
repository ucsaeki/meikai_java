package Chap3;

import java.util.Scanner;

public class DigitsNo2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("正の整数：");
		int n = stdIn.nextInt();
		
		if ( n <= -10 || n >= 10 )
			System.out.println("2桁以上です。");
		else
			System.out.println("2桁未満です。");
		

	}

}
