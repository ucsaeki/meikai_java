package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_06
 * 概要 入力された月の季節を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/24
 */
public class Exercise7_06 {

	/* 
	 * 関数名  divideSeason
	 * 概要 入力された月の値によって対応する季節を表す値を出力する
	 * 引数 月の値(1～12）
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */

	static void divideSeason(int a) {

		//3月を表す定数を設定
		final int MONTH_THREE = 3;
		//5月を表す定数を設定
		final int MONTH_FIVE = 5;
		//6月を表す定数を設定
		final int MONTH_SIX = 6;
		//8月を表す定数を設定
		final int MONTH_EIGHT = 8;
		//9月を表す定数を設定
		final int MONTH_NINE = 9;
		//11月を表す定数を設定
		final int MONTH_ELEVEN = 11;
		//12月を表す定数を設定
		final int MONTH_TWELVE = 12;
		//1月を表す定数を設定
		final int MONTH_ONE = 1;
		//2月を表す定数を設定
		final int MONTH_TWO = 2;

		//3～5月が入力された場合
		if (a >= MONTH_THREE && a <= MONTH_FIVE) {
			//春であることを表示
			System.out.print("春");
			//6～8月が入力された場合
		} else if (a >= MONTH_SIX && a <= MONTH_EIGHT) {
			//夏であることを表示
			System.out.print("夏");
			//9～11月が入力された場合
		} else if (a >= MONTH_NINE && a <= MONTH_ELEVEN) {
			//秋であることを表示
			System.out.print("秋");
			//12、1、2月が入力された場合
		} else if (a == MONTH_TWELVE || a == MONTH_ONE || a == MONTH_TWO) {
			//冬であることを表示
			System.out.print("冬");
		}
	}

	/* 
	 * 関数名  main
	 * 概要 入力された月の季節を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された月の値を表す変数を設定
		int variableMonth = 0;
		//12月を表す定数を設定
		final int MONTH_TWELVE = 12;

		//1～12月までの月を入力させる
		while (variableMonth <= 0 || variableMonth > MONTH_TWELVE) {
			//月の値の入力を促す
			System.out.print("月を入力してください：");
			//入力を読み込む
			variableMonth = standerdInput.nextInt();
			//入力された値が0以下、または12より大きい場合
			if (variableMonth <= 0 || variableMonth > MONTH_TWELVE) {
				//正しい月の入力を求めるエラー文を表示
				System.out.println("月の値は1～12で入力してください。");
			}
		}
		//季節を表す文章を表示
		System.out.print("その月は");
		//関数によって求めた季節を表示
		divideSeason(variableMonth);
		//季節を表す文章を表示
		System.out.println("です。");

	}

}
