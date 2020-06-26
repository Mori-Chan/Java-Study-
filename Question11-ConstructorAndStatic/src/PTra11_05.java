/*
 * PTra11_05.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra11_05 {
	public static void main(String[] args) {
		// ※ この問題はJam、Toastクラスを完成させてから解いてください。
		// TODO Jam型のインスンタンスを引数 ブルーベリー で作成してください
		Jam jam = new Jam("ブルーベリー");
		// TODO Toast型のインスンタンスを作成してください。
		Toast toast = new Toast(jam);
		// TODO 作成したToast型インスタンスからtasteメソッドを呼び出してください
		toast.taste();
	}
}
