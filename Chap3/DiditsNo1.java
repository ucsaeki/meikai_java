package Chap3;

import java.util.Scanner;

public class DiditsNo1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("正の整数：");
		int n = stdIn.nextInt();
		
		if ( n == 0 )
			System.out.println("ゼロです");
		else if ( n >= -9 && n <= 0)
			System.out.println("1桁です。");
		else
			System.out.println("2桁以上です。");
	}

}
