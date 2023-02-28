package chapter14;

import java.util.Scanner;

/**
 * 
 * 演習14-1 ここ（p.462~p.463）に示した図形クラス群を利用するプログラム例を作成せよ。
 * 
 */

public class practice14_01 {
	static final Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("■長方形の幅と高さをキーボードから入力してください");
		System.out.print("　　幅：");
		int rectangleWidth = stdIn.nextInt();
		System.out.print("　　高さ：");
		int rectangleHeight = stdIn.nextInt();

		Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);

		System.out.println("■生成した長方形の文字列表記を行います");
		System.out.println("　　"+rectangle.toString());
		System.out.println("■生成した長方形の描画を行います");
		rectangle.draw();
		System.out.println("■生成した長方形の面積を表示します");
		System.out.print("　　面積："+rectangle.getArea());
		
		System.out.println("■平行四辺形の幅と高さをキーボードから入力してください");
		System.out.print("　　幅：");
		int parallelogramWidth = stdIn.nextInt();
		System.out.print("　　高さ：");
		int parallelogramHeight = stdIn.nextInt();
		
		Parallelogram parallelogram = new Parallelogram(parallelogramWidth, parallelogramHeight);
		
		System.out.println("■生成した平行四辺形の文字列表記を行います");
		System.out.println("　　"+parallelogram.toString());
		System.out.println("■生成した平行四辺形の描画を行います");
		parallelogram.draw();
		System.out.println("■生成した平行四辺形の面積を表示します");
		System.out.print("　　面積："+parallelogram.getArea());
	}
}

//===== 2次元インターフェース =====//
interface Plane2D {
	int getArea(); // ◯面積を求める
}

//===== 長方形クラス（テキスト13章p.438~p.442のサンプルコードにp.463での変更を追加したものです。） =====//
class Rectangle extends Shape implements Plane2D {
	private int width; // 底辺の幅
	private int height; // 高さ

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String toString() { // 文字列表現
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}

	public void draw() { // 描画
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}

	public int getArea() { // ◯面積を求める
		return width * height;
	}
}

//===== 平行四辺形クラス（p.463のサンプルコードです。） =====//
class Parallelogram extends Shape implements Plane2D {
	private int width; // 底辺の幅
	private int height; // 高さ

	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public String toString() { // 文字列表現
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	public void draw() { // 描画
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++)
				System.out.print(" ");
			for (int j = 1; j <= width; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}

	public int getArea() { // ◯面積を求める
		return width * height;
	}
}

/**
 * 以下はテキスト13章p.438~p.442のサンプルコードです。
 */

/**
 * クラスShapeは、図形の概念を表す抽象クラスです。 抽象クラスですから、本クラスのインスタンスを生成することはできません。
 * 具体的な図形クラスは、このクラスから派生します。
 * 
 * @see Object
 */
abstract class Shape {
	/**
	 * 図形情報を表す文字列を返却する抽象メソッドです。 クラスShapeから派生するクラスで、このメソッドの本体を実装します。
	 * このメソッドは、java.lang.Objectクラスのメソッドを抽象クラスとしてオーバーライドしたメソッドです。
	 */
	public abstract String toString();

	/**
	 * メソッドdrawは、図形を描画するためのメソッドです。 クラスShapeから派生するクラスで、このメソッドを実装します。
	 */
	public abstract void draw();

	/**
	 * メソッドprintは、図形情報の表示と図形の描画を行います。 具体的には、以下の二つのステップを順次行います。
	 * Step1.メソッドtoStringが返却する文字列を表示して改行。 Step2.メソッドdrawを呼び出して図形の描画
	 */
	public void print() {
		System.out.println(toString());
		draw();
	}
}
