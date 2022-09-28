package chapter12;

public class Car {
	private String name; // 名前
	private int width; // 幅（mm）
	private int height; // 高さ（mm）
	private int length; // 長さ（mm）
	private double x; // 現在位置X座標（km）
	private double y; // 現在位置Y座標（km）
	private double fuel; // 残り燃料（リットル）
	private Day purchaseDay; // 購入日

	// --- コンストラクタ ---//
	public Car(String name, int width, int height, int length, double x, double y, double fuel, Day purchaseDay) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = x;
		this.y = y;
		this.fuel = fuel;
		this.purchaseDay = purchaseDay;
	}

	public double getX() {
		return x;
	} // 現在位置X座標を取得

	public double getY() {
		return y;
	} // 現在位置Y座標を取得

	public double getFuel() {
		return fuel;
	} // 購入日を取得

	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	} // 購入日を取得

	// --- スペック表示 ---//
	public void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}

	// --- X方向にdx・Y方向にdy移動 ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy); // 移動距離

		if (dist / 15 > fuel) { // 燃費は 15km/L とする
			return false; // 移動できない ・・・燃料不足
		} else {
			fuel -= dist / 15; // 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			return true; // 移動完了
		}
	}
}
