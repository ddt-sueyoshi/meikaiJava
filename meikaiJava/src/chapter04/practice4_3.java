package chapter04;
/**
 *
 * @author システム開発部
 *右に示すように、二つの整数値を読み込んで、
 *小さいほうの数以上で大きいほうの数以下の全整数を小さいほうから順に表示するプログラムを作成せよ
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_3 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("");
		//整数型の変数を宣言し、キーボードから読み込んだ整数値を代入
		int number1 = standardInput.nextInt();
		//入力を促す文字列を出力
		System.out.print("");
		//整数型の変数を宣言し、キーボードから読み込んだ整数値を代入
		int number2 = standardInput.nextInt();

		//もし1つめの整数が2つ目の整数が大きい場合
		if (number1 > number2) {
			//入力された2つの変数を入れ替える
			int backup = number1; //退避用の変数を宣言、1つめの整数の値を代入
			number1 = number2; //1つめの変数に2つめの整数の値を代入
			number2 = backup; //2つめの変数に退避させた整数の値を代入
		}

		//1つめの整数に1加算し、2つに整数の間の数の最小の数にする
		number1 = number1 + 1;
		//繰り返す処理内容
		do {
			//1つめの整数を出力
			System.out.print(number1 + " ");
			//1つめの整数に1加算
			number1 = number1 + 1;
		} while (number1 != number2);//1つめの整数と2つめの整数と等しくない場合繰り返し
	}

}
