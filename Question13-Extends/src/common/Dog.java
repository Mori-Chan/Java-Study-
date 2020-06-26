/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

// TODO 同一パッケージのAnimalクラスを継承してください
public class Dog extends Animal{
	/*
	 *  TODO eatメソッドをオーバーライドして以下の内容が出力されるようにしてください。
	 *  name はドッグフードを食べました
	 *  ※ name には name フィールドの値が入る
	 */
	public void eat() {
		System.out.println(getName() + "はドッグフードを食べました。");
	}
}
