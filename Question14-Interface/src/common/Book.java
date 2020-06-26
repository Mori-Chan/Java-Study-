/*
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package common;

/**
 * 本についての抽象クラス
 */
public abstract class Book {

	/**
	 * 本のタイトルを取得する
	 * @return 本のタイトル
	 */
	public abstract String getBookTite();

	/**
	 * 本の章立てのリストを取得する
	 * @return 章立ての一覧
	 */
	public abstract String[] getEpisodeList();
}
