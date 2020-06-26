import java.util.ArrayList;

/*
 * PTra19_01.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra19_01 {
    public static void main(String[] args) {
    	// TODO String型を格納するArraylistを変数名 animals で作成してください。
    	ArrayList<String> animals = new ArrayList<String>();
    	/*
    	 *  TODO animalsに以下の文字列を追加してください
    	 *  ・いぬ
    	 *  ・ねこ
    	 *  ・うさぎ
    	 *  ・たぬき
    	 */
    	animals.add("いぬ");
    	animals.add("ねこ");
    	animals.add("うさぎ");
    	animals.add("たぬき");
    	// TODO animalsの中身を全て出力してください(拡張for文を使用する事)
    	for(String anim : animals) {
    		System.out.println(anim);
    	}
    }
}