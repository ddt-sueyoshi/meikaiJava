package chapter12;

import java.util.Scanner;

/**
 * 
 * @author user 演習12-1 総走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスを作成せよ。 自動車クラス Car
 *         第２版（p.324）から派生すること。
 */

public class practice12_01 {
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		Day today = new Day(2022, 9, 28);
		Car2 scoop = new Car2("scoop", 1800, 1900, 4000, 0, 0, 50, today, 0);

		scoop.putSpec();

		do {
			System.out.println();
			System.out.println("走らせる距離を入力してください。");
			System.out.print("東に（西なら負の数で）何km？");
			int dx = stdIn.nextInt();
			System.out.print("北に（南なら負の数で）何km？");
			int dy = stdIn.nextInt();
			scoop.move(dx, dy);

			System.out.println("残り燃料は" + scoop.getFuel() + "Lです。");
			System.out.print("繰り返しますか？　はい・・・1 いいえ・・・0：");
		} while (stdIn.nextInt() == 1);


		System.out.println();
		System.out.println("走行距離は" + scoop.getTotalMileage() + "kmです。");
	}
}

class Car2 extends Car {
	private double totalMileage; // 総走行距離（km）

	public Car2(String name, int width, int height, int length, double x, double y, double fuel, Day purchaseDay,
			double totalMileage) {
		super(name, width, height, length, x, y, fuel, purchaseDay);
		this.totalMileage = totalMileage;
	}

	public double getTotalMileage() {
		return totalMileage;
		// 走行距離を取得
	}

	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // 移動距離

		if (dist / 15 <= getFuel()) {
			totalMileage += dist; // 燃料不足でない場合のみ走行距離を計上する
		}
		return super.move(dx, dy);
	}
}
