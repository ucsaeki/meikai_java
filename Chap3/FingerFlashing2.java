package Chap3;

import java.util.Scanner;

public class FingerFlashing2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("手を選べ（０…グー/1…チョキ/2…パー）：");
		int hand = stdIn.nextInt();
		
		switch ( hand ) {
		case 0: System.out.println("グー"); break;
		case 1: System.out.println("チョキ"); break;
		case 2: System.out.println("パー"); break;
		}

	}

}
