package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_11
 * 概要 読み込んだ二つの整数値の差が10以下であるか11以上であるかを判断するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_11 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ二つの整数値の差が10以下であるか11以上であるかを判断するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数の入力を促す。Aは教本準拠。
		System.out.print("整数A:");
		//入力を読み込む。
		int firstNumber = standerdInput.nextInt();
		//整数の入力を促す。Bは教本準拠。
		System.out.print("整数B:");
		//入力を読み込む。
		int secondNumber = standerdInput.nextInt();
		
		//変数にAとBの大きい方の値から小さい方を引いた値を代入。
		int minimumNumber = ( firstNumber > secondNumber ? firstNumber - secondNumber 
		: secondNumber - firstNumber );
		//変数が11以上の場合
		if( minimumNumber >= 11 )
			//文章を表示
			System.out.print("それらの差は11以上です。");
		//そうでない場合
		else
			//文章を表示。
			System.out.print("それらの差は10以下です。");
	}

}
