package Exercise7;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_10
 * 概要 ランダムに生成した3つの値を、ランダムに指定された4つのパターンの問題の形に当てはめて出題する
 * 作成者 Y.Saeki
 * 作成日 2024/04/25
 */
public class Exercise7_10 {

	//Randomクラスに変数を設定。
	static Random randomRand = new Random();
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	//指定された問題のパターンを表す変数を設定
	static int variableQuiz = 0;
	//指定された問題の回答を表す変数を設定
	static int answerFigures = 0;

	/* 
	 * 関数名  confirmRetry
	 * 概要 問題の表示を継続して行うかどうかを確認するメソッド
	 * 引数 なし
	 * 返り値 trueならば問題の継続、falseならば問題終了
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */

	static boolean confirmRetry() {
		//回答の継続を判断するための変数を設定
		int continueQuiz = 0;
		//回答の継続を表す定数を設定
		final int CONSTANT_CONTINUE = 1;
		//継続の確認を行う
		do {
			//継続を判断する変数への入力を促す。
			System.out.print("もう一度？＜Yes…1/No…0＞：");
			//入力を読み込む
			continueQuiz = standerdInput.nextInt();
			//1か0以外の数値が入力された場合
			if (continueQuiz != 0 && continueQuiz != CONSTANT_CONTINUE) {
				//1か0の入力求めるエラー文を表示する。
				System.out.println("1か0で入力してください。");
			}
			//入力された値が0もしくは1以外の場合継続する
		} while (continueQuiz != 0 && continueQuiz != CONSTANT_CONTINUE);
		//継続を判断する変数が1の場合、trueを返却する。
		return continueQuiz == CONSTANT_CONTINUE;
	}

	/* 
	 * 関数名  selectQuiz
	 * 概要 4つの問題文から、指定された一つの問題文を表示するメソッド
	 * 引数 ランダムに生成された3つの3桁の数値と、問題のパターンを指定する変数
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */
	static void selectQuiz(int a, int b, int c, int x) {
		//1番の問題を表す定数を設定。
		final int QUIZ_ONE = 0;
		//2番の問題を表す定数を設定。
		final int QUIZ_TWO = 1;
		//3番の問題を表す定数を設定。
		final int QUIZ_THREE = 2;
		//4番の問題を表す定数を設定。
		final int QUIZ_FOUR = 3;

		//1番の問題が指定された場合
		if (x == QUIZ_ONE) {
			//1番の問題文を表示
			System.out.print(a + " + " + b + " + " + c + " = ");
			//1番の問題の正解を表す変数に計算した数値を代入。
			answerFigures = (a + b + c);
		} //2番の問題が指定された場合
		else if (x == QUIZ_TWO) {
			//2番の問題文を表示
			System.out.print(a + " + " + b + " - " + c + " = ");
			//2番の問題の正解を表す変数に計算した数値を代入。
			answerFigures = (a + b - c);
		} //3番の問題が指定された場合
		else if (x == QUIZ_THREE) {
			//3番の問題文を表示
			System.out.print(a + " - " + b + " + " + c + " = ");
			//3番の問題の正解を表す変数に計算した数値を代入。
			answerFigures = (a - b + c);
		} //4番の問題が指定された場合
		else if (x == QUIZ_FOUR) {
			//4番の問題文を表示
			System.out.print(a + " - " + b + " - " + c + " = ");
			//4番の問題の正解を表す変数に計算した数値を代入。
			answerFigures = (a - b - c);
		}
	}

	/* 
	 * 関数名  main
	 * 概要 3つのランダムな3桁の数値を使用した問題を指定し、出題と回答を繰り返すメソッド
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */

	public static void main(String[] args) {
		//出題開始を表す文章を表示
		System.out.println("暗算力トレーニング!!");
		//回答終了が選択されるまで問題を繰り返し表示して正しい回答を行わせる
		do {
			//ランダムな3桁の数値を生成して変数1に設定
			int firstNumber = randomRand.nextInt(900) + 100;
			//ランダムな3桁の数値を生成して変数2に設定
			int secondNumber = randomRand.nextInt(900) + 100;
			//ランダムな3桁の数値を生成して変数3に設定
			int thirdNumber = randomRand.nextInt(900) + 100;

			//問題のパターン数を表す定数を設定
			final int SELECT_FOUR = 4;
			//問題のパターンを指定するための変数を設定
			int variableQuiz = 0;
			//問題のパターンを指定するための変数に0から3までの乱数を代入
			variableQuiz = randomRand.nextInt(SELECT_FOUR);

			//入力された回答を表す変数を設定
			int variableAnswer = 0;
			
			//正しい回答が行われるまで繰り返す
			inner: while (true) {
				//関数を用いて問題を出題する
				selectQuiz(firstNumber, secondNumber, thirdNumber, variableQuiz);
				//回答を読み込む
				variableAnswer = standerdInput.nextInt();
				//回答が正解の場合
				if (variableAnswer == answerFigures) {
					//正解であることを表示
					System.out.println("正解です。");
					//問題文の表示の繰り返しを終了する
					break inner;
				}
				//回答が不正解の場合
				else {
					//不正解であることを表示
					System.out.println("違いますよ!!");
				}
			}
			//関数を用いて回答を継続するか確認し、trueならば出題を継続する
		} while (confirmRetry());
		//出題の繰り返しを終了したことを表示。
		System.out.println("終了します。");

	}

}
