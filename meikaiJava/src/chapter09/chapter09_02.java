package chapter09;

/**
 *
 * @author システム開発部
 *日付クラス第3版を利用するプログラムを作成せよ。
 *全てのコンストラクタの動きを確認できるようにすること。
 */

import java.util.Scanner;

public class chapter09_02 {

	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in);

		// パラメータなしで生成、デフォルト値のまま
		Day day1 = new Day();

		// パラメータなしで生成、年・月・日をそれぞれ設定
		Day day2 = new Day();
		day2.setYear(1994);
		day2.setMonth(11);
		day2.setDate(11);

		// パラメータなしで生成、年・月・日をまとめて設定
		Day day3 = new Day();
		day3.set(1996, 8, 31);

		// パラメータ年のみで生成
		Day day4 = new Day(2000);

		// パラメータ年・月で生成
		Day day5 = new Day(2001, 5);

		//パラメータ年・月・日で生成
		Day day6 = new Day(2007, 10, 31);

		// 生成した日付を表示
		Day[] days = { day1, day2, day3, day4, day5, day6 };
		String[] infos = {
				"* パラメータなしで生成、デフォルト値のまま *",
				"* パラメータなしで生成、年・月・日をそれぞれ設定 *",
				"* パラメータなしで生成、年・月・日をまとめて設定 *",
				"* パラメータ年のみで生成 *",
				"* パラメータ年・月で生成 *",
				"* パラメータ年・月・日で生成 *"
		};
		for (int i = 0; i < days.length; i++) {
			System.out.println(infos[i]);
			System.out.println(days[i].toString() + "\n");
		}

		// 日付dと等しいかのメソッド確認用
		System.out.println("index 1 の日付は？");
		System.out.print("年：");
		int year = standardInput.nextInt();
		System.out.print("月：");
		int month = standardInput.nextInt();
		System.out.print("日：");
		int date = standardInput.nextInt();
		Day inputDay = new Day(year, month, date);
		System.out.println("\n" + (days[1].equalTo(inputDay) ? "正解" : "不正解"));
	}

}
