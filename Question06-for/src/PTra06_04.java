/*
 * PTra06_04.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra06_04 {
	public static void main(String[] args) {
		// TODO 下記のfor文の中で、変数iの値を条件に以下のような挙動をするプログラムを作成してください。
		/*
		 * ① iが3で割り切れる場合はfizzと出力する
		 * ② iが5で割り切れる場合はbuzzと出力する
		 * ③ iが3でも5でも割り切れる場合はfizzbuzzと出力する
		 * ④ 上記のいずれにも当てはまらない場合はiの値をそのまま出力する
		 */
		for(int i = 1;i < 50;i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if(i % 3 == 0) {
				System.out.println("fizz");
			} else if(i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}

	}
}
