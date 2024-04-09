package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_2
 * 概要 後に入力した整数が先に入力した整数の約数であるかを判定するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise3_2 {
	/* 
	 * 関数名  main
	 * 概要 後に入力した整数が先に入力した整数の約数であるかを判定するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//整数値の入力を促す。
		System.out.print("整数A：");
		//入力を読み込む。
		int firstVariabale = standerdInput.nextInt();
		//整数値の入力を促す。
		System.out.print("整数B：");
		//入力を読み込む。
		int secondVariable = standerdInput.nextInt();
		
		//約数が0の場合
		if ( secondVariable == 0) {
			//割られる数が0の場合
			if ( firstVariabale ==0 ) {
				//0は0の約数であることを表示。
				System.out.println("BはAの約数です。");
			//そうでない場合。
			} else {
				//0で割ることはできず、0は約数にならないことを表示。
				System.out.println("0は約数になりません");
			//A÷Bの余りが0の場合。
			}} else if ( firstVariabale % secondVariable == 0 ) {
			//BがAの約数であることを表示。
			System.out.println("BはAの約数です。");
			//そうではない場合
			} else {
			//文章を表示。
			System.out.println("BはAの約数ではありません。");
			}
		
	}

}
