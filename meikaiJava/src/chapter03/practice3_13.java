package chapter03;

/**
 *
 * @author システム開発部
 *演習3-13
 *キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 *※たとえば2,3,1の中央値は2で、1,2,1の中央値は1で、3,3,3の中央値は3である。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_13 {

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

		//中央値用の整数型変数を宣言
		int middle;

		//小さい順に2つめ、1つめ、3つめまたは3つめ、1つめ、2つめの場合
		if ((number2 >= number1&&number1>=number3)||(number3<=number1&&number1<=number2)) {
			middle=number1; //中央値は1つめ
		}
		//小さい順に1つめ、2つめ、3つめまたは3つめ、2つめ、1つめの場合
		else if ((number1 >= number2&&number2>=number3)||(number1<=number2&&number2<=number3)) {
			middle=number2; //中央値は2つめ
		}
		//小さい順に1つめ、3つめ、2つめまたは2つめ、3つめ、1つめの場合
		else {
			middle=number3; //中央値は3つめ
		}

		//中央値を含む文字列を表示
		System.out.print("中央値は" + middle + "です。");

	}

}
