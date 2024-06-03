package Exercise14;

//Scannerクラスをインポート
import java.util.Scanner;

//Petクラスをインポート
import Pet.Pet;
//RobotPetクラスをインポート
import Pet.RobotPet;

/* 
 * クラス名 PetTester
 * 概要 入力されたペットと飼い主の名前を表示し、ペットがロボットの場合柄を変更する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class PetTester {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);

	/* 
	 * 関数名 isYes
	 * 概要 Yesが選択されたかどうかを判定する
	 * 引数 回答させたい内容(String)
	 * 返り値 Yes(true)、No(false)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/21
	 */
	public static boolean isYes(String targetSubject) {
		//Yesを選択したことを表す変数にtrueを代入(boolean)
		boolean yesChoose = true;
		//入力された値を表す変数を設定(int)
		int variableNumber = 0;
		//Yesを選んだことを表す定数を設定(int)
		final int CHOOSE_YES = 1;
		//Noを選んだことを表す定数を設定(int)
		final int CHOOSE_NO = 0;

		//YesかNoで回答させる
		while (true) {
			//回答させたい内容を表示
			System.out.print(targetSubject + "Yes…1/No…0：");
			//入力された値を読み込む
			variableNumber = standardInput.nextInt();
			//入力された値がYesNoを表す定数以外だった場合
			if (variableNumber != CHOOSE_YES && variableNumber != CHOOSE_NO) {
				//正しい数値での入力を求めるエラー文を表示
				System.out.println("0か1を入力してください。");
				//Noが回答された場合
			} else if (variableNumber == CHOOSE_NO) {
				//Yesを入力したことを表す変数にfalseを代入
				yesChoose = false;
				//繰り返しを終了する
				break;
				//Yesが選択された場合
			} else {
				//繰り返しを終了する
				break;
			}
		} //回答を返却
		return yesChoose;
	}

	/* 
	 * 関数名 main
	 * 概要 ペットの情報を入力させ、ロボットペットの場合着せ替えを行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public static void main(String[] args) {
		//飼い主の名前の入力を促す
		System.out.print("あなたの名前：");
		//入力を読み込む
		String masterName = standardInput.next();
		//ペットの名前の入力を促す
		System.out.print("ペットの名前：");
		//入力を読み込む
		String petName = standardInput.next();
		//ペットがロボットかどうかを入力させる
		if (isYes("あなたのペットはロボットですか。")) {
			//情報を入力したロボットペットのインスタンスを生成
			RobotPet yourRobotPet = new RobotPet(petName, masterName);
			//生成したインスタンスを用いて、自己紹介の文章を表示
			yourRobotPet.introduceMyself();
			//柄を変えることが選択された場合
			if (isYes("柄を変えますか。")) {
				//関数を用いて、ロボットペットの柄を変更する
				yourRobotPet.changeSkinn();
				//柄変更後の自己紹介の文章を表示
				yourRobotPet.introduceMyself();
			//柄を変えないことが選択された場合
			} else {
				//柄を変更しなかったことを表示
				System.out.println("柄変更は行いませんでした。");
			}
		//ロボットではない場合
		} else {
			//情報を入力したペットのインスタンスを生成
			Pet yourPet = new Pet(petName, masterName);
			//生成したインスタンスを用いて、自己紹介の文章を表示
			yourPet.introduceMyself();
		}

	}

}
