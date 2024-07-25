package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_15
 * 概要 身長と標準体重の対応表を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/11
 */
public class Exercise4_15 {
	/* 
	 * 関数名  main
	 * 概要 身長と標準体重の対応表を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/11
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//身長の最低値と最高値を表す変数に初期値0を代入。
		int underHeight = 0, overHeight = 0, intervalVariable = 0;
		//入力された整数値が0以下の場合繰り返し
		for (; underHeight <= 0;) {
			//入力を促す。
			System.out.print("何cmから：");
			//入力を読み込む。
			underHeight = standerdInput.nextInt();
			//入力値が0以下の場合
			if (underHeight <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正しく入力してください。");
			}
		}
		//入力された整数値が0以下、または先に入力された値より小さい場合繰り返し
		for (; overHeight <= 0 || overHeight <= underHeight;) {
			//入力を促す。
			System.out.print("何cmまで：");
			//入力を読み込む。
			overHeight = standerdInput.nextInt();
			//整数値が0以下の場合
			if (overHeight <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正しく入力してください。");
			} //後から入力した整数値が先に入力した整数値より小さい場合。
			if (overHeight <= underHeight) {
				//先に入力した身長より高い身長の入力を促す文章を表示。
				System.out.print("先に入力した身長より高い身長を入力してください。");
			}
		} //入力された整数値が0以下の場合繰り返し
		for (; intervalVariable <= 0;) {
			//入力を促す文章を表示。
			System.out.print("何cmごと：");
			//入力を読み込む。
			intervalVariable = standerdInput.nextInt();
			//整数値が0以下の場合
			if (intervalVariable <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}

		//文章を表示。
		System.out.println("身長　標準体重");
		//計算に使用する定数に100、10、9をそれぞれ設定。
		final int CONSTANT_HUNDRED = 100, CONSTANT_TEN = 10, CONSTANT_NINE = 9;
		//計算に使用する定数に0.9を設定。
		final double POINT_NINE = 0.9;
		//入力された身長の最低値から最高値までの標準体重を計算
		for (; underHeight <= overHeight;) {
			//実数値の変数に平均体重を計算して代入
			double perWeight = (underHeight - CONSTANT_HUNDRED) * POINT_NINE;
			//平均体重に小数点以下の数字が発生する場合
			if (perWeight * CONSTANT_TEN % CONSTANT_TEN != 0) {
				//身長と標準体重を表示。
				System.out.println(underHeight + "　 " + perWeight);
				//平均体重に小数点以下の数字が発生しない場合
			} else {
				//定数を用いて身長と標準体重を計算して表示。
				System.out.println(underHeight + "　 " 
				+ (underHeight - CONSTANT_HUNDRED) * CONSTANT_NINE / CONSTANT_TEN);
			} //身長に表示する幅の値を足して次のループへ。
			underHeight = underHeight + intervalVariable;
		}

	}

}
