package chapter15;

import java.util.Calendar;

/**
 * 
 * コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。
 * コマンドラインから年のみが与えられた場合は、その年の１月から１２月までのカレンダーを表示して、 年と月が与えられた場合は、その月のカレンダーを表示して、
 * 年も月も与えられなかったら現在の月のカレンダーを表示すること。
 */

public class practice15_08 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		if (args.length == 1) {
			int year = Integer.valueOf(args[0]).intValue();
			for (int i = 1; i <= 12; i++) {
				showCalendar(year, i);
				System.out.println();
			}
		} else if (args.length == 2) {
			int year = Integer.valueOf(args[0]).intValue();
			int month = Integer.valueOf(args[0]).intValue();
			showCalendar(year, month);
		} else {
			showCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH));
		}
	}

	private static void showCalendar(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, 1);

		int firstDayInMonthOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // 1:SUN, 2:MON, ... 7:SAT


		int maxDate = calendar.getActualMaximum(Calendar.DATE);

		System.out.println(year + "." + month);
		System.out.println("SUN MON TUE WED THU FRI SAT");

		// 日付出力
		for (int i = 1; i < firstDayInMonthOfWeek - 1; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= maxDate; i++) {
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(" " + i + " ");

			if ((i + firstDayInMonthOfWeek) % 7 == 1) {
				// 土曜日の日付まで出力したら改行
				System.out.println();
			}
		}
		System.out.println();
	}

}
