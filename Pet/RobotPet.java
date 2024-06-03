package Pet;
//Scannerクラスをインポート
import java.util.Scanner;

/* 
 * クラス名 RobotPet
 * 概要 ロボットペットの情報を管理するPetの派生クラス
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class RobotPet extends Pet implements Skinnable {
	//Scannerクラスに変数を設定。
	static Scanner standardInput = new Scanner(System.in);
	//ロボットペットの柄を表すフィールドを宣言し、初期値として黒色であることを表す定数を設定
	private int skinnColer = BLACK_COLER;

	/* 
	 * コンストラクタ名 RobotPet
	 * 概要 ロボットペットと飼い主の名前を初期化
	 * 引数 ロボットペット、飼い主の名前(String)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public RobotPet(String petName, String masterName) {
		//スーパークラスのコンストラクタを用いてロボットペットと飼い主の名前を初期化
		super(petName, masterName);
	}

	/* 
	 * 関数名 introduceMyself
	 * 概要 自己紹介の文章を表示する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	@Override
	public void introduceMyself() {
		//ロボットペットの名前を表示
		System.out.println("◇私はロボット。名前は" + petName + "。");
		//飼い主の名前を表示
		System.out.println("◇ご主人様は" + masterName + "。");
		//現在の柄を表示
		printPetColer(this.skinnColer);
	
	}

	/* 
	 * 関数名 changeSkinn
	 * 概要 ロボットペットの色を変更する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	@Override
	public void changeSkinn() {
		//選択範囲の最小値を表す定数を設定
		final int RANGE_MINIMUM = 0;
		//選択範囲の最大値を表す定数を設定
		final int RANGE_MAXIMUM = 4;
		//柄の変更を予告
		System.out.print("柄を変更します。(0…黒/1…赤/2…緑/3…青/4…豹柄)：");
		//選択された色を表す変数を設定し、色を選択肢の範囲内で入力させる
		int chosedColer = choseInRange(RANGE_MINIMUM, RANGE_MAXIMUM);
		//選択された色によって分岐
		switch (chosedColer) {
		//黒が選ばれた場合
		case BLACK_COLER:
			//柄を表す変数に黒を表す定数を代入
			this.skinnColer = BLACK_COLER;
			//柄が黒であることを表示
			System.out.println("柄が黒になりました。");
			//分岐を脱出する
			break;
			//赤が選ばれた場合	
		case RED_COLER:
			//柄を表す変数に赤を表す定数を代入
			this.skinnColer = RED_COLER;
			//柄が赤であることを表示
			System.out.println("柄が赤になりました。");
			//分岐を脱出する
			break;
			//緑が選ばれた場合
		case GREEN_COLER:
			//柄を表す変数に緑を表す定数を代入
			this.skinnColer = GREEN_COLER;
			//柄が緑であることを表示
			System.out.println("柄が緑になりました。");
			//分岐を脱出する
			break;
			//青が選ばれた場合
		case BLUE_COLER:
			//柄を表す変数に青を表す定数を代入
			this.skinnColer = BLUE_COLER;
			//柄が青であることを表示
			System.out.println("柄が青になりました。");
			//分岐を脱出する
			break;
			//豹柄が選ばれた場合
		case LEOPARD_COLER:
			//柄を表す変数に豹柄を表す定数を代入
			this.skinnColer = LEOPARD_COLER;
			//柄が豹柄であることを表示
			System.out.println("柄が豹柄になりました。");
			//分岐を脱出する
			break;
		}

	}

	/* 
	 * 関数名 printPetColer
	 * 概要 ロボットペットの柄を表示する
	 * 引数 色を表す定数(int)
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public void printPetColer(int variableColer) {
		//選択された色によって分岐
		switch (variableColer) {
		//黒が選ばれた場合
		case BLACK_COLER:
			//柄を表す変数に黒を表す定数を代入
			this.skinnColer = BLACK_COLER;
			//柄が黒であることを表示
			System.out.println("◇柄は黒である。");
			//分岐を脱出する
			break;
			//赤が選ばれた場合	
		case RED_COLER:
			//柄を表す変数に赤を表す定数を代入
			this.skinnColer = RED_COLER;
			//柄が赤であることを表示
			System.out.println("◇柄は赤である。");
			//分岐を脱出する
			break;
			//緑が選ばれた場合
		case GREEN_COLER:
			//柄を表す変数に緑を表す定数を代入
			this.skinnColer = GREEN_COLER;
			//柄が緑であることを表示
			System.out.println("◇柄は緑である。");
			//分岐を脱出する
			break;
			//青が選ばれた場合
		case BLUE_COLER:
			//柄を表す変数に青を表す定数を代入
			this.skinnColer = BLUE_COLER;
			//柄が青であることを表示
			System.out.println("◇柄は青である。");
			//分岐を脱出する
			break;
			//豹柄が選ばれた場合
		case LEOPARD_COLER:
			//柄を表す変数に豹柄を表す定数を代入
			this.skinnColer = LEOPARD_COLER;
			//柄が豹柄であることを表示
			System.out.println("◇柄は豹柄である。");
			//分岐を脱出する
			break;
		}

	}

	/* 
	 * 関数名 choseInRange
	 * 概要 指定された範囲内の値を入力させる
	 * 引数 範囲の下限、上限(int)
	 * 返り値 範囲内の値(int)
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/29
	 */
	public static int choseInRange(int rangeMinimum, int rangeMuximum) {
		//入力された値を表す変数に入力を読み込む
		int chooseNumber = standardInput.nextInt();

		//選択された図形を表す変数に範囲外の値が入力された場合
		for (; chooseNumber < rangeMinimum || chooseNumber > rangeMuximum;) {
			//範囲内の値の入力を促すエラー文章を表示
			System.out.println(rangeMinimum + "から" + rangeMuximum + "までの値を入力してください。");
			//選択された図形を表す変数に入力を読み込む
			chooseNumber = standardInput.nextInt();
		}
		//範囲内の値を返却する
		return chooseNumber;
	}

}
