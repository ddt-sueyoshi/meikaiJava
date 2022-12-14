package chapter13;

import java.util.Scanner;

/**
 * 演習13-02 図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
 * 左下直角のもの、左上が直角のもの、右下が直角のもの、右上が直角のものを追加すること。
 * 直角二等辺三角形を表す抽象クラスを作り、そこから個々のクラスを派生して作ること。
 * 
 * @author user
 *
 */

public class practice13_02 {
	final static Scanner stdIn = new Scanner(System.in);

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
		System.out.println("　左下直角の直角二等辺三角形・・・1");
		System.out.println("　左上直角の直角二等辺三角形・・・2");
		System.out.println("　右下直角の直角二等辺三角形・・・3");
		System.out.println("　右上直角の直角二等辺三角形・・・4");
		int shapeNum = stdIn.nextInt();

		// 直角二等辺三角形の底辺・高さの長さを入力する
		System.out.println("　　底辺・高さの長さ：");
		int shortSideLength = stdIn.nextInt();

		// 選択した図形に応じて引数を入力して図形を生成する
		if (shapeNum == 1) {
			// 左下直角の直角二等辺三角形が選択された場合、入力した底辺・高さの長さを引数として設定する
			return new RightIsoscelesTriangleRightAngleOnLowerLeft(shortSideLength);
		} else if (shapeNum == 2) {
			// 左上直角の直角二等辺三角形が選択された場合、入力した底辺・高さの長さを引数として設定する
			return new RightIsoscelesTriangleRightAngleOnUpperLeft(shortSideLength);
		} else if (shapeNum == 3) {
			// 右下直角の直角二等辺三角形が選択された場合、入力した底辺・高さの長さを引数として設定する
			return new RightIsoscelesTriangleRightAngleOnLowerRight(shortSideLength);
		} else if (shapeNum == 4) {
			// 右上直角の直角二等辺三角形が選択された場合、入力した底辺・高さの長さを引数として設定する
			return new RightIsoscelesTriangleRightAngleOnUpperRight(shortSideLength);
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
 * クラスRightIsoscelesTriangleは直角二等辺三角形を表す抽象クラスです。
 * このクラスは、図形を表す抽象クラスShapeから派生したクラスです。 抽象クラスですから、本クラスのインスタンスを生成することはできません。
 * 具体的な直角二等辺三角形クラスは、このクラスから派生します。
 * 
 * @see Shape
 *
 */
abstract class RightIsoscelesTriangle extends Shape {
	/**
	 * 底辺・高さの長さを表すint型のフィールドです。
	 */
	private int shortSideLength;

	/**
	 * 直角二等辺三角形を生成するコンストラクタです。 底辺・高さの長さを引数として受け取ります。
	 * 
	 * @param shortSideLength
	 */
	RightIsoscelesTriangle(int shortSideLength) {
		setShortSideLength(shortSideLength);
	}

	/**
	 * 直角二等辺三角形の 底辺・高さの長さを取得します。
	 * 
	 * @return 直角二等辺三角形の底辺・高さの長さ
	 */
	public int getShortSideLength() {
		return shortSideLength;
	}

	/**
	 * 直角二等辺三角形の 底辺・高さの長さを設定します。
	 * 
	 * @return 設定する直角二等辺三角形の底辺・高さの長さ
	 */
	public void setShortSideLength(int shortSideLength) {
		this.shortSideLength = shortSideLength;
	}
}

/**
 * クラスRightIsoscelesTriangleRightAngleOnLowerLeftは左下直角の直角二等辺三角形を表すクラスです。
 * このクラスは、直角二等辺三角形を表すRightIsoscelesTriangleから派生したクラスです。
 * 
 * @see Shape
 * @see RightIsoscelesTriangle
 *
 */
class RightIsoscelesTriangleRightAngleOnLowerLeft extends RightIsoscelesTriangle {
	RightIsoscelesTriangleRightAngleOnLowerLeft(int shortSideLength) {
		super(shortSideLength);
	}

	/**
	 * メソッドtoStringは、直角二等辺三角形に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"RightIsoscelesTriangleRightAngleOnLowerLeft(shortSideLength:4)"を返却します。
	 *         4の部分は底辺・高さの長さに応じた値です。
	 */
	@Override
	public String toString() {
		return "RightIsoscelesTriangleRightAngleOnLowerLeft(shortSideLength:" + getShortSideLength() + ")";
	}

	/**
	 * メソッドdrawは、直角二等辺三角形を描画します。 描画は、アステリスク記号'*'を並べることによって行います。
	 */
	@Override
	public void draw() {
		for (int i = 1; i <= getShortSideLength(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}

/**
 * クラスRightIsoscelesTriangleRightAngleOnUpperLeftは左上直角の直角二等辺三角形を表すクラスです。
 * このクラスは、直角二等辺三角形を表すRightIsoscelesTriangleから派生したクラスです。
 * 
 * @see Shape
 * @see RightIsoscelesTriangle
 *
 */
class RightIsoscelesTriangleRightAngleOnUpperLeft extends RightIsoscelesTriangle {
	RightIsoscelesTriangleRightAngleOnUpperLeft(int shortSideLength) {
		super(shortSideLength);
	}

	/**
	 * メソッドtoStringは、直角二等辺三角形に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"RightIsoscelesTriangleRightAngleOnUpperLeft(shortSideLength:4)"を返却します。
	 *         4の部分は底辺・高さの長さに応じた値です。
	 */
	@Override
	public String toString() {
		return "RightIsoscelesTriangleRightAngleOnUpperLeft(shortSideLength:" + getShortSideLength() + ")";
	}

	/**
	 * メソッドdrawは、直角二等辺三角形を描画します。 描画は、アステリスク記号'*'を並べることによって行います。
	 */
	@Override
	public void draw() {
		for (int i = getShortSideLength(); i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}

/**
 * クラスRightIsoscelesTriangleRightAngleOnLowerRightは右下直角の直角二等辺三角形を表すクラスです。
 * このクラスは、直角二等辺三角形を表すRightIsoscelesTriangleから派生したクラスです。
 * 
 * @see Shape
 * @see RightIsoscelesTriangle
 *
 */
class RightIsoscelesTriangleRightAngleOnLowerRight extends RightIsoscelesTriangle {
	RightIsoscelesTriangleRightAngleOnLowerRight(int shortSideLength) {
		super(shortSideLength);
	}

	/**
	 * メソッドtoStringは、直角二等辺三角形に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"RightIsoscelesTriangleRightAngleOnLowerRight(shortSideLength:4)"を返却します。
	 *         4の部分は底辺・高さの長さに応じた値です。
	 */
	@Override
	public String toString() {
		return "RightIsoscelesTriangleRightAngleOnLowerRight(shortSideLength:" + getShortSideLength() + ")";
	}

	/**
	 * メソッドdrawは、直角二等辺三角形を描画します。 描画は、空白部分をスペースで、図形内部をアステリスク記号'*'を並べることによって行います。
	 */
	@Override
	public void draw() {
		for (int i = 1; i <= getShortSideLength(); i++) {
			for (int j = 1; j <= getShortSideLength() - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}

/**
 * クラスRightIsoscelesTriangleRightAngleOnUpperRightは右上直角の直角二等辺三角形を表すクラスです。
 * このクラスは、直角二等辺三角形を表すRightIsoscelesTriangleから派生したクラスです。
 * 
 * @see Shape
 * @see RightIsoscelesTriangle
 *
 */
class RightIsoscelesTriangleRightAngleOnUpperRight extends RightIsoscelesTriangle {
	RightIsoscelesTriangleRightAngleOnUpperRight(int shortSideLength) {
		super(shortSideLength);
	}

	/**
	 * メソッドtoStringは、直角二等辺三角形に関する図形情報を表す文字列を返却します。
	 * 
	 * @return 文字列"RightIsoscelesTriangleRightAngleOnUpperRight(shortSideLength:4)"を返却します。
	 *         4の部分は底辺・高さの長さに応じた値です。
	 */
	@Override
	public String toString() {
		return "RightIsoscelesTriangleRightAngleOnUpperRight(shortSideLength:" + getShortSideLength() + ")";
	}

	/**
	 * メソッドdrawは、直角二等辺三角形を描画します。 描画は、空白部分をスペースで、図形内部をアステリスク記号'*'を並べることによって行います。
	 */
	@Override
	public void draw() {
		for (int i = getShortSideLength(); i >= 1; i--) {
			for (int j = 1; j <= getShortSideLength() - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
