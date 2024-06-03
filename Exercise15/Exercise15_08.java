package Exercise15;

//Dayクラスをインポート
import Exercise12.Exercise12_01.Day;

/* 
 * クラス名 Exercise15_08
 * 概要 コマンドライン引数で指定された年月のカレンダーを表示する
 * 作成者 Y.Saeki
 * 作成日 2024/06/03
 */
public class Exercise15_08 {
	/* 
	 * 関数名 printDate
	 * 概要 カレンダーの日付を表示する
	 * 引数 日(int)
	 * 返り値 日付と余白を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/06/03
	 */
	public static String printDate(int dateNumber) {
		//日付と余白を表す文字列を表示
		return String.format("%02d  ", dateNumber);
	}

	/* 
	 * 関数名 printCalender
	 * 概要 引数で指定された年月をカレンダーで表示する
	 * 引数 カレンダーとして表示したい日付(Day)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/06/03
	 */
	public static void printCalender(Day targetDay) {
		//日曜日を表す定数を設定
		final int SUNDAY_NUMBER = 0;
		//土曜日を表す定数を設定
		final int SATURDAY = 6;
		//表示するカレンダーの年月を表示
		System.out.println(targetDay.getYear() + "年" + targetDay.getMonth() + "月のカレンダーを表示します。");
		//曜日を表示
		System.out.println("日  月  火  水  木  金  土");

		//曜日を表す変数に表示したい年月の1日の曜日を代入
		int dayOfWeek = targetDay.dayOfWeek();
		//現在が何曜日かを表す変数を設定し、初期値として日曜日を代入
		int weekCounter = SUNDAY_NUMBER;

		//その月の最小日数に到達するまで空白を表示する
		for (int i = dayOfWeek; i > 0; i--) {
			//調整のための空白を表示
			System.out.print("    ");
			//曜日を表す変数に1加算
			weekCounter++;
		}

		//月の最小の日を表す定数を設定
		final int MINIMUM_DATE = 1;
		//その月の最小日数から最大日数までの日付を表示する
		for (int i = MINIMUM_DATE; i <= targetDay.monthMaximumDays(targetDay.getYear(), targetDay.getMonth()); i++) {
			//対象の日付を表示
			System.out.print(printDate(i));

			//曜日を表す変数が土曜日の場合
			if (weekCounter == SATURDAY) {
				//改行する
				System.out.println();
				//曜日を表す変数に日曜日を表す定数を設定
				weekCounter = SUNDAY_NUMBER;
			//曜日を表す変数が土曜日以外の場合
			} else {
				//曜日を表す変数に1加算
				weekCounter++;
			}
		}
		//改行する
		System.out.println();
	}

	/* 
	 * 関数名 main
	 * 概要 コマンドライン引数で指定された年月のカレンダーを表示する
	 * 引数 年、月が入力されたコマンドライン引数(String[])
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/06/03
	 */
	public static void main(String[] args) {
		//本日の日付を入力したインスタンスを作成
		Day calendarDay = new Day();
		//月の最小の日を表す定数を設定
		final int MINIMUM_DATE = 1;
		//日を月の最小の日に設定
		calendarDay.setDate(MINIMUM_DATE);

		//コマンドライン引数に年が入力されている場合の配列の要素数を表す定数を設定
		final int YEAR_ARGUMENT = 1;
		//コマンドライン引数に月が入力されている場合の配列の要素数を表す定数を設定
		final int MONTH_ARGUMENT = 2;
		//コマンドライン引数の年が格納されている要素の値を表す定数を設定
		final int YEAR_PLACE_INDEX = 0;
		//コマンドライン引数の月が格納されている要素の値を表す定数を設定
		final int MONTH_PLACE_INDEX = 1;
		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;

		//符号を反転させるための定数を設定
		final int INVERSE_SIGN = -1;

		//コマンドライン引数に年が入力されている場合
		if (args.length >= YEAR_ARGUMENT) {
			//コマンドライン引数の年が0ではない場合
			if (Integer.parseInt(args[YEAR_PLACE_INDEX]) != 0) {
				//年の値を表す変数にコマンドライン引数の年を代入
				int yearNumber = Integer.parseInt(args[YEAR_PLACE_INDEX]);
				//年を表すコマンドライン引数が負の数の場合、符号を反転させる
				yearNumber = (yearNumber < 0 ? yearNumber * INVERSE_SIGN : yearNumber);
				//日付にコマンドライン引数で指定された年を代入
				calendarDay.setYear(yearNumber);
			//年に0が入力されている場合
			} else {
				//最小の年を表す変数を設定
				final int MINIMUM_YEAR = 1;
				//年の値に最小の年を代入
				calendarDay.setYear(MINIMUM_YEAR);
			}

			//コマンドライン引数に月が入力されている場合
			if (args.length >= MONTH_ARGUMENT) {
				//コマンドライン引数の月が0ではない場合
				if (Integer.parseInt(args[MONTH_PLACE_INDEX]) != 0) {
					//コマンドライン引数の月が1月以上12月以下の場合
					if (Integer.parseInt(args[MONTH_PLACE_INDEX]) >= MONTH_JANUARY
							&& Integer.parseInt(args[MONTH_PLACE_INDEX]) <= MONTH_DECEMBER) {
						//月の値を表す変数にコマンドライン引数の月を代入
						int monthNumber = Integer.parseInt(args[MONTH_PLACE_INDEX]);
						//日付にコマンドライン引数で指定された月を代入
						calendarDay.setMonth(monthNumber);
					//月が1月より小さい場合
					} else if (Integer.parseInt(args[MONTH_PLACE_INDEX]) < 0) {
						//日付に1月を代入
						calendarDay.setMonth(MONTH_JANUARY);
					//月の12月より大きい場合
					} else {
						//日付に12月を代入
						calendarDay.setMonth(MONTH_DECEMBER);
					}
				//コマンドライン引数の月が0の場合
				} else {
					//最小の年を表す変数を設定
					final int MINIMUM_MONTH = 1;
					//年の値に最小の年を代入
					calendarDay.setMonth(MINIMUM_MONTH);
				}
				//対象の年月をカレンダー形式で表示する
				printCalender(calendarDay);

			//コマンドライン引数に月が入力されていない場合
			} else {
				//1月から12月までの全ての月をカレンダー形式で表示する
				for (int i = MONTH_JANUARY; i <= MONTH_DECEMBER; i++) {
					//日付の月に1月から12月までを代入
					calendarDay.setMonth(i);
					//対象の年月をカレンダー形式で表示する
					printCalender(calendarDay);
					//改行する
					System.out.println();
				}
			}
		//コマンドライン引数に何も入力されていない場合
		} else {
			//今日の年月をカレンダー形式で表示する
			printCalender(calendarDay);
		}
	}
}
