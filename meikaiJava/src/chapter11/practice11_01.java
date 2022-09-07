package chapter11;

import id.DateId;

/**
 * 
 * @author user 演習11-1 List10-2(p.356)のクラスDateIdをパッケージidに所属させるように書き換えよ。
 *         なお、DateIdTesterは無名パッケージに所属させること。
 */

// DeteIdTester
public class practice11_01 {

	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
	}

}
