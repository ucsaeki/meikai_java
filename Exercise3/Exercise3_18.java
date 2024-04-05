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

		//変数によって分岐。
		switch ( variableMonth ) {
		//変数が1、2、3のとき、冬を表示して分岐を終了。
		case 1 : case 2 : case 3 : System.out.println("冬"); break;
		//変数が4、5、6のとき、春を表示して分岐を終了。
		case 4 : case 5 : case 6 : System.out.println("春"); break;
		//変数が7、8、9のとき、夏を表示して分岐を終了。
		case 7 : case 8 : case 9 : System.out.println("夏"); break;
		//変数が10、11、12のとき、秋を表示して分岐を終了。
		case 10 :case 11 : case 12 : System.out.println("秋"); break;
		}

	}

}
