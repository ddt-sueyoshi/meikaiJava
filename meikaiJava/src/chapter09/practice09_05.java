package chapter09;

/**
 * 
 * @author user
 * 開始日と終了日とから構成される《期間》を表すクラス Period を作成せよ。
 * フィールドは以下のようになる。
 * class Period {
 *     private Day from;    // 開始日
 *     private Day to;      // 終了日
 * }
 * コンストラクタやメソッドを自由に定義すること。
 */

/** 期間クラス */
class Period {
	private Day from; // 開始日
	private Day to; // 終了日

	// --- コンストラクタ ---//
	Period(Day from, Day to) {
		this.from = from;
		this.to = to;
	}

	// --- 開始日を取得する --- //
	public Day getFrom() {
		return from;
	}

	// --- 終了日を取得する --- //
	public Day getTo() {
		return to;
	}
}

public class practice09_05 {

	public static void main(String[] args) {
		// 開始日を生成
		Day fromDay = new Day(1888, 2, 3);
		// 終了日を生成
		Day toDay = new Day(1965, 10, 3);
		// 期間を生成
		Period period = new Period(fromDay, toDay);
		// 開始日取得、終了日取得をし、文字列として表示する
		System.out.println("開始日：" + period.getFrom() + "　終了日：" + period.getTo());
	}

}
