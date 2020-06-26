/*
 * PTra10_05.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

/*
 * TODO 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
 *
 * クラス名
 * 		Car
 * フィールド
 * 		color			:	String型
 * 		gasoline		:	int型
 * メソッド
 * 		戻り値(int)、メソッド名(run)、引数(なし)
 * 			・gasolineフィールドの値を1減らす。
 * 			・1～15の数の中からランダムな値（車が進む距離）を戻り値として返す。
 * 			・もしgasolineフィールドが負の数になった場合（車がもう進めない）は-1を戻り値として返す。
 */
public class PTra10_05 {
	public static void main(String[] args) {
		// ※この問題はCarクラスを作成してから解いてください。

		// TODO Car型変数 car を型のインスタンスで初期化してください。
		Car car = new Car();
		// TODO 変数 carの colorフィールドに 赤 を代入してください。
		car.color = "赤";
		// TODO 変数 carの gasolineフィールドに 50 を代入してください。
		car.gasoline = 50;
		// TODO 変数 carに格納されているインスタンスメソッドrunを実行してください。
		int move = car.run();
		// TODO 「x色の車はy進みました」と出力してください。
		// ※ xには車の色、yには車の進んだ距離を入れること
		System.out.println(car.color + "色の車は" + move + "進みました");
		// TODO 変数 carのgasolineフィールドを出力してください。(49が出力されること)
		System.out.println(car.gasoline);
	}
}
