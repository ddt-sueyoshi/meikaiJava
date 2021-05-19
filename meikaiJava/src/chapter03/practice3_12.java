package chapter03;

/**
 *
 * @author システム開発部
 *演習3-12
 *キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_12 {

	public static void main(String[] args) {

		//読み込みのためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("1つめの整数：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number1 = standardInput.nextInt();
		//入力を促す文字列を出力
		System.out.print("2つめの整数：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number2 = standardInput.nextInt();
		//入力を促す文字列を出力
		System.out.print("3つめの整数：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number3 = standardInput.nextInt();

		//最小値を格納する変数を宣言、1つ目の変数を代入
		int minimum = number1;
		//最小値の変数より2つ目の変数が小さい場合
		if (number2 < minimum)
			//最小値の変数に2つ目の変数を代入
			minimum = number2;
		//最小値の変数より3つ目の変数が小さい場合
		if (number3 < minimum)
			//最小値の変数に3つ目の変数を代入
			minimum = number3;

		//最小値変数を含む文字列を表示
		System.out.print("最小値は" + minimum + "です。");

	}

}
