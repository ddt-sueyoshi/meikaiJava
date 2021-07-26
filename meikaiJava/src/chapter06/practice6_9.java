package chapter06;

import java.util.Random;
/**
 * 
 * @author システム開発部
 *演習6-9
 *要素型がint型である配列を作り、全要素を1~10の乱数で埋め尽くす（1以上10以下の値を代入する）プログラムを作成せよ。
 *要素数はキーボードから読み込むこと。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_9 {

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

		//配列の要素数分繰り返し
		for (int number : numbers) {
			//1～10の乱数（0～9の乱数+1）を配列の値として格納
			number = random.nextInt(9) + 1;
			System.out.print(number + " ");
		}
	}

}
