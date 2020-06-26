/*
 * PTra11_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra11_01 {
	public static void main(String[] args) {
		// ※ この問題はUserクラス、Walletクラスを使用して解いてください。
		// TODO Wallet型変数 wallet をWallet型のインスタンスで初期化してください。
		Wallet wallet = new Wallet();
		// TODO walletのmoneyフィールドに10000を代入してください。
		wallet.money = 10000;
		// TODO User型変数 user をUser型のインスタンスで初期化してください
		User user = new User();
		// TODO userのnameフィールドに太郎を代入してください。
		user.name = "太郎";
		// TODO userのwalletフィールドに作成したwalletを代入してください。
		user.wallet = wallet;
		// TODO userのconfirmWalletメソッドを実行してください。
		// ※ 太郎の財布の中の残額は10000円です と表示されます。
		user.confirmWallet();
		// TODO userのuseMoneyメソッドを 引数1000 で実行してください。
		user.useMoney(1000);
		// TODO userのconfirmWalletメソッドを再度実行してください。
		// ※ 太郎の財布の中の残額は9000円です と表示されます。
		user.confirmWallet();
	}
}
