/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

/*
 *  TODO 以下の要件を満たしたクラスを作成してください。
 *  ・Carクラスを実装する
 *
 *  ・Carクラスの抽象メソッドを実装する。実装内容は以下の通り
 *  	ガソリンを補充する
 *  		ハイオクを x リットル補充した(x は引数の値) と表示する
 *
 *  	走る
 *			スポーツカーは時速 x キロで走った と表示する
 *			ただし、引数の値が 300 を超えた場合は 速度オーバーです と表示する
 *
 */
public class SportsCar implements Car {
	public void charge(int x) {
		System.out.println("ハイオクを" + x + "リットル補充した");
	}
	public void run(int x) {
		if (x > 300) {
			System.out.println("速度オーバーです");
		} else {
			System.out.println("スポーツカーは時速" + x +"キロで走った");
		}
	}
}
