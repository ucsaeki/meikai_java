package Exercise6;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_06
 * 概要 入力した人数と点数から、合計点、平均点、最高点、最低点を表示する。
 * 作成者 Y.Saeki
 * 作成日 2024/04/16
 */
public class Exercise6_06 {
	/* 
	 * 関数名  main
	 * 概要 入力した人数と点数から、合計点、平均点、最高点、最低点を表示する。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/16
	 */

	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//入力された値を表す変数を設定
		int peopleNumber = 0;
		//正の整数値が入力されるまで警告と入力の催促を繰り返す。
		for (; peopleNumber <= 0;) {
			//整数値の入力を促す。
			System.out.print("入力する人数：");
			//入力を読み込む。
			peopleNumber = standerdInput.nextInt();
			//入力された整数値が0以下の場合
			if (peopleNumber <= 0) {
				//正の整数値の入力を促す文章を表示。
				System.out.print("正の整数値を入力してください。");
			}
		} //要素数が入力された人数の値である配列を生成
		int[] variableArray = new int[peopleNumber];
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;
		//点数の最大値である定数を設定
		final int CONSTANT_HUNDRED = 100;
		
		//点数を全て入力させる
		for (int i = 0; i < peopleNumber; i++) {
			//点数の入力を促す
			System.out.print((i + CONSTANT_ONE) + "番目の点数：");
			//入力を読み込む。
			variableArray[i] = standerdInput.nextInt();
			//入力された値が0より小さい、または100より大きい場合
			if (variableArray[i] < 0 || variableArray[i] > CONSTANT_HUNDRED) {
				//エラー文を表示
				System.out.println("点数は0～100以内で入力してください。");
				//もう一度同じ要素の入力をさせるため、計算回数から1減算
				i--;
			}
		}
		//合計を表す変数を設定
		int sumArray = 0;
		//最高点を表す変数にインデックス0を設定
		int maximumArray = variableArray[0];
		//最低点を表す変数にインデックス0を設定
		int minimumArray = variableArray[0];
		
		//インデックスの値の合計を求める
		for (int i = 0; i < variableArray.length; i++) {
			//合計を表す変数に各インデックスを加算
			sumArray += variableArray[i];
		}//最大値を求める
		for (int i = 1; i < variableArray.length; i++) {
			//インデックスの値が最大値より大きい場合
			if (maximumArray < variableArray[i]) {
				//最大値にインデックスの値を代入
				maximumArray = variableArray[i];
			}
		}//最小値を求める
		for (int i = 1; i < variableArray.length; i++) {
			//インデックスの値が最小値より小さい場合
			if (minimumArray > variableArray[i]) {
				//最小値にインデックスの値を代入
				minimumArray = variableArray[i];
			}
		}
		//最大値を表示
		System.out.println("合計点：" + sumArray + "点");
		//平均値をfloat型の実数値で表示
		System.out.println("平均点：" +  (float)sumArray / variableArray.length  + "点");
		//最高点を表示
		System.out.println("最高点：" + maximumArray + "点");
		//最低点を表示
		System.out.println("最低点：" + minimumArray + "点");

	}

}
