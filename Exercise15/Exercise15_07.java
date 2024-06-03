package Exercise15;
/* 
 * クラス名 Exercise15_07
 * 概要 コマンドライン引数のdouble型の値を全て加算する
 * 作成者 Y.Saeki
 * 作成日 2024/06/03
 */
public class Exercise15_07 {
	/* 
	 * 関数名 main
	 * 概要 コマンドライン引数のdouble型の値を全て加算する
	 * 引数 コマンドライン引数(String[])
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/06/03
	 */
	public static void main(String[] args) {
		//合計を表す変数を設定
		double sumValue = 0.0;
		//加算した回数を表す変数を設定
		int counterNumber = 0;
		//コマンドライン引数の全ての要素を走査する
		for( String i : args) {
			//加算した回数に1加算
			counterNumber++;
			//配列の要素を表示
			System.out.println("[" + counterNumber + "] = " + Double.parseDouble(i));
			//合計に配列の要素の文字列を数値に変換した値を加算して代入
			sumValue += Double.parseDouble(i);
		}
		//合計を表示
		System.out.println("合計は" + sumValue + "です。");

	}

}
