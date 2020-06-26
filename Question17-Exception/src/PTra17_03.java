/*
 * PTra15_03.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra17_03 {
	public static void main(String[] args) {
		try {

			/*
			 *  TODO
			 *  NumberFormatExceptionが発生 が表示されるように、
			 *  以下の処理を書き換えてください
			 */
			throw new NumberFormatException();

		} catch (NullPointerException e) {
			System.out.println("NullPointerExceptionが発生");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatExceptionが発生");
		} catch (Exception e) {
			System.out.println("Exceptionが発生");
		}
	}
}