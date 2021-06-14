package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-26
 *配列aの要素a[idx]にxを挿入した配列を返却するメソッドarrayInsOfを作成せよ。
 */
public class practice7_26 {

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		//配列を生成
		int[] ary = makeAry();

		//挿入するインデックスを読み込む
		//配列のインデックスにない数ならやり直し
		int insertIdx = -1;
		do {
			System.out.print("挿入するインデックス：");
			insertIdx = standardInput.nextInt();
		} while (insertIdx < 0 || insertIdx > ary.length);
		//挿入する値
		System.out.print("挿入する値：");
		int insertValue = standardInput.nextInt();

		//配列から読み込んだインデックスの値を挿入した配列
		int[] insertedAry = arrayInsOf(ary, insertIdx, insertValue);
		//指定の値が挿入された配列を表示
		System.out.print("指定の値を挿入した配列：");
		showAry(insertedAry);
	}

	static int[] arrayInsOf(int[] a, int idx, int n) {
		//引数より1要素数が多い配列を生成
		int[] insertedAry = new int[a.length + 1];
		//追加対象インデックスより先頭側はそのままコピー
		//追加対象インデックスより末尾側は1個前方の値をコピー
		for (int i = 0; i < insertedAry.length; i++) {
			if (i < idx) {
				insertedAry[i] = a[i];
			} else if (i == idx) {
				insertedAry[i]=n;
			} else {
				insertedAry[i] = a[i - n];
			}
		}
		return insertedAry;
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
