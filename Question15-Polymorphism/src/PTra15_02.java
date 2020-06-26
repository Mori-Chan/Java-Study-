import common.Car;
import common.SportsCar;
import common.Truck;

/*
 * PTra15_02.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra15_02 {
	public static void main(String[] args) {
		//※ この問題はcommonパッケージのクラスを使用して解いてください。
		// TODO SportsCar型のインスタンスをCar型の変数に代入してください
		Car sCar = new SportsCar();
		// TODO Truck型のインスタンスをCar型の変数に代入してください
		Car tCar = new Truck();
		// TODO Car型の配列を作成して、上記2つのインスタンスを追加してください
		Car[] carList = {new SportsCar(), new Truck()};
		/* TODO carListの中身を順番に取り出して、runメソッドを実行してください。
		 *
		 * 以下が表示されれば正解
		 *
		 * スポーツカーは時速100で走った
		 * トラックは時速30で走った
		 */
		for(int i = 0; i < carList.length; i++) {
			carList[i].run();
		}
	}
}
