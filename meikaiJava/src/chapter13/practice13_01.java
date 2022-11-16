package chapter13;

import java.util.Scanner;

/**
 * 演習13-1 図形クラス群をテストするプログラムを作成せよ。 List
 * 13-9と同じく、Shape型の配列を利用して、インスタンスの生成と表示を行うこと。
 * ただし、個々の要素が参照するインスタンスは、プログラム内で与えるのではなく、キーボードから読み込まれるようにすること。
 * 
 * @author user
 */
public class practice13_01 {
	static Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		// テストの繰り返しの判定に使用する変数
		// テストが完了するたびにキーボード入力値を代入する
		int toContinue;

		do {
			// テスト対象の図形を生成する
			Shape shape = generateShape();
			System.out.println();

			// 生成した図形情報の文字列表示又は描画を行う
			if (shape != null) {
				toStringOrDraw(shape);
			}
			System.out.println();

			// キーボード入力に応じて、テストを続行するかを判断する
			System.out.println("繰り返しますか？");
			System.out.println("はい　・・・1");
			System.out.println("いいえ・・・0");
			toContinue = stdIn.nextInt();

			System.out.println();
		} while (toContinue == 1);
	}

	/**
	 * キーボード入力に応じて、テスト対象の図形のインスタンスを生成する
	 */
	private static Shape generateShape() {
		// 対象の図形を選択する
		System.out.println("■テストを行う図形を選択してください");
		System.out.println("　点　　　・・・1");
		System.out.println("　水平直線・・・2");
		System.out.println("　垂直直線・・・3");
		System.out.println("　長方形　・・・4");
		int shapeNum = stdIn.nextInt();

		// 選択した図形に応じて引数を入力して図形を生成する
		if (shapeNum == 1) {
			// 点が選択された場合、引数はなし
			return new Point();
		} else if (shapeNum == 2) {
			// 水平直線が選択された場合、長さの引数を入力する
			System.out.println("　　水平直線の長さ：");
			int length = stdIn.nextInt();
			return new HorzLine(length);
		} else if (shapeNum == 3) {
			// 垂直直線が選択された場合、長さの引数を入力する
			System.out.println("　　垂直直線の長さ：");
			int length = stdIn.nextInt();
			return new VirtLine(length);
		} else if (shapeNum == 4) {
			// 長方形が選択された場合、幅と高さの引数を入力する
			System.out.println("　　長方形の幅：");
			int width = stdIn.nextInt();
			System.out.println("　　長方形の高さ：");
			int height = stdIn.nextInt();
			return new Rectangle(width, height);
		} else {
			// 想定外の数値が入力された場合、メッセージを表示してnullを返却する
			System.out.println("　入力値に誤りがあります");
			return null;
		}
	}

	/**
	 * キーボード入力に応じて、図形情報の文字列表示又は描画を行う
	 */
	private static void toStringOrDraw(Shape shape) {
		// 表示内容を、図形情報の文字列表示か描画で選択する
		System.out.println("■図形についての表示内容を選択してください");
		System.out.println("　図形情報の文字列を表示する・・・1");
		System.out.println("　図形の描画を行う　　　　　・・・2");
		int toStringOrDraw = stdIn.nextInt();

		if (toStringOrDraw == 1) {
			// 図形情報の文字列を表示する
			System.out.println(shape.toString());
		} else if (toStringOrDraw == 2) {
			// 図形の描画を行う
			shape.draw();
		} else {
			// 想定外の数値が入力された場合、メッセージを表示する
			System.out.println("　入力値に誤りがあります");
		}
	}
}

/**
 * 以下はテキストp.438~p.442のサンプルコードです。
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

/**
 * クラスPointは、点を表すクラスです。 このクラスは、図形を表す抽象クラスShapeから派生したクラスです。 フィールドはありません。
 * 
 * @see Shape
 */
class Point extends Shape {
	/**
	 * 点を生成するコンストラクタです。 受け取る引数はありません。
	 */
	Point() {
		// 何も行わない
	}

