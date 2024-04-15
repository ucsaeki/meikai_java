package Exercise4;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise4_25
 * 概要 読み込んだ整数を加算し合計を表示するプログラムと、読み込んだ整数を1000以内で加算し合計を表示するプログラム
 * 作成者 Y.Saeki
 * 作成日 2024/04/12
 */
public class Exercise4_25 {
	/* 
	 * 関数名  main
	 * 概要 読み込んだ整数を加算し合計を表示するプログラムと、読み込んだ整数を1000以内で加算し合計を表示するプログラム
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/12
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//文章を表示。
		System.out.println("整数を加算します。");
		//入力された値を表す変数を設定
		int firstInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; firstInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("何個加算しますか：");
			//入力を読み込む。
			firstInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (firstInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//合計を表す変数を設定
		int firstSum = 0;
		//加算した回数を表す変数を設定
		int timesNumberOne = 0;
		//入力された値を既定の回数加算し続ける
		for (; timesNumberOne < firstInteger; timesNumberOne++) {
			//入力を促す文章を表示。
			System.out.print("整数（0で終了） :");
			//入力を読み込む。
			int firstVariable = standerdInput.nextInt();
			//最初の入力で0が選択された場合
			if (firstVariable == 0 && timesNumberOne == 0) {
				//エラー文を表示
				System.out.println("計算できませんでした。終了します。");
				//繰り返しを終了する。
				break;
			}
			//0が入力された場合
			else if (firstVariable == 0) {
				//繰り返しを終了する。
				break;
			}
			//合計を表す変数に入力された値を加算して代入
			firstSum += firstVariable;
		}
		//加算回数が入力回数以上の場合
		if (timesNumberOne >= firstInteger) {
			//合計を表示
			System.out.println("合計は" + firstSum + "です。");
			//平均を表示
			System.out.println("平均は" + firstSum / timesNumberOne + "です。");
		}
		//改行する
		System.out.println();

		//文章を表示。
		System.out.println("整数を加算します。");
		//入力された値を表す変数を設定
		int secondInteger = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; secondInteger <= 0;) {
			//整数値の入力を促す。
			System.out.print("何個加算しますか：");
			//入力を読み込む。
			secondInteger = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (secondInteger <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}
		//合計を表す変数を設定
		int secondSum = 0;
		//加算した回数を表す変数を設定
		int timesNumberTwo = 0;
		//合計の上限値を表す定数を設定
		final int CONSTANT_THOUSAND = 1000;
		//入力された値を既定の回数加算し続ける
		for (; timesNumberTwo < secondInteger; timesNumberTwo++) {
			//入力を促す文章を表示。
			System.out.print("整数 :");
			//入力を読み込む。
			int secondVariable = standerdInput.nextInt();
			//最初の入力で1000以上の値が入力された場合。
			if (secondVariable > 1000 && timesNumberTwo == 0) {
				//エラー文を表示
				System.out.println("1000を越えるため計算できません。終了します");
				//エラー表示を加算回数として扱わないようにするため、加算回数の変数から1引く。
				break;
			}
			//これまでの合計値とこれから加算する値の合計値が1000を超える場合
			else if (secondSum + secondVariable > CONSTANT_THOUSAND) {
				//文章を表示
				System.out.println("合計が1000を超えました。");
				//文章を表示
				System.out.println("最後の数値は無視します。");
				//繰り返しを終了する。
				break;
			}
			//合計を表す変数に入力された値を加算して代入
			secondSum += secondVariable;
		}
		//加算回数が0より大きい場合
		if ( timesNumberTwo > 0) {
		//合計を表示
		System.out.println("合計は" + secondSum + "です。");
		//平均を表示
		System.out.println("平均は" + secondSum / timesNumberTwo + "です。");
		}

	}

}
