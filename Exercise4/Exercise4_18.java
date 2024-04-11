package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_18
 * 概要 1から入力した値までの整数値の2乗値を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_18 {
	/* 
	 * 関数名  main
	 * 概要 1から入力した値までの整数値の2乗値を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された数値を表す変数に0を代入。
		int integerNumber = 0;
		//入力された値が0以下の場合繰り返し
		for (; integerNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("nの値：");
			//入力を読み込む。
			integerNumber = standerdInput.nextInt();
			//入力された整数値が負の数の場合
			if (integerNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.println("正の整数値を入力してください。");
			}
		} //入力された値を二乗した値を表す変数を設定。
		int squardNumber = 0;
		//二乗した回数を表す変数を設定。
		int countNumber = 0;
		//入力された値と同じ回数計算を繰り返す。
		for (int i = 1; i <= integerNumber; i++) {
			//二乗する値を表す変数に二乗する回数を代入。
			countNumber = i;
			//入力された値を二乗した値を代入。
			squardNumber = (i * i);
			//二乗する値と二乗した値を表示。
			System.out.println(countNumber + "の2乗は" + squardNumber);
		}
		
	}

}
