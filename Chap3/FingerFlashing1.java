package Chap3;

import java.util.Scanner;

public class FingerFlashing1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("手を選べ（０…グー/1…チョキ/2…パー）：");
		int hand = stdIn.nextInt();
		
		if ( hand == 0 )
			System.out.println("グー");
		else if ( hand == 1 )
			System.out.println("チョキ");
		else
			System.out.println("パー");

	}

}
