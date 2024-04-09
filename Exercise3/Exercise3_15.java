package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_15
 * 概要 入力した二つtの整数値を降順にソートするメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_15 {
	/* 
	 * 関数名  main
	 * 概要 入力した二つの整数値を降順にソートするメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数の入力を促す。
		System.out.print("整数1:");
		//入力した値を読み込む。
		int firstNumber = standerdInput.nextInt();
		//整数の入力を促す。
		System.out.print("整数2:");
		//入力した値を読み込む。
		int secondNumber = standerdInput.nextInt();
		
		//後に入力した変数のほうが大きい場合
		if ( firstNumber < secondNumber ) {
			//変数に先に入力した変数を代入。
			int oneTimeStrage = firstNumber;
			//変数に後から入力した変数を代入。
			firstNumber = secondNumber;
			//変数に保存しておいた先に入力した変数を入力。
			secondNumber = oneTimeStrage;
		}
		//文章を表示。
		System.out.println("1≧2となるようにソートしました。");
		//文章を表示。
		System.out.println("整数1:" + firstNumber );
		//文章を表示。
		System.out.println("整数2:" + secondNumber );

	}

}
