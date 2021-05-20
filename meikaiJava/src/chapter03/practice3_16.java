package chapter03;
/**
 *
 * @author システム開発部
 *演習3-16
 *三つの整数値を読み込んで、昇順（小さい順）にソートするプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_16 {

	public static void main(String[] args) {
		//読み込みのためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("1つめの整数：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number1 = standardInput.nextInt();
		//入力を促す文字列を出力
		System.out.print("2つめの整数：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number2 = standardInput.nextInt();
		//入力を促す文字列を出力
		System.out.print("3つめの整数：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int number3 = standardInput.nextInt();

		//退避用の整数型変数を宣言
		int number4;

		//１つめ整数より2つ目の整数が小さい場合
		if (number1 > number2) {
			//1つめの値、2つめの値を入れ替える
			number4 = number1; //1つめの整数を退避
			number1 = number2; //1つめの整数に2つめの整数の値を代入
			number2 = number4; //2つめの整数に退避した整数を代入
		}

		//1つめの整数より3つめの整数が小さい場合
		if (number1 > number3) {
			//3つめの値、1つめの値、2つめの値の順に並べ替える
			number4 = number1; //1つめの整数を退避
			number1 = number3; //1つめの整数に3つめの整数の値を代入
			number2 = number1; //2つめの整数に1つめの整数の値を代入
			number3 = number4; //3つめの整数に退避した整数を代入
			//1つめの整数より3つめの整数が小さくなく、2つめの整数より3つめの整数が小さい場合
		} else if (number2 > number3) {
			//2つめの値、3つめの値を入れ替える
			number4 = number2; //2つめの整数を退避
			number2 = number3; //2つめの整数に3つめの整数の値を代入
			number3 = number4; //3つめの整数に退避した整数を代入
		}

		//小さい順に並べた整数を含む文字列を表示
		System.out.print("小さいほうから順に " + number1 + "," + number2 + "," + number3);

	}

}
