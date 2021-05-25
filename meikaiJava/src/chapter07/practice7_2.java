package chapter07;

/**
 *
 * @author システム開発部
 *演習7-2
 *三つのnt型引数a,b,cの最小値を求めるメソッドminを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_2 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された整数を変数に格納
		System.out.print("整数：");
		int number1 = standardInput.nextInt();
		System.out.print("整数：");
		int number2 = standardInput.nextInt();
		System.out.print("整数：");
		int number3 = standardInput.nextInt();

		//minメソッドに入力された整数を渡して最小値を出力
		System.out.print("最小値は" + min(number1, number2, number3) + "です。");

	}

	//3つの整数を引数として受け取り、最小値の整数を返す
	static int min(int a, int b, int c) {
		//最小値変数にaを代入
		int min = a;
		//現最小値よりbが小さければ入れ替え
		if (min > b) {
			min = b;
		}
		//現最小値よりcが小さければ入れ替え
		if (min > c) {
			min = c;
		}
		return min;
	}

}
