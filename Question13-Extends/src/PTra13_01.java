import common.Cat;

/*
 * PTra13_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra13_01 {
	public static void main(String[] args) {
		//※ この問題はcommonパッケージのCatクラスを完成させてから解いてください。
		// TODO commonパッケージのCatクラスをインスンタンス化してください
		Cat cat = new Cat();
		// TODO Cat型インスタンスのnameフィールドに タマ を代入してください
		cat.setName("タマ");
		// TODO Cat型インスタンスのrunメソッドを実行してください
		// ※ タマは走りました。が表示されれば正解
		cat.run();
		// TODO Cat型インスタンスのeatメソッドを実行してください
		// ※ タマは食事をしました。が表示されれば正解
		cat.eat();
	}
}
