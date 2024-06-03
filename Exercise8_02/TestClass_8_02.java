package Exercise8_02;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 TestClass_8_02
 * 概要 対話的に車を移動させる
 * 作成者 Y.Saeki
 * 作成日 2024/05/13
 */
public class TestClass_8_02 {
	//Scannerクラスに変数を設定。
	static Scanner standerdInput = new Scanner(System.in);

	/* 
	 * 関数名 inputIntegralNumber
	 * 概要 int型の正の整数値を入力させる
	 * 引数 入力させたい整数値の内容を表す文章
	 * 返り値 int型の正の整数値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static int inputIntegralNumber(String targetSubject) {
		//入力された値を表す変数を設定
		int variableNumber = 0;
		//正の整数値で入力させる
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
	 * 関数名 main
	 * 概要 車のデータを入力し、そのデータを持つ車を移動させる
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public static void main(String[] args) {
		//車のデータの入力を促す
		System.out.println("車のデータを入力してください。");
		//車の名前の入力を促す
		System.out.print("名前は：");
		//車の名前を読み込む
		String yourCarName = standerdInput.next();
		//車のナンバーの入力を促す
		System.out.print("ナンバーは：");
		//車のナンバーを入力させる
		String yourCarNumber = standerdInput.next();

		//車幅,を表す変数を設定
		int yourCarWidth = 0;
		//車幅を0より大きい値で入力させる
		yourCarWidth = inputIntegralNumber("車幅は(mm)：");
		//高さを表す変数を設定
		int yourCarHeight = 0;
		//高さを0より大きい値で入力させる
		yourCarHeight = inputIntegralNumber("高さは(mm)：");
		//長さを表す変数を設定
		int yourCarLength = 0;
		//長さを0より大きい値で入力させる
		yourCarLength = inputIntegralNumber("長さは(mm)：");
		//タンク容量を表す変数を設定
		double yourCarMuximumFuel = 0;
		//タンク容量を0より大きい値で入力させる
		yourCarMuximumFuel = inputRealNumber("タンク容量は(L)：");

		//タンク容量の最大値を越えた値を作成するための定数を設定
		final int OVER_MUXIMUM = 1;
		//ガソリンの初期値を表す変数を設定
		double yourCarRestFuel = yourCarMuximumFuel + OVER_MUXIMUM;
		//0より大きくタンク容量以下の値でガソリンの初期値を入力させる
		for (; yourCarRestFuel > yourCarMuximumFuel;) {
			//ガソリンの初期量を0より大きい値で入力させる
			yourCarRestFuel = inputRealNumber("ガソリンの初期量は(L)：");
			//初期値の値がタンク容量の最大値より大きい場合
			if (yourCarRestFuel > yourCarMuximumFuel) {
				//タンク容量以下の値の入力を求めるエラー文章を表示
				System.out.print("タンク容量以下の値を入力してください。");
			}
		}

		//車の燃費を0より大きい値で入力させる
		double yourCarEfficietFuel = inputRealNumber("車の燃費は(km/L)：");
		//車の現在位置のX座標を表す変数を設定
		double currentLocationX = 0;
		//車の現在位置のY座標を表す変数を設定
		double currentLocationY = 0;

		//入力された値を用いてインスタンスを作成
		Car yourCar = new Car(yourCarName, yourCarNumber, yourCarWidth, yourCarHeight, yourCarLength,
				yourCarMuximumFuel, yourCarRestFuel, yourCarEfficietFuel, currentLocationX, currentLocationY);

		//ガソリンスタンドのx座標を表す定数を設定
		final double placeGasStationX = 0;
		//ガソリンスタンドのy座標を表す定数を設定
		final double placeGasStationY = 0;

		//スタート地点とガソリンスタンドの位置を表示
		System.out.println("座標(0,0)のガソリンスタンドから出発します。");

		//終了が選択されるまで動作を続ける
		while (true) {
			//プログラムを終了させることを表す定数を設定
			final int EXIT_ROOP = 0;
			//車を移動させることを表す定数を設定
			final int MOVING_CAR = 1;
			//車の情報を表示することを表す定数を設定
			final int PUT_CAR_SPEC = 2;

			//現在地の座標と燃料残量を表示
			System.out.println("現在地(" + yourCar.getCoordinateX() + ',' + yourCar.getCoordinateY() + ")・残り燃料"
					+ yourCar.getRestFuel());
			//行動と対応した値を表示。
			System.out.println("移動…1、スペック表示…2、終了…0");
			///何の行動をするかの入力を促す
			System.out.print("何を行いますか。0～2で入力してください：");

			//選択された行動を表す変数を設定
			int actionJudge = 0;
			//入力を読み込む
			actionJudge = standerdInput.nextInt();

			//選択肢以外の値が入力された場合、行動の選択を行う変数に範囲内の値を入力させる
			while (actionJudge != EXIT_ROOP && actionJudge != MOVING_CAR && actionJudge != PUT_CAR_SPEC) {
				//範囲内の値の入力を求めるエラー文章を表示
				System.out.print("0～2で行動を選択してください。\n何を行いますか:");
				//入力を読み込む
				actionJudge = standerdInput.nextInt();
			}
			//プログラム終了が選択された場合
			if (actionJudge == EXIT_ROOP) {
				//繰り返しを終了する
				break;
			}
			//車の移動が選択された場合
			else if (actionJudge == MOVING_CAR) {
				//X方向の移動距離の入力を促す
				System.out.print("X方向の移動距離(km)：");
				//X方向の移動距離を表す変数を設定
				double moveLengthX = 0;
				//入力を読み込む
				moveLengthX = standerdInput.nextDouble();

				//Y方向の移動距離の入力を促す
				System.out.print("Y方向の移動距離(km)：");
				//Y方向の移動距離を表す変数を設定
				double moveLengthY = 0;
				//入力を読み込む
				moveLengthY = standerdInput.nextDouble();

				//車を移動させるための関数を用いて車を移動させる。
				//燃料が不足していてfalseが返却された場合
				if (!yourCar.isAbleToMoveCar(moveLengthX, moveLengthY)) {
					//燃料の不足を表示
					System.out.println("燃料が足りません！");
					//改行する
					System.out.println();

					//移動後の座標とガソリンスタンドの座標が同じ場合
				} else {
					//現在地のx座標を表す変数にx方向に移動した距離を代入
					currentLocationX += moveLengthX;
					//現在地のy座標を表す変数にy方向に移動した距離を代入
					currentLocationY += moveLengthY;

					//現在地点がガソリンスタンドの座標と同じ場合
					if (currentLocationX == placeGasStationX && currentLocationY == placeGasStationY) {
						//ガソリンスタンドに到着したことを表示
						System.out.print("ガソリンスタンドに到着しました。\n給油しますか。Yes…1/No…0：");
						//給油の判断を行う変数を設定し、変数に入力を読み込む
						int refuelJudge = standerdInput.nextInt();
						//給油を行わないことを表す定数を設定
						final int THROUGH_GAS = 0;
						//給油を行うことを表す定数を設定
						final int STOP_GAS = 1;

						//0か1を入力させる
						while (refuelJudge < THROUGH_GAS || refuelJudge > STOP_GAS) {
							//0か1で入力を求めるエラー文章を表示
							System.out.print("0か1で入力してください。\\n給油しますか。Yes…1/No…0：");
							//給油の判断を行う変数に入力を読み込む
							refuelJudge = standerdInput.nextInt();
						}
						//給油を判断する変数が0の場合
						if (refuelJudge == THROUGH_GAS) {
							//給油を行わなかったことを表示
							System.out.println("給油は行いませんでした。");
							//改行する
							System.out.println();
							//最初から繰り返しを継続する
							continue;
							//給油を判断する変数が1の場合
						} else {

							//関数を用いて、給油を行う。
							yourCar.refuelGas();
							//最初から繰り返しを行う
							continue;
						}
					}
					//改行する
					System.out.println();
				}
				//車のスペックの表示が選択された場合
			} else if (actionJudge == PUT_CAR_SPEC) {
				//関数を用いて、車の情報を表示
				yourCar.putSpec();
			}
		}
		//終了したことを表示
		System.out.println("終了しました。");
	}
}
