package Exercise15;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise15_02
 * 概要 入力された文字列の全ての文字の文字コードを表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class Exercise15_02 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 main
	 * 概要 入力された文字列の全ての文字の文字コードを表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void main(String[] args) {

		//文字列の入力を促す
		System.out.print("文字列：");
		//文字列を入力させる
		String CharLine = standardInput.next();

		//文字列の全ての文字を文字コードで表示する
		for (int i = 0; i < CharLine.length(); i++) {
			//文字を文字コードで表示する
			System.out.println("[" + i + "] = " + CharLine.codePointAt(i));
		}
	}

}
