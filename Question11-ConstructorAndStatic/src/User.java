

public class User {
	String name;
	Wallet wallet;

	/**
	 * 引数で渡された金額を、walletフィールドのmoneyから引く
	 * @param money
	 */
	void useMoney(int money) {
		this.wallet.money -= money;
		System.out.println(this.name +"は財布の中のお金を" + money + "円使用しました");
	}

	/**
	 * 財布の中の金額を出力する
	 */
	void confirmWallet() {
		System.out.println(this.name +"の財布の中の残額は" + this.wallet.money + "円です");
	}
}
