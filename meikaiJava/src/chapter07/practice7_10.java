package chapter07;

import java.util.Random;
/**
 * 
 * @author システム開発部
 *演習7-10
 *List7-10を拡張して、以下の四つの問題をランダムに出題するプログラムを作成せよ。
 * x + y + z
 * x + y - z
 * x - y + z
 * x - y - z
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_10 {
	//読み込みクラスの生成
	//乱数クラスの生成
	static Scanner standardInput = new Scanner(System.in);
	static Random random = new Random();

	//続行の要否を確認
	static boolean confirRetry() {
		int cont;
		do {
			//整数をキーボードから読み込む
			System.out.print("もう一度？<Yes…1／No…0>：");
			cont = standardInput.nextInt();
		} while (cont != 1 && cont != 0); //不適切な数字の場合やり直し
		//繰り返しならtrue、そうでなければfalseを返却
		return (cont == 1);
	}

	//3つの整数を受け取り、加算減算を組み合わせた問題をランダムに出題
	static void mathQuestion(int x, int y, int z) {
		String question = ""; //問題を格納する文字列変数
		int correct = 0; //正解を格納する整数変数
		int answer; //回答を格納する整数変数

		//0～3の乱数を生成し、乱数に応じて問題を分岐させる
		int variation = random.nextInt(4);
		switch (variation) {
		case 0:
			question = "x + y + z ="; //問題文を代入
			correct = x + y + z; //正解を代入
			break;
		case 1:
			question = "x + y - z ="; //問題文を代入
			correct = x + y - z; //正解を代入
			break;
		case 2:
			question = "x - y + z ="; //問題文を代入
			correct = x - y + z; //正解を代入
			break;
		case 3:
			question = "x - y - z ="; //問題文を代入
			correct = x - y - z; //正解を代入
			break;
		}

		while (true) { //正解でなければ繰り返す
			System.out.print(question);//出題
			answer = standardInput.nextInt();//回答を読み込む
			if (answer == correct) {
				System.out.println("正解です！");
				break;
			}
			System.out.println("違います");
		}
	}

	public static void main(String[] args) {
		do {
			//三つの整数をキーボードから読み込んで変数に格納
			System.out.print("整数：");
			int number1 = standardInput.nextInt();
			System.out.print("整数：");
			int number2 = standardInput.nextInt();
			System.out.print("整数：");
			int number3 = standardInput.nextInt();

			//読み込んだ整数で加算減算の組み合わせ問題を出題
			mathQuestion(number1, number2, number3);
		} while (confirRetry());	//繰り返しの要否を確認
	}

}
