package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_17
 * 概要 配列の要素数と全要素の値を入力させ、指定した探索する値を配列の末尾から探索してその値が格納されている要素を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/30
 */
public class Exercise7_17 {

	//探索する値が発見できなかった場合を表す定数を設定
	static final int NOTHING_KEY = -1;
	/* 
	 * 関数名 linerSearchR
	 * 概要 配列の末尾から全要素を探索し、探索する値のインデックスの値を返却するメソッド。
	 * 引数 配列、探索する値
	 * 返り値 目的の値が発見された場合はそのインデックスの値、発見されなかった場合は発見できなかったことを表す定数
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */

	static int linerSearchR(int[] a, int key) {
		//要素数と最大のインデックスの値の差を解消するための定数を設定。
		final int CONSTANT_ONE = 1;
		//探索の結果を表す変数を設定し、初期値に目的の値が発見できていないことを表す定数を入力。
		int keyPlace = NOTHING_KEY;
		
		//配列の末尾から線形探索を行う。
		for (int i = (a.length - CONSTANT_ONE); i >= 0; i--) {
			//目的の要素を発見した場合
			if (a[i] == key) {
				//目的の要素が格納されているインデックスの値を表す変数に代入
				keyPlace = i;
				//繰り返しを終了
				break;
			}
		} //探索終了後、探索の結果を表す変数を返却
		return keyPlace;//////////
	}

	/* 
	 * 関数名 main
	 * 概要 配列の要素数と全要素の値、探索する要素の値を入力させ、目的の値を末尾から探索してその値が格納されている要素を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/30
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//配列の要素数を表す変数を設定
		int elementNumber = 0;

		//配列の要素数を正の整数値で入力させる
		for (; elementNumber <= 0;) {
			//要素数の入力を促す
			System.out.print("要素数：");
			//入力された値を読み込む
			elementNumber = standerdInput.nextInt();
			//入力された値が0未満または31より大きい値だった場合
			if (elementNumber <= 0) {
				//0以上の数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		}
		//要素の入力を促す
		System.out.println("要素をを入力してください。");
		//入力された要素数を持つ配列を生成
		int[] variableArray = new int[elementNumber];
		//配列の全要素に入力させる
		for (int i = 0; i < elementNumber; i++) {
			//配列への入力を促す
			System.out.print("variableArray[" + i + "] ：");
			//配列に入力を読み込む
			variableArray[i] = standerdInput.nextInt();
		}
		
		//探索する値を表す変数を設定
		int targetNumber = 0;
		//探索する要素の値の入力を促す
		System.out.println("探索する要素の値：");
		//入力を読み込む。
		targetNumber = standerdInput.nextInt();

		//探索の結果を表す変数を設定
		int resaltSearch = 0;
		//関数を用いて目的の値の探索を行う。
		resaltSearch = linerSearchR(variableArray,targetNumber);
		//配列内に目的の値が存在しなかった場合
		if (resaltSearch == NOTHING_KEY) {
			//配列内に目的の値が存在しないことを表示
			System.out.println("その値の要素は存在しません。");
		}//目的の値が存在する場合
		else {
		//その値が存在するインデックスの値を表示する。
		System.out.println("その値は、variableArray[" + resaltSearch + "]にあります。");

	}
	}
}
