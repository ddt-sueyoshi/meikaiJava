package chapter10;

import static java.util.Calendar.*;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 
 * @author user 演習10−4 日付クラス第４版（p.346）を以下のように改良せよ。
 *         ・引数を受け取らないコンストラクタによるインスタンスの生成時は、西暦１年１月１日で初期化するのではなく、プログラム実行時の日付で初期化する。
 *         ・引数を受け取るコンストラクタに不正な値が指定された場合は、適当な値に調整する
 *         （例えば13月が指定された場合は１２月とする／9月31日と指定された場合は9月30日とする）。
 * 
 *         さらに以下に示すメソッドを追加すること： 年内での経過日数（その年の元旦から数えて何日目であるか）を求めるメソッド、
 *         年内の残り日数を求めるメソッド、 他の日付との前後関係（より前の日付か／同じ日付か／より後の日付か）を判定するインスタンスメソッド、
 *         二つの日付の前後関係を判定するクラスメソッド、
 *         日付を一つ後ろに進めるメソッド（日付が2012年12月31日であれば、2013年1月1日に更新する）、 次の日の日付を返却するメソッド、
 *         日付を一つ前に戻すメソッド、 前の日の日付を返却するメソッド、 日付をn日後ろに進めるメソッド、 n日後の日付を返却するメソッド、
 *         日付をn日前に戻すメソッド、 n日前の日付返却するメソッド etc...
 */

class Day {
	GregorianCalendar today = new GregorianCalendar(); // プログラム実行時の日付を取得する

	private int year = today.get(YEAR); // 年
	// GregorianCalendar.MONTH は JANUARY[0], FEBRUARY[1]... と値を保つので数字表記の場合は 1 加算する
	private int month = today.get(MONTH) + 1; // 月
	private int date = today.get(DATE); // 日

