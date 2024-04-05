package Chap4;

import java.util.Scanner;

public class enshuu4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int retry;//retryを設定。
		
		do {//繰り返し。
		
			System.out.print("整数値：");//整数値の入力を促す。
			int n = stdIn.nextInt();//入力した数値を代入。
		
			if ( n > 0 )//nが0より大きいとき。
				System.out.println("その値は正です。");//文章を表示。
			else if ( n < 0 )//nが0未満のとき。
				System.out.println("その値は負です。");//文章を表示。
			else//当てはまらないとき。
				System.out.println("その値は０です。");//文章を表示。
		
			System.out.println("もう一度？　1…Yes／2…No:");//継続を確認する文章を表示。
			retry = stdIn.nextInt();//入力した数値を代入。
		} while ( retry == 1);//1と入力されたとき、｛｝内を繰り返す。
	}

}
