package Chap2;

import java.util.Scanner;

public class Circle2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final double PI = 3.1416;
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("半径:");
		double r =stdIn.nextDouble();
		
		System.out.println("円周の長さは" + 2 * PI * r + "です。");
		System.out.println("面積は" + PI * r * r + "です。");
	}

}
