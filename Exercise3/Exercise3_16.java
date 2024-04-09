package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_16
 * 概要 入力した三つの整数を昇順にソートするメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_16 {
	/* 
	 * 関数名  main
	 * 概要 入力した三つの整数を昇順にソートするメソッド。
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
		//最大値、中央値、最小値に該当する変数にそれぞれ0を設定。
		int maxmumNumber =0, midiumNumber = 0, minimumNumber = 0;
		
		//変数に最初に入力した値を代入。
		maxmumNumber = firstNumber;
		//二番目に入力した値が変数より大きいとき
		if ( secondNumber > maxmumNumber ) {
			//変数に二番目に入力した値を代入。
			maxmumNumber = secondNumber;
		//三番目に入力した値が変数より大きいとき
		}if ( thirdNumber > maxmumNumber ) {
			//変数に三番目に入力した値を代入。
			maxmumNumber = thirdNumber;
			//二つの変数を比較して大きいほうを中央値として代入。
			 midiumNumber = ( firstNumber > secondNumber ? firstNumber : secondNumber );
			//二つの変数を比較して小さいほうを最小値として代入。
			minimumNumber = ( firstNumber > secondNumber ? secondNumber : firstNumber );
		//変数が二番目に入力した値とおなじ場合
		}else if ( maxmumNumber == secondNumber ) {
			//二つの変数を比較して大きいほうを中央値として代入。
			midiumNumber = ( firstNumber > thirdNumber ? firstNumber : thirdNumber );
			//二つの変数を比較して小さいほうを最小値として代入。
			minimumNumber = ( firstNumber > thirdNumber ? thirdNumber : firstNumber );
		//そうでない場合
		}else {
			//二つの変数を比較して大きいほうを中央値として表示。
			midiumNumber =  ( secondNumber > thirdNumber ? secondNumber : thirdNumber );
			//二つの変数を比較して小さいほうを最小値として代入。
			minimumNumber =  ( secondNumber > thirdNumber ? thirdNumber : secondNumber );
		}
		//文章を表示。
		System.out.println("小さい順にソートしました");
		//文章を表示。
		System.out.println( minimumNumber );
		//文章を表示。
		System.out.println( midiumNumber );
		//文章を表示。
		System.out.println( maxmumNumber );
	}

}
