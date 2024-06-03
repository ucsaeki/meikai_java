package Exercise6;

//Randomクラスをインポート。
import java.util.Random;

/* 
 * クラス名 Exercise6_12
 * 概要 配列の要素の並びをシャッフルする
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_12 {
	/* 
	 * 関数名  main
	 * 概要 配列の要素の並びをシャッフルする
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/19
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomRand = new Random();

		//代入に使用する定数を生成
		final int NUMBER_ZERO = 0;
		//代入に使用する定数を生成
		final int NUMBER_ONE = 1;
		//代入に使用する定数を生成
		final int NUMBER_TWO = 2;
		//代入に使用する定数を生成
		final int NUMBER_THREE = 3;
		//代入に使用する定数を生成
		final int NUMBER_FOUR = 4;
		//代入に使用する定数を生成
		final int NUMBER_FIVE = 5;
		//代入に使用する定数を生成
		final int NUMBER_SIX = 6;
		//代入に使用する定数を生成
		final int NUMBER_SEVEN = 7;
		//代入に使用する定数を生成
		final int NUMBER_EIGHT = 8;
		//代入に使用する定数を生成
		final int NUMBER_NINE = 9;
		//計算に使用する定数を生成
		final int NUMBER_TEN = 10;

		//要素数が10の配列を生成し、順番に0～9を代入。
		int[] variableArray = { NUMBER_ZERO, NUMBER_ONE, NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIVE,
				NUMBER_SIX, NUMBER_SEVEN, NUMBER_EIGHT, NUMBER_NINE };

		//全ての要素を表示する
		for (int i = 0; i < NUMBER_TEN; i++) {
			//インデックスの値と、そこに格納された要素の値を順番に表示
			System.out.println("variableArray[" + i + "] = " + variableArray[i]);
		}
		//改行する
		System.out.println();

		//ランダムな順番に並べるための配列を生成
		int[] randomArray = new int[NUMBER_TEN];

		//連続する要素が同じ値にならないように乱数を入力する。
		outer: for (int i = 0; i < NUMBER_TEN; i++) {
			//要素に0～9の乱数を入力する。
			randomArray[i] = randomRand.nextInt(NUMBER_TEN);
			//繰り返しの一番最初以外の場合
			if (i > 0) {
				//既に入力されている要素から同じ値を見つけ出す
				for (int j = 0; j < i; j++) {
					//既に入力された値に同じ値が存在する場合
					if (randomArray[i] == randomArray[j]) {
						//インデックスの値を1減算
						i--;
						//最初から繰り返す
						continue outer;
					}
				}
			}
		}
		//文章を表示。
		System.out.println("順番に並んだ要素をシャッフルしました\n");
		//ランダムな順番に並べるための配列を用いて、0～9までの値を入力した配列の要素ごと並びを入れ替えて表示
		for (int k : randomArray) {
			//並び変えた0～9までの配列のインデックスと値を表示
			System.out.println("variableArray[" + randomArray[k] + "] = " + variableArray[randomArray[k]]);

		}

	}

	//		//要素の値のシャッフルを10回行う
	//		for (int i = 0; i < NUMBER_TEN; i++) {
	//			//対象の値を一時保存用の変数に代入
	//			int numberStorage = variableArray[i];
	//			//交換する要素をランダムに指定する
	//			int randomArray = randomRand.nextInt(NUMBER_TEN);
	//			//対象の値にランダムに選択された要素の値を代入
	//			variableArray[i] = variableArray[randomArray];
	//			//ランダムに選択された値に保存しておいた対象の値を代入
	//			variableArray[randomArray] = numberStorage;
	//		}
	//		//文章を表示。
	//		System.out.println("順番に並んだ0～9までの値をシャッフルしました");
	//		//改行する
	//		System.out.println();
	//		//全ての要素を表示する
	//		for (int i = 0; i < NUMBER_TEN; i++) {
	//			//インデックスの値と、そこに格納された要素の値を順番に表示
	//			System.out.println("variableArray[" + i + "] = " + variableArray[i]);
	//		}

}
