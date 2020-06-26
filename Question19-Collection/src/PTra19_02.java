import java.util.ArrayList;

import common.Player;

/*
 * PTra19_02.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra19_02 {
    public static void main(String[] args) {
    	// TODO Player型を格納するArraylistを変数名 playserList で作成してください。
    	ArrayList<Player> playserList = new ArrayList<Player>();
    	/*
    	 *  TODO 以下の情報を持つインスンタンスを3つ作成してください
    	 *
    	 *  -------1人目---------
    	 *  ポジション：MF
    	 *  名前		：佐川真司
    	 *  国		：日本
    	 *  所属チーム：ドルトムント
    	 *
    	 *  -------2人目---------
    	 *  ポジション：DF
    	 *  名前		：永元佑都
    	 *  国		：日本
    	 *  所属チーム：インテル
    	 *
    	 *  -------3人目---------
    	 *  ポジション：MF
    	 *  名前		：本田健佑
    	 *  国		：日本
    	 *  所属チーム：ACミラン
    	 */
    	Player player1 = new Player("MF", "佐川真司", "日本", "ドルトムント");
    	Player player2 = new Player("DF", "永元佑都", "日本", "インテル");
    	Player player3 = new Player("MF", "本田健佑", "日本", "ACミラン");
    	// TODO 作成したインスタンスを全てplayserListに追加してください
    	playserList.add(player1);
    	playserList.add(player2);
    	playserList.add(player3);
    	/*
    	 *  TODO playserListの情報を全て出力してください。(拡張for文を使用する事)
    	 *
    	 * ※ 以下のように標示されれば正解
    	 * MF,佐川真司,日本,ドルトムント
		 * DF,永元佑都,日本,インテル
		 * MF,本田健佑,日本,ACミラン
    	 */
    	for(Player player : playserList) {
    		System.out.println(player);
    	}
    }
}