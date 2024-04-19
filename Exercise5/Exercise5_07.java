package Exercise5;

/* 
 * クラス名 Exercise5_07
 * 概要 0.0から1.0まで0.001おきにその値とその値の二乗を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/16
 */
public class Exercise5_07 {
	/* 
	 * 関数名  main
	 * 概要 0.0から1.0まで0.001おきにその値とその値の二乗を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/16
	 */
	public static void main(String[] args) {
		//表題を表示
		System.out.println("　 値　　　 値の二乗");
		//点線を表示
		System.out.println("---------------------");
		
		//計算で使用する定数を設定
		final int CONSTANT_NUMBER = 1000;
		
		//1000まで加算を繰り返す
		for (int variableNumber = 0; variableNumber <= CONSTANT_NUMBER; variableNumber++) {
			//int型の変数をfloat型に変換して1000で割る
			float pointVariable = (float)variableNumber / CONSTANT_NUMBER;
			
			//加算した値を表示
			System.out.printf("%8f", pointVariable);
			//空白を表示
			System.out.print("　　");
			//変巣を二乗した値を表示
			System.out.printf("%8f\n", pointVariable * pointVariable);

		}

	}

}