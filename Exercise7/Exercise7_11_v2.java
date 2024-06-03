package Exercise7;

public class Exercise7_11_v2 {

	static void xRotate(int x) {

		for (int i = 31; i >= 0; i--) {

			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		return;

	}

	
	////////////////////////////////////

	static void rRotate(int x, int n) {

		for (int i = n - 1; i >= 0; i--) {

			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');

		}
		return;

	}

	public static void main(String[] args) {

		int n = 2;
		int wordCount = 1;
		//ビットの指定された桁から指定された個数分1を表示した値を作成
		for (int i = 0; i < n; i++) {
			//1を指定された桁数左シフトした値を変数に代入
			
			wordCount += 1 << n + i;
		}

		// TODO 自動生成されたメソッド・スタブ
		xRotate(240000000);

		System.out.println();

		rRotate(1200, 5);

		System.out.println();

		int x = 5;

		int l = 2;

		System.out.println(x * (2 * n));

		System.out.println(x << n);
	}

}
