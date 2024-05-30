
package Exercise9.Exercise9_04;

/**
 * 人のステータスを管理する人間クラス
 * @author Y.Saeki
 * @see Object
 */
public class Human {
	/**
	 * 名前を表すフィールド
	 * @author Y.Saeki
	 */
	public String humanName = "";
	/**
	 * 身長を表すフィールド
	 * @author Y.Saeki
	 */
	public double humanHeight = 0.0;
	/**
	 * 体重を表すフィールド
	 * @author Y.Saeki
	 */
	public double humanWeight = 0.0;
	/**
	 * 年齢を表すフィールド
	 * @author Y.Saeki
	 */
	public int humanAge = 0;
	/**
	 * 性別を表すフィールド
	 * @author Y.Saeki
	 */
	public String humanGender = "";
	/**
	 * 誕生日を表すフィールド
	 * @author Y.Saeki
	 */
	public Day humanBirthday = new Day();

	/**
	 * 名前、身長、体重、年齢、性別、誕生日を表すコンストラクタを初期化する
	 * @author Y.Saeki
	 * @param humanName 名前
	 * @param humanHeight 身長
	 * @param humanWeight 体重
	 * @param humanAge 年齢
	 * @param humanGender 性別
	 * @param yourBirthday 誕生日
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

	/**
	 * 対象の名前を取得する
	 * @author Y.Saeki
	 * @return humanName 名前
	 */
	public String getHumanName() {
		//対象の名前を表す変数を返却
		return humanName;
	}

	/**
	 * 対象の身長を取得する
	 * @author Y.Saeki
	 * @return humanHeight 身長
	 */

	public double getHumanHeight() {
		//対象の身長を表す変数を返却
		return humanHeight;
	}

	/**
	 * 対象の体重を取得する
	 * @author Y.Saeki
	 * @return humanWeight 体重
	 */
	public double getHumanWeight() {
		//対象の体重を表す変数を返却
		return humanWeight;
	}

	/**
	 * 対象の年齢を取得する
	 * @author Y.Saeki
	 * @return humanAge 年齢
	 */
	public int getHumanAge() {
		//対象の年齢を表す変数を返却
		return humanAge;
	}

	/**
	 * 対象の性別を取得する
	 * @author Y.Saeki
	 * @return humanGender 性別
	 */
	public String getHumanGender() {
		//対象の性別を表す変数を返却
		return humanGender;
	}

	/**
	 * 対象の誕生日を取得する
	 * @author Y.Saeki
	 * @return humanBirthday 誕生日
	 */
	public Day getHumanBirthDay() {
		//誕生日を表す変数を返却
		return humanBirthday;
	}

	/**
	 * 対象の人の全ての情報を表示する
	 * @author Y.Saeki
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

	/**
	 * 名前、身長、体重、年齢、性別、誕生日を表す文字列を返却する
	 * @author Y.Saeki
	 * @return 名前、身長、体重、年齢、性別、誕生日を表す文字列
	 */
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

}