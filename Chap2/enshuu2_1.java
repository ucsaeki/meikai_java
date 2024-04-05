package Chap2;

public class enshuu2_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x;//xはint型の変数
		int y;//yはint型の変数
		
		x=10.5;//xに10.5を代入。しかしint型の変数は整数のみのため、代入に失敗した。
		y=12.5;//yに12.5を代入。しかしint型の変数は整数のみのため、代入に失敗した。
		
		System.out.println("xの値は"+x+"です。");//xの値を画面に表示するプログラム。
		System.out.println("yの値は"+y+"です。");//yの値を画面に表示するプログラム。
		System.out.println("合計は"+(x+y)+"です。");//xとyの合計を画面に表示するプログラム。
		System.out.println("平均は"+(x+y)/2+"です。");//xとyの平均を画面に表示するプログラム。
		//xとyの値の代入に失敗したため、13～16行目のプログラムが失敗した。
	}

}
