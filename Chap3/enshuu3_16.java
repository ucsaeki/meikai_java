package Chap3;

import java.util.Scanner;

public class enshuu3_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:");//整数の入力を促す。
		int a = stdIn.nextInt();//aに入力する。
		
		System.out.print("整数b:");//整数の入力を促す。
		int b = stdIn.nextInt();//bに入力する。
		
		System.out.print("整数c:");//整数の入力を促す。
		int c = stdIn.nextInt();//bに入力する。
		
		int min = a;//minにaを代入。
		if ( min > b )
			min = b;//minよりbが小さいとき、minにbを代入。
		if( min > c )
			min = c;//minよりcが小さいとき、minにcを代入。
		
		int max = a;//maxにaを代入。
		if ( b > max )
			max = b;//maxよりbが小さいとき、maxにbを代入。
		if ( c > max )
			max = c;//maxよりcが小さいとき、maxにcを代入。
		
		int mid = a;//midにaを代入。
		
		if ( max == a )//maxとaが同じとき。
			if ( min == b )//minとbが同じとき。
				mid = c;//midにcを代入。
			else//minがbではないとき。
				mid = b;//midにbを代入。
		else if ( max == b )//maxがbと同じとき。
			if ( min == a )//minがaと同じとき。
				mid = c;//midにcを代入。
			else//minがaではないとき。
				mid = a;//midにaを代入。
		else if ( min == a )//minがaと同じとき。
			mid = b;//midにbを代入。
		else
			mid = a;//midにaを代入。
		
		System.out.println("小さい順にソートしました");//文章を表示。
		System.out.println(min);//minを表示。
		System.out.println(mid);//midを表示。
		System.out.println(max);//maxを表示。
			
		
		
		
		
		
		
	}

}
