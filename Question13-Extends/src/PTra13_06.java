import common.Item;
import common.Slime;
import common.SuperHero;

/*
 * PTra13_06.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra13_06 {
	/*
	 * TODO commonパッケージにHeroクラスを継承した、SuperHeroクラスを作成してから解いてください。
	 * 	●HP, POWER, ENDURANCEはHeroと同じでそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		item	:	Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerフィールドの値に加えて、itemフィールドのadditionalDamage分を加算した値を返す
	 *
	 * 		itemフィールドのアクセサ
	 */
	public static void main(String[] args) {

		// TODO SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者(装備あり)", "スライム"を設定してください
		SuperHero sHero = new SuperHero();
		sHero.setName("勇者(装備あり)");
		Slime slime = new Slime();
		slime.setName("スライム");
		// TODO Itemクラスのインスタンスを作成し、("こんぼう", 5）をコンストラクタの引数にしてください
		Item item = new Item("こんぼう", 5);
		// TODO SuperHeroインスンタンスのitemフィールドに作成したitemインスタンスをセットしてください
		sHero.setItem(item);
		// TODO SuperHeroインスンタンスのattackメソッドを呼び出して、戻り値を出力してください
		// ※ 15と出力されれば正解
		System.out.println(sHero.attack());
	}
}
