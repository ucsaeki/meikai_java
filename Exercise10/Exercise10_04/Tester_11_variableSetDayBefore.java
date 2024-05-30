package Exercise10.Exercise10_04;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_11_variableSetDayBefore
 * 概要 対象の日付を指定した日数分前に戻した日付を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/24
 */
public class Tester_11_variableSetDayBefore {
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
	 * 関数名 inputDay
	 * 概要 日付を入力させる
	 * 引数 入力させたい日付の内容を表す文字列(String)
	 * 返り値 日付(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public static Day inputDay(String targetSubject) {
		//入力させたい内容を表示
		System.out.println(targetSubject);
		//年の入力を促す
		System.out.print("年：");
		//年を表す変数を設定し、入力させる(int)
		int variableYear = standardInput.nextInt();
		//年の入力を促す
		System.out.print("月：");
		//月を表す変数を設定し、入力させる(int)
		int variableMonth = standardInput.nextInt();
		//年の入力を促す
		System.out.print("日：");
		//入力された日を表す変数を設定し、入力させる(int)
		int variableDate = standardInput.nextInt();
		//入力された年、月、日を用いてインスタンスを作成(Day)
		Day variableDay = new Day(variableYear, variableMonth, variableDate);
		//作成した日付を返却
		return variableDay;
	}

	/* 
	 * 関数名 main
	 * 概要 対象の日付を指定した日数分前に戻した日付を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public static void main(String[] args) {
		//指定した日数分前に戻したい日付を表すインスタンスを設定し、入力させる(Day)
		Day multipleUpDay = new Day(inputDay("前に戻したい日付を入力してください。"));
		//前に戻したい日数を入力させる
		int turnBackDate = inputIntegralNumber("戻したい日数：");
		//インスタンスに指定された日数前に戻した日付をセットする
		multipleUpDay.setMultipulBeforeDay(turnBackDate);
		//前に戻した日付をセットしたインスタンスの年、月、日を表示。
		System.out.println(turnBackDate + "日分前に戻した日付は、" + multipleUpDay.getYear() + "年"
				+ multipleUpDay.getMonth() + "月" + multipleUpDay.getDate() + "日です。");

	}

}
