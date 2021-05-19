package chapter03;
/**
 *
 * @author システム開発部
 *演習3ｰ15
 *二つの整数値を読み込んで、降順（大きい順）にソートするプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_15 {

	public static void main(String[] args) {
		//読み込みのためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数a：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number1 = standardInput.nextInt();
		//入力を促す文字列を出力
		System.out.print("整数b：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number2 = standardInput.nextInt();

		//退避用の整数型変数を宣言
		int number3;

		//１つめ整数より2つ目の整数が大きい場合
		if (number1 < number2) {
			//1つめの値、2つめの値を入れ替える
			number3 = number1; //1つめの整数を退避
			number1 = number2; //1つめの整数に2つめの整数の値を代入
			number2 = number3; //2つめの整数に退避した整数を代入
		}

		//値を大きい順に表示する文字列を出力
		System.out.println("整数a：" + number1 + "\n整数b：" + number2);

	}

}
