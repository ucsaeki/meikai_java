package Exercise6;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise6_05
 * 概要 要素数と個々の要素の値を読み込んで読み込んだ値を初期化子と同じ形式で表示する。
 * 作成者 Y.Saeki
 * 作成日 2024/04/16
 */
public class Exercise6_05 {
	/* 
	 * 関数名  main
	 * 概要 要素数と個々の要素の値を読み込んで読み込んだ値を初期化子と同じ形式で表示する。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/16
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int firstInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("要素数：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//要素数が入力された値である配列を生成
		int[] variableArray = new int[firstInteger];
		//すべてのインデックスに入力させる
		for ( int i = 0; i < variableArray.length; i++) {
			//各インデックスの値の入力を促す
			System.out.print("a[" + i + "] = ");
			//入力を読み込む
			variableArray[i] = standerdInput.nextInt();
		}
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//記号を表示
		System.out.print("a = {");
		//インデックスの値の表示を要素数-1回繰り返す
		for ( int i = 0; i < variableArray.length - CONSTANT_ONE; i++) {
			//インデックスの値を表示する
			System.out.print(variableArray[i] + ", ");
		}//インデックスの末尾の値と記号を表示する。
		System.out.println(variableArray[firstInteger - CONSTANT_ONE] + "}");
		

	}

}
