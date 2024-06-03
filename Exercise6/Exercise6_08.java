package Exercise6;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_08
 * 概要 double型の配列の全要素の合計と平均を求める
 * 作成者 Y.Saeki
 * 作成日 2024/04/19
 */
public class Exercise6_08 {
	/* 
	 * 関数名  main
	 * 概要 double型の配列の全要素の合計と平均を求める
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/19
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int elementNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; elementNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("要素数：");
			//入力を読み込む。
			elementNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (elementNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		}//入力された要素数を持つ配列を生成
		double[] variableArray = new double[elementNumber];

		//入力を促す文章を表示
		System.out.println("要素の値を入力してください。");
		//全ての要素を入力させる
		for (int i = 0; i < elementNumber; i++) {
			//要素への入力を促す
			System.out.print("variableArray[" + i + "] = :");
			//対応する要素へ入力を読み込む
			variableArray[i] = standerdInput.nextDouble();///////
		}
		//全要素の合計を表す変数を設定
		double sumNumber = 0;
		//全要素の合計の値を求める
		//for (int i = 0; i < elementNumber; i++) {
		for ( double j : variableArray) {
			//合計の変数に要素の値を加算
			sumNumber += j;
		}
		//合計を表示
		System.out.println("全要素の合計は" + sumNumber + "です。");
		//平均を表示
		System.out.println("全要素の平均は" + sumNumber / elementNumber + "です。");

	}

}
