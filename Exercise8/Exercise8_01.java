package Exercise8;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Exercise8_01
 * 概要 入力された名前、身長、体重、年齢、性別の情報を表示し、BMIを求める
 * 作成者 Y.Saeki
 * 作成日 2024/05/10
 */
public class Exercise8_01 {
	/* 
	 * 関数名 main
	 * 概要 名前、身長、体重、年齢、性別の情報を入力させ、その情報とBMIを表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/10
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//情報の入力を促す文章を表示
		System.out.println("あなたの情報を入力してください。");
		//名前の入力を促す
		System.out.print("名前：");
		//入力を読み込む
		String yourName = standerdInput.next();

		//身長を表す変数を設定
		double yourHeight = 0;
		//正しい身長を入力させる
		for (; yourHeight <= 0;) {
			//身長の入力を促す
			System.out.print("身長(cm)：");
			//入力を読み込む
			yourHeight = standerdInput.nextDouble();
			//入力された値が0以下の場合
			if (yourHeight <= 0) {
				//正しい値の入力を求めるエラー文章を表示。
				System.out.println("正しい身長を入力してください。");
			}
		}

		//体重を表す変数を設定
		double yourWeight = 0;
		//正しい体重を入力させる
		for (; yourWeight <= 0;) {
			//体重の入力を促す
			System.out.print("体重(kg)：");
			//入力を読み込む
			yourWeight = standerdInput.nextDouble();
			//入力された値が0以下の場合
			if (yourWeight <= 0) {
				//正しい値の入力を求めるエラー文章を表示。
				System.out.println("正しい体重を入力してください。");
			}
		}

		//年齢を表す変数を設定
		int yourAge = 0;
		//年齢の範囲外の値を表す定数を設定
		final int OUT_RANGE_AGE = -1;
		//年齢を表す変数に範囲外の値を代入
		yourAge = OUT_RANGE_AGE;

		//正しい年齢を入力させる
		for (; yourAge < 0;) {
			//年齢の入力を促す
			System.out.print("年齢：");
			//入力を読み込む
			yourAge = standerdInput.nextInt();
			//入力された値が0より小さい場合
			if (yourAge < 0) {
				//正しい値の入力を求めるエラー文章を表示。
				System.out.println("正しい年齢を入力してください。");
			}
		}

		//性別の入力を促す
		System.out.print("性別：");
		//入力を読み込む
		String yourGender = standerdInput.next();

		//入力された値を用いてHumanClassのインスタンスを作成
		HumanClass yourStatus = new HumanClass(yourName, yourHeight, yourWeight, yourAge, yourGender);

		//改行する
		System.out.println();

		//情報を表示することを予告
		System.out.println("入力された情報を表示します。");
		//関数を用いて、名前、身長、体重、年齢、性別を表示
		yourStatus.printAllStatus();

		//BMIを表示することを予告
		System.out.println("あなたのBMIを算出しました。");
		//関数を用いて求めたBMIの値を表示
		yourStatus.printBMI();

	}

}
