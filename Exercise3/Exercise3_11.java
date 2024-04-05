package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_11
 * 概要 読み込んだ二つの整数値の差が10以下であるか11以上であるかをはんだするメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_11 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ二つの整数値の差が10以下であるか11以上であるかをはんだするメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		System.out.print("整数a");//整数の入力を促す。
		int a = standerdInput.nextInt();//aに入力する。

		System.out.print("整数b");//整数の入力を促す。
		int b = standerdInput.nextInt();//bに入力する。
		
		int min = ( a > b ? a - b : b - a );
		//minはaがbより大きいときa-bの値、そうでないときはb-aの値を代入。
		
		if( min >= 11 )
			System.out.print("それらの差は11以上です。");//minが11以上の場合表示。
		else
			System.out.print("それらの差は10以下です。");//minが11以上でない場合表示。

	}

}
