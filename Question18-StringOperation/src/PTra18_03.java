/*
 * PTra18_03.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra18_03 {
	public static void main(String[] args) {
		String str = "りんご,みかん,いちご,ぶどう";

		// TODO strクラスの文字をカンマで区切って配列に変換してください
		String[] fruitList = str.split(",");
		// TODO 配列の中の文字列を全て出力して下さい
		for (String f : fruitList) {
			System.out.println(f);
		}
	}
}
