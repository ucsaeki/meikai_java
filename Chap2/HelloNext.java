package Chap2;

import java.util.Scanner;

public class HelloNext {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("お名前は？");
		String S = stdIn.next();
		
		System.out.println("こんにちは" + S + "さん。");
	}

}