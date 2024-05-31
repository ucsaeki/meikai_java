package Exercise15;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise15_03
 * 概要 入力された文字列から指定された文字を探索して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class Exercise15_03 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 main
	 * 概要 入力された文字列から指定された文字を探索して表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void main(String[] args) {
		//文字列1の入力を促す
		System.out.print("文字列s1：");
		//文字列を入力させる
		String firstCharLine = standardInput.next();
		//文字列2の入力を促す
		System.out.print("文字列s2：");
		//文字列を入力させる
		String secondCharLine = standardInput.next();
		//文字列1が文字列2を含まない場合を表す定数を設定
		final int NOT_CONTAIN = -1;
		
		//一つ目の文字列の中に二つ目の文字列が含まれているか判断する変数に、結果の値を代入する
		int judgeSameChar = firstCharLine.indexOf(secondCharLine);
		//文字列が含まれていなかった場合
		if (judgeSameChar == NOT_CONTAIN) {
			//文字列が含まれていないことを表示
			System.out.println("文字列1に文字列2は含まれません。");
		//文字列が含まれていた場合
		}else {
			//文字列1を表示
			System.out.println("s1：" + firstCharLine);
			//文字列2を表示
			System.out.print("s2：");
			//該当の文字の場所になるまで空白を表示
			for ( int i = judgeSameChar; i > 0; i--) {
				//空白を表示
				System.out.print(" ");
			}
			//文字列2を表示
			System.out.println(secondCharLine);
		}
		
	}

}
