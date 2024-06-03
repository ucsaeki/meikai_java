package Exercise6;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise6_18
 * 概要 行数、各行の列数、各要素の値を読み込んで表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/23
 */
public class Exercise6_18 {
	/* 
	 * 関数名  main
	 * 概要 行数、各行の列数、各要素の値を読み込んで表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/23
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);

		//行数を表す変数を設定
		int rowNumber = 0;
		//正の値で行数を入力させる
		for (; rowNumber <= 0;) {
			//行数の入力を促す
			System.out.print("行数：");
			//入力を読み込む
			rowNumber = standerdInput.nextInt();
			//入力された値が0以下の場合
			if (rowNumber <= 0) {
				//再入力を求める文章を表示
				System.out.println("正の値を入力してください。");
			}
		}

		//入力された行数の二次元配列を生成
		int[][] variableArray = new int[rowNumber][];

		//正の値で列数を入力させる
		for (int j = 0; j < rowNumber; j++) {
			//列数を表す変数を設定
			int columnNumber = 0;
			//正の値で列数を入力させる
			for (; columnNumber <= 0;) {
				//列数の入力を促す
				System.out.print("variableArray[" + j + "]の 列数：");
				//入力を読み込む
				columnNumber = standerdInput.nextInt();
				//入力された値が0以下の場合
				if (columnNumber <= 0) {
					//再入力を求める文章を表示
					System.out.println("正の値を入力してください。");
				} else {
					variableArray[j] = new int[columnNumber];
				}
			}
		}

		//入力を促す
		System.out.println("要素の値を入力してください");
		
		//全ての要素に入力させる
		for (int i = 0; i < variableArray.length; i++) {
			//列内の全ての要素に入力させる。
			for (int j = 0; j < variableArray[i].length; j++) {
				//列数を表す変数を設定
				int elementNumber = 0;
				//要素の入力を促す
				System.out.print("variableArray[" + i + "][" + j + "]：");
				//入力を読み込む
				elementNumber = standerdInput.nextInt();
				//入力を配列の要素に代入
				variableArray[i][j] = elementNumber;

			}
		}
		//全ての要素を出力する
		for (int i = 0; i < variableArray.length; i++) {	
			//列の要素の値を全て出力する
			for (int j = 0; j < variableArray[i].length; j++) {
				//要素の値を出力する
				System.out.printf("%3d", variableArray[i][j]);
			}
			//改行する
			System.out.println("");
		}
	}

}
