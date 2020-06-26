/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

/**
 * 車についてのインターフェース
 */
public interface Car {
	/**
	 * ガソリンを補充する
	 * @param gasoline
	 */
	void charge(int x);

	/**
	 * 走る
	 */
	void run(int x);
}
