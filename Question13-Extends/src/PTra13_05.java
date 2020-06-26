import common.Hero;
import common.Slime;

/*
 * PTra13_05.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra13_05 {
	public static void main(String[] args) {
		//※この問題はPTra13_03、PTra13_04で作成したHero、Slimeクラスを使用して解いてください。
		// TODO HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero hero = new Hero();
		hero.setName("勇者");
		Slime slime = new Slime();
		slime.setName("スライム");
		/*
		 * TODO HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 *
		 * 戦いが終了したら、勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
		 */
		while(true) {
			boolean slimeDeadFlg = slime.damage(hero.attack());
			if(slimeDeadFlg == true) {
				System.out.println("勇者はスライムとの戦闘に勝利した。");
				break;
			}
			boolean heroDeadFlg = hero.damage(slime.attack());
			if(heroDeadFlg == true) {
				System.out.println("スライムは勇者との戦闘に勝利した。");
				break;
			}
		}
	}
}
