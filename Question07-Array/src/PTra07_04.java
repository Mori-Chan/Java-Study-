/*
 * PTra07_04.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_04 {
	public static void main(String[] args) {
		int[] array = new int[1000];

		// TODO 配列arrayに1から1000までの整数を順に入れてください
		// ※ for文を用いて代入を行うこと
		for(int i = 0; i < 1000; i++) {
			array[i] = i+1;
		}

		// TODO 配列arrayの全要素を順番に出力してください
//		for(int j = 0; j < array.length; j++) {
//			System.out.println(array[j]);
//		}
		for(int j : array) {
			System.out.println(j);
		}
	}
}
