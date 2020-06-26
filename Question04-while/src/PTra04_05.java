/*
 * PTra04_05.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Random;
import java.util.Scanner;

public class PTra04_05 {
	public static void main(String[] args) {
		// 以下はじゃんけんを行うプログラムです。
		// TODO TODOコメントの指示に従ってプログラムを完成させてください。

		// 入力を要求するためのもの
		Scanner scanner = new Scanner(System.in);
		// 乱数生成処理
		Random random = new Random();

		// 勝敗の状態を覚えておくための変数(初期値は負けとする)
		boolean winFlag = false;

		// プレイヤーが勝つまでじゃんけんを繰り返す。
		while(!winFlag) {
			int playerHand;
			int npcHand;

			// プレイヤーに出す手を選ばせる
			// ※ 数値でない入力は考慮していません(エラーになります)
			System.out.println("じゃんけんを行います。");
			System.out.println("あなたの出す手を入力してください");
			System.out.println("0:グー, 1:チョキ, 2:パー");
			playerHand = Integer.parseInt(scanner.nextLine());
			// TODO 選ばれた手を出力してください(0なら"あなたはグーを出しました"等)
			switch(playerHand) {
			case 0:
				System.out.println("あなたはグーを出しました");
				break;
			case 1:
				System.out.println("あなたはチョキを出しました");
				break;
			case 2:
				System.out.println("あなたはパーを出しました");
				break;
			default:
				// 範囲外の数値が選ばれた場合
				System.out.println("選択肢にない数値が選ばれました。");
				break;
			}

			// 対戦相手の手をランダムに選択する。
			npcHand = random.nextInt(3);
			// TODO 対戦相手の手を出力してください(0なら"相手はグーを出しました"等)
			switch(npcHand) {
			case 0:
				System.out.println("相手はグーを出しました");
				break;
			case 1:
				System.out.println("相手はチョキを出しました");
				break;
			case 2:
				System.out.println("相手はパーを出しました");
				break;
			default:
				break;
			}

			// TODO じゃんけんの結果を出力してください。
			// TODO プレイヤーが勝った場合はプログラムが終了するようにしてください。
			if(playerHand == 0) {
				// プレイヤーがグーを出した場合
				if(npcHand == 0) {
					// 対戦相手がグーならあいこ
					System.out.println("あいこです");
				} else if(npcHand == 1) {
					// 対戦相手がチョキなら勝ち
					System.out.println("あなたの勝ちです！");
					System.out.println("プログラムを終了します");
					winFlag = true;
				} else if(npcHand == 2) {
					// 対戦相手がパーなら負け
					System.out.println("対戦相手の勝ちです");
				}
			} else if(playerHand == 1) {
				// プレイヤーがチョキを出した場合
				if(npcHand == 0) {
					// 対戦相手がグーなら負け
					System.out.println("対戦相手の勝ちです");
				} else if(npcHand == 1) {
					// 対戦相手がチョキならあいこ
					System.out.println("あいこです");
				} else if(npcHand == 2) {
					// 対戦相手がパーなら勝ち
					System.out.println("あなたの勝ちです！");
					System.out.println("プログラムを終了します");
					winFlag = true;
				}
			} else if(playerHand == 2) {
				// プレイヤーがパーを出した場合
				if(npcHand == 0) {
					// 対戦相手がグーなら勝ち
					System.out.println("あなたの勝ちです！");
					System.out.println("プログラムを終了します");
					winFlag = true;
				} else if(npcHand == 1) {
					// 対戦相手がチョキなら負け
					System.out.println("対戦相手の勝ちです");
				} else if(npcHand == 2) {
					// 対戦相手がパーならあいこ
					System.out.println("あいこです");
				}
			}

			// 次のじゃんけんの前に改行しておく
			System.out.println();
		}
	}
}
