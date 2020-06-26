/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

/**
 * 例外を発生させるようなメソッドを集めたクラスです
 * @author rhizome
 *
 */
public class ThrowExceptionUtil {

	// 1文字ごとに遅らせる秒数(ミリ秒)
	final static int SLEEP_TIME = 1000;

	/**
	 * 渡された引数からカウントダウンを実施する
	 * @param count
	 * @throws InterruptedException
	 */
	public static void countDown(int count) throws InterruptedException {
		for(int i = count; i >= 0; i--) {
			System.out.println(i);
			Thread.sleep(SLEEP_TIME);
		}

		System.out.println("カウントダウンを終了します");

	}
}
