package chapter10;

import java.util.Scanner;

/**
 * 
 * @author user 演習10-3
 *         二値/三値/配列の最小値を求めるメソッドや最大値を求めるメソッドを集めたユーティリティクラスMinMaxを作成せよ。
 */

final class MinMax {
	// --- 二値の最小値を求める ---//
	public static int min(int a, int b) {
		int min = a; // a を最小値 min に代入する
		if (min > b) { // b の方が min より小さければ代入する
			min = b;
		}
		return min; // min を返却する
	}

	// --- 三値の最小値を求める ---//
	public static int min(int a, int b, int c) {
		int min = a; // a を最小値 min に代入する
		if (min > b) { // b の方が min より小さければ代入する
			min = b;
		}
		if (min > c) { // c の方が min より小さければ代入する
			min = c;
		}
		return min; // min を返却する
	}

	// --- 配列の最小値を求める ---//
	public static int min(int[] numbers) {
		int min = numbers[0]; // 配列の先頭を最小値 min に代入する
		for (int i = 1; i < numbers.length; i++) { // 配列の先頭側から１つずつ最小値と比較する
			if (min > numbers[i]) { // 配列の項目のほうが min より小さければ代入する
				min = numbers[i];
			}
		}
		return min; // min を返却する
	}

	// --- 二値の最大値を求める ---//
	public static int max(int a, int b) {
		int max = a; // a を最小値 min に代入する
		if (max < b) { // b の方が min より小さければ代入する
			max = b;
		}
		return max; // min を返却する
	}

	// --- 三値の最大値を求める ---//
	public static int max(int a, int b, int c) {
		int max = a; // a を最小値 min に代入する
		if (max < b) { // b の方が min より小さければ代入する
			max = b;
		}
		if (max < c) { // c の方が min より小さければ代入する
			max = c;
		}
		return max; // min を返却する
	}

	// --- 配列の最大値を求める ---//
	public static int max(int[] numbers) {
		int max = numbers[0]; // 配列の先頭を最小値 min に代入する
		for (int i = 1; i < numbers.length; i++) { // 配列の先頭側から１つずつ最小値と比較する
			if (max < numbers[i]) { // 配列の項目のほうが min より小さければ代入する
				max = numbers[i];
			}
		}
		return max; // min を返却する
	}
}

public class practice10_03 {

	public static void main(String[] args) {
		Scanner stdInput = new Scanner(System.in);

		// 入力された2値の最小値と最大値を表示する
		System.out.println("2つの最小値と最大値を求めます。");
		System.out.print("1つ目の値：");
		int number1 = stdInput.nextInt();
		System.out.print("2つ目の値：");
		int number2 = stdInput.nextInt();
		System.out.println("最小値は" + MinMax.min(number1, number2) + "です。");
		System.out.println("最大値は" + MinMax.max(number1, number2) + "です。");

		// 入力された3値の最小値と最大値を表示する
		System.out.println("3つの最小値と最大値を求めます");
		System.out.print("1つ目の値：");
		int number3 = stdInput.nextInt();
		System.out.print("2つ目の値：");
		int number4 = stdInput.nextInt();
		System.out.print("3つ目の値：");
		int number5 = stdInput.nextInt();
		System.out.println("最小値は" + MinMax.min(number3, number4, number5) + "です。");
		System.out.println("最大値は" + MinMax.max(number3, number4, number5) + "です。");

		// 入力された数値配列の最小値と最大値を表示する
		System.out.println("配列の最小値と最大値を求めます");
		System.out.print("配列の長さ：");
		int length = stdInput.nextInt();
		int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("配列" + i + "番目の値：");
			numbers[i] = stdInput.nextInt();
		}
		System.out.println("最小値は" + MinMax.min(numbers) + "です。");
		System.out.println("最大値は" + MinMax.max(numbers) + "です。");
	}

}
