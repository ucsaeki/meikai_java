package Exercise13.Exercise13_01;

//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 Tester_13_01
 * 概要 指定された個数の指定された図形を表示する
 * 作成者 Y.Saeki
 * 作成日 2024/05/29
 */
public class Tester_13_01 {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	//点を選択したことを表す定数を設定
	static final int CHOSE_POINT = 1;
	//水平直線を選択したことを表す定数を設定
	static final int CHOSE_HORIZONTAL_LINE = 2;
	//垂直直線を選択したことを表す定数を設定
	static final int CHOSE_VIRTICAL_LINE = 3;
	//長方形を選択したことを表す定数を設定
	static final int CHOSE_RECTANGLE = 4;

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
	 * 関数名 main
	 * 概要 指定された個数の指定された図形を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public static void main(String[] args) {
		//図形の個数を表す変数を宣言し、正の整数値で入力させる
		int shapeNumber = inputIntegralNumber("図形は何個：");
		//選択された図形を表す変数を格納するため、図形の個数と同じ数の要素数を持つ配列を作成
		Shape[] holdingShapeArray = new Shape[shapeNumber];
		//要素と要素の個数の表示の差を埋めるための定数を設定
		final int FILL_INDEX = 1;
		//選択範囲の最小値を表す定数を設定
		final int RANGE_MINIMUM = 1;
		//選択範囲の最大値を表す定数を設定
		final int RANGE_MAXIMUM = 4;

		//指定された個数分の図形を選択させる
		for (int i = 0; i < shapeNumber; i++) {

			//図形の選択を促す文章を表示(String)
			System.out.print((i + FILL_INDEX) + "番の図形の種類(1…点/2…水平直線/3…垂直直線/4…長方形)：");
			//選択された図形を表す変数に入力を読み込む(int)
			int ChoosedShape = standardInput.nextInt();
			//選択された図形を表す変数に範囲外の値が入力された場合
			for (; ChoosedShape < RANGE_MINIMUM || ChoosedShape > RANGE_MAXIMUM;) {
				//範囲内の値の入力を促すエラー文章を表示
				System.out.println(RANGE_MINIMUM + "から" + RANGE_MAXIMUM + "までの値を入力してください。");
				//選択された図形を表す変数に入力を読み込む
				ChoosedShape = standardInput.nextInt();
			}

			//選択された図形に応じて情報を入力させる
			switch (ChoosedShape) {
			//点が選択された場合
			case CHOSE_POINT:
				//点を表すインスタンスを生成
				holdingShapeArray[i] = new Point();
				//分岐を脱出する
				break;
			//水平直線が選択された場合
			case CHOSE_HORIZONTAL_LINE:
				//長さを入力した水平直線を表すインスタンスを配列に格納
				holdingShapeArray[i] = new HorzLine(inputIntegralNumber("水平直線の長さ："));
				//分岐を脱出する
				break;
			//垂直直線が選択された場合
			case CHOSE_VIRTICAL_LINE:
				//長さを入力した垂直直線を表すインスタンスを配列に格納
				holdingShapeArray[i] = new VirtLine(inputIntegralNumber("垂直直線の長さ："));
				//分岐を脱出する
				break;
			//長方形が選択された場合
			case CHOSE_RECTANGLE:
				//幅と高さを入力した長方形を表すインスタンスを配列に格納
				holdingShapeArray[i] = new Rectangle(inputIntegralNumber("長方形の幅："), inputIntegralNumber("長方形の高さ："));
				//分岐を脱出する
				break;
			}
		}
		//配列に格納された全ての図形を表示する
		for (int i = 0; i < shapeNumber; i++) {
			//格納された図形を表示する
			holdingShapeArray[i].print();
			//改行する
			System.out.println();
		}

	}

}
