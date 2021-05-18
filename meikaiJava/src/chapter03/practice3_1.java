package chapter03;

/**
*
* @author システム開発部
*演習3-1
*右に示すように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。
*/

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_1 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number = standardInput.nextInt();

		//入力された整数が0以下の場合
		if (number < 0)
			//変数の符号を反転させて代入
			number = -number;

		//絶対値を文字列で出力
		System.out.print("その絶対値は" + number + "です。");

	}

}
