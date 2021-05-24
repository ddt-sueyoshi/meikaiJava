package chapter02;

/**
 *
 * @author システム開発部
 *
 *演習2-8
 *キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice2_8 {

	public static void main(String[] args) {
		//ランダムクラスの生成
		Random random = new Random();
		//入力のためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数値:");
		//int型の変数を宣言し、キーボードから入力された値で初期化
		int number1 = standardInput.nextInt();

		//整数の変数を宣言し、
		//0から10の整数をランダムに生成し5を減算
		//-5から5のランダムな値として代入する
		int number2 = (random.nextInt(11)) - 5;

		//読み込んだ整数値プラスマイナス5の合計を含む文字列を表示
		System.out.print("その値の±5の乱数を生成しました。それは" + (number1 + number2) + "です。");

	}

}
