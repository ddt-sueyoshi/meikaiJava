package chapter03;

/**
 *
 * @author システム開発部
 *
 *演習3-2
 *二つの整数値を読み込んで、後者が前者の約数であれば『BはAの約数です。』と表示し、
 *そうでなければ『BはAの約数ではありません。』と表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_2 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数A：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number1 = standardInput.nextInt();

		//入力を促す文字列を出力
		System.out.print("整数B：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number2 = standardInput.nextInt();

		//BをAで割った剰余が0と等しい場合
		if ((number2 % number1) == 0) {
			//文字列を出力（約数である）
			System.out.print("BはAの約数です。");
		}
		//そうでない（剰余が0でない）場合
		else {
			//文字列を出力（約数でない）
			System.out.print("BはAの約数ではありません。");
		}

	}

}
