import common.JavaBasicBook;

/*
 * PTra14_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra14_01 {
	public static void main(String[] args) {
		//※ この問題はcommonパッケージのJavaBasicBookクラスを完成させてから解いてください。
		// TODO commonパッケージのJavaBasicBookクラスをインスンタンス化してください
		JavaBasicBook jBook = new JavaBasicBook();
		// TODO インスタンスから本のタイトルを取得して出力してください
		System.out.println(jBook.getBookTite());
		// TODO インスタンスから章立てのリストを取得して出力してください
		String[] epList = jBook.getEpisodeList();
		for(int i = 0; i < epList.length; i++) {
			System.out.println(epList[i]);
		}

	}
}
