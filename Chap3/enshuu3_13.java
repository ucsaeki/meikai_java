package Chap3;

import java.util.Scanner;

public class enshuu3_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a");//整数の入力を促す。
		int a = stdIn.nextInt();//aに入力する。

		System.out.print("整数b");//整数の入力を促す。
		int b = stdIn.nextInt();//bに入力する。
		
		System.out.print("整数c");//整数の入力を促す。
		int c = stdIn.nextInt();//cに入力する。

		int max = a;//maxにaを代入。
		if ( b > max )//maxがbより小さいとき。
			max = b;//maxにbを代入。
		if ( c > max )//maxがcより小さいとき。
			max = c;//maxにcを代入。
		
		int min = a;//minにaを代入。
		if ( b < min )//bがminより小さいとき。
			min = b;//minにbを代入。
		if ( c < min )//cがminより小さいとき。
			min = c;//minにcを代入。
		
		if ( max == a )//maxとaが同じとき。
			if ( min == b )//minとbが同じとき。
				System.out.print("中央値は" + c + "です。");//maxがa、minがbのとき、cを表示。
			else//minがbではないとき。
				System.out.print("中央値は" + b + "です。");//maxがa、minがbではないとき、bを表示。
		else if ( max == b )//maxがbと同じとき。
			if ( min == a )//minがaと同じとき。
				System.out.print("中央値は" + c + "です。");//maxがaでなくbでminがaのとき、cを表示。
			else//minがaではないとき。
				System.out.print("中央値は" + a + "です。");
				//maxがaでもbでもなくminがaではないとき、aを表示。
		else if ( min == a )//minがaと同じとき。
			System.out.print("中央値は" + b + "です。");
			//maxがaでもbでもなくminがaと同じとき、bを表示。
		else
			System.out.print("中央値は" + a + "です。");
			//maxがaでもbでもなくminがaと違うとき、aを表示。
			
			
			
			
	}

}