	// -- y年は閏年か？ -- //
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}

	// -- コンストラクタ -- //
	public Day() {
	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this.year = year;
		this.month = validatedMonth(month); // 不正な値が指定された場合は、適当な値に調整するよう改良
	}

	public Day(int year, int month, int date) {
		this.year = year;
		this.month = validatedMonth(month); // 不正な値が指定された場合は、適当な値に調整するよう改良
		this.date = validatedDate(date); // 不正な値が指定された場合は、適当な値に調整するよう改良
	}

	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	// --- 年・月・日を取得 --- //
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return date;
	}

	// --- 年・月・日を設定 --- //
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	// -- 閏年か？ -- //
	public boolean isLeap() {
		return isLeap(year);
	}

	// --- 曜日を求める --- //
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// --- 日付dと等しいか --- //
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	// --- 文字列表現を返却 --- //
	public String toString() {
		String[] wd = { "月", "火", "水", "木", "金", "土", "日" };
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

	/** 下記からは日付クラス第４版には無い改良のための追加のメソッド */

	// --- 月に不正な値が指定された場合は、適当な値に調整する（改良のため追加） --- //
	private int validatedMonth(int m) {
		if (m < 1) {
			return 1; // 1 より小さい場合は、1 を設定する
		} else if (m < 13) {
			return m;
		} else {
			return 12; // 12 より大きい場合は、12 を設定する
		}
	}

	// --- 日に不正な値が指定された場合は、適当な値に調整する --- //
	private int validatedDate(int d) {
		if (d < 1) {
			return 1; // 1 より小さい場合は1を設定する
		} else if (d > lastDateInMonth(month)) {
			return lastDateInMonth(month); // その月の末日より大きい場合は、末日を設定する
		} else {
			return d;
		}
	}

	// --- その月の最後の日付を返却 ---//
	private int lastDateInMonth(int m) {
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			return 31;
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			return 30;
		} else if (m == 2 && isLeap()) {
			return 29;
		} else if (m == 2) {
			return 28;
		} else {
			return 0; // 月が 1 ~ 12 以外の不正な場合
		}
	}

	// --- 年内での経過日数（その年の元旦から数えて何日目であるか）を求めるメソッド --- //
	public int countDays() {
		int days = date - 1; // 月の初めから何日経過したかを設定（1月2日 なら 1 日経過）
		for (int m = 1; m < month; m++) {
			days += lastDateInMonth(m); // 1月 より後の場合は、前月の末日までの日数を加算する
		}
		return days;
	}

	// --- 年内の残り日数を求めるメソッド --- //
	public int countdownDays() {
		if (isLeap()) {
			return 365 - countDays();
		} else {
			return 364 - countDays();
		}
	}

	// --- 他の日付との前後関係（より前の日付か／同じ日付か／より後の日付か）を判定するインスタンスメソッド --- //
	public String isBeforeAndAfter(Day d) {
		if (year < d.year || (year == d.year && month < d.month)
				|| (year == d.year && month == d.month && date < d.date)) {
			return "after";
		}
		if (equalTo(d)) {
			return "equal";
		}
		return "before";
	}

	// --- 二つの日付の前後関係を判定するクラスメソッド --- //
	public String isBeforeAndAfterTwoDays(Day d1, Day d2) {
		if (d1.year < d2.year || (d1.year == d2.year && d1.month < d2.month)
				|| (d1.year == d2.year && d1.month == d2.month && d1.date < d2.date)) {
			return "day1 is before day2";
		}
		if (d1.equalTo(d2)) {
			return "day1 is equal day2";
		}
		return "day1 is after day2";
	}

	// --- 日付を一つ後ろに進めるメソッド（日付が 2012年12月31日 であれば、2013年1月1日 に更新する） --- //
	public void advanceOneDay() {
		if (month == 12 && date == lastDateInMonth(month)) {
			// 12月31日 の場合は、翌年の 1月1日 に更新する
			year++;
			month = 1;
			date = 1;
		} else if (date == lastDateInMonth(month)) {
			// 12月 以外の月末日の場合は、翌月の 1日 に更新する
			month++;
			date = 1;
		} else {
			date++;
		}
	}

	// --- 次の日の日付を返却するメソッド --- //
	public Day oneDayAfter() {
		if (month == 12 && date == lastDateInMonth(month)) {
			// 12月31日 の場合は、翌年の 1月1日 を返却する
			return new Day(year + 1);
		} else if (date == lastDateInMonth(month)) {
			// 12月以外の月末日の場合は、翌月の 1日 を返却する
			return new Day(year, month + 1);
		} else {
			return new Day(year, month, date + 1);
		}
	}

	// --- 日付を一つ前に戻すメソッド --- //
	public void turnBackOneDay() {
		if (month == 1 && date == 1) {
			// 1月1日 の場合は、前年の 12月31日 に更新する
			year--;
			month = 12;
			date = 31;
		} else if (date == 1) {
			// 1月 以外の月初日の場合は、前月の末日に更新する
			month--;
			date = lastDateInMonth(month);
		} else {
			date--;
		}
	}

	// --- 前の日の日付を返却するメソッド --- //
	public Day oneDayBefore() {
		if (month == 1 && date == 1) {
			// 1月1日 の場合は、前年の 12月31日 を返却する
			return new Day(year - 1, 12, 31);
		} else if (date == 1) {
			// 1月 以外の月初日の場合は、前月の末日を返却する
			return new Day(year, month - 1, lastDateInMonth(month));
		} else {
			return new Day(year, month, date - 1);
		}
	}

	// --- 日付をn日後ろに進めるメソッド --- //
	public void advanceNDays(int n) {
		while (countdownDays() < n) {
			// 日数が年内の残日数より大きい場合は、翌年の 1月1日 までの日数を減算する処理を繰り返し、年を確定する
			n = n - countdownDays() - 1;
			year++;
			month = 1;
			date = 1;
		}
		while (lastDateInMonth(month) < date + n) {
			// 日数が月末までの日数より大きい場合は、翌月の 1日 までの日数を減算する処理を繰り返し、月を確定する
			n = n - (lastDateInMonth(month) - date + 1);
			month++;
			date = 1;
		}
		// 日を確定する
		date = date + n;
	}

	// --- n日後の日付を返却するメソッド --- //
	public Day nDaysAfter(int n) {
		Day responseDay = new Day(year, month, date);
		responseDay.advanceNDays(n);
		return responseDay;
	}

	// --- 日付をn日前に戻すメソッド --- //
	public void turnBackNDays(int n) {
		while (countDays() < n) {
			// 日数が年内の経過日数より大きい場合は、前年の 12月31日 までの日数を減算する処理を繰り返し、年を確定する
			n = n - countDays() - 1;
			year--;
			month = 12;
			date = 31;
		}
		while (date <= n) {
			// 日数が月初日までの日数より大きい場合は、翌月の末日までの日数を減算する処理を繰り返し、月を確定する
			n = n - date;
			month--;
			date = lastDateInMonth(month);
		}
		// 日を確定する
		date = date - n;
	}

	// --- n日前の日付返却するメソッド --- //
	public Day nDaysBefore(int n) {
		Day responseDay = new Day(year, month, date);
		responseDay.turnBackNDays(n);
		return responseDay;
	}
}

public class practice10_04 {
	static Scanner stdIn = new Scanner(System.in);

	// 年月日の入力から日付を生成する
	public static Day inputDay() {
		System.out.println("　日付を生成します。年月日を指定してください。");
		System.out.print("　　年：");
		int year = stdIn.nextInt();
		System.out.print("　　月：");
		int month = stdIn.nextInt();
		System.out.print("　　日：");
		int date = stdIn.nextInt();

		Day day = new Day(year, month, date);
		return day;
	}

	// 数値の入力から繰り返すか否かを判定する
	public static boolean isLeap() {
		System.out.print("　　繰り返しますか？　はい・・・1 いいえ・・・0：");
		int repeatFlag = stdIn.nextInt();
		return repeatFlag == 1;
	}

