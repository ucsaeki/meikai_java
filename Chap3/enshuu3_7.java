package Chap3;

import java.util.Scanner;

public class enshuu3_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("正の整数：");//正の整数の入力を促す。
		int n = stdIn.nextInt();//nに実数値を読み込む。
		
		if ( n > 0 )
			if ( n % 3 == 0)
				System.out.println("その値は3で割り切れます。");//n%3が0の場合表示する。
			else if( n % 3 == 1)
				System.out.println("その値を3で割った余りは1です。");//n%3が1の場合表示する。
			else
				System.out.println("その値を3で割った余りは2です。");//n%3が2の場合表示する。
		 else
				System.out.println("正でない値が入力されました。");//nが0以下の場合表示する。
	}

}
