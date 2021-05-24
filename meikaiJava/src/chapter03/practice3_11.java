package chapter03;

/**
 *
 * @author システム開発部
 *演習3-11
 *右に示すように、二つの整数値を読み込んで、それらの値の差が10以下であれば、『それらの差は10以下です。』と表示し、
 *そうでなければ『それらの差は11以上です。』と表示するプログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice3_11 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数A：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number1 = standardInput.nextInt();

		//入力を促す文字列を出力
		System.out.print("整数B：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number2 = standardInput.nextInt();

		//整数型の変数を宣言
		//2つの実数を比較し大きいほうから小さいほうを引いた値を代入
		int number3=(number1 > number2) ? (number1-number2) : (number2-number1);

		//差分の変数が10以下か判定し、分岐した文字列を出力
		System.out.print("それらの差は"+(number3<=10?"10以下です。":"11以上です。"));

	}

}
