package Chap3;

import java.util.Scanner;

public class enshuu3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("正の整数：");//正の整数の入力を促す。
		int n = stdIn.nextInt();//nに実数値を読み込む。
		
		if ( n > 0 )
			if ( n % 5 == 0)
				System.out.println("その値は5で割り切れます。");//n%5が0の場合表示する。
			else
				System.out.println("その値は5で割り切れません。");//n%5が0以外の場合表示する。
		 else
				System.out.println("正でない値が入力されました。");//nが0以下の場合表示する。
			
		}
}
