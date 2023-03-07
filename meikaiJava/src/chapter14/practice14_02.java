package chapter14;

import java.util.Scanner;

/**
 * 演習14-2 ロボット型ペットクラスRobotPet（p.407）を拡張した、着せ替え可能なロボット型ペットクラスを作成せよ。
 * インターフェースSkinnableを実装すること。 ※次のページの解説も参考にすること。
 */

public class practice14_02 {
	static final Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		// 画面の入力からロボットペットを生成する
		System.out.print("ペットの名前を入力してね。：");
		String petName = stdIn.next();
		System.out.print("飼い主の名前を入力してね。：");
		String masterName = stdIn.next();
		SkinnableRobotPet pet = new SkinnableRobotPet(petName, masterName);

		System.out.println("ペットが自己紹介をするよ。");
		pet.introduce();
		System.out.println();

		System.out.println("家事をさせよう。");
		System.out.print("　　0・・・掃除　　1・・・選択　　2・・・炊事：");
		int sw = stdIn.nextInt();
		pet.work(sw);
		System.out.println();

		System.out.println("着せ替えをしよう。色を選んで入力してね。");
		System.out.print("　　0・・・黒　　1・・・赤　　2・・・緑　　3・・・青　　4・・・豹柄：");
		int color = stdIn.nextInt();
		pet.changeSkin(color);
		System.out.println();
	}

}

class SkinnableRobotPet extends RobotPet implements Skinnable {
	private int skin = BLACK;

	// コンストラクタ
	public SkinnableRobotPet(String name, String masterName) {
		super(name, masterName);
	}

	public void changeSkin(int skin) {
		System.out.print("スキンを");
		switch (skin) {
		case BLACK:
			System.out.print("黒");
			break;
		case RED:
			System.out.print("赤");
			break;
		case GREEN:
			System.out.print("緑");
			break;
		case BLUE:
			System.out.print("青");
			break;
		case LEOPARD:
			System.out.print("豹柄");
			break;
		}
		System.out.println("に変更しました。");
	}
}

/** 以下はp.461のサンプルコードです */
// 着せ替えインターフェース
interface Skinnable {
	int BLACK = 0;
	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int LEOPARD = 4;

	void changeSkin(int skin); // ★スキン変更
}

/** 以下はp.407のサンプルコードです */
// ペットクラス
class Pet {
	private String name; // ペットの名前
	private String masterName; // 飼い主の名前

	// コンストラクタ
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}

	// ペットの名前を調べる
	public String getName() {
		return name;
	}

	// 飼い主の名前を調べる
	public String getMasterName() {
		return masterName;
	}

	// 自己紹介
	public void introduce() {
		System.out.println("■僕の名前は" + getName() + "です。");
		System.out.println("■ご主人様は" + getMasterName() + "です。");
	}
}

class RobotPet extends Pet {
	// コンストラクタ
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}

	// 自己紹介
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	// 家事をする
	public void work(int sw) {
		switch (sw) {
		case 0:
			System.out.println("掃除します。");
			break;
		case 1:
			System.out.println("洗濯します。");
			break;
		case 2:
			System.out.println("炊事します。");
			break;
		}
	}
}
