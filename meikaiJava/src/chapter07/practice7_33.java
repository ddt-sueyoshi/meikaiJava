package chapter07;

import java.util.Scanner;

/**
 *
 * @author システム開発部
 *演習問題7-33
 *int型の1次元配列とint型の2次元配列（行によって列数が異なる可能性がある）の全要素を表示する、多重定義されたメソッド群を作成せよ。
 *なお、1次元配列の表示では、各要素の間には1文字分のスペースを空けること。
 *また、2次元配列の表示では、各列の数値の先頭がそろうように、最低限のスペースを空けること。
 */
public class practice7_33 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		int[] ary1 = makeAry();
		int[][] ary2 = makeDoubleAry();
		showAry(ary1);
		showAry(ary2);

	}

	/**
	 * 配列の要素数、全要素の値をキーボードから読み込み配列を作成
	 * @return キーボードから読み込んだ整数配列
	 */
	static int[] makeAry() {
		System.out.print("配列の長さ：");
		int length = standardInput.nextInt();
		int[] numbers = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.print(i + "番目の値：");
			numbers[i] = standardInput.nextInt();
		}
		return numbers;
	}

	/**
	 * 配列を受けとり全要素を表示する
	 * @param numbers 表示する整数配列
	 */
	static void showAry(int[] numbers) {
		System.out.print("{ ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.print("}");
	}

	/**
	 * 二次元配列の要素数、全要素の値をキーボードから読み込み配列を作成
	 * @return キーボードから読み込んだ2次元整数配列
	 */
	static int[][] makeDoubleAry() {
		//行数・列数をキーボードから読み込む
		System.out.print("配列の行数：");
		int rows = standardInput.nextInt();

		//各要素の値をキーボードから読み込む
		int[][] numbers = new int[rows][];
		for (int i = 0; i < rows; i++) {
			System.out.print(i + "行目の配列の列数：");
			int columns = standardInput.nextInt();
			for (int j = 0; j < columns; j++) {
				System.out.print(i + "行目" + j + "番目の値：");
				numbers[i][j] = standardInput.nextInt();
			}
		}
		//二重配列を返却
		return numbers;
	}

	/**
	 * 二次元配列を受けとり全要素を表示する
	 * @param numbers 表示する2次元整数配列
	 */
	static void showAry(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%5d", numbers[i][j]);
			}
			System.out.println();
		}
	}
}
