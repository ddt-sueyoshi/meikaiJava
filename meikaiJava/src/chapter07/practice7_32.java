package chapter07;

import java.util.Scanner;

/**
 *
 * @author システム開発部
 *演習問題7-32
 *LiList7-32のメソッドprintBitsは、int型整数値の内部ビットを表示するものであった。
 *他の整数型に対しても同様の働きを行う、多重定義されたメソッド群を作成せよ。
 */
public class practice7_32 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	//ビット構成を表示する
	static void printBits(byte x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(short x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	static void printBits(long x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	public static void main(String[] args) {
		//キーボードから整数を読み込み
		System.out.print("number1 :");
		byte numByte = standardInput.nextByte();
		System.out.print("number2 :");
		short numShort = standardInput.nextShort();
		System.out.print("number3 :");
		int numInt = standardInput.nextInt();
		System.out.print("number4 :");
		long numLong = standardInput.nextLong();

		//それぞれのビット構成を表示
		printBits(numByte);
		printBits(numShort);
		printBits(numInt);
		printBits(numLong);
	}

}
