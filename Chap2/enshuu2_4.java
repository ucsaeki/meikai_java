package Chap2;

import java.util.Scanner;

public class enshuu2_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値：");//xの値の入力を促す。
		int x = stdIn.nextInt();//xに実数値を読み込む。
		
		System.out.println("10を加えた値は" + (x + 10) + "です。");//x+10の値を表示。
		System.out.println("10を減じた値は" + (x - 10) + "です。");//x-10の値を表示。
	}

}
