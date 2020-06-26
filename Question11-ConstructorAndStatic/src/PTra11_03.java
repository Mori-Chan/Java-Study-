/*
 * PTra11_03.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */


public class PTra11_03 {
	public static void main(String[] args) {
		// ※ この問題はCatクラスにコンストラクタを作成してから解いてください。
		// TODO Cat型変数 cat1 を 引数なしでインスタンス化してください。
		Cat cat1 = new Cat();
		// TODO cat1のnameフィールドを出力してください
		// ※ タマと出力されれば正解
		System.out.println(cat1.name);
		// TODO Cat型変数 cat2 を 引数にミケを渡してインスタンス化してください。
		Cat cat2 = new Cat("ミケ");
		// TODO cat2のnameフィールドを出力してください
		// ※ ミケと出力されれば正解
		System.out.println(cat2.name);
	}
}
