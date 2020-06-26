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
import java.util.Random;

public class Car {
	String color;
	int gasoline;
	int run() {
		this.gasoline--;
		if(gasoline < 0) {
			return -1;
		}
		Random random = new Random();
		int dist = random.nextInt(15) +1;
		return dist;
	}
}
