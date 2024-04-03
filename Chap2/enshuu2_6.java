package Chap2;

import java.util.Scanner;

public class enshuu2_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner stdIn = new Scanner(System.in);
		
		
        System.out.print("底辺：");//xの値の入力を促す。
		double x = stdIn.nextDouble();//xに実数値を読み込む。
		
		System.out.print("高さ：");//yの値の入力を促す。
		double y = stdIn.nextDouble();//yに実数値を読み込む。
		
		System.out.println("面積は" + ( x * y) / 2  + "です。");
		//底辺xと高さyから三角形の面積を表示するプログラム。
		
	}

}
