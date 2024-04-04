package Exercise2;

//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise2_
 * 概要 キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_4 {
	/* 
	 * 関数名  main
	 * 概要 キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するメソッド。
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
		//firstVariableに入力された値を読み込む。
		int firstVariable = standerdInput.nextInt();
		
		//firstVariable+10の値を表示。
		System.out.println("10を加えた値は" + ( firstVariable + 10) + "です。");
		//firstVariable-10の値を表示。
		System.out.println("10を減じた値は" + ( firstVariable - 10) + "です。");
	}

}
