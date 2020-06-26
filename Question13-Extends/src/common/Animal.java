/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

/**
 * 動物の情報や行動を持ったクラスです
 *
 */
public class Animal {
	/** 名前 */
	private String name;

	/**
	 * 行動：走る
	 */
	public void run() {
		System.out.println(this.name + "は走りました。");
	}

	/**
	 * 行動：食べる
	 */
	public void eat() {
		System.out.println(this.name + "は食事をしました。");
	}

	/**
	 * Setter
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * @return
	 */
	public String getName() {
		return this.name;
	}

}
