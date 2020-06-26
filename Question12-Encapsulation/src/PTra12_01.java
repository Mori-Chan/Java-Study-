/*
 * PTra12_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import common.User;

public class PTra12_01 {
	public static void main(String[] args) {
		// ※ この問題はcommonパッケージのUserクラスを完成させてから解いてください。
		/*
		 * TODO インスタンスフィールドへのアクセスをアクセサ経由に変更してください
		 */
		User user = new User();
		user.setUserId(1000);
		user.setUserName("リゾーム太郎");
		user.setMailAddress("rhizome@hogehoge.com");
		user.setPassword("12345");

		System.out.println("ID　：" + user.getUserId());
		System.out.println("名前　：" + user.getUserName());
		System.out.println("メールアドレス　　：" + user.getMailAddress());
		System.out.println("パスワード　　：" + user.getPassword());
	}
}
