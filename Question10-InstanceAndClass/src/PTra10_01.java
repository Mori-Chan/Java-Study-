/*
 * PTra10_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra10_01 {
	public static void main(String[] args) {
		// ※ この問題はUserクラスを使用して解いてください。
		// TODO User型変数 user を宣言してください。
		User user;
		// TODO 変数 user に userインスタンスを代入してください。
		user = new User();
		// TODO 変数 userのidフィールドに 1000 を代入してください。
		user.id = 1000;
		// TODO 変数 userのnameフィールドに 山田太郎 を代入してください。
		user.name = "山田太郎";
		// TODO 変数 userの idフィールド を出力してください。
		System.out.println(user.id);
		// TODO 変数 userの nameフィールド を出力してください。
		System.out.println(user.name);
	}
}
