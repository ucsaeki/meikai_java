package Exercise7;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise7_09
 * 概要 正の整数値を入力させて表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/24
 */
public class Exercise7_09 {

	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名  readPlusInt
	 * 概要 入力された値が正の値ならばそのまま返却し、負の値と0ならば再入力させるメソッド
	 * 引数 なし
	 * 返り値 入力された正の整数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	static int readPlusInt() {
		//入力された整数値を表す変数を設定
		int variableNumber = 0;
		//正の整数値を入力させる
		for (; variableNumber <= 0;) {
			//正の整数値の入力を促す文章を表示
			System.out.print("正の整数値：");
			//入力を読み込む
			variableNumber = standerdInput.nextInt();
		}
		//入力された正の整数値を返却する。
		return variableNumber;
	}

	/* 
	 * 関数名  main
	 * 概要 入力された正の整数値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/24
	 */
	public static void main(String[] args) {
		//関数を用いて、正の整数値を入力させて表示する
		System.out.println("引数は" + readPlusInt() + "です。");
		
	}

}
