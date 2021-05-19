package chapter03;

/**
 *
 * @author システム開発部
 *演習3-14
 *List3-13と同様に、二つの整数値を読み込んで、小さいほうの値と大きいほうの値の両方を表示するプログラムを作成せよ。
 *ただし、二つの整数値が等しい場合は、右に示すように、『二つの値は同じです。』と表示すること。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_14 {

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

		//１つめ整数より2つ目の整数が小さい場合
		if (number1 > number2) {
			//1つめの値、2つめの値を入れ替える
			number3 = number1; //1つめの整数を退避
			number1 = number2; //1つめの整数に2つめの整数の値を代入
			number2 = number3; //2つめの整数に退避した整数を代入
		}

		//値を小さい順に表示する文字列を出力
		System.out.println("整数a：" + number1 + "\n整数b：" + number2);
		//1つめの整数と2つめの整数が等しい場合
		if (number1 == number2)
			//値が等しい旨の文字列を出力
			System.out.print("二つの値は同じです。");

	}

}
