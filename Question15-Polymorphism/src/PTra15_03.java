import common.Car;
import common.SportsCar;

/*
 * PTra15_03.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra15_03 {
	public static void main(String[] args) {
		//※ この問題はcommonパッケージのクラスを使用して解いてください。
		Car car = new SportsCar();

		// TODO キャストを利用してSportsCarクラスに car 変数を代入してください。
		SportsCar sCar = (SportsCar)car;
		// TODO turboメソッドを実行してください。
		// ※ スポーツカーは時速300で走った と表示されれば正解
		sCar.turbo();
	}
}
