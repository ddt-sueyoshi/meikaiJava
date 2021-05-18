package chapter03;

/**
 *
 * @author システム開発部
 *演習3-7
 *正の整数値を読み込んで、それを3で割った値に応じて『その値は3で割り切れます。』
 *『その値を3で割った余りは1です。』『その値を3で割った余りは2です。』のいずれかを表示するプログラムを作成せよ。
 *※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_7 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number = standardInput.nextInt();

		//入力された数が0より小さい場合
		if (number < 0)
			//文字列を出力
			System.out.print("正でない値が入力されました。");
		//3で割った剰余が0と等しい場合
		else if ((number % 3) == 0)
			//文字列を出力
			System.out.print("その値は3で割り切れます。");
		//3で割った剰余が1と等しい場合
		else if ((number % 3) == 1)
			//文字列を出力
			System.out.print("その値を3で割った余りは1です。");
		//そのほかの場合
		else
			//文字列を出力
			System.out.print("その値を3で割った余りは2です。");

	}

}