	/**
	 * メソッドtoStringは、点に関する図形情報を表す文字列を返却します。 返却する文字列は、常に"Point"です。
	 * 
	 * @return 文字列"Point"を返却します。
	 */
	public String toString() {
		return "Point";
	}

	/**
	 * メソッドdrawは、点を描画するメソッドです。 プラス記号"+"を１個だけ表示して改行します。
	 */
	public void draw() {
		System.out.println("+");
	}
}

/**
 * クラスAbstLineは直線を表す抽象クラスです。 このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * 抽象クラスですから、本クラスのインスタンスを生成することはできません。 具体的な直線クラスは、このクラスから派生します。
 * 
 * @see Shape
 * @see HorzLine VirtLine
 */
abstract class AbstLine extends Shape {
	/**
	 * 直線の長さを表すint型のフィールドです。
	 */
	private int length;

	/**
	 * 直線を生成するコンストラクタです。 長さを引数として受け取ります。
	 * 
	 * @param length 生成する直線の長さ。
	 */
	AbstLine(int length) {
		setLength(length);
	}

	/**
	 * 直線の長さを取得します。
	 * 
	 * @return 直線の長さ。
	 */
	public int getLength() {
		return length;
	}

	/**
	 * 直線の長さを設定します。
	 * 
	 * @param length 設定する直線の長さ。
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * メソッドtoStringは、直線に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"AbstLine(length:3)"を返却します。 3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "AbstLine(length:" + length + ")";
	}
}

/**
 * クラスHorzLineは水平直線を表す抽象クラスです。 このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * 
 * @see Shape
 * @see AbstLine
 */
class HorzLine extends AbstLine {
	/**
	 * 水平線を生成するコンストラクタです。長さを引数として受け取ります。
	 * 
	 * @param length 生成する直線の長さ
	 */
	HorzLine(int length) {
		super(length);
	}

	/**
	 * メソッドtoStringは、水平直線に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"HorzLine(length:3)"を返却します。 3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "HorzLine(length:" + getLength() + ")";
	}

	/**
	 * メソッドdrawは、水平直線を描画します。 描画は、マイナス記号'-'を横に並べることによって行います。 長さの個数だけ'-'を連続表示して改行します。
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.print("-");
		System.out.println();
	}
}

/**
 * クラスVirtLineは水平直線を表す抽象クラスです。 このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * 
 * @see Shape
 * @see AbstLine
 */
class VirtLine extends AbstLine {
	/**
	 * 垂直線を生成するコンストラクタです。長さを引数として受け取ります。
	 * 
	 * @param length 生成する直線の長さ
	 */
	VirtLine(int length) {
		super(length);
	}

	/**
	 * メソッドtoStringは、水平直線に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"VirtLine(length:3)"を返却します。 3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "VirtLine(length:" + getLength() + ")";
	}

	/**
	 * メソッドdrawは、垂直直線を描画します。 描画は、マイナス記号'|'を縦に並べることによって行います。
	 * 長さの個数だけ'|'を表示して改行するのを繰り返します。
	 */
	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.println("|");
	}
}

/**
 * クラスRectangleは長方形を表す抽象クラスです。 このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * 
 * @see Shape
 */
class Rectangle extends Shape {
	/**
	 * 長方形の幅を表すint型のフィールドです。
	 */
	private int width;

	/**
	 * 長方形の高さを表すint型のフィールドです。
	 */
	private int height;

	/**
	 * 長方形を生成するコンストラクタです。幅と高さを引数として受け取ります。
	 * 
	 * @param width  生成する長方形の幅
	 * @param height 生成する長方形の高さ
	 */
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * メソッドtoStringは、長方形に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"Rectangle(width:4, height:3)"を返却します。 4と3の部分は長さに応じた値です。
	 */
	public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")";
	}

	/**
	 * メソッドdrawは、長方形を描画します。 描画は、アステリスク記号'*'を並べることによって行います。
	 * 幅の数だけ'*'を表示して改行するのを高さの回数だけ繰り返します。
	 */
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}

}
