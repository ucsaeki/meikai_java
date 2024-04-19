package Exercise5;

/* 
 * クラス名 Exercise5_06
 * 概要 float型の変数とint型の変数を0.0から0.1まで0.001ずつ加算した値と、その値を1000で割った値を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/15
 */
public class Exercise5_06 {
	/* 
	 * 関数名  main
	 * 概要 float型の変数とint型の変数を0.0から0.1まで0.001ずつ加算した値と、その値を1000で割った値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/15
	 */
	public static void main(String[] args) {
		//表題を表示
		System.out.println("　float　　　　int");
		//点線を表示
		System.out.println("---------------------");
		//浮動小数点型の変数を設定
		float secondVariale = 0.0F;
		//計算に使用する浮動小数点の定数を設定
		final float ZERO_ZERO_ONE = 0.001F;
		//計算に使用する定数を設定
		final int CONSTANT_THOUSAND = 1000;
		//計算回数が1000回以上になるまで繰り返す

		for (int i = 0; i <= CONSTANT_THOUSAND; i++) {
			//変数を、全体を1桁、小数点以下を7桁で表示
			System.out.printf("%1.7f", secondVariale);
			//変数に0,001を加算した値を代入
			secondVariale += ZERO_ZERO_ONE;
			//空白を表示
			System.out.print("　　");
			//計算回数を1000で割った値を変数に設定
			float secondVariable = (float) i / CONSTANT_THOUSAND;
			//変数を、全体を8桁で表示
			System.out.printf("%1.7f\n", secondVariable);

		}
	}

}
