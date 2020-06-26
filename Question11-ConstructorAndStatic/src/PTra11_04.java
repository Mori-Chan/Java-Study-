/*
 * PTra11_04.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra11_04 {
	public static void main(String[] args) {
		// ※この問題はStudentクラスを使用して解いてください。
		// TODO 生徒の名前に 太郎 を設定してください。
		Student student = new Student();
		student.name = "太郎";
		// TODO 教室の名前に A を設定してください。
		Student.group = "A";
		// TODO 先生の名前に 山田 を設定してください。
		Student.teacher = "山田";
		// TODO studentProfileメソッドを実行してください。
		// ※ 太郎はA教室の生徒です と表示されれば正解
		student.studentProfile();
		// TODO groupProfileメソッドを実行してください
		// ※ A教室の担任は山田先生です。 と表示されれば正解
		Student.groupProfile();
	}
}
