package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_9
 * 概要 入力された二つの実数値の大きいほうの値を表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_9 {
	/* 
	 * 関数名  main
	 * 概要 入力された二つの実数値の大きいほうの値を表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//実数の入力を促す。
		System.out.print("実数：");
		//入力を読み込む。
		int firstNumber = standerdInput.nextInt();
		//実数の入力を促す。
		System.out.print("実数：");
		//入力を読み込む。
		int secondNumber = standerdInput.nextInt();
		
		//大きいほうの変数を表示する
		System.out.println("大きいほうの値は" 
		+ ( firstNumber > secondNumber ? firstNumber : secondNumber) + "です。");
		

	}

}
