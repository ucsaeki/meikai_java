package Exercise6;

//Randomクラスをインポート。
import java.util.Random;
//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_04
 * 概要 配列の全要素に代入した乱数の値を縦の棒グラフで表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/16
 */
public class Exercise6_04 {
	/* 
	 * 関数名  main
	 * 概要 配列の全要素に代入した乱数の値を縦の棒グラフで表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/16
	 */
	public static void main(String[] args) {
		//Randomクラスに変数を設定。
		Random randomRand = new Random();
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//入力された値を表す変数を設定
		int firstInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("要素数：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//乱数の初期値として使用する定数を設定。
		final int CONSTANT_ONE = 1;
		//乱数の最大値を定数に設定
		final int CONSTANT_TEN = 10;
		//要素数が入力された値であるint型の配列を生成
		int[] variableArray = new int[firstInteger];
		//全てのインデックスに乱数を入力させる
		for (int i = 0; i < firstInteger; i++) {
			//それぞれのインデックスに1から10までの乱数を代入
			variableArray[i] = CONSTANT_ONE + randomRand.nextInt(CONSTANT_TEN);
		}

		//段数が10から0になるまで記号の表示を繰り返す
		for (int i = CONSTANT_TEN; i > 0; i--) {
			//記号の数が要素数の値になるまで繰り返し
			for (int j = 0; j < firstInteger; j++) {
				//インデックスの値が段数の値以上の場合
				if (variableArray[j] >= i) {
					//記号を表示
					System.out.print("* ");
					//そうでない場合
				} else {
					//空白を表示。
					System.out.print("  ");
				}
			} //改行する
			System.out.println();
		}
		//計算で使用する定数を設定
		final int PER_TEN = 10;
		
		//インデックスの数だけ点線を表示する
		for (int i = 0; i < firstInteger; i++) {
			//点線を表示する
			System.out.print("--");
		}//改行する
		System.out.println();
		//要素数の数だけ計算を行って10で割った余りを表示する。
		for (int i = 0; i < firstInteger; i++) {
			//各インデックスを10で割った剰余を表示する
			System.out.print(i % PER_TEN + " ");
		}

	}

}
