package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_7
 * 概要 入力された正の整数を3で割った際の余りを表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_7 {
	/* 
	 * 関数名  main
	 * 概要 入力された正の整数を3で割った際の余りを表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//正の整数の入力を促す
		System.out.print("正の整数：");
		//入力を読み込む。
		int n = standerdInput.nextInt();
		//もし変数が0より大きい場合
		if ( n > 0 )
			//もし変数÷3の余りが0の場合
			if ( n % 3 == 0)
				//3で割り切れることを表示。
				System.out.println("その値は3で割り切れます。");
			//もし変数÷3の余りが1の場合
			else if( n % 3 == 1)
				//余りが1であることを表示。
				System.out.println("その値を3で割った余りは1です。");
			//そうでない場合
			else
				//余りが2であることを表示
				System.out.println("その値を3で割った余りは2です。");
		//そうでない場合
		else
			//入力値が正でないことを表示。
			System.out.println("正でない値が入力されました。");

	}

}
