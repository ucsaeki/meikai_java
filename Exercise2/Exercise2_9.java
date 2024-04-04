package Exercise2;
//Randomクラスをインポート。
import java.util.Random;
/* 
 * クラス名 Exercise2_9
 * 概要 0.0以上1.0未満、0.0以上10.0未満、-1.0以上1.0未満の実数値をそれぞれランダムで生成するメソッド
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_9 {
	/* 
	 * 関数名  main
	 * 概要 0.0以上1.0未満、0.0以上10.0未満、-1.0以上1.0未満の実数値をそれぞれランダムで生成するメソッド
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//randomNumberに変数を設定。
		Random randomNumber = new Random();
		
		//firstRandomは0～1.0未満の乱数。
		double firstRandom = randomNumber.nextDouble(1.0);
		//secondRandomは0～10.0未満の乱数。
		double secondRandom = randomNumber.nextDouble(10.0);
		//thirdRandomは0～2.0未満の乱数。
		double thirdRandom = randomNumber.nextDouble(2.0);
		
		//0以上1.0未満の乱数を表示。
		System.out.println( firstRandom );
		//0以上10.0未満の乱数を表示。
		System.out.println( secondRandom );
		//-1.0以上1.0未満の乱数を表示するため、thirdRandom-1をした値を表示。
		System.out.println( thirdRandom - 1.0 );
	}

}
