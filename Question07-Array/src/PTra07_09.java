/*
 * PTra07_09.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra07_09 {
	public static void main(String[] args) {
		// 2次元配列
		int[][] array = {
					{1,3,5,7},
					{11,13,17,19,23,29}
				};

		// TODO 2次元配列arrayに含まれるすべての整数要素の平均値を浮動小数で出力してください
		// ※ 繰り返しを使用して記述すること
		int sum = 0;
		int elementNum = 0;
		for(int i = 0;i < array.length;i++) {
			elementNum += array[i].length;
			for(int j = 0;j < array[i].length;j++) {
				sum += array[i][j];
			}
		}
		System.out.println((double)sum / (double)elementNum);
	}
}