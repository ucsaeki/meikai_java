package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_3
 * 概要 List3-5の最後のelseをelse if ( n == 0 )に変更した場合のテスト。
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise3_3 {
	/* 
	 * 関数名  main
	 * 概要 List3-5の最後のelseをelse if ( n == 0 )に変更した場合のテスト。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		
		//整数値の入力を促す。
		System.out.print("整数値：");
		//入力を促す。変数nは教本準拠。
		int n = standerdInput.nextInt();
		
		//もし変数が0より大きい場合。
		if ( n > 0 )
			//入力値が正であることを表示。
			System.out.println("その値は正です");
		//変数が0より大きくなく、0より小さい場合。
		else if ( n < 0 )
			//入力値が負であることを表示。
			System.out.println("その値は負です");
		//変数が0と同じとき。
		//List3-5の最後尾のelseをelse if ( n == 0 )に変更したとしても、変更前と同様の挙動を示す。
		else if ( n == 0 )
			System.out.println("その値は0です");
	
	}

}
