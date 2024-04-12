package Exercise4;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_27
 * 概要 入力回数制限を設けた0～99までの数当てゲーム
 * 作成者 Y.Saeki
 * 作成日 2024/04/12
 */
public class Exercise4_27 {
	/* 
	 * 関数名  main
	 * 概要 入力回数制限を設けた0～99までの数当てゲーム
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/12
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomNumber = new Random();
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//乱数生成のための定数に100を設定。
		final int HUNDRED_CONSTANT = 100;
		//0以上100未満の乱数を生成。
		int randomHundred = randomNumber.nextInt(HUNDRED_CONSTANT);

		//文章を表示。
		System.out.println("数当てゲーム開始！\n10回以内に0～99の数を当ててください。");
		//回答を表す変数を設定。
		int hitNumber = 0;
		//入力回数制限を表す定数10を設定。
		final int REMIT_TEN = 10;

		Outer: for (int i = 0; i <= REMIT_TEN; ++i) {
			//入力回数が10回以下の場合
			if (i == REMIT_TEN) {
				//不正解の場合の回答を表示
				System.out.println("正解は、" + randomHundred + "でした。残念！");
				//繰り返しを終了する。
				break Outer;
			}
			if (i <= REMIT_TEN) {
				//文章を表示。
				System.out.print("いくつかな：");
				//入力を読み込む。
				hitNumber = standerdInput.nextInt();
				//入力された整数値が0以下の場合
				if (hitNumber < 0 || hitNumber > HUNDRED_CONSTANT) {
					//正の整数値の入力を促す文章を表示。
					System.out.print("0～99で入力してください。");
					//間違った入力を回答回数として数えないようにするため、回答回数の変数から1引く。
					i--;
					//継続する
					continue;
					//回答と乱数が同じ場合
				} else if (hitNumber == randomHundred) {
					//正解の場合の回答を表示
					System.out.println("Congratulation！ 正解は" + randomHundred + "です。");
					//繰り返しを終了する。
					break Outer;
				} else if (i == REMIT_TEN) {
					//不正解の場合の回答を表示
					System.out.println("正解は、" + randomHundred + "でした。残念！");
					//繰り返しを終了する。
					break Outer;
					//回答がが乱数より大きい場合
				} else if (hitNumber > randomHundred) {
					//文章を表示。
					System.out.println("もっと小さな数だよ。");
					//継続する
					continue;
					//回答が乱数より小さい場合
				} else if (hitNumber < randomHundred && i < REMIT_TEN) {
					//文章を表示。
					System.out.println("もっと大きな数だよ。");
					//継続する
					continue;
				}
			}

		}

	}

}
