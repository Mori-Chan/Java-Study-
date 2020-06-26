package common;

public class SuperHero extends Character {

	public SuperHero() {
		super(25, 10, 7);
	}

	Item item;

	public int attack() {
		return super.attack() + item.getAdditionalDamage();
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
