import common.Slime;

/*
 * PTra13_04.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra13_04 {

	/* TODO commonパッケージにCharacterクラスを継承した、Slimeクラスを作成してから解いてください。
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（10, 5, 2）
	 */
	//※Slimeクラスに継承したCharacterクラスをよく読んでから解いてください。
	public static void main(String[] args) {
		// TODO Slimeクラスをインスンタンス化してください
		Slime slime = new Slime();
		// TODO Slimeインスタンスのnameフィールドに スライム を設定して下さい
		slime.setName("スライム");
		// TODO Slimeインスタンスのキャラクター情報を表示してください
		System.out.println(slime.showParameter());
	}
}
