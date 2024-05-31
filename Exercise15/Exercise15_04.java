package Exercise15;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise15_04
 * 概要 浮動小数点数値を、小数点以下と全体の桁数を指定された値で調整して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class Exercise15_04 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 int型の正の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 正の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表すint型変数を設定
		int variableNumber = 0;
		//int型の正の整数値で入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standardInput.nextInt();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 inputZeroNumber
	 * 概要 0以上の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 0以上の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public static int inputZeroNumber(String targetSubject) {
		//入力させたい値の内容を表示
		System.out.print(targetSubject);
		//入力された値を表す変数を設定
		int variableNumber = standardInput.nextInt();
		//0以上の整数値を入力させる
		for (; variableNumber < 0;) {
			//入力された値が0よりちいさい場合
			if (variableNumber < 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("0以上の整数値を入力してください。");
				//入力させたい値の内容を表示
				System.out.print(targetSubject);
				//入力された値を読み込む
				variableNumber = standardInput.nextInt();
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 printDouble
	 * 概要 浮動小数点数値を、小数点以下と全体の桁数を指定して表示させる
	 * 引数 浮動小数点数値(double)、小数点以下の桁数、全体の桁数(int)
	 * 返り値 桁数を調整した浮動小数点数値を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static String printDouble(double x, int p, int w) {
		//桁数を調整した浮動小数点数値を返却する
		return String.format(String.format("%%%d.%df", w, p), x);

	}

	/* 
	 * 関数名 main
	 * 概要 浮動小数点数値を、小数点以下と全体の桁数を指定された値で調整して表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void main(String[] args) {
		//浮動小数点数値の入力を促す
		System.out.print("浮動小数点数値を入力してください：");
		//入力を読み込む
		double doubleNumber = standardInput.nextDouble();

		//表示させる桁数の入力を促す
		System.out.println("表示させたい桁数を入力してください。");
		//小数点以下の桁数を入力させる
		int digitsUnderPoint = inputZeroNumber("小数点以下の桁数：");
		//全体の桁数を入力させる
		int digitsWholeNumber = inputIntegralNumber("全体の桁数：");
		//関数を用いて、桁数を調整した浮動小数点数値を表示
		System.out.println("桁数を調整した値は" + printDouble(doubleNumber, digitsUnderPoint, digitsWholeNumber) + "です。");

	}

}
