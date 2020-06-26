import common.Hero;

/*
 * PTra13_03.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra13_03 {

	/*
	 * TODO commonパッケージ内に、Characterクラスを継承した、Heroクラスを作成してから解いてください。
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */

	//※Heroクラスに継承したCharacterクラスをよく読んでから解いてください。
	public static void main(String[] args) {
		// TODO Heroクラスをインスンタンス化してください
		Hero hero = new Hero();
		// TODO Heroインスタンスのnameフィールドに 勇者 を設定して下さい
		hero.setName("勇者");
		// TODO Heroインスタンスのキャラクター情報を表示してください
		System.out.println(hero.showParameter());
	}
}
