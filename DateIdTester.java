//Scannerクラスをインポート
import java.util.Scanner;

//Idクラスをインポート
import Id.DateId;

/* 
 * クラス名 DateIdTester
 * 概要 指定された人数分の識別番号を発行して表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/27
 */
public class DateIdTester {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 正の整数値を入力させる
	 * 引数 入力させたいint型の整数値の内容を表す文章(String)
	 * 返り値 正の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表す変数を設定(int)
		int variableNumber = 0;
		//正の整数値を入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表す文字列を表示
			System.out.print(targetSubject);
			//入力を読み込む
			variableNumber = standerdInput.nextInt();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//正の整数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 main
	 * 概要 指定された人数分の識別番号を発行して表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public static void main(String[] args) {
		//識別番号を発行することを予告
		System.out.println("本日の日付に対応した識別番号を発行します。");
		//識別番号を発行する人数を正の整数値で入力させる
		int peopleNumber = inputIntegralNumber("識別番号を発行する人数：");
		
		//入力された人数分識別番号を発行して表示
		for ( int i = 1; i <= peopleNumber; i++) {
			//識別番号を表すインスタンスを作成(DateId)
			DateId variableId = new DateId ();
			//インスタンスの識別番号を取得して表示。
			System.out.println(i + "人目の識別番号：" + variableId.getId());
		}

	}

}
