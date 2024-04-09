package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_18
 * 概要 入力された月に対応する季節を表示するメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_18 {
	/* 
	 * 関数名  main
	 * 概要 入力された月に対応する季節を表示するメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//整数の入力を促す。
		System.out.print("月を入力してください。:");
		//入力を読み込む。
		int variableMonth = standerdInput.nextInt();

		//nが1以上12以下の場合
		if ( variableMonth >= 1 && variableMonth <= 12 ) {

			//変数によって分岐。
			switch ( variableMonth ) {
			//変数が3の場合
			case 3 :
			//変数が3の場合
			case 4 : 
			//変数が5の場合、文章を表示。
			case 5 : System.out.println("春");
			//分岐を終了。
			break;
			//変数が6の場合
			case 6 :
			//変数が7の場合
			case 7 :
			//変数が8の場合、文章を表示。
			case 8 : System.out.println("夏");
			//分岐を終了。
			break;
			//変数が9の場合
			case 9 :
			//変数が10の場合
			case 10 : 
			//変数が11の場合、文章を表示。
			case 11 : System.out.println("秋");
			//分岐を終了。
			break;
			//変数が1の場合
			case 1:
			//変数が2の場合
			case 2 : 
			//変数が12の場合、文章を表示。
			case 12 : System.out.println("冬");
			//分岐を終了。
			break;
			}
		//そうでない場合
		} else {
			//文章を表示。
			System.out.println("正しい月を入力してください");
		}

	}

}
