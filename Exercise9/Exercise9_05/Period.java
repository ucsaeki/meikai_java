package Exercise9.Exercise9_05;

/* 
 * クラス名 Period
 * 概要 期間を表すPeriodクラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/21
 */
public class Period {
	//開始日を表すフィールドを設定
	private Day from;
	//終了日を表すフィールドを設定
	private Day to;

	/* 
	 * コンストラクタ名 Period
	 * 概要 開始日、終了日を表すフィールドを初期化する
	 * 引数 期間の開始日、終了日(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public Period(Day from, Day to) {
		//開始日を表すフィールドを初期化
		this.from = from;
		//終了日を表すフィールドを初期化
		this.to = to;
	}

	/* 
	 * 関数名 toString
	 * 概要 開始日と終了日を1つの文字列として返却する
	 * 引数 なし
	 * 返り値 開始日と終了日を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public String toString() {
		//開始日と終了日を返却する
		return String.format("開始日：%s\n終了日：%s", from, to);
	}
}
