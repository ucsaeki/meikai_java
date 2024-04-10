package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_15
 * 概要 身長と標準体重の対応表を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/10
 */
public class Exercise4_15 {
	/* 
	 * 関数名  main
	 * 概要 身長と標準体重の対応表を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/10
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//身長の最低値と最高値を表す変数に初期値0を代入。
		int underHight = 0, overHight = 0;
		//入力された整数値が0以下の場合繰り返し
		for (; underHight <= 0;) {
			//入力を促す。
			System.out.print("何cmから：");
			//入力を読み込む。
			underHight = standerdInput.nextInt();
		}
		//入力された整数値が0以下の場合繰り返し
		for (; overHight <= 0;) {
			//入力を促す。
			System.out.print("何cmまで：");
			//入力を読み込む。
			overHight = standerdInput.nextInt();
		}
		//文章を表示。
		System.out.println("身長　標準体重");
		
		final int CONSTANT_FIVE = 5;
		//入力された身長の最低値から最高値までの標準体重を計算
		for (int i = underHight; i <= overHight;) {
			//実数値の変数に身長を代入
			double averageWeight = i;
			//身長と標準体重を計算して表示。
			System.out.println(i + "　" + (averageWeight - 100) * 0.9);
			//身長に定数5を足して次のループへ。
			i = i + CONSTANT_FIVE;
		}

	}

}
