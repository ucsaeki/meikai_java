package Exercise10.Exercise10_01;
//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Ex10_01_Tester
 * 概要 入力した人数分の識別番号を発行し、それを表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/21
 */
public class Ex10_01_Tester {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);
	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 int型の正の整数値を入力させる
	 * 引数 入力させたいint型の整数値の内容を表すString型の文章
	 * 返り値 int型の正の整数値5
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表すint型変数を設定
		int variableNumber = 0;
		//int型の正の整数値で入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standerdInput.nextInt();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の整数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 main
	 * 概要 入力した人数分の識別番号を発行し、それを表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public static void main(String[] args) {
		//識別番号を発行する人数を正の整数値で入力させる
		int peopleNumber = inputIntegralNumber("識別番号を発行する人数：");
		//指定した人数分の名前を入力させ、識別番号を発行する
		for ( int i = 0; i < peopleNumber;i++) {
			//名前の入力を促す
			System.out.print("発行する人の名前：");
			//入力を読み込む
			String peopleName = standerdInput.next();
			//Idクラスのインスタンスを作成
			Id issueNumber = new Id();
			//個人のインスタンスに対して発行された識別番号を表示
			System.out.println(peopleName + "さんの識別番号：" + issueNumber.getId());
			//最後に与えた識別番号を表示
			System.out.println("最後に与えた識別番号は：" + issueNumber.getMaxId() );
		}

	}

}
