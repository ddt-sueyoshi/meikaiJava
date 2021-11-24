package chapter09;

public class Day {
	private int year = 1;
	private int month = 1;
	private int date = 1;

	//--  コンストラクタ  --//
	public Day() {
	}

	public Day(int year) {
		this.year = year;
	}

	public Day(int year, int month) {
		this.year = year;
		this.month = month;
	}

	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	//--  年・月・日を取得  --//
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	//--  年・月・日を設定  --//
	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	//--  曜日を求める  --//
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		// 0 : 日曜日, 1 : 月曜日, …… , 5 … 金曜日, 6 … 土曜日
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	//--  日付dと等しいか  --//
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	//--  文字列表現を返却  --//
	public String toString() {
		String wd[] = { "日", "月", "火", "水", "木", "金", "土" };
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

}
