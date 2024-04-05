package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 
 * 概要 読み込んだ正の整数を5で割り切れるか判断するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_5 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ正の整数を5で割り切れるか判断するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//正の整数の入力を促す。
		System.out.print("正の整数：");
		//nに実数値を読み込む。
		int integlerNumber = standerdInput.nextInt();
		
		//もし変数が0以上の場合
		if ( integlerNumber > 0 )
			//変数÷5が0の場合
			if ( integlerNumber % 5 == 0)
				//文章を表示。
				System.out.println("その値は5で割り切れます。");
			//それ以外の場合
			else
				//文章を表示。
				System.out.println("その値は5で割り切れません。");
		//それ以外の場合
		 else
			//文章を表示
			System.out.println("正でない値が入力されました。");

	}

}
