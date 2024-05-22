package Exercise9.Exercise9_02;

/* 
 * クラス名 Day
 * 概要 日付を取得する日付クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/16
 */
public class Day {
	//年を表すフィールド(int)を宣言し、初期値を設定
	private int calendarYear = 1;
	//月を表すフィールド(int)を宣言し、初期値を設定
	private int calendarMonth = 1;
	//日を表すフィールド(int)を宣言し、初期値を設定
	private int calendarDate = 1;

	/* 
	 * コンストラクタ名 Day
	 * 概要 フィールド初期値のままコンストラクタを初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day() {

	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年を引数(int)の値で、月、日はフィールド初期値のままコンストラクタを初期化する
	 * 引数 年(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(int initialYear) {
		//年を表すフィールドを初期化(int)
		this.calendarYear = initialYear;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年と月を入力された値で、日をフィールド初期値のまま初期化する。
	 * 引数 年(int)、月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(int initialYear, int initialMonth) {
		//コンストラクタを使用して年を初期化
		this(initialYear);
		//月を表すフィールドを初期化(int)
		this.calendarMonth = initialMonth;
	}

	/* 
	 * コンストラクタ名 Day
	 * 概要 年(int)、月(int)、日(int)を初期化する
	 * 引数 年(int)、月(int)、日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public Day(int initialYear, int initialMonth, int initialdate) {
		//コンストラクタを使用して年(int)、月(int)を初期化
		this(initialYear, initialMonth);
		//日を表すフィールドを初期化(int)
		this.calendarDate = initialdate;
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
	public void setYear(int year) {
		//年を表すフィールドに年を表す引数を代入。
		this.calendarYear = year;
	}

	/* 
	 * 関数名 setMonth
	 * 概要 月を表すフィールドに代入するセッタ(int)
	 * 引数 月(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public void setMonth(int month) {
		//月を表すフィールドに月を表す引数を代入。
		this.calendarMonth = month;
	}

	/* 
	 * 関数名 setDay
	 * 概要 日を表すフィールドに代入するセッタ(int)
	 * 引数 日(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public void setDate(int date) {
		//日を表すフィールドに日を表す引数を代入。
		this.calendarDate = date;

	}
	/* 
	 * 関数名 setAllDate
	 * 概要 年、月、日を表すフィールドに代入するセッタ(int)
	 * 引数 年、月、日(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */

	public void setAllDate(int year, int month, int date) {
		//年を表すフィールドに年を表す引数を代入。
		this.calendarYear = year;
		//月を表すフィールドに月を表す引数を代入。
		this.calendarMonth = month;
		//日を表すフィールドに日を表す引数を代入。
		this.calendarDate = date;
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
			//月を表す変数に12を足す
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

	
	
	
	
	
	
	
}
