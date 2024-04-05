package Chap3;

import java.util.Random;

public class enshuu3_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		
		int n = rand.nextInt(3);//nに0～2のランダムな数字を代入。
		
		System.out.println( n );//nを表示。
		
		switch ( n ) {//nを分岐。
		case 0: System.out.println("グー"); break;//nが0のとき表示して分岐を終了する。
		case 1: System.out.println("チョキ"); break;//nが1のとき表示して分岐を終了する。
		case 2: System.out.println("パー"); break;//nが2のとき表示して分岐を終了する。
		}
	}

}
