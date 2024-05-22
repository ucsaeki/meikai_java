package Exercise10.Exercise10_04;

import static java.util.Calendar.*;

//GregorianCalendarクラスをインポート
import java.util.GregorianCalendar;

/* 
 * クラス名 Day
 * 概要 日付に関する情報を管理する日付クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/22
 */
public class Day {
	//年を表すフィールド(int)を宣言し、初期値を設定
	private int calendarYear = 1;
	//月を表すフィールド(int)を宣言し、初期値を設定
	private int calendarMonth = 1;
	//日を表すフィールド(int)を宣言し、初期値を設定
	private int calendarDate = 1;

	//本日の日付を表示するクラス初期化子を宣言
	static {
		//本日の日付をインスタンスを作成
		GregorianCalendar variableToday = new GregorianCalendar();
		//本日の年を取得する
		int todayYear = variableToday.get(YEAR);
		//本日の月を取得する
		int todayMonth = variableToday.get(MONTH);
		//本日の日を取得する
		int todayDate = variableToday.get(DATE);
		//取得した情報を用いて本日の日付を表すインスタンスを作成
		Day today = new Day(todayYear, todayMonth, todayDate);
		//インスタンスの日付を表示
		System.out.println(today);
		
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 コンストラクタを本日の日付で初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day() {
		//本日の日付を表すインスタンスを作成
		GregorianCalendar variableToday = new GregorianCalendar();
		//年を表すフィールドを本日の年で初期化
		this.calendarYear = variableToday.get(YEAR);
		//月を表すフィールドを本日の月で初期化
		this.calendarMonth =  variableToday.get(MONTH);
		//日を表すフィールドを本日の日で初期化
		this.calendarDate =  variableToday.get(DATE);
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年を引数(int)の値で、月、日はフィールド初期値のままコンストラクタを初期化する
	 * 引数 年(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(int calendarYear) {
		//年を表すフィールドを初期化(int)
		this.calendarYear = calendarYear;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年と月を入力された値で、日をフィールド初期値のまま初期化する。
	 * 引数 年(int)、月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(int calendarYear, int calendarMonth) {
		//コンストラクタを使用して年を初期化
		this(calendarYear);
		//月を表すフィールドを初期化(int)
		this.calendarMonth = calendarMonth;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年(int)、月(int)、日(int)を初期化する
	 * 引数 年(int)、月(int)、日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(int calendarYear, int calendarMonth, int calendarDate) {
		//コンストラクタを使用して年(int)、月(int)を初期化
		this(calendarYear, calendarMonth);
		//日を表すフィールドを初期化(int)
		this.calendarDate = calendarDate;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年(int)、月(int)、日(int)を別のコンストラクタの値を用いて初期化する
	 * 引数 年、月、日をもつコンストラクタ(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(Day anotherDay) {
		//年(int)、月(int)、日(int)に引数のインスタンス(Day)の値を入力して初期化
		this(anotherDay.calendarYear, anotherDay.calendarMonth, anotherDay.calendarDate);
	}

	/* 
	 * 関数名 getYear
	 * 概要 対象の年を取得するゲッタ(int)
	 * 引数 なし
	 * 返り値 年(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public int getYear() {
		//年(int)を返却する
		return calendarYear;
	}

	/* 
	 * 関数名 getMonth
	 * 概要 対象の月を取得するゲッタ(int)
	 * 引数 なし
	 * 返り値 月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public int getMonth() {
		//月(int)を返却する
		return calendarMonth;
	}

	/* 
	 * 関数名 getDate
	 * 概要 対象の年を取得するゲッタ(int)
	 * 引数 なし
	 * 返り値 日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public int getDate() {
		//日(int)を返却する
		return calendarDate;
	}

	/* 
	 * 関数名 setYear
	 * 概要 年を表すフィールドに代入するセッタ(int)
	 * 引数 年(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public void setYear(int variableYear) {
		//年を表すフィールドに年を表す引数を代入。
		this.calendarYear = variableYear;
	}

	/* 
	 * 関数名 setMonth
	 * 概要 月を表すフィールドに代入するセッタ(int)
	 * 引数 月(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public void setMonth(int variableMonth) {
		//月を表すフィールドに月を表す引数を代入。
		this.calendarMonth = variableMonth;
	}

	/* 
	 * 関数名 setDay
	 * 概要 日を表すフィールドに代入するセッタ(int)
	 * 引数 日(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public void setDate(int variableDate) {
		//日を表すフィールドに日を表す引数を代入。
		this.calendarDate = variableDate;

	}
	/* 
	 * 関数名 setAllDate
	 * 概要 年、月、日を表すフィールドに代入するセッタ(int)
	 * 引数 年、月、日(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */

	public void setAllDate(int variableYear, int variableMonth, int variableDate) {
		//年を表すフィールドに年を表す引数を代入。
		this.calendarYear = variableYear;
		//月を表すフィールドに月を表す引数を代入。
		this.calendarMonth = variableMonth;
		//日を表すフィールドに日を表す引数を代入。
		this.calendarDate = variableDate;
	}

	/* 
	 * 関数名 dayOfWeek
	 * 概要 ツェラーの公式を用いて、曜日を表す整数を求めて返却する(int)
	 * 引数 なし
	 * 返り値 求めた曜日を表す変数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public int dayOfWeek() {

		//変数(int)に対象の年を代入する
		int targetYear = calendarYear;
		//変数(int)に対象の月を代入する
		int targetMonth = calendarMonth;
		//対象の月が1月か2月の場合
		if (targetMonth == 1 || targetMonth == 2) {
			//年を表す変数から1引く
			targetYear--;
			//月を表す変数に12か月分を足す
			targetMonth += 12;
		}
		//ツェラーの公式を用いて、対象の日付の曜日を表す整数値(int)を求めて返却する
		return (targetYear + targetYear / 4 - targetYear / 100 + targetYear / 400 + (13 * targetMonth + 8) / 5
				+ calendarDate)
				% 7;
	}

	/* 
	 * 関数名 equalTo
	 * 概要 インスタンスと引数が等しいかどうかを判定する(boolean)
	 * 引数 比較したいインスタンス(Day)
	 * 返り値 true、false
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public boolean equalTo(Day comparisonDay) {
		//インスタンスと引数の年、月、日の全てが同じならtrueを、そうでないならfalseを返却
		return (calendarYear == comparisonDay.calendarYear && calendarMonth == comparisonDay.calendarMonth
				&& calendarDate == comparisonDay.calendarDate);
	}

	/* 
	 * 関数名 toString
	 * 概要 設定されている年、月、日、曜日を1つの文字列として返却する
	 * 引数 なし
	 * 返り値 年、月、日、曜日を表した文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */

	public String toString() {
		//それぞれの曜日が入力されたString型の配列を生成
		String[] characterWeek = { "日", "月", "火", "水", "木", "金", "土" };
		//設定されている年、月、日、曜日を1つの文字列(String)として返却
		return String.format("%04d年%02d月%02d日(%s)", calendarYear, calendarMonth, calendarDate,
				characterWeek[dayOfWeek()]);

	}

	/* 
	 * 関数名 fixOutRangeMonth
	 * 概要 不正な月の値を修正して返却する
	 * 引数 1～12以外の範囲外の月の値(int)
	 * 返り値 1月、もしくは12月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public int fixOutRangeMonth(int errorMonth) {
		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;
		//不正な月の値が0以下の場合1月を、そうでない場合12月を返却する
		return (errorMonth <= 0 ? MONTH_JANUARY : MONTH_DECEMBER);
	}

	/* 
	 * 関数名 fixOutRangeDate
	 * 概要 不正な日の値を修正して返却する
	 * 引数 月の最大日数、月の値に対応した日数の範囲外の日の値(int)
	 * 返り値 1日、もしくはその月の最大の日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public int fixOutRangeDate(int maximumMonthDate, int errorDate) {
		//月の最小日数を表す定数を設定
		final int MINIMUM_DATE = 1;
		//不正な日の値が0以下の場合月の最小日数を、そうでない場合月の最大日数を返却
		return (errorDate <= 0 ? MINIMUM_DATE : maximumMonthDate);
	}
	/* 
	 * 関数名 getMuximumDate
	 * 概要 月の最大日数を返却する
	 * 引数 年、月(int)
	 * 返り値 対象の月の最大日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public int getMuximumDate(int year, int month) {
		//各月の最大日数を入力した配列を生成
		final int[] monthMaximumDateArray = { 31, (isLeap(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//求めたい月の最大日数を返却
		return monthMaximumDateArray[month - 1];
	}

	/* 
	 * 関数名 isLeapYear
	 * 概要 対象の年が閏年かどうかを判断するメソッド
	 * 引数 年(int)
	 * 返り値 閏年の場合true、そうでない場合false(boolean)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public static boolean isLeap(int variableYear) {
		//対象の年が閏年の条件に当てはまる場合true、そうでない場合falseを返却する
		return (variableYear % 4 == 0 && (variableYear % 100 != 0 || variableYear % 400 == 0) ? true : false);
	}

	/* 
	 * 関数名 countDateFromThisYearStarting
	 * 概要 年始から指定された日付までの経過日数を返却する
	 * 引数 年、月、日(int)
	 * 返り値 年始から指定された日付までの経過日数
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public int countDateFromThisYearStarting(int year, int month, int date) {
		//経過日数を表した変数を設定
		int totalDays = 0;
		//該当の月より前の月の日数を合計する
		for (int i = 0; i <= month - 1; i++) {
			//経過日数を表した変数に月の日数を加算
			totalDays += getMuximumDate(year,i);
		}
		//経過日数の合計に指定された月の経過日数を加算
		totalDays += date;
		//求めた日数を返却
		return totalDays;
	}

	/* 
	 * 関数名 countDaysUntilNextYear
	 * 概要 対象の日付から年内の残り日数を求める
	 * 引数 年、月、日(int)
	 * 返り値 年内の残り日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public int countDaysUntilNextYear(int year, int month, int date) {
		//対象の年の最大日数から、対象の日までの経過日数を引いた値を返却
		return ((isLeap(year) ? 366 : 365) - countDateFromThisYearStarting(year, month, date));
	}

}