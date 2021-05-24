package chapter06;

import java.util.Random;
/**
 * 
 * @author システム開発部
 *連続する要素が同じ値を持つことのないように演習6-9のプログラムを改良したプログラムを作成せよ。
 *たとえば{1,3,5,5,3,2}とならないようにすること。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_10 {

	public static void main(String[] args) {
		//読み込み・乱数クラスを生成
		Scanner standardInput = new Scanner(System.in);
		Random random = new Random();

		//入力を促すメッセージ出力
		//要素数になる整数をキーボードから読み込む
		System.out.print("要素数：");
		final int length = standardInput.nextInt();
		//入力された整数を要素数とするint型の配列を宣言
		int[] numbers = new int[length];

		//配列先頭の要素は重複を気にしなくて良いのでループ外で出力
		numbers[0] = random.nextInt(9) + 1;
		//配列の要素数分繰り返し
		for (int i = 1; i < length; i++) {
			//1つ前の要素と一致しない乱数が得られるまで繰り返し
			int number;
			{
				//1～10の乱数（0～9の乱数+1）
				number = random.nextInt(9) + 1;
			}
			while (number == numbers[i - 1])
				;
			//乱数を配列の値として格納
			numbers[i] = number;
		}
		for (int number : numbers) {
			System.out.print(number + " ");
		}

	}

}
