package chapter07;

import java.util.Scanner;

/**
 *
 * @author システム開発部
 *演習7-21
 *配列aと配列bの全要素の値を交換するメソッドaryExchngを作成せよ。
 *二つの要素の要素数が等しくない場合は、小さいほうの要素数分の要素を交換すること。
 */
public class practice7_21 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	//配列の要素数、全要素の値をキーボードから読み込み配列を作成
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

	//二つの配列の要素を入れ替える
	static int[][] aryExchng(int[] aryX, int[] aryY) {
		//短い配列の要素数分繰り返す
		int count = aryX.length <= aryY.length ? aryX.length : aryY.length;
		for (int i = 0; i < count; i++) {
			int backup = aryX[i];
			aryX[i] = aryY[i];
			aryY[i] = backup;
		}
		int[][] twoArys = { aryX, aryY };

		return twoArys;
	}

	//配列を受けとり全要素を表示する
	static void showAry(int[] numbers) {
		System.out.print("{ ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.print("}");
	}

	public static void main(String[] args) {
		//配列を2つ作成
		System.out.println("aryNumberA ");
		int[] aryNumberA = makeAry();
		System.out.println("aryNumberB ");
		int[] aryNumberB = makeAry();

		//作成した配列の要素を入れ替える
		aryExchng(aryNumberA, aryNumberB);

		//入れ替えた配列を表示
		System.out.print("aryNumberA ");
		showAry(aryNumberA);
		System.out.println();
		System.out.print("aryNumberB ");
		showAry(aryNumberB);
	}

}
