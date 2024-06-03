package Exercise12.Exercise12_01;

/* 
 * クラス名 Car
 * 概要 車の情報を管理する
 * 作成者 Y.Saeki
 * 作成日 2024/05/27
 */
public class Car {
	//車の名前を表すフィールドを宣言
	protected String carName = ("");
	//車のナンバーを表すフィールドを宣言
	protected String carNumber = ("");
	//車の幅を表すフィールドを宣言
	protected int carWidth = 0;
	//車の高さを表すフィールドを宣言
	protected int carHeight = 0;
	//車の長さを表すフィールドを宣言
	protected int carLength = 0;
	//車の現在位置のx座標を表すフィールドを宣言
	protected double coordinateX = 0.0;
	//車の現在位置のy座標を表すフィールドを宣言
	protected double coordinateY = 0.0;
	//残燃料を表すフィールドを宣言
	protected double restFuel = 0.0;
	//車の購入日を表すフィールドを宣言し、初期値として本日の日付を設定
	protected Day purchaseDay = new Day();

	/* 
	 * 関数名 Car
	 * 概要 引数を受け取らない場合の車の情報を入力して初期化する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public Car() {

	}

	/* 
	 * コンストラクタ名 Car
	 * 概要 車の情報を入力して初期化する
	 * 引数 車の名前(String)、ナンバー(String)、幅(int)、高さ(int)、長さ(int)、x座標(double)、y座標(double)、
	 * 残燃料(double)、購入日(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public Car(String carName, String carNumber, int carWidth, int carHeight, int carLength, double coordinateX,
			double coordinateY, double restFuel, Day purchaseDay) {
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
		//車の現在のx座標を表すフィールドを初期化
		this.coordinateX = coordinateX;
		//車の現在のy座標を表すフィールドを初期化
		this.coordinateY = coordinateY;
		//車の残燃料を表すフィールドを初期化
		this.restFuel = restFuel;
		//車の購入日を表すフィールドを初期化
		this.purchaseDay = new Day(purchaseDay);
	}

	/* 
	 * 関数名 getX
	 * 概要 車の現在のx座標を取得する
	 * 引数 なし
	 * 返り値 車の現在のx座標(double)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public double getX() {
		//車の現在のx座標を返却
		return coordinateX;
	}

	/* 
	 * 関数名 getY
	 * 概要 車の現在のy座標を取得する
	 * 引数 なし
	 * 返り値 車の現在のy座標(double)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public double getY() {
		//車の現在のy座標を返却
		return coordinateY;
	}

	/* 
	 * 関数名 getFuel
	 * 概要 車の残燃料を取得する
	 * 引数 なし
	 * 返り値 車の残燃料(double)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public double getFuel() {
		//車の残燃料を返却
		return restFuel;
	}

	/* 
	 * 関数名 getPurchaseDay
	 * 概要 車の購入日を取得する
	 * 引数 なし
	 * 返り値 車の購入日(Day)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public Day getPurchaseDay() {
		//車の購入日を返却
		return new Day(purchaseDay);
	}

	/* 
	 * 関数名 putSpec
	 * 概要 車の性能を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public void putSpec() {
		//車の名前を表示
		System.out.println("名前：" + carName);
		//車幅を表示
		System.out.println("車幅：" + carWidth);
		//車高を表示
		System.out.println("車高：" + carHeight);
		//車長を表示
		System.out.println("車長：" + carLength);
	}

	/* 
	 * 関数名 canMoveCar
	 * 概要 指定された地点に車が移動できるかを判定し、可能なら移動してtrue、不可能なら移動せずfalseを返却する
	 * 引数 目的地のx座標、y座標(double)
	 * 返り値 移動可能、不可能(boolean)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/27
	 */
	public boolean canMoveCar(double movingX, double movingY) {
		//移動可能かどうかを判断する変数を設定し、初期値として移動可能を入力
		boolean canMove = true;
		//車の移動距離を求める(double)
		double movingDistance = Math.sqrt(movingX * movingX + movingY * movingY);
		//移動に必要な燃料が残燃料より大きい場合
		if (movingDistance > restFuel) {
			//移動の判断をする変数にfalseを代入
			canMove = false;
			//必要な燃料が残燃料より少ない場合
		} else {
			//必要な燃料を残燃料から減算
			restFuel -= movingDistance;
			//x座標に移動距離分を加算
			coordinateX += movingX;
			//y座標に移動距離分を加算
			coordinateY += movingY;
		}
		//移動の判断をする変数を返却
		return canMove;

	}

}
