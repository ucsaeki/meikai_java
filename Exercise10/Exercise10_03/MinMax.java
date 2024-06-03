package Exercise10.Exercise10_03;

/* 
 * クラス名 MinMax
 * 概要 最小値、最大値を求めるメソッドを格納したユーティリティクラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/22
 */
public class MinMax {
	/* 
	 * 関数名 findMinimum
	 * 概要 二値の最小値を返却する
	 * 引数 最小値を求めたい二値(int)
	 * 返り値 最小値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static int findMinimum(int firstNumber, int secondNumber) {
		//二値を比較して小さい値を返却する
		return (firstNumber < secondNumber ? firstNumber : secondNumber);
	}

	/* 
	 * 関数名 findMinimum
	 * 概要 三値の最小値を返却する
	 * 引数 最小値を求めたい三値(int)
	 * 返り値 最小値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static int findMinimum(int firstNumber, int secondNumber, int thirdNumber) {
		//三値の中で一つ目の値が最も小さい場合
		if (firstNumber < secondNumber && firstNumber < thirdNumber) {
			//一つ目の値を返却
			return firstNumber;
			//二つ目の値が最も小さい場合
		} else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
			//二つ目の値を返却
			return secondNumber;
			//三つの値が最も小さい場合
		} else {
			//三つの値を返却
			return thirdNumber;
		}
	}

	/* 
	 * 関数名 findMinimum
	 * 概要 配列内の最小値を返却する
	 * 引数 配列(int[])
	 * 返り値 配列内の最小値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static int findMinimum(int[] variableArray) {
		//最小値を表す変数を設定し、配列冒頭の値を代入
		int minimumNumber = variableArray[0];
		//配列を走査し、最小値を求める
		for (int i = 0; i < variableArray.length; i++) {
			//最小値と配列の値を比較し、小さいほうの値を最小値を表す変数に代入
			minimumNumber = (variableArray[i] < minimumNumber ? variableArray[i] : minimumNumber);
		}
		//求めた最小値を返却
		return minimumNumber;
	}

	/* 
	 * 関数名 findMaximum
	 * 概要 二値の最大値を返却する
	 * 引数 最大値を求めたい二値(int)
	 * 返り値 最大値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static int findMaximum(int firstNumber, int secondNumber) {
		//二値を比較して大きい値を返却する
		return (firstNumber > secondNumber ? firstNumber : secondNumber);
	}

	/* 
	 * 関数名 findMaximum
	 * 概要 三値の最大値を返却する
	 * 引数 最大値を求めたい三値(int)
	 * 返り値 最大値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static int findMaximum(int firstNumber, int secondNumber, int thirdNumber) {
		//三値の中で一つ目の値が最も大きい場合
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			//一つ目の値を返却
			return firstNumber;
			//二つ目の値が最も大きい場合
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			//二つ目の値を返却
			return secondNumber;
			//三つの値が最も大きい場合
		} else {
			//三つの値を返却
			return thirdNumber;
		}
	}

	/* 
	 * 関数名 findMaximum
	 * 概要 配列内の最大値を返却する
	 * 引数 配列(int[])
	 * 返り値 配列内の最大値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/22
	 */
	public static int findMaximum(int[] variableArray) {
		//最大値を表す変数を設定
		int muximumNumber = 0;
		//配列を走査し、最大値を求める
		for (int i = 0; i < variableArray.length; i++) {
			//最大値と配列の値を比較し、大きいほうの値を最大値を表す変数に代入
			muximumNumber = (variableArray[i] > muximumNumber ? variableArray[i] : muximumNumber);
		}
		//求めた最大値を返却
		return muximumNumber;

	}

}
