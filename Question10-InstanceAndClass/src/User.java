/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */


public class User {
	int id;
	String name;

	/**
	 * IDと名前を出力する挨拶メソッド
	 */
	void printProfile() {
		System.out.println("ID" + this.id + ":" +this.name);
	}

}
