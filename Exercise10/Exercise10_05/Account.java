package Exercise10.Exercise10_05;

/* 
 * クラス名 Account
 * 概要 利用者の情報を管理する銀行口座クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/20
 */
public class Account {
	//口座名義を表すフィールドに名前がないことを表す文字列を設定
	private String userName = ("No Name");
	//口座番号を表すフィールドに番号がないことを表す文字列を設定
	private String userNumber = ("No Number");
	//利用者の預金残高を表すフィールドに0を設定
	private long userBalance = 0;
	
	{
		//インスタンス初期化子を用いて、インスタンス作成ごとに文字列を表示(String)
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	/* 
	 * コンストラクタ名 Account
	 * 概要 口座名義を入力してコンストラクタを初期化
	 * 引数 口座名義(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public Account(String userName) {
		//口座名義を入力して初期化
		this.userName = userName;
	}

	/* 
	 * コンストラクタ名  Account
	 * 概要 口座名義、口座番号を入力してコンストラクタを初期化
	 * 引数 口座名義(String)、口座番号(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public Account(String userName, String userNumber) {
		//コンストラクタから口座名義を呼び出し
		this(userName);
		//口座番号を初期化
		this.userNumber = userNumber;

	}

	/* 
	 * コンストラクタ名  Account
	 * 概要 口座名義、口座番号、預金残高を入力してコンストラクタを初期化
	 * 引数 口座名義(String)、口座番号(String)、預金残高(long)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public Account(String userName, String userNo, long userBalance) {
		//口座名義、口座番号を呼び出し
		this(userName, userNo);
		//預金残高を初期化
		this.userBalance = userBalance;
	}

	/* 
	 * 関数名 getName
	 * 概要 口座名義を返却する
	 * 引数 なし
	 * 返り値 口座名義(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public String getName() {
		//口座名義を返却
		return userName;
	}

	/* 
	 * 関数名 getNumber
	 * 概要 口座番号を返却する
	 * 引数 なし
	 * 返り値 口座番号(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public String getNumber() {
		//利用者番号を返却
		return userNumber;
	}

	/* 
	 * 関数名 getBalance
	 * 概要 利用者の口座残高を返却する
	 * 引数 なし
	 * 返り値 利用者の口座残高(long)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public long getBalance() {
		//利用者の口座残高を返却
		return userBalance;
	}
	
	/* 
	 * 関数名 depositMoney
	 * 概要 指定した金額を預ける
	 * 引数 預ける金額(long)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public void depositMoney(long amountOfMoney) {
		//口座残高に預ける金額を加算
		userBalance += amountOfMoney;
	}

	/* 
	 * 関数名 withdrawMoney
	 * 概要 指定した金額を引き出す
	 * 引数 引き出す金額(long)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public void withdrawMoney(long amountOfMoney) {
		//口座残高から引き出す金額を減算
		userBalance -= amountOfMoney;
	}
	/* 
	 * 関数名 toString
	 * 概要  口座名義、口座番号、預金残高を1つの文字列として返却する
	 * 引数 なし
	 * 返り値 口座名義、口座番号、預金残高を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public String toString() {
		//口座名義、口座番号、預金残高を表す文字列を返却する
		return String.format("口座名義：%s\n口座番号：%s\n預金残高：%d円",userName, userNumber, userBalance);

	}

}

