/**
 * @author 81906
 *
 */
public class PTra10_08 {
	public static void main(String[] args) {
		//※この問題は PTra10_05で作成したCarクラスを使用して解いてください。
		// 目的地までの距離
		final int DISTANCE = 300;

		/*
		 * TODO Car型のインスタンスを3件作成し、それぞれの色、ガソリンを以下のように設定してください。
		 * 1台目：colorフィールドに"赤"、gasolineフィールドに50
		 * 2台目：colorフィールドに"青"、gasolineフィールドに60
		 * 3台目：colorフィールドに"黄"、gasolineフィールドに70
		 *
		 * 各carインスタンスメソッドrunを繰り返し使って、それぞれ目的地まで進んでください
		 * 先にガソリンがなくなった場合は、「x色の車は、目的地に到達できませんでした」を出力してください
		 * 目的地についた時点で「x色の車は、目的地にまでy時間かかりました。残りのガソリンは、zリットルです」を出力してください
		 * ※ xは車の色、yはrunメソッドを実行した回数, zは残りのガソリンの数です
		 * ※ クラス型配列を利用して処理を行なってください。
		 */
		Car car1 = new Car(), car2 = new Car(), car3 = new Car();
		// 1台目
		car1.color = "赤";
		car1.gasoline = 50;
		// 2台目
		car2.color = "青";
		car2.gasoline = 60;
		// 3台目
		car3.color = "黄";
		car3.gasoline = 70;
		// Car型配列に作成したインスンタンスを格納する
		Car[] carList = new Car[3];
		carList[0] = car1;
		carList[1] = car2;
		carList[2] = car3;
		// 配列の要素数分繰り返しを行う
		for(int i = 0; i < carList.length; i++) {
			/*
			 *  進んだ距離の合計move と runメソッドを実行した回数のcountは繰り返しスコープの外で初期化
			 *  このタイミングで初期化をおこなうことで、車ごとの進んだ距離と実行回数にすることができる
			 */
			int move = 0;
			int count = 0;
				/*
				 *  carListのi番目のrunメソッドを実行する。
				 *  iの数が0,1,2と増えていくので、繰り返すごとに別のインスタンスのrunメソッドが実行される
				 */
			while(true) {
				int car = carList[i].run();
				// 戻り値が -1 の時はガソリンがなくなった時なので繰り返し終了
				if(car == -1) {
					System.out.println(carList[i].color + "色の車は、目的地に到達できませんでした。");
					break;
				}
				// 進んだ距離の合計moveにrunメソッドの戻り値を加算
				move += car;
				// runメソッドを実行した回数countをインクリメント
				count++;
				// 進んだ距離の合計が、目的地を超えた場合は目的についたので繰り返し終了
				if(move >= DISTANCE) {
					System.out.println(carList[i].color + "色の車は、目的地にまで" + count + "時間かかりました。残りのガソリンは、" + carList[i].gasoline + "リットルです。");
					break;
				}
			}
		}
	}
}
