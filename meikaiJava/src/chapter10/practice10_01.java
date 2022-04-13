package chapter10;

/**
 * 
 * @author user
 * 演習10−1
 * List１０-3(p.340)に示した連番クラスIdに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ。
 * static int getMaxId()
 * なお、このメソッドは、インスタンスをn個生成した時点で呼び出すとnを返すことになる。
 */

/** 連番クラス */
class Id {
	static int counter = 0; // 何番までの識別番号を与えたか
	private int id; // 識別番号

	// -- コンストラクタ --//
	public Id() {
		id = ++counter;
	}

	// -- 識別番号を取得 --//
	public int getId() {
		return id;
	}

	// -- 最後に与えた識別番号を取得 --//
	static int getMaxId() {
		return counter;
	}
}

public class practice10_01 {

	public static void main(String[] args) {
		Id a = new Id(); // 識別番号1番
		Id b = new Id(); // 識別番号2番
		
		System.out.println("aの識別番号："+a.getId());
		System.out.println("bの識別番号："+b.getId());
		System.out.println("最後の識別番号："+Id.getMaxId());

	}

}
