import common.Dog;

/*
 * PTra13_02.java
 *   作成	Rhizome
 *------------------------------------------------------------
 */

public class PTra13_02 {
	public static void main(String[] args) {
		//※ この問題はcommonパッケージのDogクラスを完成させてから解いてください。
		// TODO commonパッケージのDogクラスをインスンタンス化してください
		Dog dog = new Dog();
		// TODO Dog型インスタンスのnameフィールドに ポチ を代入してください
		dog.setName("ポチ");
		// TODO Dog型インスタンスのrunメソッドを実行してください
		// ※ ポチは走りました。が表示されれば正解
		dog.run();
		// TODO Dog型インスタンスのeatメソッドを実行してください
		// ※ ポチはドッグフードを食べました。が表示されれば正解
		dog.eat();
	}
}
