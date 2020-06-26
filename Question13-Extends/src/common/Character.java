/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

/**
 * 登場するキャラクターの情報とデフォルトの行動を設定したクラスです
 * @author rhizome
 *
 */
public class Character {
	/** 名前 */
	private String name = "キャラクター";

	/** 体力 */
	private int hp;

	/** 力 */
	private int power;

	/** 防御力 */
	private int endurance;

	/**
	 * 体力、攻撃力、防御力の初期値を設定しつつ、Characterインスタンスを生成します
	 * @param hp
	 * @param attack
	 * @param defence
	 */
	public Character(int hp, int power, int endurance) {
		this.hp = hp;
		this.power = power;
		this.endurance = endurance;
	}

	/**
	 * 名前を設定します
	 * @param name	設定したい名前
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 名前を取得します
	 * @return 名前
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 攻撃を行います
	 * @return 相手に与えるダメージを返します
	 */
	public int attack() {
		return this.power;
	}

	/**
	 * ダメージ判定を行います
	 * @param attack 攻撃値
	 * @return	体力が0になったらtrue、まだ体力が残っていたらfalse
	 */
	public boolean damage(int attack) {

		boolean deadFlg = false;

		// ダメージ計算
		int damage = attack - this.endurance;
		if (damage <= 0) {
			// 必ず1ダメージは入るようにする
			damage = 1;
		}

		// ダメージ分体力を減らす
		this.hp -= damage;

		// 体力がなくなったかどうかの判定
		if (this.hp <= 0) {

			// 体力が負の値になったら0に設定する
			this.hp = 0;

			deadFlg = true;
			System.out.println(this.name + "は" + damage + "のダメージを受けた。");
			System.out.println(this.name + "の残り体力は" + this.hp + "。");
			System.out.println(this.name + "は" + "ちからつきた。");
		} else {
			System.out.println(this.name + "は" + damage + "のダメージを受けた。");
			System.out.println(this.name + "の残り体力は" + this.hp + "。");
		}

		System.out.println("↓");


		return deadFlg;
	}

	/**
	 * キャラクター情報を表示します
	 * @return
	 */
	public String showParameter() {
		StringBuilder str = new StringBuilder();

		str.append("名　前：" + this.name);
		str.append("\n");
		str.append("体　力：" + this.hp);
		str.append("\n");
		str.append("　力　：" + this.power);
		str.append("\n");
		str.append("耐　久：" + this.endurance);

		return str.toString();
	}
}