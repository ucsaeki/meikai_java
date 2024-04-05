package Exercise2;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise2_10
 * 概要 個別に入力された姓と名を連続で表示させるメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_10 {
	/* 
	 * 関数名  main
	 * 概要 個別に入力された姓と名を連続で表示させるメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdImput = new Scanner(System.in);
		
		//姓の入力を促す。
		System.out.print("姓：");
		//姓を読み込む。
		String familyName = standerdImput.next();
		
		//名の入力を促す。
		System.out.print("名：");
		//名を読み込む。
		String firstName = standerdImput.next();
		
		//姓と名を連続で表示。
		System.out.println("こんにちは" + familyName + firstName + "さん。");
	}

}
