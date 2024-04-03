package Chap2;

import java.util.Scanner;

public class enshuu2_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓：");//姓の入力を促す。
		String s1 = stdIn.next();//文字列s１を読み込む。
		
		System.out.print("名：");//名の入力を促す。
		String s2 = stdIn.next();//文字列s２を読み込む。
		
		System.out.println("こんにちは" + s1 + s2 + "さん。");//姓と名を連続で表示。

	}

}