	public static void main(String[] args) {
		// 年月日の指定なしで日付を生成（実行時の日付が設定される）
		System.out.println("■年月日の指定なしで日付を生成します。");
		Day today = new Day();
		System.out.println("　今日の日付：" + today.getYear() + "年" + today.getMonth() + "月" + today.getDay() + "日");

		// 年を指定して日付を生成
		do {
			System.out.println("■年を指定して日付を生成します。年を指定してください。");
			System.out.print("　年：");
			int year = stdIn.nextInt();

			Day day = new Day(year);
			System.out.println("　日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日");
		} while (isLeap());

		// 年月を指定して日付を生成
		do {
			System.out.println("■年月を指定して日付を生成します。年月を指定してください。");
			System.out.print("　年：");
			int year = stdIn.nextInt();
			System.out.print("　月：");
			int month = stdIn.nextInt();

			Day day = new Day(year, month);
			System.out.println("　日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日");
		} while (isLeap());

		// 年月日を指定して日付を生成
		do {
			System.out.println("■年月日を指定して日付を生成します。");
			Day day = inputDay();
			System.out.println("　日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日");
		} while (isLeap());

		// 年内での経過日数（その年の元旦から数えて何日目であるか）
		do {
			System.out.println("■年内での経過日数を計算します。");
			Day day = inputDay();
			System.out.println("　年が始まって" + day.countDays() + "日が経過しました。");
		} while (isLeap());

		// 年内の残り日数
		do {
			System.out.println("■年内の残りの日数を計算します。");
			Day day = inputDay();
			System.out.println("　年内の残り日数は" + day.countdownDays() + "日になりました。");
		} while (isLeap());

		// 他の日付との前後関係（より前の日付か／同じ日付か／より後の日付か）
		do {
			System.out.println("■今日と他の日付を比較します。");
			Day day = inputDay();
			System.out.println("　比較結果：" + today.isBeforeAndAfter(day));
		} while (isLeap());

		// 二つの日付の前後関係を判定する
		do {
			System.out.println("■2つの日付を比較します。");
			System.out.print("　日付1");
			Day day1 = inputDay();
			System.out.print("　日付2");
			Day day2 = inputDay();

			System.out.println("　比較結果：" + today.isBeforeAndAfterTwoDays(day1, day2));
		} while (isLeap());

		// 日付を一つ後ろに進める
		do {
			System.out.println("■日付を一つ後ろに進めます。");
			Day day = inputDay();
			day.advanceOneDay();
			System.out.println("　入力した日付を一つ後ろに進めた日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日");
		} while (isLeap());

		// 次の日の日付を返却する
		do {
			System.out.println("■次の日の日付を返却します。");
			Day day = inputDay();
			Day nextDay = day.oneDayAfter();
			System.out.println("　明日は" + nextDay.getYear() + "年" + nextDay.getMonth() + "月" + nextDay.getDay() + "日です");
		} while (isLeap());

		// 日付を一つ前に戻す
		do {
			System.out.println("■日付を一つ前に戻します");
			Day day = inputDay();
			day.turnBackOneDay();
			System.out.println("　入力した日付を一つ前に戻した日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日");
		} while (isLeap());

		// 前の日の日付を返却する
		do {
			System.out.println("■前の日の日付を返却します。");
			Day day = inputDay();
			Day previousDay = day.oneDayBefore();
			System.out.println(
					"　昨日は" + previousDay.getYear() + "年" + previousDay.getMonth() + "月" + previousDay.getDay() + "日です");
		} while (isLeap());

		// 日付をn日後ろに進める
		do {
			System.out.println("■日付をn日後ろに進めます。");
			Day day = inputDay();
			System.out.print("　n：");
			int n = stdIn.nextInt();
			day.advanceNDays(n);
			System.out.println("　入力した日付をn日後ろに進めた日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日");
		} while (isLeap());

		// n日後の日付を返却する
		do {
			System.out.println("■n日後の日付を返却します。");
			System.out.print("　n：");
			int n = stdIn.nextInt();
			Day day = today.nDaysAfter(n);
			System.out.println("　n日後は" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日です");
		} while (isLeap());

		// 日付をn日前に戻す
		do {
			System.out.println("■日付をn日前に戻します。");
			Day day = inputDay();
			System.out.print("　n：");
			int n = stdIn.nextInt();
			day.turnBackNDays(n);
			System.out.println("　入力した日付をn日前に戻した日付：" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日");
		} while (isLeap());

		// n日前の日付返却する
		do {
			System.out.println("■n日前の日付を返却します。");
			System.out.print("　n：");
			int n = stdIn.nextInt();
			Day day = today.nDaysBefore(n);
			System.out.println("　n日前は" + day.getYear() + "年" + day.getMonth() + "月" + day.getDay() + "日です");
		} while (isLeap());
	}
}
