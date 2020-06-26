/*
 * PTra15_04.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra17_04 {

	// 1文字ごとに遅らせる秒数(ミリ秒)
	final static int SLEEP_TIME = 1000;

	public static void main(String[] args) {

		try {
			numCheck(-10);
		} catch (Exception e) {
			System.out.println("例外が発生しました");
		}

	}

	/*	TODO 以下のメソッドのエラーを解決して、
	 *  実行時に 例外が発生しました と表示されるようにしてください。
	 */
	public static void numCheck(int num) throws Exception {
		if (num < 0) {
			throw new Exception();
		}

		System.out.println(num + "正の範囲の数値です");
	}

}