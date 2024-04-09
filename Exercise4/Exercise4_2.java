package Exercise4;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_2
 * 概要 ランダムな2桁の整数値を当てるメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/09
 */
public class Exercise4_2 {
	/* 
	 * 関数名  main
	 * 概要 ランダムな2桁の整数値を当てるメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/09
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//定数に90を設定。
		final int HUNDRED_CONSTANT = 90;
		//10以上90未満の乱数を生成。
		int randomHundred = randomNumber.nextInt(HUNDRED_CONSTANT + 10);
		//文章を表示。
		System.out.println("数当てゲーム開始！\n10～99の数を当ててください。");
		//変数に0を初期値として代入。
		int hitNumber = 0;
		//繰り返し
		do {
			//文章を表示。
			System.out.print("いくつかな：");
			//入力を読み込む。
			hitNumber = standerdInput.nextInt();
			//繰り返し
			do {
				//変数が9より小さく100より大きい場合
				if (hitNumber < 9 || hitNumber > 100) {
					//正しい入力を促す。
					System.out.println("10～99で入力してください。：");
					//入力を読み込む。
					hitNumber = standerdInput.nextInt();
			//変数が9より小さく100より大きい場合繰り返す。
			}}while (hitNumber < 9 || hitNumber > 100);
			//変数が乱数より大きい場合
			if (hitNumber > randomHundred) {
				//文章を表示。
				System.out.println("もっと小さな数だよ。");
			//変数が乱数より小さい場合
			} else if (hitNumber < randomHundred) {
				//文章を表示。
				System.out.println("もっと大きな数だよ。");
			}
		//変数が乱数と異なる場合繰り返す
		} while (hitNumber != randomHundred);
		//文章を表示。
		System.out.println("正解です。：");

	}

}
