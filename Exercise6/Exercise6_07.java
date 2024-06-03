package Exercise6;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_07
 * 概要 12個の乱数の末尾から目的の数値を探索する
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_07 {
	/* 
	 * 関数名  main
	 * 概要 12個の乱数の末尾から目的の数値を探索する
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
		//乱数生成のための定数を設定
		final int CONSTANT_TEN = 10;
		//要素数の定数を設定
		final int CONSTANT_TWELVE = 12;
		//要素数12の配列を宣言
		int[] variableArray = new int[CONSTANT_TWELVE];
		//配列の全ての要素に入力するまで繰り返す
		for (int j = 0; j < CONSTANT_TWELVE; j++) {
			//インデックスに0～9までの乱数を代入
			variableArray[j] = randomRand.nextInt(CONSTANT_TEN);
		}
		//文章を表示
		System.out.print("配列aの全要素の値\n{ ");
		//配列の全ての値を出力するまで繰り返す
		for (int j = 0; j < CONSTANT_TWELVE; j++) {
			//インデックスの値と空白を表示する
			System.out.print(variableArray[j] + " ");
			
		}
		//改行する
		System.out.println("}");
		
		//計算で使用する定数を設定
		final int MINUS_ONE = -1;
		//入力された探す値を表す変数に初期値-1を設定
		int targetNumber = MINUS_ONE;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; targetNumber <= MINUS_ONE || targetNumber >= CONSTANT_TEN;) {
			//整数値の入力を促す。
			System.out.print("探す数値：");
			//入力を読み込む。
			targetNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (targetNumber < 0 || targetNumber >= CONSTANT_TEN) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("0～9までの値を入力してください。");
			}
		}
		//計算で使用する手数を設定
		final int CONSTANT_ONE = 1;
		//探す数値の場所を表す変数を設定
		int variableNumber = 0;
		//探す数値を要素の末尾から探索する
		for (variableNumber = CONSTANT_TWELVE - CONSTANT_ONE; variableNumber > MINUS_ONE; ) {
			//探す数値を発見した場合
			if (variableArray[variableNumber] == targetNumber) {
				//繰り返しを終了
				break;
			}//探索する場所の値を１減算
			variableNumber--;
		}
		
		//探す値の場所を表す変数が0以上の場合
		if (variableNumber > MINUS_ONE) {
			//探す数値が格納されているインデックスを表示。a表記は教本準拠。
			System.out.println("それは、a[" + variableNumber + "]にあります。");
		//そうでない場合
		} else {
			//探す数値がないことを表示。
			System.out.println("それはありません。");
		}

	}

}
