import common.Car;
import common.SportsCar;
import common.Truck;

/*
 * PTra15_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra15_01 {
	public static void main(String[] args) {
		//※ この問題はcommonパッケージのクラスを使用して解いてください。
		// TODO SportsCar型のインスタンスをCar型の変数に代入してください
		Car sCar = new SportsCar();
		// TODO 作成したインスタンスのrunメソッドを実行してください。
		// ※ スポーツカーは時速100で走った と表示されれば正解
		sCar.run();
		// TODO Truck型のインスタンスをCar型の変数に代入してください
		Car tCar = new Truck();
		// TODO 作成したインスタンスのrunメソッドを実行してください。
		// ※ トラックは時速30で走った
		tCar.run();
	}
}
