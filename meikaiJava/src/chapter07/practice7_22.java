package chapter07;

import java.util.Scanner;

/*
 * 演習問題7-22
 * 配列aと同じ配列（要素数が同じですべての要素の値が同じ値）を生成して返却するメソッドarrayCloneを作成せよ。
 */
public class practice7_22 {

	public static void main(String[] args) {
		//配列作成メソッドを呼び出し配列Aを生成
		int[] aryOrigin = makeAry();
		//arrayCloneメソッドを呼び出し、要素数が同じですべての要素の値が同じ値を生成
		int[] aryClone = arrayClone(aryOrigin);
		//二つの配列を表示
		System.out.print("オリジナル：");
		showAry(aryOrigin);
		System.out.println();
		System.out.print("クローン：");
		showAry(aryClone);
	}

	//受け取った配列と長さ、全要素が同じ配列を生成
	static int[] arrayClone(int[] a) {
		//a同じ要素数の配列を生成
		int[] clone = new int[a.length];
		//要素数分繰り返し、先頭から順に要素をコピーする
		for (int i = 0; i < a.length; i++) {
			clone[i] = a[i];
		}
		return clone;
	}

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

	//配列を受けとり全要素を表示する
	static void showAry(int[] numbers) {
		System.out.print("{ ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.print("}");
	}

}
