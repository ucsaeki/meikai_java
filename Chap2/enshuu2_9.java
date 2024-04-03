package Chap2;

import java.util.Random;

public class enshuu2_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		
		double x = rand.nextDouble(1.0);//xは0～1.0の乱数。
		double y = rand.nextDouble(10.0);//yは0～10.0の乱数。
		double z = rand.nextDouble(2.0);//zは0～2.0の乱数。
		
		System.out.println(x);//0以上1.0未満の乱数を表示。
		System.out.println(y);//0以上10.0未満の乱数を表示。
		System.out.println(z - 1.0);//-1.0以上1.0未満の乱数を表示。
	}

}
