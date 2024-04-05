package Chap3;

import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		System.out.print("整数b：");
		int b = stdIn.nextInt();

		if (a == b)
			System.out.print("二つの値は等しいです");
		else
			System.out.print("二つの値は等しくありません。");
	}

}
