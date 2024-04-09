package Exercise3;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise3_13
 * 概要 入力した3つの整数値の中央値を表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_13 {
	/* 
	 * 関数名  main
	 * 概要 入力した3つの整数値の中央値を表示するメソッド。
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
		int thirdNumber = standerdInput.nextInt();
		//変数に最初に入力した値を代入。
		int maxmumNumber = firstNumber, minimumNumber = firstNumber;

		//二番目に入力した値が変数より大きいとき
		if (secondNumber > maxmumNumber) {
			//変数に二番目に入力した値を代入。
			maxmumNumber = secondNumber;
			//三番目に入力した値が変数より大きいとき
		}if (thirdNumber > maxmumNumber) {
			//変数に三番目に入力した値を代入。
			maxmumNumber = thirdNumber;

		}if (minimumNumber > secondNumber) {
			//変数に二番目に入力した値を代入。
			minimumNumber = secondNumber;
			//三番目に入力した値が変数より大きいとき
		}if (minimumNumber > thirdNumber) {
			//変数に三番目に入力した値を代入。
			minimumNumber = thirdNumber;
		}
		
		//最大値が最初に入力した値の場合
		if (maxmumNumber == firstNumber) {
			//最小値が二番目に入力した値の場合
			if (minimumNumber == secondNumber) {
				//文章を表示。
				System.out.println("中央値は" + thirdNumber + "です。");
				//そうでない場合
			} else {
				//文章を表示。
				System.out.println("中央値は" + secondNumber + "です。");
				//最大値が二番目に入力した値の場合
			}
		} else if (maxmumNumber == secondNumber) {
			//最小値が最初に入力した値の場合
			if (minimumNumber == firstNumber) {
				//文章を表示。
				System.out.println("中央値は" + thirdNumber + "です。");
				//そうでない場合
			} else {
				//文章を表示。
				System.out.println("中央値は" + firstNumber + "です。");
				//最小値が最初に入力した値の場合
			}
		} else if (minimumNumber == firstNumber) {
			//文章を表示。
			System.out.println("中央値は" + secondNumber + "です。");
			//そうでない場合
		} else {
			//文章を表示。
			System.out.println("中央値は" + firstNumber + "です。");
		}

	}
}
