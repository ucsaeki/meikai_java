package Exercise6;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_17
 * 概要 6人の国語と数学の点数を読み込んで、科目毎、学生毎の平均点を求める。
 * 作成者 Y.Saeki
 * 作成日 2024/04/22
 */
public class Exercise6_17 {
	/* 
	 * 関数名  main
	 * 概要 6人の国語と数学の点数を読み込んで、科目毎、学生毎の平均点を求める。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/22
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//人数を表す定数を設定
		final int CONSTANT_SIX = 6;
		//点数の上限を定数として設定
		final int MAXIMUM_POINT = 100;
		//インデックスの値と人数のずれを修正するための定数を設定
		final int CONSTANT_ONE = 1;
		//6人の国語の点数を表す配列を生成
		int[] japaneseArray = new int[CONSTANT_SIX];
		//6人の数学の点数を表す配列を生成
		int[] mathArray = new int[CONSTANT_SIX];

		//国語の点数の値の入力を促す。
		System.out.println("国語の点数を入力してください。");
		//国語の点数を6人分入力させる
		for (int i = 0; i < CONSTANT_SIX; i++) {
			//入力を促す//////
			System.out.print((i + CONSTANT_ONE) + "人目：");
			//入力を読み込む
			japaneseArray[i] = standerdInput.nextInt();
			//入力された値が100より大きい、もしくは0より小さい場合
			if (japaneseArray[i] > MAXIMUM_POINT || japaneseArray[i] < 0) {
				//正しい点数の入力を促す文章を表示
				System.out.println("点数は0～100点の間で入力してください");
				//計算回数に加算しないようにするため1減算
				i--;
			}
		} //数学の点数の値の入力を促す。
		System.out.println("数学の点数を入力してください。");
		//国語の点数を6人分入力させる
		for (int i = 0; i < CONSTANT_SIX; i++) {
			//入力を促す//////
			System.out.print((i + CONSTANT_ONE) + "人目：");
			//入力を読み込む
			mathArray[i] = standerdInput.nextInt();
			//入力された値が100より大きい、もしくは0より小さい場合
			if (mathArray[i] > MAXIMUM_POINT || mathArray[i] < 0) {
				//正しい点数の入力を促す文章を表示
				System.out.println("点数は0～100点の間で入力してください");
				//計算回数に加算しないようにするため1減算
				i--;
			}
		}
		//国語の点数の合計を表す変数を設定
		int japaneseSum = 0;
		//数学の点数の合計を表す変数を設定
		int mathSum = 0;

		//国語の点数の合計を求める
		for (int i = 0; i < CONSTANT_SIX; i++) {
			//国語の点数の合計を表す変数に要素の値を加算
			japaneseSum += japaneseArray[i];
		}
		//数学の点数の合計を求める
		for (int i = 0; i < CONSTANT_SIX; i++) {
			//数学の点数の合計を表す変数に要素の値を加算
			mathSum += mathArray[i];
		}
		//実数値で国語の平均点を求める
		System.out.println("全体の国語の平均点は" + ((double)japaneseSum / CONSTANT_SIX) + "点です。");
		//実数値で数学の平均点を求める
		System.out.println("全体の数学の平均点は" + ((double)mathSum / CONSTANT_SIX) + "点です。");

		//2で割る際に使用する定数を設定。
		final double PER_TWE = 2.0;

		//全員の平均点を表示する
		for (int i = 0; i < CONSTANT_SIX; i++) {
			//個人の平均点を表す変数を設定。
			double personSum = 0.0;
			//個人の平均点を表す変数に2教科の合計÷2を代入。
			personSum =(double) (japaneseArray[i] + mathArray[i]) / PER_TWE;
			//個人の平均点を表示。
			System.out.println(i + CONSTANT_ONE + "番目の人の平均点は" + personSum + "点です。");

		}

	}

}
