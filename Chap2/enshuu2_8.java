package Chap2;

import java.util.Random;
import java.util.Scanner;

public class enshuu2_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		Random rand = new Random();
		
		int x = rand.nextInt(11);//xは0～11の乱数
		
		System.out.print("整数値:");//整数値の入力を促す。
		int y = stdIn.nextInt();//yに実数値を読み込む。
		
		System.out.println("その値の±5の乱数を生成しました。それは" + ( y + ( x - 5 )) +  "です。");
		//入力された値の±5の乱数を表示。
	}

}
