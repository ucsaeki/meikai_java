package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_20
 * 概要 入力した値の正方形を記号によって表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_20 {
	/* 
	 * 関数名  main
	 * 概要 入力した値の正方形を記号によって表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int firstInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("直角が左上の三角形を表示します。\n段数は：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//改行ごとに減少する*の数を表す変数を設定。
		int decreaseUpLeft = firstInteger;
		//左上に直角部分を持つ底辺と高さが入力された値である三角形を表示			
		for (int i = 1; i <= firstInteger; i++) {
			//入力された値の数だけ記号を横に表示する
			for (int j = 1; j <= decreaseUpLeft; j++) {
				//記号を表示。
				System.out.print('*');
			}
			//改行する
			System.out.println();
			//改行ごとに表示する記号を一つ減少させる。
			decreaseUpLeft--;
		}
		//改行する
		System.out.println();

		//入力された値を表す変数を設定
		int secondInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; secondInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("直角が右下の三角形を表示します。\n段数は：");
			//入力を読み込む。
			secondInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (secondInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//改行ごとに減少する空白の数を表す変数を設定。
		int decreaseDownRight = secondInteger;
		//右下に直角部分をもつ三角形を表示。
		for (int i = 1; i <= secondInteger; i++) {
			//入力された値の数-1個空白を横に表示する
			for (int j = 1; j <= decreaseDownRight; --j) {
				//空白を表示。
				System.out.print(' ');
				for  (int k = 1; k <= secondInteger; k++) {
				
				}
				
				
				
				
				
				
				//記号を表示。
				System.out.print('*');
			//改行する
			System.out.println();
			//改行ごとに表示する記号を一つ減少させる。
			decreaseDownRight--;
				
				//空白を表示。
				System.out.print(' ');
			}
			//右下が直角になる直角三角形型に記号を表示
			for (int k = 1; k <= secondInteger; k++) {
				//記号を表示。
				System.out.print('*');
			}
			//改行する
			System.out.println();
			//改行ごとに*を一つ増加させる。
			decreaseDownRight++;

		}

	}

}
