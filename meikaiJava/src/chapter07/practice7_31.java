package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-31
 *int型の整数xの絶対値、long型整数xの絶対値、float型実数の絶対値、double型実数の絶対値を求める、多重定義されたメソッド群を作成せよ。
 */
public class practice7_31 {

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		//int型、long型、float型、double型の変数をキーボードから読み込み
		System.out.print("整数a：");
		int numberA = standardInput.nextInt();
		System.out.print("整数b：");
		long numberB = standardInput.nextLong();
		System.out.print("実数c：");
		float numberC = standardInput.nextFloat();
		System.out.print("実数d：");
		double numberD = standardInput.nextDouble();

		//絶対値を出力
		System.out.println("整数aの絶対値：" + absolute(numberA));
		System.out.println("整数bの絶対値：" + absolute(numberB));
		System.out.println("整数cの絶対値：" + absolute(numberC));
		System.out.println("整数dの絶対値：" + absolute(numberD));
	}

	static int absolute(int x) {
		int abslt = x; //引数で初期化
		if (x < 0) //もし負の数なら正負を反転させる
			abslt = -x;
		return abslt;
	}

	static long absolute(long x) {
		long abslt = x; //引数で初期化
		if (x < 0) //もし負の数なら正負を反転させる
			abslt = -x;
		return abslt;
	}

	static float absolute(float x) {
		float abslt = x; //引数で初期化
		if (x < 0) //もし負の数なら正負を反転させる
			abslt = -x;
		return abslt;
	}

	static double absolute(double x) {
		double abslt = x; //引数で初期化
		if (x < 0) //もし負の数なら正負を反転させる
			abslt = -x;
		return abslt;
	}

}
