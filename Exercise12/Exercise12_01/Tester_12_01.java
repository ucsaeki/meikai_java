package Exercise12.Exercise12_01;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_12_01
 * 概要 車の情報を入力させて表示し、車を移動させる
 * 作成者 Y.Saeki
 * 作成日 2024/05/27
 */
public class Tester_12_01 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 int型の正の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章(String)
	 * 返り値 正の整数値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/24
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表すint型変数を設定
		int variableNumber = 0;
		//int型の正の整数値で入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standardInput.nextInt();
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
	 * 引数 入力させたい実数値の内容を表す文章
	 * 返り値 double型の正の実数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static double inputRealNumber(String targetSubject) {
		//入力された値を表す変数を設定
		double variableNumber = 0;
		//正の整数値で入力させる
		for (; variableNumber <= 0;) {
			//入力させたい値の内容を表示
			System.out.print(targetSubject);
			//入力された値を読み込む
			variableNumber = standardInput.nextDouble();
			//入力された値が0以下だった場合
			if (variableNumber <= 0) {
				//0より大きい数値での入力を求めるエラー文を表示
				System.out.println("正の実数値を入力してください。");
			}
		} //入力された値を返却
		return variableNumber;
	}

	/* 
	 * 関数名 inputDay
	 * 概要 日付を入力させる
	 * 引数 入力させたい日付の内容を表す文字列(String)
	 * 返り値 日付(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/23
	 */
	public static Day inputDay(String targetSubject) {
		//入力させたい内容を表示
		System.out.println(targetSubject);
		//年を表す変数を設定し、入力させる(int)
		int variableYear = inputIntegralNumber("年：");
		//月を表す変数を設定し、入力させる(int)
		int variableMonth = inputMonth();
		//入力された日を表す変数を設定し、入力させる(int)
		int variableDate = inputDate(variableYear, variableMonth);
		//入力された年、月、日を用いてインスタンスを作成(Day)
		Day variableDay = new Day(variableYear, variableMonth, variableDate);
		//作成した日付を返却
		return variableDay;
	}

	/* 
	 * 関数名 inputMonth
	 * 概要 月を入力させる
	 * 引数 なし
	 * 返り値 月(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int inputMonth() {
		//入力された月を表す変数を設定(int)
		int variableMonth = 0;
		//1月を表す定数を設定
		final int MONTH_JANUARY = 1;
		//12月を表す定数を設定
		final int MONTH_DECEMBER = 12;

		//1～12月までの値を入力させる
		while (variableMonth < MONTH_JANUARY || variableMonth > MONTH_DECEMBER) {
			//変数に正の整数値を入力させる(int)
			variableMonth = inputIntegralNumber("月：");
			//入力値が12より大きい場合
			if (variableMonth > MONTH_DECEMBER) {
				//1～12までの値での入力を求めるエラー文章を表示
				System.out.println("1～12までの整数で入力してください。");
			}
		}
		//入力された月の値を返却する
		return variableMonth;
	}

	/* 
	 * 関数名 inputDate
	 * 概要 年と月に応じた日を入力させるメソッド
	 * 引数 年(int)、月(int)
	 * 返り値 日(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int inputDate(int variableYear, int variableMonth) {
		//関数を用いて、入力可能な日付の上限を求める
		int limitDate = monthMaximumDays(variableYear, variableMonth);
		//日を表す変数を設定
		int variableDate = 0;

		//1からその月の最大値までの値を入力させる
		while (variableDate <= 0 || variableDate > limitDate) {
			//変数に正の整数値を入力させる(int)
			variableDate = inputIntegralNumber("日：");
			//入力値がその月より大きい場合
			if (variableDate > limitDate) {
				//1～12までの値での入力を求めるエラー文章を表示
				System.out.println("1～" + limitDate + "までの整数で入力してください。");
			}
		}
		//入力された日を返却
		return variableDate;
	}

	/* 
	 * 関数名 monthMaximumDays
	 * 概要 引数の年と月に応じた月の最大日数を求めて返却する
	 * 引数 年、月(int)
	 * 返り値 月の最大日数(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/17
	 */
	public static int monthMaximumDays(int variableYear, int variableMonth) {
		//各月の最大日数を入力した配列を生成
		final int[] monthMaximumDaysArray = { 31, (isLeap(variableYear) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31 };
		//月の最大日数を表す変数に、配列内の対応する月の定数を代入
		int maximumDays = monthMaximumDaysArray[--variableMonth];
		//月の最大日数を表す変数を返却
		return maximumDays;
	}

	/* 
	 * 関数名 isLeap
	 * 概要 対象の年が閏年かどうかを判断するメソッド
	 * 引数 なし
	 * 返り値 閏年の場合true、そうでない場合false(boolean)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public static boolean isLeap(int variableYear) {
		//4で割り切れる、かつ100で割り切れないが400で割り切れる閏年の条件に合致する年数だった場合trueを、そうでない場合falseを返却
		return (variableYear % 4 == 0 && (variableYear % 100 != 0 || variableYear % 400 == 0) ? true : false);
	}

	/*
	 * 関数名 main
	 * 概要 車の情報を入力させて表示し、車を移動させる
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public static void main(String[] args) {
		//車のデータの入力を促す
		System.out.println("車のデータを入力してください。");

		//車の名前の入力を促す
		System.out.print("名前：");
		//車の名前を読み込む(String)
		String yourCarName = standardInput.next();
		//車のナンバーの入力を促す
		System.out.print("ナンバー：");
		//車のナンバーを入力させる(String)
		String yourCarNumber = standardInput.next();

		//車幅を表す変数を設定し、0より大きい値で入力させる(int)
		int yourCarWidth = inputIntegralNumber("車幅(mm)：");
		//高さを表す変数を設定し、0より大きい値で入力させる(int)
		int yourCarHeight = inputIntegralNumber("高さ(mm)：");
		//長さを表す変数を設定し、0より大きい値で入力させる(int)
		int yourCarLength = inputIntegralNumber("長さ(mm)：");

		//車の現在位置のX座標を表す変数を設定(double)
		double currentLocationX = 0;
		//車の現在位置のY座標を表す変数を設定(double)
		double currentLocationY = 0;

		//車の残燃料を0より大きい値で入力させる(double)
		double yourCarRestFuel = inputIntegralNumber("残燃料(L)：");
		//車の購入日を入力させ、その値を用いたインスタンスを作成(Day)
		Day yourCarPurchace = new Day(inputDay("車の購入日を入力してください。"));

		//車の総走行距離を表す変数を設定(double)
		double yourCarDrivingDistance = 0.0;

		//入力された情報を用いて、車の情報を表すインスタンスを生成(drivingDistanceCar)
		DrivingDistanceCar yourCar = new DrivingDistanceCar(yourCarName, yourCarNumber, yourCarWidth,
				yourCarHeight, yourCarLength, currentLocationX, currentLocationY, yourCarRestFuel, yourCarPurchace,
				yourCarDrivingDistance);

		//車のデータの表示を予告
		System.out.println("入力されたデータを表示します");
		//車のデータを表示
		System.out.println(yourCar);

		while (true) {
			//移動距離の入力を促す
			System.out.println("移動する座標を入力してください。");
			//x方向の移動距離の入力を促す
			System.out.print("x方向：");
			//入力を読み込む
			double distanceX = standardInput.nextDouble();
			//y方向の移動距離の入力を促す
			System.out.print("y方向：");
			//入力を読み込む
			double distanceY = standardInput.nextDouble();

			//x方向にもy方向にも移動しなかった場合
			if (distanceX == 0 && distanceY == 0) {
				//移動しなかったことを表示
				System.out.println("現在の地点から移動しませんでした。");
				//現在のx座標、y座標、残燃料、総走行距離を表示
				yourCar.printNeedMooving();

				//移動可能だった場合
			} else if (yourCar.canMoveCar(distanceX, distanceY)) {
				//移動距離を総走行距離に加算する
				yourCar.setDrivingDistance(distanceX, distanceY);
				//移動したことを表示
				System.out.println("移動しました。");
				//移動後のx座標、y座標、残燃料、総走行距離を表示
				yourCar.printNeedMooving();

				//移動不可能だった場合
			} else {
				//移動できなかったことを表示
				System.out.println("燃料が足りず、移動できませんでした。");
				//繰り返しを終了する
				break;
			}
		} //終了したことを表示
		System.out.println("移動を終了します。");

	}

}
