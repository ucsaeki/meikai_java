package Exercise12.Exercise12_01;

/* 
 * クラス名 DrivingDistanceCar
 * 概要 車の総走行距離に関する情報を管理する、Carのサブクラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/27
 */
public class DrivingDistanceCar extends Car {
	//車の総走行距離を表すフィールドを宣言
	private double drivingDistance = 0.0;

	/* 
	 * コンストラクタ名 DrivingDistanceCar
	 * 概要 引数に何も入力されていない場合、フィールドを初期値で初期化する
	 * 引数 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public DrivingDistanceCar() {

	}

	/* 
	 * コンストラクタ名 DrivingDistanceCar
	 * 概要 総走行距離を追加した車の情報を入力して初期化する
	 * 引数  車の名前(String)、ナンバー(String)、幅(int)、高さ(int)、長さ(int)、x座標(double)、y座標(double)、
	 * 残燃料(double)、購入日(Day)、総走行距離(double)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public DrivingDistanceCar(String carName, String carNumber, int carWidth, int carHeight, int carLength,
			double coordinateX, double coordinateY, double restFuel, Day purchaseDay, double drivingDistance) {
		//スーパークラスのコンストラクタを用いて、名前、ナンバー、幅、高さ、長さ、x座標、y座標、残燃料、購入日を初期化
		super(carName, carNumber, carWidth, carHeight, carLength, coordinateX, coordinateY, restFuel, purchaseDay);
		//総走行距離を表すフィールドを初期化
		this.drivingDistance = drivingDistance;
	}

	/* 
	 * 関数名 setDrivingDistance
	 * 概要 車の総走行距離をセットする
	 * 引数 x方向の移動距離、y方向の移動距離(double)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public void setDrivingDistance(double lastDistanceX,double lastDistanceY) {
		//車の移動距離を表す変数を設定し、最後に移動したx方向の移動距離とy方向の移動距離を用いて求めた移動距離を代入。
		double movingDistance = Math.sqrt(lastDistanceX * lastDistanceX + lastDistanceY * lastDistanceY);
		//車の総走行距離を表すフィールドに移動距離を加算する
		this.drivingDistance += movingDistance;
	}

	/* 
	 * 関数名 printNeedMooving
	 * 概要 現在のx座標とy座標、残燃料と総走行距離を表示する
	 * 引数 x座標、y座標、残燃料、総走行距離(double)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public void printNeedMooving() {
		//現在のx座標を表示
		System.out.println("現在のx座標：" + this.coordinateX);
		//現在のy座標を表示
		System.out.println("現在のy座標：" + this.coordinateY);
		//残燃料を表示
		System.out.println("残燃料：" + this.restFuel + " L");
		//総走行距離を表示
		System.out.println("総走行距離:" + this.drivingDistance + " m");

	}

	/* 
	 * 関数名 toString
	 * 概要 drivingDistanceCar型のクラス変数を表示する
	 * 引数 なし
	 * 返り値 車の情報を表す文字列(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public String toString() {
		//車の情報を表示する
		return String.format("名前：%1s\nナンバー：%1s\n車幅：%1d mm\n高さ：%1d mm\n長さ：%1d mm\n"
				+ "x座標：%3.1f\ny座標：%3.1f\n残燃料：%3.1f L\n購入日：%s\n総走行距離：%3.1f m",
				carName, carNumber, carWidth, carHeight, carLength, coordinateX, coordinateY, restFuel, purchaseDay,
				drivingDistance);
	}
}
