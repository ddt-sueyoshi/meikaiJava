package chapter13;

import java.util.Random;
import java.util.Scanner;

/**
 * ジャンケンの《プレイヤー》を表す抽象クラスを定義せよ。 そのクラスから、以下のクラスを派生すること。
 * ・人間プレイヤークラス（出す手をキーボードから読み込む） ・コンピュータプレイヤークラス（出す手を乱数から生成する）
 */

public class practice13_03 {

	public static void main(String[] args) {
		System.out.println("コンピューターとジャンケンをしましょう。");

		// コンピュータクラスを生成する
		ComputerPlayer computer = new ComputerPlayer();
		// 人間クラスを生成する
		HumanPlayer human = new HumanPlayer();

		// 勝負の結果を出す
		System.out.print("あなたは");
		human.pon();
		System.out.print("対戦相手は");
		computer.pon();
		WinningOrLosingOrEven(human, computer);
	}

	// ジャンケンの勝ち・敗け・あいこを判定するメソッド
	static void WinningOrLosingOrEven(Player player, Player opponentPlayer) {
		if (player.getHand() == opponentPlayer.getHand()) {
			// プレイヤーと相手プレイヤーが同じ手を出せばあいこ
			System.out.println("あなたと対戦相手はあいこです。");
		} else if ((player.getHand() == 0 && opponentPlayer.getHand() == 1)
				|| (player.getHand() == 1 && opponentPlayer.getHand() == 2)
				|| (player.getHand() == 2 && opponentPlayer.getHand() == 0)) {
			// プレイヤーがグー、相手プレイヤーがチョキの時はプレイヤーの勝ち
			// プレイヤーがチョキ、相手プレイヤーがパーの時はプレイヤーの勝ち
			// プレイヤーがパー、相手プレイヤーがグーの時はプレイヤーの勝ち
			System.out.println("あなたは対戦相手に勝ちました。");
		} else {
			// プレイヤーがグー、相手プレイヤーがパーの時はプレイヤーの負け
			// プレイヤーがチョキ、相手プレイヤーがグーの時はプレイヤーの負け
			// プレイヤーがパー、相手プレイヤーがチョキの時はプレイヤーの負け
			System.out.println("あなたは対戦相手に負けました。");
		}
	}
}

/**
 * ジャンケンの《プレイヤー》を表す抽象クラス
 */
abstract class Player {
	// 手を表すフィールド
	// グーなら 0 , チョキなら 1 , パーなら 2とする
	private int hand;

	Player() {
	}

	// 手を取得する
	public int getHand() {
		return hand;
	}

	// 手を設定する
	public void setHand(int hand) {
		this.hand = hand;
	}

	// 手をメッセージで出力する
	abstract void pon();
}

/**
 * ジャンケンの《人間プレイヤー》を表すクラス Playerクラスの継承クラス
 */
class HumanPlayer extends Player {
	final static Scanner stdIn = new Scanner(System.in);

	HumanPlayer() {
		// キーボードの入力で手を設定する
		System.out.println("グーなら 0 , チョキなら 1 , パーなら 2 を入力してください。");
		int hand = stdIn.nextInt();
		setHand(hand);
	}

	void pon() {
		switch (getHand()) {
		case 0:
			System.out.println("グーを出しました。");
		case 1:
			System.out.println("チョキを出しました。");
		case 2:
			System.out.println("パーを出しました。");
		}
	}
}

/**
 * ジャンケンの《コンピュータプレイヤー》を表すクラス Playerクラスの継承クラス
 */
class ComputerPlayer extends Player {
	Random rand = new Random();

	ComputerPlayer() {
		// 乱数から手を設定する
		int hand = rand.nextInt(3);
		setHand(hand);
	}

	void pon() {
		switch (getHand()) {
		case 0:
			System.out.println("グーを出しました。");
		case 1:
			System.out.println("チョキを出しました。");
		case 2:
			System.out.println("パーを出しました。");
		}
	}
}
