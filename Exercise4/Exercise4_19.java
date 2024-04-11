package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_19
 * 概要 入力した月の季節を繰り返し表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_19 {
	/* 
	 * 関数名  main
	 * 概要 入力した月の季節を繰り返し表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された月の値を表す変数を設定。
		int monthNumber = 0;
		//繰り返しを判断する変数を設定。
		int variableJudge = 0;

		//1月を表す定数1を宣言。
		final int MONTH_JANUARY = 1;
		//2月を表す定数2を宣言。
		final int MONTH_FEBLUARY = 2;
		//3月を表す定数3を宣言。
		final int MONTH_MARCH = 3;
		//4月を表す定数4を宣言。
		final int MONTH_APRIL = 4;
		//5月を表す定数5を宣言。
		final int MONTH_MAY = 5;
		//6月を表す定数6を宣言。
		final int MONTH_JUNE = 6;
		//7月を表す定数7を宣言。
		final int MONTH_JULY = 7;
		//8月を表す定数8を宣言。
		final int MONTH_AUGUST = 8;
		//9月を表す定数9を宣言。
		final int MONTH_SEPTEMBER = 9;
		//10月を表す定数10を宣言。
		final int MONTH_OCTOBER = 10;
		//11月を表す定数11を宣言。
		final int MONTH_NOVENBER = 11;
		//12月を表す定数12を宣言。
		final int MONTH_DECENBER = 12;
		
		//繰り返しを行う場合に入力する定数1を設定
		final int RETRY＿JUDGE = 1;
		//繰り返しを終了する場合に入力する定数0を設定
		final int END_JUDGE = 0;
		
		//季節の判定を繰り返し行う。
		do {
			//正しい月の入力を行う。
			do {
				//文章を表示。
				System.out.print("季節を求めます。\n何月ですか:");
				//入力を読み込む。
				monthNumber = standerdInput.nextInt();
				//1～12月以外の値が入力された場合
				if (monthNumber < MONTH_JANUARY || monthNumber > MONTH_DECENBER) {
					//1～12までの数値の入力を求める文章を表示。
					System.out.println("1から12までの数値を入力してください。");
				}
				//1～12月以外の値が入力された場合、催促を繰り返す。
			} while (monthNumber < MONTH_JANUARY || monthNumber > MONTH_DECENBER);

			//入力された値が3もしくは4もしくは5の場合
			if (monthNumber == MONTH_MARCH || monthNumber == MONTH_APRIL || monthNumber == MONTH_MAY) {
				//春であることを表示
				System.out.println("それは春です");
			}
			//入力された値が6もしくは7もしくは8の場合
			else if (monthNumber == MONTH_JUNE || monthNumber == MONTH_JULY || monthNumber == MONTH_AUGUST) {
				//夏であることを表示
				System.out.println("それは夏です");
			}
			//入力された値が9もしくは10もしくは11の場合
			else if (monthNumber == MONTH_SEPTEMBER || monthNumber == MONTH_OCTOBER || monthNumber == MONTH_NOVENBER) {
				//秋であることを表示
				System.out.println("それは秋です");
			}
			//入力された値が12もしくは1もしくは2の場合
			else if (monthNumber == MONTH_DECENBER || monthNumber == MONTH_JANUARY || monthNumber == MONTH_FEBLUARY) {
				//冬であることを表示
				System.out.println("それは冬です");
			}
			//季節の判断を継続するかどうかを確認する。
			do {
				//季節の判定を継続するかどうかを確認する文章を表示
				System.out.println("もう一度？　1…Yes／0…No:");
				//入力を読み込む。
				variableJudge = standerdInput.nextInt();
				//1より大きい値もしくは0より小さい値が入力された場合
				if (variableJudge > RETRY＿JUDGE || variableJudge < END_JUDGE) {
					//正しい入力を求める文章を表示。
					System.out.println("1か0で回答してください。");
				} //繰り返しを判断する変数が1より大きい値もしくは0より小さい値の場合、催促を繰り返す。
			} while (variableJudge > RETRY＿JUDGE || variableJudge < END_JUDGE);
			//繰り返しを判断する変数が1の場合、季節の判定を繰り返す。
		} while (variableJudge == RETRY＿JUDGE);

		//プログラムの終了を表示。
		System.out.println("終了します。");
	}

}
