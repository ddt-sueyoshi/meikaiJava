package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-24
 *配列aから要素a[idx]を削除した配列を返却するメソッドarrayRmvOfを作成せよ。
 */
public class practice7_24 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		//配列を生成
		int[] ary = makeAry();
		//削除するインデックスを読み込む
		//配列のインデックスにない数ならやり直し
		int deleteIdx = -1;
		do {
			System.out.print("削除するインデックス：");
			deleteIdx = standardInput.nextInt();
		} while (deleteIdx < 0 || deleteIdx >= ary.length);

		//配列から読み込んだインデックスの値を削除した配列
		int[] removedAry = arrayRmvOf(ary, deleteIdx);
		//指定のインデックスの値が削除された配列を表示
		System.out.print("指定のインデックスを削除した配列：");
		showAry(removedAry);
	}

	static int[] arrayRmvOf(int[] a, int idx) {
		//引数より1つ要素数が少ない配列を生成
		int[] deletedAry = new int[a.length - 1];
		//削除対象インデックスより先頭側はそのままコピー
		//削除対象インデックスから末尾側は一つ後方の値をコピー
		for (int i = 0; i < deletedAry.length; i++) {
			if (i < idx) {
				deletedAry[i] = a[i];
			} else {
				deletedAry[i] = a[i + 1];
			}
		}
		return deletedAry;
	}

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

	//配列を受けとり全要素を表示する
	static void showAry(int[] numbers) {
		System.out.print("{ ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.print("}");
	}
}
