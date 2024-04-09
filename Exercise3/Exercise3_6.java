package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_6
 * 概要 読み込んだ正の整数が10の倍数かどうか判断するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_6 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ正の整数が10の倍数かどうか判断するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//正の整数の入力を促す。
		System.out.print("正の整数：");
		//入力を読み込む。
		int integerNumber = standerdInput.nextInt();
		//変数が0より大きい場合。
		if ( integerNumber > 0 ) {
			//変数÷10が0の場合
			if ( integerNumber % 10 == 0) {
				//10の倍数であることを表示。
				System.out.println("その値は10の倍数です。");
			//0でない場合
			} else {
				//10の倍数でないことを表示。
				System.out.println("その値は10の倍数ではありません。");
		//そうでない場合
		}}else {
			//変数が正でないことを表示。
			System.out.println("正でない値が入力されました。");
		}

	}

}
