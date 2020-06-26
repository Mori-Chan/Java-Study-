import java.util.ArrayList;
import java.util.Collections;

import common.Food;
import common.FoodUtill;

/*
 * PTra19_05.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra19_05 {
    public static void main(String[] args) {
    	// TODO FoodUtillクラスのgetFoodListメソッドを使用して料理一覧を取得してください
ArrayList<Food> foodList = FoodUtill.getFoodList();
    	/*
    	 *  TODO 料理一覧の中からランダムに3品選んで、
    	 *  選んだ料理名3つと合計の値段を出力してください。
    	 *  ※ 同じ料理が2回以上表示されてはいけません
    	 *  ※ 合計金額は 消費税は8%を加算して出力してください。(小数点以下切り捨て)
    	 */
	Collections.shuffle(foodList);
	int totalPrice = 0;
	for (int i = 0; i < 3; i++) {
		System.out.println(foodList.get(i).getName());
		totalPrice += foodList.get(i).getPrice();
	}
	System.out.println("合計金額は" + (int)((totalPrice * 1.08)) + "円です。");
    }
}