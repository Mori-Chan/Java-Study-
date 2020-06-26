/*
 * PTra12_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

public class SportsCar extends Car{
	public SportsCar() {
		super("スポーツカー", 100);
	}
	/**
	 * 設定されたスピードの3倍の速度で走る
	 */
	public void turbo() {
		System.out.println(super.getName() + "は時速" + (super.getSpeed() * 3 ) + "で走った");
	}
}
