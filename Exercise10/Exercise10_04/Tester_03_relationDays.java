package Exercise10.Exercise10_04;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_03_relationDays
 * 概要 対象の日付の他の日付との前後関係を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/24
 */
public class Tester_03_relationDays {
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
	 * 概要 対象の日付の他の日付との前後関係を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public static void main(String[] args) {
		//指定された日付から年内の残り日数の表示を予告し、宣言した日付を表す変数に入力させる(Day)
		Day targetDay = new Day(inputDay("前後関係を判定する対象の日付を入力してください。"));
		//指定された日付から年内の残り日数の表示を予告し、宣言した日付を表す変数に入力させる(Day)
		Day conperisonDay = new Day(inputDay("対象と比較するための日付を入力してください。"));
		//対象の日付と他の日付の前後関係を表示
		targetDay.daysRelation("対象の日付", conperisonDay, "他の日付");

	}

}
