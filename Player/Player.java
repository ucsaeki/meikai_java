package Player;

/* 
 * インタフェース名 Player
 * 概要 プレーヤの再生と停止を管理する
 * 作成者 Y.Saeki
 * 作成日 2024/05/31
 */
public interface Player {

	/* 
	 * 関数名 play
	 * 概要 再生を行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	void play();

	/* 
	 * 関数名 stop
	 * 概要 停止を行う
	 * 引数 なし
	 * 返り値 なし
	 * 作成者 Y.Saeki
	 * 作成日 2024/05/31
	 */
	void stop();
}
