/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

/*
 *  TODO 以下の要件を満たしたクラスを作成してください。
 *  ・Bookクラスを継承する
 *  ・Bookクラスの抽象メソッドを実装する。実装内容は以下の通り
 *  	本のタイトル
 *  		Javaの基礎入門
 *
 *  	章立てのリスト
 *			・式と変数
 *			・制御構文
 *			・メソッド
 *			・オブジェクト指向
 *			・継承
 */
public class JavaBasicBook extends Book {
	public String getBookTite() {
		return "Javaの基礎入門";
	}
	public String[] getEpisodeList() {
		String[] epList = {"式と変数" ,"制御構文", "メソッド", "オブジェクト指向", "継承"};
		return epList;
	}
}
