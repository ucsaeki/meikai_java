package Chap3;

import java.util.Scanner;

public class enshuu3_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("月を入力してください。:");//入力を促す。
		int n = stdIn.nextInt();//入力した値をnに代入。

		switch ( n ) {//nを分岐。
		case 1 :
		case 2 :
		case 3 : System.out.println("冬"); break;//nが1、2、3のとき、冬を表示して分岐を終了。
		case 4 :
		case 5 :
		case 6 :System.out.println("春"); break;//nが4、5、6のとき、春を表示して分岐を終了。
		case 7 :
		case 8 :
		case 9 :System.out.println("夏"); break;//nが7、8、9のとき、夏を表示して分岐を終了。
		case 10 :
		case 11 :
		case 12 :System.out.println("秋"); break;//nが10、11、12のとき、秋を表示して分岐を終了。
		}
	}

}
