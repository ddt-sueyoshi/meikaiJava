package chapter10;

import java.util.Scanner;

/**
 * 
 * @author user
 * 演習10-2
 * 前問で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ。
 * インスタンスを生成するたびに識別番号をnずつ増やして与える(nは正の数)。
 * nの値は、指定されない限り1とするが、メソッドを通じて取得・変更できるようにする。
 * 
 * 例えばインスタンスを3個生成した後にnを4に変更した場合、インスタンスに与える識別番号は生成順に 
 * 2, 3, 3, 4, 7, 11, 15 ･･･ となる。
 */

/** 採番クラス */
class ExId {
	static int counter = 0; // 何番までの番号を与えたか
	private int id; // 番号

	/**
	 * コンストラクタ
	 */
	public ExId() {
		id = ++counter;
	}

	/**
	 * コンストラクタ
	 * 
	 * @param n 一つ前の識別番号との差
	 */
	public ExId(int n) {
		counter += n;
		id = counter;
	}

	/**
	 * 番号を取得
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 最新の番号を取得
	 * 
	 * @return
	 */
	static int getMaxId() {
		return counter;
	}
}

public class practice10_02 {

	public static void main(String[] args) {
		Scanner stdInput = new Scanner(System.in);

		// 採番クラスを生成し最新の番号を表示する
		ExId id = new ExId();
		System.out.println("最新の番号は " + id.getMaxId() + " です。");

		int isGoingOn = 0; // 続行フラグ 1が入力されれば採番処理を繰り返す
		do {
			// 入力値を直近の番号との差として採番する
			System.out.println("次の番号は最新よりもいくつ大きくしますか？　数字を入力してください。");
			int diff = stdInput.nextInt();
			ExId nextId = new ExId(diff);
			System.out.println("最新の番号は " + id.getMaxId() + " です。");

			System.out.println("採番を続けますか？　　1・・・はい　　0・・・いいえ");
			isGoingOn = stdInput.nextInt();
		} while (isGoingOn == 1);
	}

}
