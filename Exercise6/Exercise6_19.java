package Exercise6;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_19
 * 概要 クラス数、各クラスの人数、全員の点数を読み込んで、合計点と平均点を求める。
 * 作成者 Y.Saeki
 * 作成日 2024/04/23
 */
public class Exercise6_19 {
	/* 
	 * 関数名  main
	 * 概要 クラス数、各クラスの人数、全員の点数を読み込んで、合計点と平均点を求める。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/23
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//行数を表す変数を設定
		int variableClass = 0;
		//正の値で行数を入力させる
		for (; variableClass <= 0;) {
			//入力を促す
			System.out.print("クラス数：");
			//入力を読み込む
			variableClass = standerdInput.nextInt();
			//入力された値が0以下の場合
			if (variableClass <= 0) {
				//再入力を求める文章を表示
				System.out.println("正の値を入力してください。");
			}
		}

		//入力された行数の二次元配列を生成
		int[][] variableArray = new int[variableClass][];
		//点数の上限を表す定数を設定。
		final int SCORE_HUNDRED = 100;
		//計算で使用する定数を設定
		final int CONSTANT_ONE = 1;

		//各クラスの人数と点数を配列に読み込む
		for (int i = 0; i < variableClass; i++) {
			//クラスの番号を表す変数を設定
			int classNumber = 0;
			//正しく人数を入力させる
			for (; classNumber <= 0;) {
				//クラスの人数の入力を促す
				System.out.print(i + CONSTANT_ONE + "組の人数：");
				//入力を読み込む
				classNumber = standerdInput.nextInt();
				//入力された値が0以下の場合
				if (classNumber <= 0) {
					//再入力を求める文章を表示
					System.out.println("正の値を入力してください。");
					//そうでない場合
				} else {
					//入力された値を二次元配列内の配列の要素数に代入。
					variableArray[i] = new int[classNumber];
				}

				//個人の点数を表す変数を設定
				int individualScore = 0;
				//クラス全員の点数を入力させる。
				inner: for (int j = 0; j < classNumber; j++) {
					//クラスの人数の入力を促す
					System.out.print(i + CONSTANT_ONE + "組" + (j + CONSTANT_ONE) + "番の点数：");
					//入力を読み込む
					individualScore = standerdInput.nextInt();
					//入力された値が0未満、または100より大きい場合
					if (individualScore < 0 || individualScore > SCORE_HUNDRED) {
						//再入力を求める文章を表示
						System.out.println("点数は0～100の間で入力してください。");
						//ひとつ前の番号からやり直すため1減算
						j--;
						//点数の入力からやり直す
						continue inner;
					//正しく入力された場合
					} else {
						//入力された値を配列の要素に代入する
						variableArray[i][j] = individualScore;
					}

				} //改行する
				System.out.println();
			}
		}
		//点数の合計を表す変数を設定
		int scoreSum = 0;
		//全ての点数の合計を表す変数を設定
		int totalScore = 0;
		//クラスの平均点を表す変数を設定
		double scoreAverage = 0.0;
		//全体の平均点を表す変数を設定
		double averageSum = 0.0;
		//表を作成
		System.out.println("  組 | 合計   平均");
		//点線を表示
		System.out.println("------------------");
		//全員の点数を合計して、クラスごとの合計と平均を表示する
		for (int i = 0; i < variableArray.length; i++) {
			//クラス全員の点数を合計する
			for (int j = 0; j < variableArray[i].length; j++) {
				//クラスの合計に点数を加算する
				scoreSum += variableArray[i][j];
				//全体の合計に点数を加算する
				totalScore += variableArray[i][j];
			}
			//実数値でクラスの平均を求める
			scoreAverage = (double) scoreSum / variableArray[i].length;

			//クラス名を表示
			System.out.printf("%2d", i + CONSTANT_ONE);
			//表を作成するための文字と記号を表示
			System.out.print("組 | ");
			//クラスの合計を表示
			System.out.printf("%4d", scoreSum);
			//感覚を調節するために空白を表示
			System.out.print("  ");
			//クラスの平均を表示
			System.out.printf("%5.1f", scoreAverage);
			//改行する
			System.out.println();
			//次のクラスの計算で使用するために、クラスの合計を0にする
			scoreSum = 0;
			//全体の平均の定数にクラスの平均を加算
			averageSum += scoreAverage;

		}
		//全体の平均を求める
		double totalAverage = (double) averageSum / variableClass;
		//点線を表示
		System.out.println("------------------");
		//表を作成するための文字と記号を表示
		System.out.print("  計 | ");
		//全体の合計を表示
		System.out.printf("%4d", totalScore);
		//感覚を調整するための空白を表示
		System.out.print("  ");
		//全体の平均を表示
		System.out.printf("%5.1f", totalAverage);
	}

}