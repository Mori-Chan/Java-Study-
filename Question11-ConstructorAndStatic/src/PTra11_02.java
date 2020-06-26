/*
 * PTra11_02.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra11_02 {
	public static void main(String[] args) {
		// ※ この問題はUserクラス、Walletクラスを使用して解いてください。
		// TODO Wallet型変数 wallet をWallet型のインスタンスで初期化してください。
		Wallet wallet = new Wallet();
		// TODO walletのmoneyフィールドに10000を代入してください。
		wallet.money = 10000;
		// TODO Atm型変数 atm をAtm型のインスタンスで初期化してください
		Atm atm = new Atm();
		/*
		 * TODO atmの withdrawメソッドを作成したに以下の引数を渡して呼びだしてください
		 * 第一引数 wallet、第二引数 100000
		 */
		atm.withdraw(wallet, 100000);
		// TODO walletのmoneyフィールドを出力してください
		// ※ 値が110000になっていれば正解
		System.out.println(wallet.money);
		/*
		 * TODO atmの withdrawメソッドを作成したに以下の引数を渡して呼びだしてください
		 * 第一引数 wallet、第二引数 100000
		 * ※ 預金残高不足です。現金の引き出しに失敗しましたと出れば正解
		 */
		atm.withdraw(wallet, 100000);
		// TODO walletのmoneyフィールドを出力してください
		// ※ 値が110000のまま変わっていなければ正解
		System.out.println(wallet.money);
	}
}
