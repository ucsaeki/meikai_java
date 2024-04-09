package Exercise3;
//Scannerクラスをインポート
import java.util.Scanner;
/* 
 * クラス名 Exercise3_12
 * 概要 入力した3つの整数値の最小値を求めて表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_12 {
	/* 
	 * 関数名  main
	 * 概要 入力した3つの整数値の最小値を求めて表示するメソッド。
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
		//入力を読み込む。
		int firstNumber = standerdInput.nextInt();
		//整数の入力を促す。
		System.out.print("整数2:");
		//入力を読み込む。
		int secondNumber = standerdInput.nextInt();
		//整数の入力を促す。
		System.out.print("整数3:");
		//入力を読み込む。
		int thirdNumber  = standerdInput.nextInt();
		
		//変数に最初に入力した整数を設定。
		int minimumNumber = firstNumber;
		//変数より二番目に入力した整数の方が大きいとき
		if ( secondNumber < minimumNumber ) {
			//変数に二番目の整数を代入。
			minimumNumber = secondNumber;
		//変数より三番目に入力した整数の方が大きいとき
		}if( thirdNumber < minimumNumber ) {
			//変数に三番目の整数を代入。
			minimumNumber = thirdNumber;
		}
		//文章を表示。
		System.out.print("最小値は" + minimumNumber + "です。");

	}

}
