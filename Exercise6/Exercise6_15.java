package Exercise6;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_15
 * 概要 曜日を英語で入力させる
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_15 {
	/* 
	 * 関数名  main
	 * 概要 曜日を英語で入力させる
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
		//英語の曜日を表す配列を生成
		String[] englishWeek = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
		//日本語の曜日を表す配列を生成
		String[] japaneseWeek = { "月", "火", "水", "木", "金", "土", "日" };
		//曜日の数を表す定数を設定
		final int WEEK_NUMBER = 7;
		//繰り返す場合に選択する定数を設定
		final int CONTINUE_GAME = 1;
		//繰り返しの継続を判断するための変数を宣言し、初期値に継続状態を設定
		int judgeContinue = CONTINUE_GAME;
		//前回の繰り返しでの問題を保存するための変数に並列外の数値を設定
		int lastQuestion = WEEK_NUMBER;

		//問題文を表示
		System.out.println("英語の曜日名を小文字で入力してください。");

		//繰り返しが選択される限りゲームを継続する
		outer: while (judgeContinue == CONTINUE_GAME) {
			//配列内の曜日をランダムに表す乱数を設定
			int randomWeek = randomRand.nextInt(WEEK_NUMBER);
			//生成された問題が前回の問題と同じだった場合
			if (randomWeek == lastQuestion) {
				//問題の生成を最初からやり直す
				continue outer;
			}
			inner: while (true) {
				//ランダムな曜日を表示し回答を促す
				System.out.print(japaneseWeek[randomWeek] + "曜日：");
				//回答を読み込む
				String answerWeek = standerdInput.next();
				//入力された文字列が正しかった場合
				if (answerWeek.equals(englishWeek[randomWeek])) {
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
			//前回の問題を変数に保存しておく
			lastQuestion = randomWeek;
			//1か0を入力させる
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
		} //ゲームの終了を表示
		System.out.println("終了しました。");
	}

}
