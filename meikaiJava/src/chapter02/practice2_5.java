package chapter02;

/**
 * 
 * @author システム開発部
 *
 *演習2-5
 *二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 */

//参照するクラスを記述
import java.util.Scanner;

public class practice2_5 {

	public static void main(String[] args) {

		//入力のためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);
		
		//入力を促す文字列を出力
		System.out.print("整数値1:");
		//int型の変数を宣言し、キーボードから入力された値で初期化
		int number1 = standardInput.nextInt();
		
		//入力を促す文字列を出力
		System.out.print("整数値2:");
		//int型の変数を宣言し、キーボードから入力された値で初期化
		int number2 = standardInput.nextInt();
		
		//二つの変数の和と平均を含む文字列を出力
		System.out.print("合計は" + (number1 + number2) +
				"です。\n10平均は" + (number1 +number2)/2 + "です。");

	}

}
