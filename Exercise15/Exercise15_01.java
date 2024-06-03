package Exercise15;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise15_01
 * 概要 入力された文字列を反対から表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class Exercise15_01 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 main
	 * 概要 入力された文字列を反対から表示する
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
		//文字列を反転したことを表示
		System.out.println("文字列を反転しました。");

		//要素と要素数のずれを修正するための定数を設定
		final int FILL_INDEX = 1;
		//文字列の文字を全て反対から表示する
		for (int i = CharLine.length() - FILL_INDEX; i >= 0; i--) {
			//文字を後ろから表示する
			System.out.print(CharLine.charAt(i));
		}

	}

}
