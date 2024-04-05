package Chap2;

import java.util.Random;

public class LuckyNo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random rand = new Random();
		
		int lucky = rand.nextInt(10);
		
		System.out.println("今日のラッキーナンバーは" + lucky + "です。");

	}

}
