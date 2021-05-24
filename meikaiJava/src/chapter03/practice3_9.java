package chapter03;

/**
 *
 * @author システム開発部
 *演習3-9
 *二つの実数値を読み込んで、大きいほうの値を表示するプログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice3_9 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("実数A：");
		//double型の変数を宣言
		//キーボードから読み込んだ実数値を代入
		double number1 = standardInput.nextDouble();

		//入力を促す文字列を出力
		System.out.print("実数B：");
		//double型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		double number2 = standardInput.nextDouble();

		//2つの実数を比較し大きいほうを含んだ文字列を出力
		System.out.print("大きいほうの値は" + (number1 > number2 ? number1 : number2) + "です。");
	}

}
