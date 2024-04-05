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
		Scanner standerdImput = new Scanner(System.in);
		//整数の入力を促す。
		System.out.print("整数1:");
		//入力を読み込む。
		int firstNumber = standerdImput.nextInt();
		//整数の入力を促す。
		System.out.print("整数2:");
		//入力を読み込む。
		int secondNumber = standerdImput.nextInt();
		//整数の入力を促す。
		System.out.print("整数3:");
		//入力を読み込む。
		int thirdNumber = standerdImput.nextInt();
		//変数に最初に入力した値を代入。
		int maxmumNumber = firstNumber;
		//二番目に入力した値が変数より大きいとき
		if ( secondNumber > maxmumNumber ) 
			//変数に二番目に入力した値を代入。
			maxmumNumber = secondNumber;
		//三番目に入力した値が変数より大きいとき
		if ( thirdNumber > maxmumNumber ) {
			//変数に三番目に入力した値を代入。
			maxmumNumber = thirdNumber;
			//二つの変数を比較して大きいほうを中央値として表示。
			System.out.print("中央値は" + ( firstNumber > secondNumber 
			? firstNumber : secondNumber ) + "です。");
			//変数が二番目に入力した値とおなじ場合
		}else if ( maxmumNumber == secondNumber )
			//二つの変数を比較して大きいほうを中央値として表示。
			System.out.print("中央値は" + ( firstNumber > thirdNumber 
						? firstNumber : thirdNumber ) + "です。");
		//そうでない場合
		else
			//二つの変数を比較して大きいほうを中央値として表示。
			System.out.print("中央値は" + ( secondNumber > thirdNumber 
					? secondNumber : thirdNumber ) + "です。");
		}
}
