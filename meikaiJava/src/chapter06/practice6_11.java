package chapter06;

import java.util.Random;
/**
 *
 * @author システム開発部
 *演習6-11
 *異なる要素が同じ値を持つことの内容に演習6-9のプログラムを改良したプログラムを作成せよ。
 *たとえば{1,3,5,6,1,2}とならないようにすること（配列の要素は10以下であるとする。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_11 {

	public static void main(String[] args) {
		//読み込み・乱数クラスを生成
		Scanner standardInput = new Scanner(System.in);
		Random random = new Random();

		//入力を促すメッセージ出力
		//要素数になる整数をキーボードから読み込む
		//10以下が得られるまで繰り返し
		System.out.print("要素数：");
		int length = 0;
		while (length <= 0 || length > 10) {
			length = standardInput.nextInt();
		}

		//入力された整数を要素数とするint型の配列を宣言
		int[] numbers = new int[length];

		//配列先頭の要素は重複を気にしなくて良いのでループ外で出力
		numbers[0] = random.nextInt(9) + 1;

		//配列の要素数分繰り返し
		for (int i = 1; i < length; i++) {

			int number; //乱数を格納する整数変数
			boolean retry; //やり直しフラグ（既出の整数であればtrueにする）

			do {
				retry = false; //やり直しフラグの初期化
				number = random.nextInt(9) + 1; //1～10の乱数（0～9の乱数+1）

				for (int j = 0; j < i; j++) {	//1つ前までの全要素を確認
					if (number == numbers[j]) {	//既出の場合
						retry = true;
						break;	//確認ループを抜けdo文に戻る
					}
				}
			} while (retry);

			//乱数を配列の値として格納
			numbers[i] = number;
		}

		//配列を出力
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}

}
