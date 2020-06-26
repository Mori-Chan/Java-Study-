/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerUtill {

	/**
	 * fileの中のBestElevenCandidate.csvを読み込んで、
	 * ArrayList<Player>の形に変換して返す
	 * @return サッカー選手一覧
	 */
	public static ArrayList<Player> getPlayerList() {
		ArrayList<Player> playerList = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] input = line.split(",");
				Player player = new Player(input[0],input[1],input[2],input[3]);
				playerList.add(player);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		return playerList;
	}

}
