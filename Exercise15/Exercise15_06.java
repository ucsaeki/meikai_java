package Exercise15;
//Mathクラスを静的インポートし、円周率を表すクラス変数を宣言
import static java.lang.Math.*;

/* 
 * クラス名 Exercise15_06
 * 概要 入力された半径を持つ円の円周の長さと円の面積を求める
 * 作成者 Y.Saeki
 * 作成日 2024/06/03
 */
public class Exercise15_06 {
	
	/* 
	 * 関数名 main
	 * 概要 入力された半径を持つ円の円周の長さと円の面積を求める
	 * 引数 コマンドライン引数(String[])
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/06/03
	 */
	public static void main(String[] args) {
		//半径を表す変数にコマンドライン引数の値を代入
		double radiusNumber = Double.parseDouble(args[0]);
		//半径の値が0以下の場合
		if (radiusNumber < 0) {
			//符号を反転させるための定数を設定
			final int inverseSign = -1;
			//半径の変数に符号を反転させた値を代入
			radiusNumber *= inverseSign;
		}
		
		//半径を表示
		System.out.println("半径は" + radiusNumber + "です。");
		//円周を表示
		System.out.println("円周は" + ((radiusNumber + radiusNumber) * PI) + "です。");
		//円の面積を表示
		System.out.println("円の面積は" + (radiusNumber * radiusNumber * PI) + "です。");
		
	}

}
