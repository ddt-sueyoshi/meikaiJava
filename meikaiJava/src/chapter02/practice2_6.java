package chapter02;

/**
 *
 * @author システム開発部
 *
 * 演習2-6
 *三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 *
 */

//参照するクラスを記述
import java.util.Scanner;

public class practice2_6 {

	public static void main(String[] args) {

		//入力のためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("底辺:");
		//double型の変数を宣言し、キーボードから入力された値で初期化
		double base = standardInput.nextInt();

		//入力を促す文字列を出力
		System.out.print("高さ:");
		//double型の変数を宣言し、キーボードから入力された値で初期化
		double height = standardInput.nextInt();

		//二つの変数の和と平均を含む文字列を出力
		System.out.print("面積は" + (base + height) / 2 + "です。");

	}

}
