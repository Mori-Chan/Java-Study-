import common.ThrowExceptionUtil;

/*
 * PTra15_02.java
 *   作成	Rhizome
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
public class PTra17_02 {
    public static void main(String[] args) {

		/*
		 *  TODO
		 *  commonパッケージのThrowExceptionUtilクラスから
		 *	countDownメソッドを引数 10 で呼び出してください
		 */

    	try {
    		ThrowExceptionUtil.countDown(10);
    	} catch (Exception e) {
			System.out.println("引数に負の数が渡されました");
    	}
    }
}