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
	static int n = 1; // 一つ前の識別番号との差
	private int id; // 番号

	/**
	 * コンストラクタ
	 */
	public ExId() {
		counter = counter + n;
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

	/**
	 * 最新の番号と次の番号との差を取得する
	 * 
	 * @return 最新の番号と次の番号との差
	 */
	static int getDiff() {
		return n;
	}

	/**
	 * 最新の番号と次の番号との差を変更する
	 * 
	 * @param n 最新の番号と次の番号との差
	 */
	void changeDiff(int n) {
		this.n = n;
	}
}

public class practice10_02 {

	public static void main(String[] args) {
		Scanner stdInput = new Scanner(System.in);

		// 採番クラスを生成し最新の番号を表示する
		ExId id = new ExId();
		System.out.println("最新の番号は " + id.getMaxId() + " です。");

		int isGoingOn = 0; // 続行フラグ
		do {
			System.out.println("次の番号は最新の番号より " + id.getDiff() + " 大きくなります。\n変更しますか？　　1・・・はい　　0・・・いいえ\"");
			int isChangingN = stdInput.nextInt(); // 1 が入力されれば最新の番号と次の番号との差を変更する
			
			if (isChangingN == 1) {
				System.out.println("最新の番号よりいくつ大きくしますか。整数を入力してください。");
				int n = stdInput.nextInt();
				id.changeDiff(n); // 入力された値を最新の番号と次の番号との差とする
			}
			
			// 新たに番号を発行し、表示する
			ExId newId = new ExId();
			System.out.println("新たに番号を発行しました。最新の番号は " + id.getMaxId() + " です。");

			System.out.println("採番を続けますか？　　1・・・はい　　0・・・いいえ");
			isGoingOn = stdInput.nextInt(); // 1が入力されれば採番処理を繰り返す
		} while (isGoingOn == 1);
	}

}
