package Exercise12.Exercise12_02;

/* 
 * クラス名 BalanceAccount
 * 概要 定期預金を管理するAccountのサブクラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/28
 */
public class TimeAccount extends Account {
	//定期預金残高を表すフィールドを宣言
	private long timeBalance = 0;

	/* 
	 * コンストラクタ名 TimeAccount
	 * 概要 引数を指定しない場合、それぞれの値の初期値で初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public TimeAccount() {

	}

	/* 
	 * コンストラクタ名 TimeAccount
	 * 概要  口座名義、口座番号、預金残高、定期預金残高を入力してコンストラクタを初期化
	 * 引数 口座名義(String)、口座番号(String)、預金残高(long)、定期預金残高(long)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public TimeAccount(String userName, String userNo, long userBalance, long timeBalance) {
		//口座名義、口座番号、預金残高を表すフィールドをそれぞれ初期化
		super(userName, userNo, userBalance);
		//定期預金残高を表すフィールドを初期化
		this.timeBalance = timeBalance;
	}

	/* 
	 * 関数名 getTimeBalance
	 * 概要 定期預金残高を取得する
	 * 引数 なし
	 * 返り値 定期預金残高(long)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public long getTimeBalance() {
		//預金残高と定期預金残高の合計金額を返却
		return timeBalance;
	}
	/* 
	 * 関数名 cancelTimeBalance
	 * 概要 定期預金を解約して全額を普通預金に移す
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/28
	 */
	public void cancelTimeBalance() {
		//定期預金残高を普通預金に加算
		depositMoney(timeBalance);
		//定期預金残高を0にする。
		timeBalance = 0;
	}

	/* 
	 * 関数名 toString
	 * 概要  口座名義、口座番号、預金残高、定期預金残高を1つの文字列として返却する
	 * 引数 なし
	 * 返り値 口座名義、口座番号、預金残高、定期預金残高を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	@Override
	public String toString() {
		//口座名義、口座番号、預金残高、定期預金残高を表す文字列を返却する
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d円\n定期預金残高：%d円", userName, userNumber,
				userBalance, timeBalance);

	}

}
