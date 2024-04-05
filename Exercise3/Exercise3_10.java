package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_10
 * 概要 入力した二つの値の差を表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_10 {
	/* 
	 * 関数名  main
	 * 概要 入力した二つの値の差を表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//実数の入力を促す。
		System.out.print("実数1:");
		//入力を読み込む。
		int firstReal = standerdInput.nextInt();
		//実数の入力を促す。
		System.out.print("実数2");
		//入力を読み込む。
		int secondReal = standerdInput.nextInt();
		
		//入力値の差を表示する。
		System.out.println("それらの差は" 
		+ ( firstReal > secondReal ? firstReal - secondReal : secondReal - firstReal ) + "です。");
	

	}

}
