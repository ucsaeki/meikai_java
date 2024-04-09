package Exercise3;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise3_8
 * 概要 入力された点数に応じて評価をするメソッド。
 * 作成者 Y.Saeki
 * 作成日 2024/04/05
 */
public class Exercise3_8 {
	/* 
	 * 関数名  main
	 * 概要 入力された点数に応じて評価をするメソッド。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/05
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//点数の入力を促す。
		System.out.print("点数を入力してください（0～100）:");
		//入力を読み込む。
		int gradeScore = standerdInput.nextInt();
		
		//もし変数が0以上かつ59以下の場合
		if ( gradeScore >= 0 && gradeScore <= 59 ) {
			//不可であることを表示
			System.out.println("不可");
		//もし変数が60以上かつ69以下の場合
		} else if ( gradeScore >= 60 && gradeScore <= 69 ) {
			//可であることを表示。
			System.out.println("可");
		//もし変数が70以上かつ79以下の場合
		} else if ( gradeScore >= 70 && gradeScore <= 79 ) {
			//良であることを表示。
			System.out.println("良");
		//もし変数が80以上100以下の場合
		} else if ( gradeScore >= 80 && gradeScore <= 100 ) {
			//優であることを表示。
			System.out.println("優");
		} else {
			System.out.println("0～100までの値を入力してください。");
		}

	}

}
