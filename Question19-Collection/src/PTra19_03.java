import java.util.ArrayList;

import common.Player;
import common.PlayerUtill;

/*
 * PTra19_03.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra19_03 {
    public static void main(String[] args) {
    	//※ この問題はcommonパッケージのPlayerUtillクラスをよく読んでから解いてください。
    	// TODO PlayerUtillクラスのgetPlayerListメソッドを使用して選手のリストを取得してください
    	ArrayList<Player> playserList = PlayerUtill.getPlayerList();
    	// TODO 選手のリストから、ポジションが FW の選手のみ出力してください
    	for (Player player : playserList) {
			if(player.getPosition().equals("FW")) {
				System.out.println(player);
			}
		}
    }
}