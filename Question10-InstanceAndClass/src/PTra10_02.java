/*
 * PTra10_02.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra10_02 {
	public static void main(String[] args) {
		// ※ この問題はUserクラスを使用して解いてください。
		// TODO User型変数 user を宣言してください。
		User user;
		// TODO 変数 user に userインスタンスを代入してください。
		user = new User();
		// TODO 変数 userのidフィールドに 2000 を代入してください。
		user.id = 2000;
		// TODO 変数 userのnameフィールドに 佐藤二郎 を代入してください。
		user.name = "佐藤二郎";
		// TODO 変数 userの printProfileメソッド を呼び出してください。
		user.printProfile();
	}
}
