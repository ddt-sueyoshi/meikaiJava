package chapter10;

import java.util.Scanner;

/**
 * 
 * @author user
 * 演習10-05
 * インスタンスが生成されるたびに『明解銀行での口座開設ありがとうございます。』と表示するように、
 * 銀行口座クラスAccountを変更せよ。表示はインスタンス初期化子で行うこと。
 */

/** 銀行口座クラス */
class Account {
	private String name; // 口座名義
	private String no; // 口座番号
	private long balance; // 預金残額
	private int createdYear; // 口座開設年 *新規追加
	private int createdMonth; // 口座開設月 *新規追加
	private int createdDate; // 口座開設日 *新規追加

	// --- インスタンス初期化子 --- //
	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}

	// --- コンストラクタ --- //
	Account(String n, String num, long z, int y, int m, int d) {
		name = n;
		no = num;
		balance = z;
		createdYear = y;
		createdMonth = m;
		createdDate = d;
	}

	// --- 口座名義を調べる --- //
	String getName() {
		return name;
	}

	// --- 口座番号を調べる --- //
	String getNo() {
		return no;
	}

	// --- 預金残高を調べる --- //
	long getBalance() {
		return balance;
	}

	// --- k円預ける --- //
	void deposit(long k) {
		balance += k;
	}

	// --- k円下ろす --- //
	void withdraw(long k) {
		balance -= k;
	}

	// --- 口座開設日をStringで調べる *新規追加 --- //
	public String toString() {
		String createdDay = createdYear + "年" + createdMonth + "月" + createdDate + "日";
		return createdDay;
	}
}

public class practice10_05 {
	public static void main(String[] args) {
		Scanner stdInput = new Scanner(System.in);

		int isLeap = 0;
		// 残高を入力力口座を作成する

		System.out.println("口座開設に必要な情報を入力してください。");
		// 口座名義を入力値から取得
		System.out.print("　■口座名義：");
		String name = stdInput.next();
		// 口座番号を入力値から取得
		System.out.print("　■口座番号：");
		String no = stdInput.next();
		// 初期化時の預金額を入力値から取得
		System.out.print("　■預金額：");
		long balance = stdInput.nextLong();
		// 口座開設年月日を入力値から取得
		System.out.println("　■口座開設年月日");
		System.out.print("　　　年：");
		int year = stdInput.nextInt();
		System.out.print("　　　月：");
		int month = stdInput.nextInt();
		System.out.print("　　　日：");
		int date = stdInput.nextInt();

		// 銀行口座を作成
		Account user = new Account(name, no, balance, year, month, date);

		// 口座情報を出力
		System.out.println();
		System.out.println("■" + user.getName() + "の口座");
		System.out.println("　口座番号：" + user.getNo());
		System.out.println("　預金残高：" + user.getBalance());
		System.out.println("　口座開設日：" + user.toString());

		// 残高を引き出す, 残高を預金する
		do {
			System.out.println();
			System.out.print("　預金する・・・1 引き出す・・・0：");
			int depositOrWithdraw = stdInput.nextInt();
			if (depositOrWithdraw == 1) {
				System.out.print("　　預金額：");
				int amount = stdInput.nextInt();
				user.deposit(amount);
			} else if (depositOrWithdraw == 0) {
				System.out.print("　　引き出し額：");
				int amount = stdInput.nextInt();
				user.withdraw(amount);
			} else {
				System.out.print("　　1または0で入力してください。");
			}

			System.out.println();
			System.out.print("　操作を続けますか？　はい・・・1 いいえ・・・0：");
			isLeap = stdInput.nextInt();
		} while (isLeap == 1);

		// 口座情報を出力
		System.out.println();
		System.out.println("■" + user.getName() + "の口座");
		System.out.println("　口座番号：" + user.getNo());
		System.out.println("　預金残高：" + user.getBalance());
		System.out.println("　口座開設日：" + user.toString());

	}
}
