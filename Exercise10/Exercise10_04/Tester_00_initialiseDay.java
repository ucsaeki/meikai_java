package Exercise10.Exercise10_04;
//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_00_initialiseDay
 * 概要 引数なしの日付、年、月、日をそれぞれ入力した日付をそれぞれ表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/24
 */
public class Tester_00_initialiseDay {
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
	 * 関数名 main
	 * 概要 引数なしの日付、年、月、日をそれぞれ入力した日付をそれぞれ表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public static void main(String[] args) {
		//引数をなにも指定しないでインスタンスを生成(Day)
		Day initialisedDay = new Day();
		//引数をなにも指定しないで生成したインスタンスの日付を表示
		System.out.println("引数なしで生成した日付(今日の日付)…" + initialisedDay);

		//年の入力を促す
		System.out.print("年：");
		//年を表す変数を設定し、入力させる(int)
		int variableYear = standardInput.nextInt();
		//引数に年を入力したインスタンスを生成(Day)
		Day yearSetDay = new Day(variableYear);
		//年を入力したインスタンスの日付を表示
		System.out.println("年を入力した日付…" + yearSetDay);
		
		//月の入力を促す
		System.out.print("月：");
		//月を表す変数を設定し、入力させる(int)
		int variableMonth = standardInput.nextInt();
		//引数に年、月を入力したインスタンスを生成(Day)
		Day monthSetDay = new Day (variableYear,variableMonth);
		//年、月を入力したインスタンスの日付を表示
		System.out.println("年、月を入力した日付…" + monthSetDay);
		
		//日の入力を促す
		System.out.print("日：");
		//入力された日を表す変数を設定し、入力させる(int)
		int variableDate = standardInput.nextInt();
		//引数に年、月、日を入力したインスタンスを生成(Day)
		Day dateSetDay = new Day (variableYear,variableMonth,variableDate);
		//入力された日をインスタンスに代入
		initialisedDay.setDate(variableDate);
		//年、月、日を入力したインスタンスの日付を表示
		System.out.println("年、月、日を入力した日付…" + dateSetDay);
		
		System.out.println();
		//引数をなにも指定しないでインスタンスを生成
		Day anotherDay = new Day();
		//引数をなにも指定しないで生成したインスタンスの日付を表示
		System.out.println("再度引数なしで生成した日付…" + anotherDay);
	}

}
