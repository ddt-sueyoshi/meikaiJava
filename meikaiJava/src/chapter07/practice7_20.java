package chapter07;

import java.util.Scanner;

/**
 *
 * @author システム開発部
 *演習7-20
 *配列aの要素a[idx]にxを挿入するメソッドaryInsを作成せよ。
 *挿入に伴ってa[idx]～a[a.length-2]を一つ後方にずらさなければならない。
 */

public class practice7_20 {

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	static void aryIns(int[] a, int idx, int x) {
		//指定の要素番号+1から配列の末尾まで繰り返す
		for (int i = idx + 1; i < a.length; i++) {
			//一つ先頭側にあった要素の値を代入
			a[idx] = a[idx - 1];
		}
		//指定の要素番号にxを代入
		a[idx] = x;
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

		//挿入する要素の位置
		int idx = -1;
		//挿入する要素の位置をキーボードから読み込む
		//配列の要素の位置になりうる値でなければ繰り返す
		while (idx <= 0 || idx > length - 1) {
			System.out.print("何番目に挿入しますか？：");
			idx = standardInput.nextInt();
		}

		//挿入する要素の値をキーボードから読み込む
		int newNumber = -1;
		System.out.print("挿入する値：");
		newNumber = standardInput.nextInt();

		//入力された位置から入力された数の要素を削除
		aryIns(numbers, idx, newNumber);
		//削除後の配列を表示
		System.out.print("numbers { ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.print("}");
	}

}
