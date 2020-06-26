/*
 * PTra02_08.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra02_08 {

	public static void main(String[] args) {
		// 所持金
		int money = 1000;
		// 商品価格(税抜)
		int price = 580;
		// 消費税率
		double taxRate = 0.08;

		// TODO 買い物した際の残金計算をします。
		// TODO 所持金から価格を引いた値を、買い物後の所持金として再代入してください。
		// ※消費税を考慮してください。税込み商品価格の端数は切り捨てとします。

		money -= price + (int)(price * taxRate);

		// 残金の表示部分です。編集しないでください
		System.out.println("残金は" + money + "円です。");
	}

}
