

public class Toast {

	// TODO Jam型のフィールドjamを作成してください
	Jam jam;
	/*
	 *  TODO 以下のコンストラクタを作成してください
	 *  引数		：Jam型 jam
	 *  処理		：引数のjamをjamフィールドに代入する
	 */
	Toast(Jam jam) {
		this.jam = jam;
	}
	/*
	 *  TODO tasteメソッドを作成してください
	 *  引数		：なし
	 *  戻り値	：なし
	 *  処理		：xx 味のトーストです。 出力する
	 *  ※ xxにはjamフィールドのmaterialの値が入る
	 */
	void taste() {
		System.out.println(this.jam.material + "味のトーストです。");
	}
}
