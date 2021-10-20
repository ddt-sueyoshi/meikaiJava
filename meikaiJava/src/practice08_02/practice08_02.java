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
	private double maxFuel; //満タン燃料
	private double fuel; //残り燃料

	Scanner stdInput = new Scanner(System.in);

	//----- コンストラクタ -----//
	Car(String name, int width, int hight, int length, double x, double y, double maxFuel, double fuel) {
		this.name = name;
		this.width = width;
		this.hight = hight;
		this.length = length;
		this.maxFuel = maxFuel;
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
		double dist = Math.sqrt(dx * dx + dy * dy); // 移動距離

		if (dist > fuel) {
			System.out.println("ガソリンが不足して移動できません。");
			return false;
		} // 移動できない ・・・ 燃料不足
		else {
			int isMoving;
			do {
				System.out.println("ガソリンは移動に十分な量です。\n移動しますか？\n1・・・はい　　2・・・いいえ");
				isMoving = stdInput.nextInt();
			} while (isMoving != 1 && isMoving != 2);

			if (isMoving == 1) {
				fuel -= dist; // 移動距離の分だけ燃料が減る
				x += dx;
				y += dy;
				System.out.println("移動完了しました。");
			} else {
				System.out.println("移動しませんでした。");
			}
			return true; // 移動完了
		}
	}

	//----- 給油 -----//
	boolean refueling(int additional) {
		if (fuel + additional > maxFuel) {
			System.out.println("ガソリンが多すぎて給油できません。");
			return false;
		} // 満タンをオーバーする場合は給油しない
		else {
			int isFueling;
			do {
				System.out.println("ガソリンは給油可能な量です。\n給油しますか？\n1・・・はい　　2・・・いいえ");
				isFueling = stdInput.nextInt();
			} while (isFueling != 1 && isFueling != 2);

			if (isFueling == 1) {
				fuel += additional;
				System.out.println("給油完了しました。");
			} else {
				System.out.println("給油しませんでした。");
			}
			return true; // 給油完了
		}
	}
}

public class practice08_02 {

	public static void main(String[] args) {
		Scanner stdInput = new Scanner(System.in);

		Car cabbage = new Car("キャベツ", 180, 150, 300, 0, 0, 50000, 50000);
		cabbage.putSpec();

		int isOperating;
		int operation;
		do {
			do {
				System.out.println("車の操作をしよう\n1・・・移動する　　2・・・給油する");
				operation = stdInput.nextInt();
			} while (operation != 1 && operation != 2);

			switch (operation) {
			case 1:
				//入力に応じて車を移動させる
				System.out.println("車を移動させよう。");
				System.out.print("x:");
				int x = stdInput.nextInt();
				System.out.print("y:");
				int y = stdInput.nextInt();
				cabbage.move(x, y);

				System.out.println("現在位置は x: " + cabbage.getX() + ", y: " + cabbage.getY() + " です。");
				break;
			case 2:
				//入力に応じて給油する
				System.out.println("給油しよう。");
				System.out.print("ガソリン:");
				int fuel = stdInput.nextInt();
				cabbage.refueling(fuel);

				System.out.println("現在のガソリン量は" + cabbage.getFuel() + " です。");
				break;
			}

			do {
				System.out.println("車の操作を続けますか？\n1・・・はい　　2・・・いいえ");
				isOperating = stdInput.nextInt();
			} while (isOperating != 1 && isOperating != 2);
		} while (isOperating == 1);
	}

}
