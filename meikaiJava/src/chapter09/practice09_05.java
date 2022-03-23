package chapter09;

import java.util.Scanner;

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

	// --- 開始日を変更する --- //
	public void changeFrom(Day newFrom) {
		from = newFrom;
	}

	// --- 終了日を変更する --- //
	public void changeTo(Day newTo) {
		to = newTo;
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

		Scanner stdInput = new Scanner(System.in);

		// 処理を行うフラグに1が入力された時、開始日を入力された年月日に変更する
		int isChangingFrom = 0;
		System.out.println("開始日を変更しますか？　　1・・・はい　　0・・・いいえ");
		isChangingFrom = stdInput.nextInt();

		if (isChangingFrom == 1) {
			System.out.print("◆ 開始日　年：");
			int year = stdInput.nextInt();
			System.out.print("　　　　　月：");
			int month = stdInput.nextInt();
			System.out.print("　　　　　日：");
			int date = stdInput.nextInt();

			Day from = new Day(year, month, date);
			period.changeFrom(from);
		}

		// 処理を行うフラグに1が入力された時、終了日を入力された年月日に変更する
		int isChangingTo = 0;
		System.out.println("終了日を変更しますか？　　1・・・はい　　0・・・いいえ");
		isChangingTo = stdInput.nextInt();

		if (isChangingTo == 1) {
			System.out.print("◆ 終了日　年：");
			int year = stdInput.nextInt();
			System.out.print("　　　　　月：");
			int month = stdInput.nextInt();
			System.out.print("　　　　　日：");
			int date = stdInput.nextInt();

			Day to = new Day(year, month, date);
			period.changeTo(to);
		}

		// 開始日取得、終了日取得をし、文字列として表示する
		System.out.println("開始日：" + period.getFrom() + "　終了日：" + period.getTo());
	}
}
