package chapter06;

/**
 *
 * @author システム開発部
 *演習6-13
 *配列の全要素を配列に対して逆順にコピーするプログラムを作成せよ。
 *なお、二つの配列の要素数は同一であると仮定してよい。
 */
//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice6_13 {

	public static void main(String[] args) {
		// 乱数生成・読み込みのためのクラスを生成
		Random random = new Random();
		Scanner standardInput = new Scanner(System.in);

		//要素数をキーボードから読み込む
		System.out.print("要素数：");
		int length = standardInput.nextInt();

		//配列数が同一の2つの配列
		int[] numbersA = new int[length];
		int[] numbersB = new int[length];

		//要素数の分繰り返し
		for (int i = 0; i < length; i++) {
			numbersA[i] = random.nextInt(99); //0～99までの乱数を生成し要素の値とする
		}

		//要素数分繰り返し
		for (int i = 0; i < length; i++) {
			numbersB[i] = numbersA[length - (i + 1)]; //配列Bの値に配列Aの同インデックスの値を代入
		}

		//2つの配列を表示
		System.out.println("入れ替え前");
		System.out.print("numbersA : { ");
		for (int i = 0; i < length; i++) {
			System.out.print(numbersA[i] + (i < length - 1 ? "," : " }\n"));
		}
		System.out.println("入れ替え後");
		System.out.print("numbersB : { ");
		for (int i = 0; i < length; i++) {
			System.out.print(numbersB[i] + (i < length - 1 ? "," : " }\n"));
		}

	}

}
