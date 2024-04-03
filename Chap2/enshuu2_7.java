package Chap2;

import java.util.Random;

public class enshuu2_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		
		int x = rand.nextInt(10);//xは0～9の乱数。
		int y = rand.nextInt(90);//zは0～89の乱数。
		
		System.out.println(x);//0～9の乱数を表示。
		System.out.println(x * -1);//-9～0の乱数を表示。
		System.out.println(y + 10);//10～99の乱数を表示。
		
		
	}

}
