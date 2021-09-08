package chapter07;

import java.util.Scanner;

/**
 *
 * @author システム開発部
 *演習7-25
 *配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッドarrayRmvOfNを作成せよ。
 */
public class practice7_25 {

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		//配列を生成
		int[] ary = makeAry();

		//削除するインデックスを読み込む
		//配列のインデックスにない数ならやり直し
		int deleteIdx = -1;
		int deleteNum = 0;
		do {
			System.out.print("削除するインデックス：");
			deleteIdx = standardInput.nextInt();
		} while (deleteIdx < 0 || deleteIdx >= ary.length);
		do {
			System.out.print("削除する要素の数：");
			deleteNum = standardInput.nextInt();
		} while (deleteNum < 0 || deleteIdx + deleteNum > ary.length);

		//配列から読み込んだインデックスの値を削除した配列
		int[] removedAry = arrayRmvOfN(ary, deleteIdx, deleteNum);
		//指定のインデックスの値が削除された配列を表示
		System.out.print("指定のインデックスを削除した配列：");
		showAry(removedAry);
	}

	/**
	 * 配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却する
	 * @param a 整数配列
	 * @param idx 削除する先頭のインデックス
	 * @param n 削除する個数
	 * @return aから要素を削除した配列
	 */
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		//引数よりn要素数が少ない配列を生成
		int[] deletedAry = new int[a.length - n];
		//削除対象インデックスより先頭側はそのままコピー
		//削除対象インデックスから末尾側はn個後方の値をコピー
		for (int i = 0; i < deletedAry.length; i++) {
			if (i < idx) {
				deletedAry[i] = a[i];
			} else {
				deletedAry[i] = a[i + n];
			}
		}
		return deletedAry;
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
}
