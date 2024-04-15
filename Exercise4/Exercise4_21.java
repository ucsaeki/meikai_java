package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_21
 * 概要 直角が左上、右下、右上側の直角三角形型にそれぞれ記号を表示させる
 * 作成者 Y.Saeki
 * 作成日 2024/04/12
 */
public class Exercise4_21 {
	/* 
	 * 関数名  main
	 * 概要 直角が左上、右下、右上側の直角三角形型にそれぞれ記号を表示させる
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//文章を表示。
		System.out.println("左上が直角の三角形を表示します。");

		//入力された値を表す変数を設定
		int firstInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("段数は：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//改行ごとに減少する*の数を表す変数に入力値を設定。
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

		//文章を表示。
		System.out.println("直角が右下の三角形を表示します。");
		//入力された値を表す変数を設定
		int secondInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; secondInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("段数は：");
			//入力を読み込む。
			secondInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (secondInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//改行ごとに減少する空白の数を表す変数に入力値を設定。
		int decreaseDownRight = secondInteger;
		//右下に直角部分をもつ三角形を表示。
		for (int i = 1; i <= secondInteger; i++) {
			//入力された値の数-1個空白を表示する
			for (int j = secondInteger - i; j > 0; --j) {
				//空白を表示。
				System.out.print(' ');
				//段数の数だけ記号を表示する。
			}
			for (int k = 1; k <= i; k++) {
				//記号を表示。
				System.out.print('*');
			}
			//改行する
			System.out.println();
			//空白の数を1減少させる
			decreaseDownRight--;
		}
		//改行する
		System.out.println();

		//文章を表示。
		System.out.println("直角が右上の三角形を表示します。");
		//入力された値を表す変数を設定
		int thirdInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; thirdInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("段数は：");
			//入力を読み込む。
			thirdInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (thirdInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//改行ごとに減少する記号の数を表す変数に入力値を設定。
		int decreaseUpRight = thirdInteger;
		//右下に直角部分をもつ三角形を表示。
		for (int i = 1; i <= thirdInteger; i++) {
			//段数-1だけ空白を表示する
			for (int j = 1; j < i; j++) {
				//空白を表示。
				System.out.print(' ');
			}
			//段数に応じて*を表示する
			for (int j = decreaseUpRight; j > 0; j--) {
				//記号を表示。
				System.out.print('*');
			}
			//改行する
			System.out.println();
			//空白の数を1減少させる
			decreaseUpRight--;
		}
		
	}

}
