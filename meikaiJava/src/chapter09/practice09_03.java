package chapter09;

/**
 * 
 * @author user 第８章で作成した《銀行口座クラス（第２版》(p.277)に、口座開設日のフィールドとtoStringメソッドを追加せよ。
 *         ※コンストラクタを変更したり、口座開設日のゲッタ（口座開設日フィールドが参照する日付インスタンスのコピーを返す）などのメソッドを追加したりすること。
 */
class Account {
	private String name; // 口座名義
	private String no; // 口座番号
	private long balance; // 預金残額
	private int createdYear; // 口座開設年 *新規追加
	private int createdMonth; // 口座開設月 *新規追加
	private int createdDate; // 口座開設日 *新規追加

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
		String createdDay = createdYear+"年"+createdMonth+"月"+createdDate+"日";
		return createdDay;
	}
}

public class practice09_03 {

	public static void main(String[] args) {
		// 銀行口座を作成
		Account adachi = new Account("安達泰盛","123456",1000,2000,11,11);
		Account houjou = new Account("北条高時","234567",2000,2012,5,3);
		
		// 残高を引き出す, 預金する
		adachi.withdraw(200);
		houjou.deposit(500);
		
		// 口座情報を出力
		System.out.println("■"+adachi.getName()+"の口座");
		System.out.println("     口座番号："+adachi.getNo());
		System.out.println("     預金残高："+adachi.getBalance());
		System.out.println("     口座開設日："+adachi.toString());
		
		System.out.println("■"+houjou.getName()+"の口座");
		System.out.println("     口座番号："+houjou.getNo());
		System.out.println("     預金残高："+houjou.getBalance());
		System.out.println("     口座開設日："+houjou.toString());
	}

}
