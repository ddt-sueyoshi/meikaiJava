package chapter03;
/**
 *
 * @author システム開発部
 *演習3-6
 *正の整数とを読み込んで、それが10で割り切れれば『その値は10の倍数です。』と表示し、
 *そうでなければ『その値は10の倍数ではありません。』と表示するプログラムを作成せよ。
 *※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_6 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number = standardInput.nextInt();

		//入力された数が0より小さい場合
		if (number < 0) {
			//文字列を出力
			System.out.print("正でない値が入力されました。");
		}
		//入力された数を10で割った剰余が0と等しい時
		else if ((number % 10) == 0) {
			//文字列を出力
			System.out.print("『その値は10の倍数です。』");
		}
		//その他の場合
		else {
			//文字列を出力
			System.out.print("その値は10の倍数ではありません。");
		}

	}

}
