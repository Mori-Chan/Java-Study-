/*
 * PTra07_03.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_03 {
	public static void main(String[] args) {
		String[] array = new String[5];
		array[0] = "森";
		array[1] = "山";
		array[2] = "沼";
		array[3] = "島";
		array[4] = "平地";

		// TODO 配列arrayの全要素を順番に出力してください
		// ※ 繰り返しを使用して記述すること
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		for (String string : array) {
			System.out.println(string);
		}
	}
}
