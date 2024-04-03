package Chap3;

import java.util.Scanner;

public class enshuu3_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();//nに実数値を読み込む。
		
		if ( n >= 0 && n <= 59 )
			System.out.println("不可");//0以上59以下の場合表示する。
		else if ( n >= 60 && n <= 69 )
			System.out.println("可");//60以上69以下の場合表示する。
		else if ( n >= 70 && n <= 79 )
			System.out.println("良");//70以上79以下の場合表示する。
		else if ( n >= 80 && n <= 100 )
			System.out.println("優");//80以上100以下の場合表示する。
	}

}
