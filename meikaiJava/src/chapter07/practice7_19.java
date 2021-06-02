package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-19
 *配列aから要素[idx]を先頭とするn個の要素を削除するメソッドaryRmvNを作成せよ。
 *なお、移動されずに余ってしまう要素の値は変更しなくてよい。
 */

public class practice7_19 {

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	static void aryRmvN(int[] a, int idx, int n) {
		//指定の要素番号から配列の末尾のn前まで繰り返す
		for (int i = idx; i < a.length - n; i++) {
			//n末尾側にあった要素の値を代入
			a[idx] = a[idx + n];
		}
	}

	public static void main(String[] args) {
		//配列の個数をキーボードから読み込み、配列を生成
		System.out.print("配列の長さ：");
		int length = standardInput.nextInt();
		int[] numbers = new int[length];

		//要素数分繰り返し、要素に値を代入
		for (int i = 0; i < length; i++) {
			System.out.print(i + "番目の値：");
			numbers[i] = standardInput.nextInt();
		}

		//削除する要素の位置
		int idx = -1;
		//削除する要素の位置をキーボードから読み込む
		//配列の要素の位置になりうる値でなければ繰り返す
		while (idx <= 0 || idx > length - 1) {
			System.out.print("何番目を削除しますか？：");
			idx = standardInput.nextInt();
		}

		//削除する要素の数
		int count = -1;
		//削除する要素の数をキーボードから読み込む
		//配列の要素idxより後ろの数になりうる値でなければ繰り返す
		while (count < 0 || count > length - idx) {
			System.out.print("いくつ削除しますか？：");
			count = standardInput.nextInt();
		}

		//入力された位置から入力された数の要素を削除
		aryRmvN(numbers, idx, count);
		//削除後の配列を表示
		System.out.print("numbers { ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.print("}");

	}
}
