package Chap2;

import java.util.Scanner;

public class enshuu2_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
			
		System.out.print("xの値：");//xの値の入力を促す。
		double x = stdIn.nextDouble();//xに実数値を読み込む。
			
		System.out.print("yの値：");//yの値の入力を促す。
		double y = stdIn.nextDouble();//yに実数値を読み込む。
		
		System.out.println("合計は" + ( x + y ) + "です。");//xとyの合計を表示。
		System.out.println("平均は" + ( x + y ) / 2 + "です。");//xとyの平均を表示。
	}

}
