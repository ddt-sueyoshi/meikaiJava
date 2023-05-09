package chapter15;

import java.util.Random;
import java.util.Scanner;

/**
 * 3人でジャンケンを行うプログラムを作成せよ。 プレイヤー３人のうち、コンピュータを２人として、人間を１人とすること。
 * 又演習13-3(p.443)で作成した、プレイヤークラスを利用すること。
 */
public class practice15_05 {

	public static void main(String[] args) {
		System.out.println("コンピューターとジャンケンをしましょう。");

		// コンピュータクラスを生成する
		ComputerPlayer computer1 = new ComputerPlayer();
		ComputerPlayer computer2 = new ComputerPlayer();
		// 人間クラスを生成する
		HumanPlayer human = new HumanPlayer();

		// 勝負の結果を出す
		System.out.print("あなた（プレイヤー１）は");
		human.pon();
		System.out.print("プレイヤー２は");
		computer1.pon();
		System.out.print("プレイヤー３は");
		computer2.pon();
		printTheGame(human, computer1, computer2);
	}

// ジャンケンの勝ち・敗け・あいこを判定するメソッド
	static void printTheGame(Player player1, Player player2, Player player3) {
		int hand1 = player1.getHand();
		int hand2 = player2.getHand();
		int hand3 = player3.getHand();

		if ((hand1 == hand2 && hand2 == hand3) || (hand1 != hand2 && hand2 != hand3 && hand3 != hand1)) {
			// ３人が同じ手、又は全員が別々の手を出せばあいこ
			System.out.println("あいこです。");
		} else if (hand1 == hand2) {
			if ((hand1 == 0 && hand3 == 1) || (hand1 == 1 && hand3 == 2) || (hand1 == 2 && hand3 == 0)) {
				System.out.println("プレイヤー１とプレイヤー２は勝ちました。プレイヤー３は負けました。");
			} else {
				System.out.println("プレイヤー３は勝ちました。プレイヤー１とプレイヤー２は負けました。");
			}
		} else if (hand1 == hand3) {
			if ((hand1 == 0 && hand2 == 1) || (hand1 == 1 && hand2 == 2) || (hand1 == 2 && hand2 == 0)) {
				System.out.println("プレイヤー１とプレイヤー３は勝ちました。プレイヤー２は負けました。");
			} else {
				System.out.println("プレイヤー２は勝ちました。プレイヤー１とプレイヤー３は負けました。");
			}
		} else {
			if ((hand1 == 0 && hand3 == 1) || (hand1 == 1 && hand3 == 2) || (hand1 == 2 && hand3 == 0)) {
				System.out.println("プレイヤー１は勝ちました。プレイヤー３とプレイヤー２は負けました。");
			} else {
				System.out.println("プレイヤー３とプレイヤー２は勝ちました。プレイヤー１は負けました。");
			}
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
			break;
		case 1:
			System.out.println("チョキを出しました。");
			break;
		case 2:
			System.out.println("パーを出しました。");
			break;
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
			break;
		case 1:
			System.out.println("チョキを出しました。");
			break;
		case 2:
			System.out.println("パーを出しました。");
			break;
		}
	}
}
