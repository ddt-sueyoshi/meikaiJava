package chapter02;

/**
 * 
 * @author システム開発部
 *
 *演習2-4
 *右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ。
 */

//参照するクラスを記述
import java.util.Scanner;

public class practice2_4 {

	public static void main(String[] args) {

		//入力のためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);
		//入力を促す文字列を出力
		System.out.print("整数値:");
		//int型の変数を宣言し、キーボードから入力された値で初期化
		int number = standardInput.nextInt();
		//変数に10を加えた値と10を減じた値を含む文字列を出力
		System.out.print("10を加えた値は" + (number + 10) +
				"です。\n10を減じた値は" + (number - 10) + "です。");

	}

}
