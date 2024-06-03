package Exercise6;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_14
 * 概要 月の英語表現を入力させる英単語学習ゲーム
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_14 {
	/* 
	 * 関数名  main
	 * 概要 月の英語表現を入力させる英単語学習ゲーム
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/19
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomRand = new Random();
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//1～12月の英語表記を順番に代入した配列を生成。
		String[] englishMonth = { "January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December" };

		//問題文を表示
		System.out.println("英語の月名を入力してください。");
		//問題の注意事項を表示
		System.out.println("なお、先頭は大文字で、２文字目以降は小文字とします。");

		//月の数を表す定数を設定
		final int CONSTANT_TWELVE = 12;
		//インデックスの値と入力された月の値のずれを修正するための定数を生成
		final int PLUS_ONE_MONTH = 1;
		//繰り返す場合に選択する定数を設定
		final int CONTINUE_GAME = 1;
		//繰り返しの継続を判断するための変数を宣言し、初期値に継続状態を設定
		int judgeContinue = CONTINUE_GAME;
		//前回の繰り返しでの問題を保存するための変数に配列外の数値を設定
		int lastQuestion = CONSTANT_TWELVE;
		//繰り返しが選択される限りゲームを継続する
		outer: while (judgeContinue == CONTINUE_GAME) {
			//正答となる月をランダムに生成
			int randomMonth = randomRand.nextInt(CONSTANT_TWELVE);
			//生成された問題が前回の問題と同じだった場合
			if (randomMonth == lastQuestion) {
				//問題の生成を最初からやり直す
				continue outer;
			}
			//正しい入力がされるまで継続
			inner: while (true) {
				//入力を促す文章を表示
				System.out.print((randomMonth + PLUS_ONE_MONTH) + "月：");
				//入力を読み込む
				String answerMonth = standerdInput.next();
				//入力された文字列が正しかった場合
				if (answerMonth.equals(englishMonth[randomMonth])) {
					//繰り返しを終了する
					break inner;
					//そうではない場合
				} else {
					//間違いであることを表示
					System.out.println("違います。");
					//回答の繰り返しを継続する
					continue inner;
				}
			}
			//正解であることを表示
			System.out.print("正解です。");
			//継続するかどうかの入力を促す。
			System.out.print("もう一度？ 1…Yes／0…No：");
			//入力を読み込む
			judgeContinue = standerdInput.nextInt();
			//今回の繰り返しでの問題を変数に保存しておく。			
			lastQuestion = randomMonth;
			//1か0を入力させる。
			for (; judgeContinue > 1 || judgeContinue < 0;) {
				//継続判断の変数に1か0を入力させる
				if (judgeContinue > 1 || judgeContinue < 0) {
					//正しい入力を促す文章を表示
					System.out.println("1か0で入力してください。");
					//継続するかどうかの入力を促す。
					System.out.print("もう一度？ 1…Yes／0…No：");
					//入力を読み込む
					judgeContinue = standerdInput.nextInt();
					//そうでない場合
				} else {
					//繰り返しを終了する
					break;
				}
			}
		}//ゲームの終了を表示
		System.out.println("終了しました。");
	}

}