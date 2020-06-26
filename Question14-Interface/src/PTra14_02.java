import common.SportsCar;

/*
 * PTra14_02.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra14_02 {
	public static void main(String[] args) {
		//※ この問題はcommonパッケージのSportsCarクラスを作成してから解いてください。
		// TODO commonパッケージのSportsCarクラスをインスンタンス化してください
		SportsCar sCar = new SportsCar();
		// TODO スポーツカーにハイオクを100リットル補充してください
		// ※ ハイオクを100リットル補充した と表示されれば正解
		sCar.charge(100);
		// TODO スポーツカー時速100キロで走ってください。
		// ※ スポーツカーは時速100キロで走った と表示されれば正解
		sCar.run(100);
		// TODO スポーツカー時速301キロで走ってください。
		// ※ 速度オーバーです と表示されれば正解
		sCar.run(301);
	}
}