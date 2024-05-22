package Exercise9.Exercise9_01;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 TesterClass_9_01
 * 概要 3人の情報を入力したHuman型配列と、指定した人数分の情報を入力したHuman型配列のそれぞれの全ての要素を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/16
 */
public class TesterClass_9_01 {

	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 int型の正の整数値を入力させる
	 * 引数 入力させたいint型の整数値の内容を表すString型の文章
	 * 返り値 int型の正の整数値
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
	 * 関数名 inputRealNumber
	 * 概要 double型の正の実数値を入力させる
	 * 引数 入力させたいdouble型実数値の内容を表すString型の文章
	 * 返り値 double型の正の実数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static double inputRealNumber(String targetSubject) {
		//入力された値を表すdouble型変数を設定
		double variableNumber = 0;
		//正の実数値で入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standerdInput.nextDouble();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の実数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 printHumanArray
	 * 概要 Human型の配列の全ての要素を表示する
	 * 引数 Human型の配列、その配列の名前を表すString型の文章
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/16
	 */
	static void printHumanArray(Human[] variableArray, String arrayName) {
		//配列の全ての要素を表示する
		for (int i = 0; i < variableArray.length; i++) {
			//配列の名前と対象の名前を表す要素を表示
			System.out.print(arrayName + "[" + i + "] = { " + variableArray[i].getHumanName() + " , ");
			//身長を表示
			System.out.print(variableArray[i].getHumanHeight() + " , ");
			//体重を表示
			System.out.print(variableArray[i].getHumanWeight() + " , ");
			//年齢を表示
			System.out.print(variableArray[i].getHumanAge() + " , ");
			//性別を表示
			System.out.println(variableArray[i].getHumanGender() + " }");
		}
	}

	/* 
	 * 関数名 main
	 * 概要 3人分の情報を持つHuman型配列と、指定した人数分の情報を持つHuman型配列を作成してそれぞれ表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/14
	 */
	public static void main(String[] args) {
		//作成する配列の説明を表示
		System.out.println("3人の情報が入力された配列を作成します。");

		//1人目の情報の入力を促す
		System.out.println("1人目の情報を入力してください。");
		//名前の入力を促す
		System.out.print("名前：");
		//String型の変数に入力を読み込む
		String firstPeopleName = standerdInput.next();
		//double型の正の実数で身長を入力させる
		double firstPeopleHeight = inputRealNumber("身長(mm)：");
		//double型の正の実数で体重を入力させる
		double firstPeopleWeight = inputRealNumber("体重(kg)：");
		//int型の正の整数で年齢を入力させる
		int firstPeopleAge = inputIntegralNumber("年齢：");
		//性別の入力を促す
		System.out.print("性別：");
		//String型の変数に入力を読み込む
		String firstPeopleGender = standerdInput.next();

		//2人目の情報の入力を促す
		System.out.println("2人目の情報を入力してください。");
		//名前の入力を促す
		System.out.print("名前：");
		//String型の変数に入力を読み込む
		String secondPeopleName = standerdInput.next();
		//double型の正の実数で身長を入力させる
		double secondPeopleHeight = inputRealNumber("身長(mm)：");
		//double型の正の実数で体重を入力させる
		double secondPeopleWeight = inputRealNumber("体重(kg)：");
		//int型の正の整数で年齢を入力させる
		int secondPeopleAge = inputIntegralNumber("年齢：");
		//性別の入力を促す
		System.out.print("性別：");
		//String型の変数に入力を読み込む
		String secondPeopleGender = standerdInput.next();

		//3人目の情報の入力を促す
		System.out.println("3人目の情報を入力してください。");
		//名前の入力を促す
		System.out.print("名前：");
		//String型の変数に入力を読み込む
		String thirdPeopleName = standerdInput.next();
		//double型の正の実数で身長を入力させる
		double thirdPeopleHeight = inputRealNumber("身長(mm)：");
		//double型の正の実数で体重を入力させる
		double thirdPeopleWeight = inputRealNumber("体重(kg)：");
		//int型の正の整数で年齢を入力させる
		int thirdPeopleAge = inputIntegralNumber("年齢：");
		//性別の入力を促す
		System.out.print("性別：");
		//String型の変数に入力を読み込む
		String thirdPeopleGender = standerdInput.next();

		//入力された3人分の情報を初期値としたHuman型配列を作成
		Human[] initializedArray = {
				new Human(firstPeopleName, firstPeopleHeight, firstPeopleWeight, firstPeopleAge, firstPeopleGender),
				new Human(secondPeopleName, secondPeopleHeight, secondPeopleWeight, secondPeopleAge,
						secondPeopleGender),
				new Human(thirdPeopleName, thirdPeopleHeight, thirdPeopleWeight, thirdPeopleAge, thirdPeopleGender),
		};

		//2つ目の配列を作成することを表示
		System.out.println("2つ目の配列を作成します。");

		//情報を入力する人数を表す変数を設定し、int型の正の整数値で入力させる
		int peopleNumber = inputIntegralNumber("入力する人数：");

		//入力された人数を要素数としたHuman型配列を生成。
		Human[] assignArray = new Human[peopleNumber];
		
		//表示を行った回数を表すint型変数を設定し、初期値に1回目であることを入力
		int peopleCount = 1;
		
		//Human型配列の全ての要素に入力させる
		for (int i = 0; i < assignArray.length; i++, peopleCount++) {
			//対象の人間の情報の入力を促す
			System.out.println( peopleCount + "番目の人の情報を入力してください。");

			//名前の入力を促す
			System.out.print("名前：");
			//String型の変数に入力を読み込む
			String peopleName = standerdInput.next();
			//double型の正の実数で身長を入力させる
			double peopleHeight = inputRealNumber("身長：");
			//double型の正の実数で体重を入力させる
			double peopleWeight = inputRealNumber("体重：");
			//int型の正の整数で年齢を入力させる
			int peopleAge = inputIntegralNumber("年齢：");
			//性別の入力を促す
			System.out.print("性別：");
			//String型の変数に入力を読み込む
			String peopleGender = standerdInput.next();

			//入力された値を用いて作成したインスタンスをHuman型配列の要素に代入
			assignArray[i] = new Human(peopleName, peopleHeight, peopleWeight, peopleAge, peopleGender);
			
		}

		//1つ目の配列の表示を予告
		System.out.println("1つ目の配列を表示します。");
		//関数を用いて1つ目のHuman型配列を表示
		printHumanArray(initializedArray, "initializedArray");

		//2つ目の配列の表示を予告
		System.out.println("2つ目の配列を表示します。");
		//関数を用いて2つ目のHuman型配列を表示
		printHumanArray(assignArray, "assignArray");

	}

}
