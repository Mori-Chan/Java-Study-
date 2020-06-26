

public class Student {
	String name;			// 生徒の名前
	static String group;	// 教室の名前
	static String teacher;	// 先生の名前

	/**
	 * 生徒のプロフィールを出力する
	 */
	void studentProfile() {
		System.out.println(this.name + "は" + group + "教室の生徒です");
	}

	/**
	 * 教室のプロフィールを出力する。
	 */
	static void groupProfile() {
		System.out.println(group + "教室の担任は" + teacher + "先生です。");
	}


}
