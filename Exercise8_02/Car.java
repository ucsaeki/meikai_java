package Exercise8_02;

import java.util.Scanner;

/* 
 * クラス名 Car
 * 概要 車のステータス管理を行う自動車クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/13
 */
public class Car {
	//車の名前を表すフィールドを宣言
	private String carName;
	//車のナンバーを表すフィールドを宣言
	private String carNumber;
	//車の幅を表すフィールドを宣言
	private int carWidth;
	//車の高さを表すフィールドを宣言
	private int carHeight;
	//車の長さを表すフィールドを宣言
	private int carLength;
	//タンク容量を表すフィールドを宣言
	private double maximumFuel;
	//残燃料を表すフィールドを宣言
	private double restFuel;
	//車の燃費を表すフィールドを宣言
	private double efficietFuel;
	//車の現在位置のx座標を表すフィールドを宣言
	private double coordinateX;
	//車の現在位置のy座標を表すフィールドを宣言
	private double coordinateY;

	/* 
	 * コンストラクタ名 Car
	 * 概要 車の名前、ナンバー、幅、高さ、長さ、タンク容量、燃料残量、車の燃費、車の現在位置のx、y座標、
	 * ガソリンスタンドのx、y座標を初期化する
	 * 引数 車の名前、ナンバー、幅、高さ、長さ、タンク容量、燃料残量、車の燃費、車の現在位置のx、y座標、
	 * ガソリンスタンドのx、y座標を指定するそれぞれの値
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public Car(String carName, String carNumber, int carWidth, int carHeight, int carLength,
			double maximumFuel, double restFuel, double efficietFuel, double coordinateX, double coordinateY) {

		//車の名前を表すフィールドを初期化
		this.carName = carName;
		//車のナンバーを表すフィールドを初期化
		this.carNumber = carNumber;
		//車の幅を表すフィールドを初期化
		this.carWidth = carWidth;
		//車の高さを表すフィールドを初期化
		this.carHeight = carHeight;
		//車の長さを表すフィールドを初期化
		this.carLength = carLength;

		//タンク容量を表すフィールドを初期化
		this.maximumFuel = maximumFuel;
		//燃料残量を表すフィールドを初期化
		this.restFuel = restFuel;
		//車の燃費を表すフィールドを初期化
		this.efficietFuel = efficietFuel;

		//車の現在位置のx座標を表すフィールドを初期化
		this.coordinateX = coordinateX;
		//車の現在位置のy座標を表すフィールドを初期化
		this.coordinateY = coordinateY;

	}

	/* 
	 * 関数名 getCoordinateX
	 * 概要 x座標を返却
	 * 引数 なし
	 * 返り値 車の現在のx座標
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 * 
	 */
	public double getCoordinateX() {
		//x座標を返却
		return coordinateX;
	}

	/* 
	 * 関数名 getCoordinateY
	 * 概要 y座標を返却
	 * 引数 なし
	 * 返り値 車の現在のy座標
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public double getCoordinateY() {
		//y座標を返却
		return coordinateY;
	}

	/* 
	 * 関数名 getRestFuel
	 * 概要 燃料残量を返却
	 * 引数 なし
	 * 返り値 車の現在燃料残量
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public double getRestFuel() {
		//燃料残量を返却
		return restFuel;
	}

	/* 
	 * 関数名 putSpec
	 * 概要 車の情報を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public void putSpec() {
		//改行する
		System.out.println();
		//車の名前を表示
		System.out.println("名前：" + carName);
		//車のナンバーを表示
		System.out.println("車のナンバー：" + carNumber);
		//車幅を表示
		System.out.println("車幅：" + carWidth + " mm");
		//車高を表示
		System.out.println("車高：" + carHeight + " mm");
		//車長を表示
		System.out.println("車長：" + carLength + " mm");
		//タンク容量を表示
		System.out.println("タンク容量：" + maximumFuel + " L");
		//燃費を表示
		System.out.println("燃費：" + efficietFuel + " km/L");
		//改行する
		System.out.println();
	}

	/* 
	 * 関数名 canMove
	 * 概要 移動地点までの消費燃料を計算し、燃料がある場合車を移動させてtrueを、残っていない場合は移動せずfalseを返却する。
	 * 引数 現在地をx,y=(0,0)とした場合の、移動させたい地点のx座標とy座標
	 * 返り値 trueもしくはfalse
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public boolean isAbleToMoveCar(double destinationPlaceX, double destinationPlaceY) {

		//指定座標までの直線距離を表す変数を設定し、sqrtメソッドを用いて求めた移動距離を代入
		double distanceDestination = Math
				.sqrt(destinationPlaceX * destinationPlaceX + destinationPlaceY * destinationPlaceY);
		//消費した燃料を表す変数を設定し、移動距離と燃費の値を用いて求めた消費する燃料の値を代入
		double consumputFuel = distanceDestination / efficietFuel;

		//移動に必要な燃料が燃料残量より大きい場合
		if (consumputFuel > restFuel) {
			//falseを返却
			return false;

			//燃料残量が直線距離より大きい場合
		} else {
			//燃料残量から移動に必要な燃料の値を引く
			restFuel -= consumputFuel;
			//車の現在のx座標に移動させた分のx座標を加算
			coordinateX += destinationPlaceX;
			//車の現在のy座標に移動させた分のy座標を加算
			coordinateY += destinationPlaceY;
			//trueを返却
			return true;
		}
	}

	/* 
	 * 関数名 refuelGas
	 * 概要 給油を行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/13
	 */
	public void refuelGas() {
		//Scannerクラスをインポート
		Scanner standerdInput = new Scanner(System.in);
		//給油方法の入力を促す
		System.out.print("どちらの方法で給油しますか。給油量設定…1/満タン…0：");
		//給油方法の判断を行う変数を設定し、変数に入力を読み込む
		int refuelingWay = standerdInput.nextInt();

		//満タンまで給油する場合を表す定数を設定
		final int REFUEL_MAX = 0;
		//給油量を自分で設定する場合を表す定数を設定
		final int SET_AMOUNT = 1;
		//0か1を入力させる
		while (refuelingWay < 0 || refuelingWay > SET_AMOUNT) {
			//0か1で入力を求めるエラー文章を表示
			System.out.print("0か1で入力してください。\\nどちらの方法で給油しますか。給油量設定…1/満タン…0：");
			//給油方法の判断を行う変数に入力を読み込む
			refuelingWay = standerdInput.nextInt();
		}
		//満タンが選択された場合
		if (refuelingWay == REFUEL_MAX) {
			//燃料残量の値にタンク容量の値を代入
			restFuel = maximumFuel;
			//給油を行ったことを表示
			System.out.println("満タンまで給油しました。");
			//改行する
			System.out.println();
			//給油量設定が選択された場合
		} else {
			//現在の燃料残量を表示
			System.out.println("現在の燃料残量は " + restFuel + " です。");
			//給油量の入力を促す
			System.out.print("給油したい量(L)：");
			//給油量を表す変数を設定し、入力を読み込む。
			double amountRefuel = standerdInput.nextDouble();
			//燃料残量と給油量の合計がタンク容量以上の場合
			if (amountRefuel >= (maximumFuel - restFuel)) {
				//燃料残量の値にタンク容量の値を代入
				restFuel = maximumFuel;
				//タンク容量の上限（満タン）まで給油したことを表示
				System.out.print("タンク容量の上限まで給油しました。");
			//入力された給油量がタンク容量以下の場合
			} else {
				//燃料残量に給油量を加算
				restFuel += amountRefuel;
				//給油を行ったことを表示
				System.out.println("給油が完了しました。");
			}
		}
	}
}
