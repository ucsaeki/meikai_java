package Exercise10.Exercise10_03;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Ex10_03_Tester
 * 概要 作成した配列冒頭の二値、三値、配列全体の、最小値と最大値をそれぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/22
 */
public class Ex10_03_Tester {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputUnderNumber
	 * 概要 指定した値以上の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 正の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public static int inputUnderNumber(String targetSubject) {
		//入力された値を表す変数を設定(int)
		int variableNumber = 0;
		//入力させたい値の最小値を表す定数を設定
		final int UNDER_NUMBER = 3;
		//指定した値以上の正の整数値を入力させる
		for (; variableNumber < UNDER_NUMBER;) {
			//入力させたい値の内容を表す文字列を表示
			System.out.print(targetSubject);
			//入力を読み込む
			variableNumber = standerdInput.nextInt();
			//入力された値が指定した値未満の場合
			if (variableNumber < UNDER_NUMBER) {
				//正の整数値での入力を求めるエラー文を表示
				System.out.println(UNDER_NUMBER + "以上の正の整数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 inputArray
	 * 概要 全ての要素を入力させた配列を返却する
	 * 引数 要素数(int)
	 * 返り値 配列(int[])
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static int[] inputArray(int elementNumber) {
		//要素の入力を促す
		System.out.println("配列の要素を入力してください。");
		//指定された要素数を持つ配列を作成
		int[] variableArray = new int[elementNumber];
		//配列の全ての要素に入力させる
		for (int i = 0; i < variableArray.length; i++) {
			//要素を表示して入力を促す
			System.out.print("[" + i + "]= ");
			//入力を読み込む
			variableArray[i] = standerdInput.nextInt();
		}
		//作成した配列を返却
		return variableArray;
	}

	public static void main(String[] args) {
		//配列の作成を予告
		System.out.println("配列を作成します。");
		//要素数を表す変数を設定し、正の整数値で入力させる
		int elementNumber = inputUnderNumber("要素数：");
		//入力された要素数を持つ配列を作成し、全ての要素を入力させる
		int[] subjectArray = inputArray(elementNumber);

		//配列冒頭の二値の最小値を表示
		System.out.println("配列冒頭の二値の最小値は"
				+ MinMax.findMinimum(subjectArray[0], subjectArray[1]) + "です。");
		//配列冒頭の三値の最小値を表示
		System.out.println("配列冒頭の三値の最小値は"
				+ MinMax.findMinimum(subjectArray[0], subjectArray[1], subjectArray[2])
				+ "です。");
		//配列全体の要素の最小値を表示
		System.out.println("配列全体の要素の最小値は"
				+ MinMax.findMinimum(subjectArray) + "です。");

		//改行する
		System.out.println();

		//配列冒頭の二値の最大値を表示
		System.out.println("配列冒頭の二値の最大値は"
				+ MinMax.findMaximum(subjectArray[0], subjectArray[1]) + "です。");
		//配列冒頭の三値の最大値を表示
		System.out.println("配列冒頭の三値の最大値は"
				+ MinMax.findMaximum(subjectArray[0], subjectArray[1], subjectArray[2])
				+ "です。");
		//配列全体の要素の最大値を表示
		System.out.println("配列全体の要素の最大値は"
				+ MinMax.findMaximum(subjectArray) + "です。");
	}

}
