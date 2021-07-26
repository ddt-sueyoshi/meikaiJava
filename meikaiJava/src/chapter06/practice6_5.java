package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-5
 *配列の要素数と、個々の要素数の値を読み込んで、右のように各要素の値を表示するプログラムを作成せよ。
 *表示の形式は、初期化子と同じ形式、すなわち、各要素の値をコンマで区切って{ }で囲んだ形式とすること。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_5 {
	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//キーボードから読み込んだ整数値を要素数とする整数配列を宣言
		System.out.print("要素数：");
		int number = standardInput.nextInt();
		int[] numbers = new int[number];

		//配列の要素数分繰り返し
		for (int i = 0; i < numbers.length; i++) {
			//入力された値を配列に格納
			System.out.print("numbers[" + i + "]=");
			numbers[i] = standardInput.nextInt();
		}

		//各要素の値を表示
		System.out.print("numbers = {");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if (i < (numbers.length - 1)) {
				System.out.print(","); //,区切りは最後の要素の後には不要
			}
		}
		System.out.print("}");
	}
}
