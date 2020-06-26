import common.Item;
import common.Slime;
import common.SuperHero;

/*
 * PTra13_07.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra13_07 {
	public static void main(String[] args) {
		//※この問題はPTra13_03、PTra13_04で作成したHero、Slimeクラスを使用して解いてください。
		// TODO SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者(装備あり)", "スライム"を設定してください
		SuperHero sHero = new SuperHero();
		sHero.setName("勇者(装備あり)");
		Slime slime = new Slime();
		slime.setName("スライム");
		// TODO Itemクラスのインスタンスを作成し、("ロングソード", 20）をコンストラクタの引数にしてください
		Item item = new Item("ロングソード", 20);
		// TODO SuperHeroインスンタンスのitemフィールドに作成したitemインスタンスをセットしてください
		sHero.setItem(item);
		/*
		 * TODO SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 *
		 * 戦闘が終了したら、勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		 */
		while(true) {
			boolean slimeDeadFlg = slime.damage(sHero.attack());
			if(slimeDeadFlg == true) {
				System.out.println("勇者(装備あり)はスライムとの戦闘に勝利した。");
				break;
			}
			boolean sHeroDeadFlg = sHero.damage(slime.attack());
			if(sHeroDeadFlg == true) {
				System.out.println("スライムは勇者(装備あり)との戦闘に勝利した。");
				break;
			}
		}
	}
}
