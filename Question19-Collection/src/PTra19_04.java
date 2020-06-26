import java.util.ArrayList;

import common.Player;
import common.PlayerUtill;

/*
 * PTra19_04.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra19_04 {
	public static void main(String[] args) {
		// TODO PlayerUtillクラスのgetPlayerListメソッドを使用して選手のリストを取得してください
		ArrayList<Player> playerList = PlayerUtill.getPlayerList();
		// TODO 選手のリストから、レアル・マドリード と バルセロナの選手を除外してください
		for(int i = playerList.size() - 1; i >= 0; i--) {
			if(playerList.get(i).getTeam().equals("レアル・マドリード") || playerList.get(i).getTeam().equals("バルセロナ")) {
				playerList.remove(i);
			}
		}
		// TODO 選手のリストをすべて出力してください
		for (Player player : playerList) {
			System.out.println(player);
		}
	}
}