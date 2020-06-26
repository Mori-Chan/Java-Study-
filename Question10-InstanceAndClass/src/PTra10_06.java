/*
 * PTra10_06.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra10_06 {
	public static void main(String[] args) {
		//※この問題はPTra10_05で作成したCarクラスを使用して解いてください。
		// TODO Car型変数 car を型のインスタンスで初期化してください。
		Car car = new Car();
		// TODO 変数 carの colorフィールドに 赤 を代入してください。
		car.color = "赤";
		// TODO 変数 carの gasolineフィールドに 50 を代入してください。
		car.gasoline = 50;
		// 目的地までの距離
		final int DISTANCE = 300;
		/*
		 * TODO 変数carに格納されているインスタンスメソッドrunを繰り返し使って、目的地まで進んでください
		 * 先にガソリンがなくなった場合は、「x色の車は目的地に到達できませんでした」を出力してください
		 * 目的地についた時点で「x色の車は目的地にまでy時間かかりました。残りのガソリンは、zリットルです」を出力してください
		 * xは車の色、yはrunメソッドを実行した回数, zは残りのガソリンの数です
		 */
		int move = 0;
		int count = 0;
		while(true) {
			int ret = car.run();
			// 戻り値が -1 の時はガソリンがなくなった時なので繰り返し終了
			if(ret ==-1) {
				System.out.println(car.color + "色の車は目的地に到達できませんでした。");
				break;
			}
			// 進んだ距離の合計moveにrunメソッドの戻り値を加算
			move += ret;
			// runメソッドを実行した回数countをインクリメント
			count++;
			// 進んだ距離の合計が、目的地を超えた場合は目的についたので繰り返し終了
			if (DISTANCE <= move) {
				System.out.println(car.color + "色の車は目的地に到着するまで、" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです。");
				break;
			}
		}
	}
}
