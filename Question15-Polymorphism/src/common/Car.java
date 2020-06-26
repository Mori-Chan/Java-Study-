/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

public class Car {

	private String name;
	private int speed;

	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	/**
	 * 設定されたスピードで走る
	 */
	public void run() {
		System.out.println(this.name + "は時速" + this.speed + "で走った");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
