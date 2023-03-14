package chapter14;

import java.util.Scanner;

/**
 * 演習14-3 クラスDVDPlayer（p.467）を利用するプログラム例を作成せよ
 */

public class practice14_03 {
	static final Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		DVDPlayer player = new DVDPlayer();
		int toContinue; // 操作続行判定

		do {
			System.out.println("DVDプレイヤーを操作しましょう。　１・・・再生　　２・・・停止　　３・・・スロー再生");
			int operation = stdIn.nextInt();
			switch (operation) {
			case 1:
				player.play();
				System.out.println();
				break;
			case 2:
				player.stop();
				System.out.println();
				break;
			case 3:
				player.slow();
				System.out.println();
				break;
			}

			System.out.println("操作を続けますか？　１・・・はい　　２・・・いいえ");
			toContinue = stdIn.nextInt();
		} while (toContinue == 1);
	}

}

/** 以下はp.456のサンプルコードです */

interface Player {
	void play(); // 再生

	void stop(); // 停止
}

/** 以下はp.467のサンプルコードです */

// 拡張プレーヤ　インターフェース（スロー再生付き）
interface ExPlayer extends Player {
	void slow(); // スロー再生
}

// DVDプレーヤ
class DVDPlayer implements ExPlayer {
	public void play() {
		System.out.print("■DVD再生開始！");
	}

	public void stop() {
		System.out.print("■DVD再生終了！");
	}

	public void slow() {
		System.out.print("■DVDスロー再生開始！");
	}
}
