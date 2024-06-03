package Exercise12.Exercise12_01;

//Calendarクラスをstaticインポート
import static java.util.Calendar.*;

//GregorianCalendarクラスをインポート
import java.util.GregorianCalendar;

/* 
* クラス名 Day
* 概要 日付に関する情報を管理する日付クラス
* 作成者 Y.Saeki
* 作成日 2024/05/27
*/
public class Day {
	//最後に使用した年を表すクラス変数を設定し、初期値を代入(int)
	private static int lastYear = 1;
	//最後に使用した月を表すクラス変数を設定し、初期値を代入(int)
	private static int lastMonth = 1;
	//最後に使用した日を表すクラス変数を設定し、初期値を代入(int)
	private static int lastDate = 1;

	//本日の年を表すクラス変数を設定し、初期値を代入(int)
	private static int todayYear = 1;
	//本日の月を表すクラス変数を設定し、初期値を代入(int)
	private static int todayMonth = 1;
	//本日の日を表すクラス変数を設定し、初期値を代入(int)
	private static int todayDate = 1;

	//本日の日付を表示するクラス初期化子を宣言
	static {
		//本日の日付を表すインスタンスを作成(GregorianCalendar)
		GregorianCalendar variableToday = new GregorianCalendar();
		//本日の年を取得する(int)
		todayYear = variableToday.get(YEAR);
		//要素と実際の月の値のずれを修正するために1加算して求めた、本日の月を取得する(int)
		todayMonth = variableToday.get(MONTH) + 1;
		//本日の日を取得する(int)
		todayDate = variableToday.get(DATE);
	}

	//年を表すフィールドを宣言し、初期値として本日の年を設定(int)
	private int calendarYear = todayYear;
	//月を表すフィールドを宣言し、初期値として本日の月を設定(int)
	private int calendarMonth = todayMonth;
	//日を表すフィールドを宣言し、初期値として本日の日を設定(int)
	private int calendarDate = todayDate;

	/* 
	 * コンストラクタ名 Day
	 * 概要 コンストラクタを本日の日付で初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day() {

	}
	/* 
	 * コンストラクタ名 Day
	 * 概要 コンストラクタを年の値で初期化する
	 * 引数 年(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */

