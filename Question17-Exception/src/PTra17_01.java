/*
 * PTra15_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra17_01 {
    public static void main(String[] args) {

    	String str = null;

		/*
		 *  TODO このプログラムを実行するとNullPointerExceptionが発生します。
		 * 	例外処理を行なって、例外処理が発生しました と表示されるようにプログラムを変更してください
		 */
    	try {
    		String[] list = str.split(",");
    	} catch (Exception e) {
    		System.out.println("例外処理が発生しました");
    	}
    }
}