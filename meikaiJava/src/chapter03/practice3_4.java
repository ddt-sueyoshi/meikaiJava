package chapter03;

/**
 *
 * @author システム開発部
 *演習3-4
 *二つの変数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 *『aのほうが大きいです。』『bのほうが大きいです。』『aとbは同じ値です。』
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_4 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数A：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number_a = standardInput.nextInt();

		//入力を促す文字列を出力
		System.out.print("整数B：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number_b = standardInput.nextInt();

		//aがbより大きい場合
		if (number_a > number_b)
			//文字列を出力
			System.out.print("aのほうが大きいです。");
		//bがaより大きい場合
		else if (number_b > number_a)
			//文字列を出力
			System.out.print("bのほうが大きいです。");
		//そのほかの場合
		else
			//文字列を出力
			System.out.print("aとbは同じ値です。");

	}

}
