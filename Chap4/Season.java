package Chap4;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		do {
			System.out.print("季節を求めます。\n何月ですか:");
			int month = stdIn.nextInt();
			
			if ( month >= 3 && month <= 5 )
				System.out.println("それは春です");
			
				
			
		}

	}

}
