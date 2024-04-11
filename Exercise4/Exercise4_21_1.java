package Exercise4;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise4_21_1
 * 概要 直角が左上側の直角三角形型に記号を表示させる
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_21_1 {
	/* 
	 * 関数名  main
	 * 概要 直角が左上側の直角三角形型に記号を表示させる
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//文章を表示。
		System.out.println("左上直角の三角形を表示します。");
		
		//入力された値を表す変数を設定
		int integerNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; integerNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("段数は：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		} 
		
		for ( int i = integerNumber; i > 0; i--) {
			for ( int j = integerNumber; j > 0; j--) {
				
				System.out.print('*');
			}
			System.out.println();
			
		}
			

	}

}
