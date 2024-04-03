package Chap3;

import java.util.Scanner;

public class enshuu3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");//整数値の入力を促す。
		int n = stdIn.nextInt();//nに実数値を読み込む。
		
		if ( n > 0 )
			System.out.println("その値は正です");//nが0より大きいときに文章を表示。
		else if ( n < 0 )
			System.out.println("その値は負です");//nが0より小さいときに文章を表示。
		else if ( n == 0 )
			System.out.println("その値は0です");//nが0であるときに文章を表示。
		//List3-5の最後尾のelseをelse if ( n == 0 )に変更したとしても、変更前と同様の挙動を示す。
	}

}
