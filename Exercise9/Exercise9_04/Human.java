package Exercise9.Exercise9_04;

/* 
 * クラス名 Human
 * 概要 人のステータスを管理する人間クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/20
 */
public class Human {

	//名前を表すフィールドを宣言し、入力されていないことを表す文字列を代入(String)
	private String humanName = ("No Name");
	//身長を表すフィールドを宣言(double)
	private double humanHeight = 0.0;
	//体重を表すフィールドを宣言(double)
	private double humanWeight = 0.0;
	//年齢を表すフィールドを宣言(int)
	private int humanAge = 0;
	//性別を表すフィールドを宣言し、入力されていないことを表す文字列を代入(String)
	private String humanGender = ("No Gender");
	//誕生日の日付を表すフィールドを宣言しDayクラスのインスタンスを代入
	private Day humanBirthday = new Day();
	/* 
	 * 関数名 Human
	 * 概要 名前、身長、体重、年齢、性別、誕生日をコンストラクタを初期化
	 * 引数 名前(String)、身長(double)、体重(double)、年齢(int)、性別(String)、誕生日(Day)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public Human(String humanName, double humanHeight, double humanWeight, int humanAge, String humanGender,
			Day yourBirthday) {
		//名前を表すフィールドを初期化
		this.humanName = humanName;
		//身長を表すフィールドを初期化
		this.humanHeight = humanHeight;
		//体重を表すフィールドを初期化
		this.humanWeight = humanWeight;
		//年齢を表すフィールドを初期化
		this.humanAge = humanAge;
		//性別を表すフィールドを初期化
		this.humanGender = humanGender;
		//誕生日を表すフィールドを初期化
		this.humanBirthday = yourBirthday;
	}

	/* 
	 * 関数名 getHumanName
	 * 概要 対象の名前(String)を取得するゲッタ
	 * 引数 なし
	 * 返り値 名前(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public String getHumanName() {
		//対象の名前を表す変数を返却
		return humanName;
	}

	/* 
	 * 関数名 getHumanHeight
	 * 概要 対象の身長(double)を取得するゲッタ
	 * 引数 なし
	 * 返り値 身長(double)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public double getHumanHeight() {
		//対象の身長を表す変数を返却
		return humanHeight;
	}

	/* 
	 * 関数名 getHumanWeight
	 * 概要 対象の体重(double)を取得するゲッタ
	 * 引数 なし
	 * 返り値 体重(double)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public double getHumanWeight() {
		//対象の体重を表す変数を返却
		return humanWeight;
	}

	/* 
	 * 関数名 getHumanAge
	 * 概要 対象の年齢(int)を取得するゲッタ
	 * 引数 なし
	 * 返り値 年齢(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public int getHumanAge() {
		//対象の年齢を表す変数を返却
		return humanAge;
	}

	/* 
	 * 関数名 getHumanGender
	 * 概要 対象の性別(String)を取得するゲッタ
	 * 引数 なし
	 * 返り値 性別(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	public String getHumanGender() {
		//対象の性別を表す変数を返却
		return humanGender;
	}

	/* 
	 * 関数名 getHumanBirthDay
	 * 概要 誕生日を表す変数を返却する
	 * 引数 なし
	 * 返り値 誕生日(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public Day getHumanBirthDay() {
		//誕生日を表す変数を返却
		return humanBirthday;
	}

	/* 
	 * 関数名 printAllStatus
	 * 概要 対象の人の全ての情報を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/10
	 */
	void printAllStatus() {
		//名前を表示
		System.out.println("名前：" + humanName);
		//身長を表示
		System.out.println("身長：" + humanHeight + " cm");
		//体重を表示
		System.out.println("体重：" + humanWeight + " kg");
		//年齢を表示
		System.out.println("年齢：" + humanAge + " 歳");
		//性別を表示
		System.out.println("性別：" + humanGender);
		//誕生日を表示
		System.out.println("誕生日：" + humanBirthday);
	}

	/* 
	 * 関数名 toString
	 * 概要 名前、身長、体重、年齢、性別、誕生日を表す文字列を返却する
	 * 引数 なし
	 * 返り値 名前、身長、体重、年齢、性別、誕生日を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/20
	 */
	public String toString() {
		//名前、身長、体重、年齢、性別、誕生日を表す文字列を返却する
		return String.format("名前：%s\n身長：%3.1f cm\n体重：%3.1f kg\n年齢：%1d歳\n性別：%s\n誕生日：%s ",
				humanName, humanHeight, humanWeight, humanAge, humanGender, humanBirthday);
	}

	/* 
	 * 関数名 printBMI
	 * 概要 対象の人の身長と体重を用いてBMIの値を算出し表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/10
	 */
	void printBMI() {
		//BMIで肥満型と判断される最小の値を表す定数を設定
		final int BMI_OBESITY = 25;
		//BMIでやせ型と判断される最高の値を表すdouble型の定数を設定
		final double BMI_THINNESS = 18.5;
		//長さのcm表記をm表記に変換するために使用する定数を設定
		final int CONVERSION_METERS = 100;

		//対象の人の身長と体重からBMIを求める
		double variavleBMI = (humanWeight / ((humanHeight / CONVERSION_METERS) * (humanHeight / CONVERSION_METERS)));
		//BMIの値を表示
		System.out.println(humanName + "さんのBMIは、" + (float) variavleBMI + "です。");
		//BMIがやせ型を表す定数の値より小さい場合
		if (variavleBMI < BMI_THINNESS) {
			//やせ型であることを表示
			System.out.println(humanName + "さんは痩せ型です。");
		} //BMIがやせ型を表す定数の値以上かつ肥満型を表す定数の値未満の場合
		else if (variavleBMI >= BMI_THINNESS && variavleBMI < BMI_OBESITY) {
			//適正体重であることを表示
			System.out.println(humanName + "さんは適正体重です。");
		} //BMIが肥満型を表す定数の値以上の場合
		else if (variavleBMI >= BMI_OBESITY) {
			//BMIが肥満型であることを表示
			System.out.println(humanName + "さんは肥満です。");
		}

	}

}
