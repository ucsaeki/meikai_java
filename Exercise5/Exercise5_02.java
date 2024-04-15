package Exercise5;

//Scannerクラスをインポート。
import java.util.Scanner;

/* 
 * クラス名 Exercise5_02
 * 概要 float型とdouble型の変数にそれぞれ値を読み込んで表示する。
 * 作成者 Y.Saeki
 * 作成日 2024/04/15
 */
public class Exercise5_02 {
	/* 
	 * 関数名  main
	 * 概要 float型とdouble型の変数にそれぞれ値を読み込んで表示する。
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//文章を表示。
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		//入力を促す文章を表示。
		System.out.print("x:");
		//入力を読み込む。
		float firstInteger = standerdInput.nextFloat();
		//入力を促す文章を表示。
		System.out.print("y:");
		//入力を読み込む
		double secondInteger = standerdInput.nextDouble();

		//文章を表示。
		System.out.println("x=" + firstInteger);
		//文章を表示。
		System.out.println("y=" + secondInteger);

	}

}
