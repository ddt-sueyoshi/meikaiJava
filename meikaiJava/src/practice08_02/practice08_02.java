package practice08_02;

import java.util.Scanner;

/**
 *
 *
 * @author システム開発部
 *演習08-02
 *自動車クラスCarに対してフィールドやメソッドを自由に追加せよ。
 *
 *↓追加したもの
 *給油メソッド
 */

class Car {
	private String name; //名前
	private int width; //幅
	private int hight; //高さ
	private int length; //長さ
	private double x; //現在位置X座標
	private double y; //現在位置Y座標
	private double fuel; //残り燃料

	//----- コンストラクタ -----//
	Car(String name, int width, int hight, int length, double x, double y, double fuel) {
		this.name = name;
		this.width = width;
		this.hight = hight;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}

	double getX() {
		return x;
	} //現在位置Xを取得

	double getY() {
		return y;
	} //現在位置Yを取得

	double getFuel() {
		return fuel;
	} //残り燃料を取得

	//----- スペック表示 ------//
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + hight + "mm");
		System.out.println("車長：" + length + "mm");
	}

	//----- X方向にdx、Y方向にdy移動 -----//
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy + dy); // 移動距離

		if (dist > fuel) {
			System.out.println("ガソリンが不足して移動できません。");
			return false;
		} // 移動できない ・・・ 燃料不足
		else {
			fuel -= dist; // 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			System.out.println("移動完了しました。");
			return true; // 移動完了
		}
	}

	//----- 給油 -----//
	boolean refueling(int additional) {
		if (fuel + additional > 50000) {
			System.out.println("ガソリンが多すぎて給油できません。");
			return false;
		} // 満タンをオーバーする場合は給油しない
		else {
			fuel += additional;
			System.out.println("給油完了しました。");
			return true; // 給油完了
		}
	}
}

public class practice08_02 {

	public static void main(String[] args) {
		Scanner stdInput = new Scanner(System.in);

		Car cabbage = new Car("キャベツ", 180, 150, 300, 0, 0, 50000);
		cabbage.putSpec();

		//入力に応じて車を移動させる
		System.out.println("車を移動させよう。");
		System.out.print("x:");
		int x = stdInput.nextInt();
		System.out.print("y:");
		int y = stdInput.nextInt();
		cabbage.move(x, y);

		System.out.println("現在位置は x: " + cabbage.getX() + ", y: " + cabbage.getY() + " です。");

		//入力に応じて給油する
		System.out.println("給油しよう。");
		System.out.print("ガソリン:");
		int fuel = stdInput.nextInt();
		cabbage.refueling(fuel);

		System.out.println("現在のガソリン量は" + cabbage.getFuel() + " です。");

	}

}
