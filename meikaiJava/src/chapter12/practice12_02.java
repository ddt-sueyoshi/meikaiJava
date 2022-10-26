package chapter12;

/**
 * 
 * @author user 演習12-2 定期預金付き銀行口座クラス型変数a, bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド
 *         compBalance を作成せよ。 static int compBalance(Account a, Account b)
 *         合計額を比較して、aの方が多ければ1、等しければ0、bの方が多ければ-1を返却すること。
 *         もしaやbの参照先が、定期預金を持たないAccount型のインスタンスであれば、普通預金の金額を比較の対象とすること。 [参照]
 *         Account p.277, TimeAccount p.401
 */
public class practice12_02 {
	// a, bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド
	static int compBalance(Account a, Account b) {
		// aの預金総額
		long balanceA = a.getTotalBalance();
		// bの預金総額
		long balanceB = b.getTotalBalance();
		// aの方が多ければ1、等しければ0、bの方が多ければ-1を返却する
		if (balanceA > balanceB) {
			return 1;
		} else if (balanceA == balanceB) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// compBalance のテストを行う

		// 普通預金のみの口座
		Account scoop = new Account("Scoop", "001", 10000);
		Account muck = new Account("muck", "002", 30000);
		// 定期預金付きの口座
		TimeAccount dizzy = new TimeAccount("Dizzy", "003", 50000, 10000);
		TimeAccount roley = new TimeAccount("Roley", "004", 10000, 20000);

		// Account同士の預金総額の比較を行う
		// それぞれの口座名義と預金総額を表示する
		System.out.println(scoop.getName() + "の預金額の合計は" + scoop.getTotalBalance() + "、" + muck.getName() + "の預金額の合計は"
				+ muck.getTotalBalance() + "です。");
		// Account同士の預金総額の比較を数値で取得する
		int compResult1 = compBalance(scoop, muck);
		// 比較結果の数値に応じてメッセージを表示する
		if (compResult1 > 0) {
			System.out.println("前者の方が大きいです。");
		} else if (compResult1 == 0) {
			System.out.println("同額です。");
		} else {
			// muckの方が預金総額が大きいので、この分岐に入る
			System.out.println("後者の方が大きいです。");
		}
		System.out.println();

		// TimeAccount同士の預金総額の比較を行う
		// それぞれの口座名義と預金総額を表示する
		System.out.println(dizzy.getName() + "の預金額の合計は" + dizzy.getTotalBalance() + "、" + roley.getName() + "の預金額の合計は"
				+ roley.getTotalBalance() + "です。");
		// TimeAccount同士の預金総額の比較を数値で取得する
		int compResult2 = compBalance(dizzy, roley);
		// 比較結果の数値に応じてメッセージを表示する
		if (compResult2 > 0) {
			// dizzyの方が預金総額が大きいので、この分岐に入る
			System.out.println("前者の方が大きいです。");
		} else if (compResult2 == 0) {
			System.out.println("同額です。");
		} else {
			System.out.println("後者の方が大きいです。");
		}
		System.out.println();

		// AccountとTimeAccountの預金総額の比較を行う
		// それぞれの口座名義と預金総額を表示する
		System.out.println(muck.getName() + "の預金額の合計は" + muck.getTotalBalance() + "、" + roley.getName() + "の預金額の合計は"
				+ roley.getTotalBalance() + "です。");
		// AccountとTimeAccountの預金総額の比較を数値で取得する
		int compResult3 = compBalance(muck, roley);
		// 比較結果の数値に応じてメッセージを表示する
		if (compResult3 > 0) {
			System.out.println("前者の方が大きいです。");
		} else if (compResult3 == 0) {
			// 預金総額が同額なので、この分岐に入る
			System.out.println("同額です。");
		} else {
			System.out.println("後者の方が大きいです。");
		}
	}

}

class Account {
	private String name; // 口座名義
	private String no; // 口座番号
	private long balance; // 預金残高

	// --- コンストラクタ ---//
	Account(String name, String no, long balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}

	// --- 口座名義を調べる ---//
	String getName() {
		return name;
	}

	// --- 口座番号を調べる ---//
	String getNo() {
		return no;
	}

	// --- 預金残高を調べる ---//
	long getBalance() {
		return balance;
	}

	// --- k円預ける ---//
	void deposit(long k) {
		balance += k;
	}

	// --- k円おろす ---//
	void withdraw(long k) {
		balance -= k;
	}

	// 普通預金の合計額を調べる（このAccountクラスではgetBalance()と重複するが、継承クラスと同名メソッドとするため実装）
	long getTotalBalance() {
		return getBalance();
	}
}

class TimeAccount extends Account {
	private long timeBalance; // 預金残高（定期預金）

	// コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		super(name, no, balance); // クラスAccountのコンストラクタの呼び出し
		this.timeBalance = timeBalance; // 預金残高（定期預金）
	}

	// 定期預金残高を調べる
	long getTimeBalance() {
		return timeBalance;
	}

	// 定期預金を解約して全額を普通預金に移す
	void cancel(long k) {
		deposit(timeBalance);
		timeBalance = 0;
	}

	// 普通預金と定期預金残高の合計額を調べる
	@Override
	long getTotalBalance() {
		return super.getBalance() + timeBalance;
	}
}
