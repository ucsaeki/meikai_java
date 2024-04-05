package Chap3;

import java.util.Scanner;

public class enshuu3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a：");//aの入力を促す。
		int a = stdIn.nextInt();//aに実数値を読み込む。
		
		System.out.print("b：");//bの入力を促す。
		int b = stdIn.nextInt();//bに実数値を読み込む。
		
		if ( a > b )
			System.out.println("aのほうが大きいです。");//aがbよりも大きいときに文章を表示する。
		else if ( a < b )
			System.out.println("bのほうが大きいです。");//bがaよりも小さいときに文章を表示する。
		else
			System.out.println("aとbは同じ値です。");//aとbが同じ値の時に文章を表示する。

	}

}