	public Day(int variableYear) {

		//最小の年を表す定数を設定
		final int MINIMUM_YEAR = 1;
		//引数の年が最小値より小さい場合
		if (variableYear < MINIMUM_YEAR) {
			//年を最小の年に修正する
			variableYear = MINIMUM_YEAR;
		}
		//修正後の年を最後に使用した年を表すクラス変数に代入
		lastYear = variableYear;
		//年を表すフィールドを初期化(int)
		this.calendarYear = lastYear;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 コンストラクタを年、月の値で初期化する
	 * 引数 年、月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public Day(int calendarYear, int calendarMonth) {
		//修正後の年を使用して年を初期化
		this(calendarYear);

		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;
		//月の値が1未満の場合
		if (calendarMonth < MONTH_JANUARY) {
			//月を1月に変更
			calendarMonth = MONTH_JANUARY;
		}
		//月の値が12より大きい場合
		if (calendarMonth > MONTH_DECEMBER) {
			//月を12月に変更
			calendarMonth = MONTH_DECEMBER;
		}
		//修正後の月を最後に使用した月を表すクラス変数に代入
		lastMonth = calendarMonth;
		//月を表すフィールドを初期化(int)
		this.calendarMonth = lastMonth;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 コンストラクタを年、月、日の値で初期化する
	 * 引数 年、月、日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public Day(int calendarYear, int calendarMonth, int calendarDate) {
		//コンストラクタを使用して年、月を初期化
		this(calendarYear, calendarMonth);

		//日の最小値を表す定数を設定
		final int MINIMUM_DATE = 1;
		//日の値が最小値以下の場合
		if (calendarDate < MINIMUM_DATE) {
			//日を最小値に変更
			calendarDate = MINIMUM_DATE;
		}
		//その月の最大日数を表す変数を設定し、不正修正後の値を使用して最大日数を代入
		int muximumDate = monthMaximumDays(lastYear, lastMonth);
		//日がその月の最大日数より大きい場合
		if (calendarDate > muximumDate) {
			//日をその月の最大日数に変更
			calendarDate = muximumDate;
		}
		//修正後の日を最後に使用した日を表すクラス変数に代入
		lastDate = calendarDate;
		//日を表すフィールドを初期化(int)
		this.calendarDate = lastDate;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年、月、日を別のコンストラクタの値を用いて初期化する
	 * 引数 年、月、日をもつコンストラクタ(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(Day anotherDay) {
		//年、月、日(int)に引数のインスタンスの値を入力して初期化(Day)
		this(anotherDay.calendarYear, anotherDay.calendarMonth, anotherDay.calendarDate);
	}

	/* 
	 * 関数名 getYear
	 * 概要 対象の年を取得する(int)
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
	 * 概要 対象の月を取得する(int)
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
	 * 概要 対象の年を取得する(int)
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
	 * 概要 年を表すフィールドに代入する
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
	 * 概要 月を表すフィールドに代入する
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
	 * 概要 日を表すフィールドに代入する
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
	 * 概要 年、月、日を表すフィールドに代入する
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
	 * 概要 ツェラーの公式を用いて、曜日を表す整数を求めて返却する
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
	 * 関数名 isDayEqual
	 * 概要 インスタンスと引数が等しいかどうかを判定する
	 * 引数 比較したいインスタンス(Day)
	 * 返り値 インスタンスと引数が等しい場合true、そうでない場合false(boolean)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public boolean isDayEqual(Day comparisonDay) {
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
	 * 関数名 monthMaximumDays
	 * 概要 引数の年と月に応じた月の最大日数を求めて返却する
	 * 引数 年、月(int)
	 * 返り値 月の最大日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public int monthMaximumDays(int variableYear, int variableMonth) {
		//各月の最大日数を入力した配列を生成
		final int[] monthMaximumDaysArray = { 31, (isLeap(variableYear) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31 };
		//月の最大日数を表す変数に、配列内の対応する月の定数を代入
		int maximumDays = monthMaximumDaysArray[--variableMonth];
		//月の最大日数を表す変数を返却
		return maximumDays;
	}

	/* 
	 * 関数名 isLeapYear
	 * 概要 対象の年が閏年かどうかを判断するメソッド
	 * 引数 なし
	 * 返り値 閏年の場合true、そうでない場合false(boolean)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public boolean isLeap(int variableYear) {
		//4で割り切れる、かつ100で割り切れないが400で割り切れる閏年の条件に合致する年数だった場合trueを、そうでない場合falseを返却
		return (variableYear % 4 == 0 && (variableYear % 100 != 0 || variableYear % 400 == 0) ? true : false);
	}

	/* 
	 * 関数名 countDateFromThisYearStarting
	 * 概要 年始からインスタンスの日付までの経過日数を返却する
	 * 引数 なし
	 * 返り値 年始からインスタンスの日付までの経過日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public int countDateFromThisYearStarting() {
		//経過した月数から対象の日付が存在する月を除外するための定数を設定
		final int EXCEPTION_MONTH = 1;
		//経過した日数から対象の日付が存在する日にちを除外するための定数を設定
		final int EXCEPTION_DATE = 1;
		//経過日数を表した変数を設定
		int totalDays = 0;
		//インスタンスの日付が存在する月より前の月の最大日数を合計する
		for (int i = EXCEPTION_MONTH; i < this.getMonth(); i++) {
			//経過日数を表した変数に月の日数を加算
			totalDays += monthMaximumDays(calendarYear, i);
		}
		//経過日数の合計に指定された月の経過日数を加算
		totalDays += this.getDate();
		//当日分の日付を含まないようにするため、当日の日にちを除外するための定数で減算
		totalDays -= EXCEPTION_DATE;
		//求めた日数を返却
		return totalDays;
	}

	/* 
	 * 関数名 countDateUntilNextYear
	 * 概要 対象の日付から年内の残り日数を求める
	 * 引数 日付(Day)
	 * 返り値 年内の残り日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public int countDateUntilNextYear(Day targetDay) {
		//通常の一年の日数を表す定数を設定
		final int YEAR_DATE_NUMBER = 365;
		//閏年の場合の一年の日数を表す定数を設定
		final int LEAP_YEAR_DATE_NUMBER = 366;
		//経過した日数から対象の日付が存在する日にちを除外するための定数を設定
		final int EXCEPTION_DATE = 1;

		//対象の年の最大日数から、対象の日までの経過日数と当日分を含まないようにするための1日分を引いた値を返却
		return ((isLeap(this.getYear()) ? LEAP_YEAR_DATE_NUMBER : YEAR_DATE_NUMBER)
				- targetDay.countDateFromThisYearStarting() - EXCEPTION_DATE);
	}

	/* 
	 * 関数名 daysRelation
	 * 概要 インスタンスが持つ日付と基準の日付の前後関係を表示する
	 * 引数 インスタンスの日付を表す文字列(String)、基準の日付(Day)、基準の日付の内容を表す文字列(String)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public void daysRelation(String nameStandard, Day conparisonDay, String nameConparison) {
		//インスタンスの年、月、日を持つインスタンスを作成(Day)
		Day i = new Day(calendarYear, calendarMonth, calendarDate);
		//インスタンスの日付と基準の日付の前後関係を表示
		daysRelation(i, nameStandard, conparisonDay, nameConparison);
	}

	/* 
	 * 関数名 daysRelation
	 * 概要 対象の日付と基準の日付の前後関係を表示する
	 * 引数 対象の日付(Day)、対象の日付を表す文字列(String)、基準の日付(Day)、基準の日付を表す文字列(String)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static void daysRelation(Day standardDay, String nameStandard, Day conparisonDay, String nameConparison) {
		//二つの日付の年数が同じ場合
		if (standardDay.getYear() == conparisonDay.getYear()) {
			//二つの日付の月数が同じ場合
			if (standardDay.getMonth() == conparisonDay.getMonth()) {
				//二つの日付の日数が同じ場合
				if (standardDay.getDate() == conparisonDay.getDate()) {
					//二つの日付が同じ日付であることを表示
					System.out.println("二つの日付は同じです。");
					//日数が異なる場合
				} else {
					//対象の日の方が基準の日より大きい場合後の日付であることを、そうでない場合前の日付であることを表示
					System.out.println(standardDay.getDate() > conparisonDay.getDate()
							? nameStandard + "は" + nameConparison + "より後の日付です。"
							: nameStandard + "は" + nameConparison + "より前の日付です。");
				}
				//月数が異なる場合
			} else {
				//対象の月の方が基準の月より大きい場合後の日付であることを、そうでない場合前の日付であることを表示
				System.out.println(standardDay.getMonth() > conparisonDay.getMonth()
						? nameStandard + "は" + nameConparison + "より後の日付です。"
						: nameStandard + "は" + nameConparison + "より前の日付です。");
			}
			//年数が異なる場合
		} else {
			//対象の年の方が基準の年より大きい場合後の日付であることを、そうでない場合前の日付であることを表示
			System.out.println(standardDay.getYear() > conparisonDay.getYear()
					? nameStandard + "は" + nameConparison + "より後の日付です。"
					: nameStandard + "は" + nameConparison + "より前の日付です。");
		}
	}

	/* 
	 * 関数名 setDayAfter
	 * 概要 インスタンスの日付を一つ後ろに進める
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public void setDayAfter() {
		//関数を用いて一つ後ろに進めた日付を取得。
		goAfterDay();
		//取得した日付をインスタンスに入力
		setAllDate(this.calendarYear, this.calendarMonth, this.calendarDate);
	}

	/* 
	 * 関数名 goAfterDay
	 * 概要 対象の日付の次の日の日付を返却する
	 * 引数 なし
	 * 返り値 対象の次の日の日付(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public Day goAfterDay() {
		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;
		//月の最小日数を表す定数を設定
		final int MINIMUM_DATE = 1;

		//対象の日付の日がその月の最大日数と同じ場合
		if (calendarDate == monthMaximumDays(calendarYear, calendarMonth)) {
			//その月が12月の場合
			if (calendarMonth == MONTH_DECEMBER) {
				//年を来年に変更
				calendarYear++;
				//月を1月に変更
				calendarMonth = MONTH_JANUARY;
				//月が12ではない場合
			} else {
				//月を来月に変更
				calendarMonth++;
			}
			//日を1日に変更
			calendarDate = MINIMUM_DATE;
			//日が月の最大日数と同じではない場合
		} else {
			//日を翌日に変更
			calendarDate++;
		}
		//翌日を表すインスタンスを作成(Day)
		Day afterDay = new Day(calendarYear, calendarMonth, calendarDate);
		//変更後の日付を返却
		return afterDay;
	}

	/* 
	 * 関数名 setDayBefore
	 * 概要 インスタンスの日付を一つ前に戻す
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public void setDayBefore() {
		//関数を用いて一つ後ろに進めた日付を取得
		goBeforeDay();
		//取得した日付をインスタンスに入力
		setAllDate(this.calendarYear, this.calendarMonth, this.calendarDate);
	}

	/* 
	 * 関数名 goBeforeDay
	 * 概要 対象の日付の前の日の日付を返却する
	 * 引数 なし
	 * 返り値 対象の前の日の日付(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public Day goBeforeDay() {
		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;
		//月の最小日数を表す定数を設定
		final int MINIMUM_DATE = 1;
		//対象の日付の日が月の一番最初の日だった場合
		if (calendarDate == MINIMUM_DATE) {
			//その月が1月の場合
			if (calendarMonth == MONTH_JANUARY) {
				//その年が1の場合
				if (calendarYear == 1) {
					//その日付より前に戻れないことを表示。
					System.out.println("表示可能な最も前の日に到達したので、その日付を表示します。");
					//年が1ではない場合
				} else {
					//年を前年に変更
					calendarYear--;
					//月を12月に変更
					calendarMonth = MONTH_DECEMBER;
					//日を更新後の月の最大日数の値に変更
					calendarDate = monthMaximumDays(calendarYear, calendarMonth);
				}
				//その月が1月でない場合
			} else {
				//月を前月に変更
				calendarMonth--;
				//日を更新後の月の最大日数の値に変更
				calendarDate = monthMaximumDays(calendarYear, calendarMonth);
			}
			//日が月の最小日数ではない場合
		} else {
			//日を前日に変更
			calendarDate--;
		}
		//前日を表すインスタンスを作成(Day)
		Day BeforeDay = new Day(calendarYear, calendarMonth, calendarDate);
		//変更後の日付を返却
		return BeforeDay;
	}

	/* 
	 * 関数名 setMultipulAfterDay
	 * 概要 指定した日数分日付を後ろに進める
	 * 引数 後ろに進めたい日数(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public void setMultipulAfterDay(int dateNumber) {
		//関数を用いて指定した日数後ろに進めた日付を取得
		goMultipulAfterDay(dateNumber);
		//取得した日付をインスタンスに入力
		setAllDate(this.calendarYear, this.calendarMonth, this.calendarDate);

	}

	/* 
	 * 関数名 goMultipulDayAfter
	 * 概要 対象の日付の、指定した日数日後の日付を返却する
	 * 引数 何日後かを指定する値(int)
	 * 返り値 指定した値日後の日付(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public Day goMultipulAfterDay(int dateNumber) {
		//インスタンスと同じ日付を持つインスタンスを作成(Day)
		Day variableAfterDay = new Day(calendarYear, calendarMonth, calendarDate);
		//指定した日数分日付を進める
		for (int i = dateNumber; i > 0; i--) {
			//関数を用いて求めた日付を代入する
			variableAfterDay = goAfterDay();
		}
		//指定した日数後の日付を返却
		return variableAfterDay;
	}

	/* 
	 * 関数名 setMultipulBeforeDay
	 * 概要 指定した日数分日付を前に戻す
	 * 引数 前に戻したい日数(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public void setMultipulBeforeDay(int dateNumber) {
		//関数を用いて指定した日数前に進めた日付を取得
		goMultipulBeforeDay(dateNumber);
		//取得した日付をインスタンスに入力
		setAllDate(this.calendarYear, this.calendarMonth, this.calendarDate);
	}

	/* 
	 * 関数名 goMultipulBeforeDay
	 * 概要 対象の日付の、指定した日数分前の日付を返却する
	 * 引数 何日前かを指定する値(int)
	 * 返り値 指定した日数分前の日付(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public Day goMultipulBeforeDay(int dateNumber) {
		//最小の年を表す定数を設定
		final int YEAR_MINIMUM = 1;
		//最小の月を表す定数を設定
		final int MONTH_MINIMUM = 1;
		//最小の日を表す定数を設定
		final int DATE_MINIMUM = 1;

		//最も最小の日付を表すインスタンスを作成(Day)
		final Day MINIMUM_DAY = new Day(YEAR_MINIMUM, MONTH_MINIMUM, DATE_MINIMUM);
		//関数を起動したインスタンスと同じ日付を持つインスタンスを作成(Day)
		Day variableBeforeDay = new Day(calendarYear, calendarMonth, calendarDate);
		//指定した日数分日付を戻す
		for (int i = dateNumber; i > 0; i--) {
			//最も最小の日付に到達した場合
			if (variableBeforeDay.getYear() == MINIMUM_DAY.getYear() &&
					variableBeforeDay.getMonth() == MINIMUM_DAY.getMonth() &&
					variableBeforeDay.getDate() == MINIMUM_DAY.getDate()) {
				//その日付より前に戻れないことを表示。
				System.out.println("表示可能な最も前の日に到達したので、その日付を表示します。");
				//繰り返しを終了する
				break;
			}
			//関数を用いて求めた日付を代入する
			variableBeforeDay = goBeforeDay();
		}
		//指定した日数分前の日付を返却
		return variableBeforeDay;
	}

}
