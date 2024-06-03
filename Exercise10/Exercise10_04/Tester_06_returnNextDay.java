package Exercise10.Exercise10_04;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_06_returnNextDay
 * 概要 対象の次の日の日付を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/24
 */
public class Tester_06_returnNextDay {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

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
		 * 概要 対象の次の日の日付を表示する
		 * 引数 なし
		 * 返り値 なし
		 * 作成者 Y.Saeki
		 * 作成日 2024/05/24
		 */
	public static void main(String[] args) {
		//次の日の日付を表示したい日付を表すインスタンスを宣言し、入力させる(Day)
		Day nextDay = new Day(inputDay("次の日の日付を求めたい日付を入力してください。"));
		//次の日の日付を表示。
		System.out.println("次の日の日付は" + nextDay.goAfterDay() + "です。");

	}

}
