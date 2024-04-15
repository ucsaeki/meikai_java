package Exercise5;
//Scannerクラスをインポート。
import java.util.Scanner;
/* 
 * クラス名 Exercise5_01
 * 概要 10進整数で読み込んだ値を8進数と16進数で表示する
 * 作成者 Y.Saeki
 * 作成日 2024/04/15
 */
public class Exercise5_01 {
	/* 
	 * 関数名  main
	 * 概要 10進整数で読み込んだ値を8進数と16進数で表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/04/15
	 */
	public static void main(String[] args) {
		//Scannerクラスに変数を設定。
		Scanner standerdInput = new Scanner(System.in);
		//文章を表示。
		System.out.print("整数：");
		//入力を読み込む。
		int firstInteger = standerdInput.nextInt();
		
		//文章を表示。
		System.out.print("8進数では");
		//10進数で入力された値を8進数に変換して表示。
		System.out.printf("%o\n", firstInteger);
		//文章を表示。
		System.out.println("です。");
		//文章を表示。
		System.out.print("16進数では");
		//10進数で入力された値を16進数に変換して表示。
		System.out.printf("%x\n", firstInteger);
		//文章を表示。
		System.out.println("です。");
	}

}
