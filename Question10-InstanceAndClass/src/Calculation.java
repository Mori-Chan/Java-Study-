/*
 * TODO 以下の仕様のクラスを作成してください
 * （このファイルとは別に、新しくJavaファイルを作成してください）
 *
 * クラス名
 * 		Calculation
 * フィールド
 * 		baseNum		:	int型
 * メソッド
 * 		戻り値(なし)、メソッド名(add)、引数(int num)
 * 		フィールドbaseNum に引数num を加える
 */
public class Calculation {

	int baseNum;

	/**
	 * baseNumフィールドに引数の値を加算する
	 * @param num
	 */
	void add(int num) {
		this.baseNum += num;
	}
}
