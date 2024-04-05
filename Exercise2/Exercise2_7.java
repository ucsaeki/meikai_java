package Exercise2;
//Randomクラスをインポート。
import java.util.Random;
/* 
 * クラス名 Exercise2_7
 * 概要 1桁の正の整数値、1桁の負の整数値、2桁の正の整数値をランダムに表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_7 {
	/* 
	 * 関数名  main
	 * 概要 1桁の正の整数値、1桁の負の整数値、2桁の正の整数値をランダムに表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomNumber = new Random();
		
		//final変数RANDOM_TENに10、RANDOM_NINETYに90を設定して確定。
		final int RANDOM_TEN = 10,RANDOM_NINETY = 90;
		
		//変数に0～9の乱数を設定。
		int randomNine = randomNumber.nextInt( RANDOM_TEN );
		//変数に0～-9の乱数を設定するため、0～9の乱数に-1をかけた値を設定。
		int randomMinusNine = randomNumber.nextInt( RANDOM_TEN ) * -1;
		//変数に10～99の乱数を設定するため、0～89までの乱数に10足した値を設定。
		int randomNinety = randomNumber.nextInt( RANDOM_NINETY ) + 10;
		
		//0～9の乱数を表示。
		System.out.println( randomNine );
		//-9～0の乱数を表示。
		System.out.println( randomMinusNine );
		//10～99の乱数を表示。
		System.out.println( randomNinety );

	}

}
