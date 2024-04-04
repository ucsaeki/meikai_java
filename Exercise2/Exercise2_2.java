package Exercise2;

/* 
 * クラス名 
 * 概要 三つのint型変数に値を代入して合計と平均を求めるメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_2 {
	/* 
	 * 関数名  main
	 * 概要 三つのint型変数に値を代入して合計と平均を求めるメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//int型の変数fistNumberに0を代入。
		int fistNumber = 0;
		//int型の変数secondnumberに0を代入。
		int secondNumber = 0;
		//int型の変数thirdnumberに0を代入。
		int thirdNumber = 0;
		
		//fistNumbeに30を代入
		fistNumber=10;
		//secondNumberに30を代入
		secondNumber=20;
		//thirdNumberに30を代入
		thirdNumber=30;
		
		//三値の合計を表示するために三値を足す。
		System.out.println("合計は"+(fistNumber+secondNumber+thirdNumber)+"です。");	
		//三値の平均を表示するため、合計を3で割る。
		System.out.println("平均は"+(fistNumber+secondNumber+thirdNumber)/3+"です。");
	}

}
