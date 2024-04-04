package Exercise2;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_3 {
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//整数値の入力を促す。
		System.out.print("整数値：");
		//firstVariableに実数値を読み込む。
		int firstVariable = standerdInput.nextInt();
		
		//入力された値を表示する。
		System.out.println( firstVariable + "と入力しましたね。");
	}

}
