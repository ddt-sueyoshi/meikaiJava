package chapter02;

/**
 *演習2-3
 *右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 */

//参照するクラスを記述
import java.util.Scanner;

public class practice2_3 {

	public static void main(String[] args) {

		//入力のためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);
		//入力を促す文字列を出力
		System.out.print("整数値:");
		//int型の変数を宣言し、キーボードから入力された値で初期化
		int number = standardInput.nextInt();
		//変数を含む文字列を出力
		System.out.println("入力した値は" + number + "ですね。");

	}

}
