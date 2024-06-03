package Player;
/* 
 * クラス名 DVDPlayer
 * 概要 DVDの再生、停止、スロー再生を行う
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public class DVDPlayer implements ExPlayer{
	/* 
	 * 関数名 play
	 * 概要 DVDを再生する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public void play() {
		//再生をおこなうことを表示
		System.out.println("■DVD再生開始！");
	}
	
	/* 
	 * 関数名 stop
	 * 概要 DVDの再生を停止する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public void stop() {
		//再生を停止したことを表示
		System.out.println("■DVD再生終了！");
	}
	
	/* 
	 * 関数名 slow
	 * 概要 DVDをスロー再生する
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	public void slow() {
		//スロー再生を行うことを表示
		System.out.println("■DVDスロー再生開始！");
	}
	
}
