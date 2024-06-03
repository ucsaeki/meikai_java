package Id;
//Calendarクラスを静的インポート
import static java.util.Calendar.*;

//GregorianCalendarクラスをインポート
import java.util.GregorianCalendar;

/* 
 * クラス名 DateId
 * 概要 識別番号を管理する
 * 作成者 Y.Saeki
 * 作成日 2024/05/27
 */
public class DateId {
	//最後に渡した識別番号を表す静的フィールドを宣言し、初期値を設定
	private static int counterNumber = 0;
	//識別番号を表すフィールドを宣言し、初期値を設定
	private int idNumber = 0;

	//本日の日付を表示するクラス初期化子を宣言
	static {
		//本日の日付を表すインスタンスを作成(GregorianCalendar)
		GregorianCalendar variableToday = new GregorianCalendar();
		//本日の年を取得する(int)
		int todayYear = variableToday.get(YEAR);
		//要素と実際の月の値のずれを修正するために1加算して求めた、本日の月を取得する(int)
		int todayMonth = variableToday.get(MONTH) + 1;
		//本日の日を取得する(int)
		int todayDate = variableToday.get(DATE);
		//本日の年月日を一つの文字列として表示
		System.out.printf("今日は%04d年%02d月%02d日です。\n", todayYear, todayMonth, todayDate);
		//下二桁を残して、年、月、日を一つの数字として表示するため、年を100000倍、月を10000倍、日を100倍して加算した値を、
		//識別番号を表す静的フィールドに初期値として代入
		counterNumber = todayYear * 100000 + todayMonth * 10000 + todayDate * 100;
	}

	/* 
	 * 関数名 DateId
	 * 概要 識別番号を初期化する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public DateId() {
		//識別番号を表すフィールドに、最後に渡した番号を表す静的フィールドの値を1加算した値で初期化
		idNumber = ++counterNumber;
	}

	/* 
	 * 関数名 getId
	 * 概要 識別番号を取得する
	 * 引数 なし
	 * 返り値 識別番号(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public int getId() {
		//識別番号を表すフィールドの値を返却する
		return idNumber;
	}
}
