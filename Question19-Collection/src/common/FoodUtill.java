/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodUtill {

	/**
	 * fileの中のFoodMenu.csvを読み込んで、
	 * ArrayList<Food>の形に変換して返す
	 * @return 料理一覧
	 */
	public static ArrayList<Food> getFoodList() {
		ArrayList<Food> foodList = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/FoodMenu.csv"))) {
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] input = line.split(",");
				Food player = new Food(input[0],Integer.parseInt(input[1]));
				foodList.add(player);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		return foodList;
	}

}
