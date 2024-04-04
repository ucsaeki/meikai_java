package Exercise2;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 
 * 概要 
 * 作成者 Y.Saeki
 * 作成日 2024/04/04
 */
public class Exercise2_6 {
	/* 
	 * 関数名  main
	 * 概要 
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/04
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
			
		//底辺の値の入力を促す。
	    System.out.print("底辺：");
	    //実数値を読み込む。
		double bottomLength = standerdInput.nextDouble();
		
		//高さの値の入力を促す。
		System.out.print("高さ：");
		//実数値を読み込む。
		double heightLength = standerdInput.nextDouble();
		
		//三角形の面積を表示するため、底辺×高さ÷2をした値を表示。
		System.out.println("面積は" + ( bottomLength * heightLength) / 2  + "です。");
	}

}
