package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_11
 * 概要 入力された整数値を右と左に指定した値だけビット回転させた値をそれぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/25
 */
public class Exercise7_11 {
	/* 
	 * 関数名  rRotate
	 * 概要 入力された整数を指定された値の数右にビット回転した値を求める
	 * 引数 入力された整数値と回転させるビットの数
	 * 返り値 入力された整数値をビット回転させた後の値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */
	static int rRotate(int x, int n) {
		
		for ( int i = 31; i >= 0; i--) {
			
			System.out.print(((x >>> i & 1 ) == 1) ? '1': '0');
			
			
			
		}

	}

	/* 
	 * 関数名  lRotate
	 * 概要 入力された整数を指定された値の数左にビット回転した値を求める
	 * 引数 入力された整数値と回転させるビットの数
	 * 返り値 入力された整数値をビット回転させた後の値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */
	static int lRotate(int x, int n) {

	}

	/* 
	 * 関数名  main
	 * 概要 入力された値を右と左に指定した値だけビット回転させた値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/25
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を示す変数を設定
		int variableNumber = 0;
		//回転させるビット数を表す変数を設定
		int rotateNumber = 0;
		//ビットの個数を表す定数を設定
		final int BIT_NUMBER = 32;
		//これから行う動作を説明する
		System.out.println("ビット回転させます。");
		//ビット回転させる整数値の入力を促す。
		System.out.print("回転させる整数値：");
		//入力を読み込む
		variableNumber = standerdInput.nextInt();

		for (; rotateNumber < 0;) {
			//回転させるビット数の入力を促す。
			System.out.print("何ビット回転させますか。：");
			//入力を継続を判断する変数に読み込む
			rotateNumber = standerdInput.nextInt();
			//入力された値が負の数の場合
			if (rotateNumber < 0) { 
				//正の整数値の入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}

		}

	}

}
