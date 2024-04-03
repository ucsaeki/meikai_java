package Chap2;

import java.util.Scanner;

public class HelloNextLine {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("お名前は？");
		String S = stdIn.nextLine();
		
		System.out.println("こんにちは" + S + "さん");
		
		
	}

}
