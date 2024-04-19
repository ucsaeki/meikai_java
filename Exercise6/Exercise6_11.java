package Exercise6;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_11
 * 概要 各要素が同じ値を持たないように、全要素に乱数を入力して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_11 {
	/* 
	 * 関数名  main
	 * 概要 各要素が同じ値を持たないように、全要素に乱数を入力して表示する
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
		//入力された値を表す変数を設定
		int elementNumber = 0;
		//乱数の上限を表すための定数を設定
		final int CONSTANT_TEN = 10;
		//乱数の生成に使用する定数を設定
		final int CONSTANT_ONE = 1;
		//計算で使用する定数を設定
		final int MINUS_ONE = -1;
		
		//1～10までの値が入力されるまで警告と入力の催促を繰り返す。
		for (; elementNumber <= 0 || elementNumber > CONSTANT_TEN;) {
			//1～10までの整数値の入力を促す。
			System.out.print("要素数(1～10まで)：");
			//入力を読み込む。
			elementNumber = standerdInput.nextInt();
			//入力された整数値が1～10以外の場合
			if (elementNumber <= 0 || elementNumber > CONSTANT_TEN) {
				//正しい入力を促す文章を表示。
				System.out.print("1～10の整数値で入力してください。");
			}
		}
		
		//入力された値を要素数とする配列を宣言
		int[] variableArray = new int[elementNumber];
		//連続する要素が同じ値にならないように乱数を入力する。
		outer: for (int i = 0; i < elementNumber; i++) {
			//要素に1～10の乱数を入力する。
			variableArray[i] = randomRand.nextInt(CONSTANT_TEN) + CONSTANT_ONE;
			//繰り返しの一番最初以外の場合
			if (i > 0) {
				//既に入力されている要素から同じ値を見つけ出す
				for (int j = 0; j < i; j++) {
					//既に入力された値に同じ値が存在する場合
					if (variableArray[i] == variableArray[j]) {
						//インデックスの値を1減算
						i--;
						//最初から繰り返す
						continue outer;//////
					}
				}
			}
		}
		//全ての要素を表示する
		for (int i = 0; i < elementNumber; i++) {
			//インデックスの値と、そこに格納された要素の値を順番に表示
			System.out.println("variableArray[" + i + "] = " + variableArray[i]);
		}

	}

}
