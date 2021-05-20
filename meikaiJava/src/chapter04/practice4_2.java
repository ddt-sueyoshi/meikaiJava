package chapter04;

import java.util.Random;

/**
 *
 * @author システム開発部
 *演習4-2
 *2桁の整数値（10～99）を当てさせる≪数当てゲーム≫を作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_2 {

	public static void main(String[] args) {
		//読み込み、乱数生成のためのクラスを生成
		Scanner standardInput = new Scanner(System.in);
		Random random = new Random();

		//当てるべき数を格納する整数型変数を宣言
		//0～89の乱数に10加算して10～99（2桁の整数）として代入
		int correct = random.nextInt(90) + 10;
		//回答を格納する整数型変数を宣言
		int answer;

		//ゲームの開始メッセージを出力
		System.out.println("game start!\nchoose number in 10~89");

		//繰り返す処理内容
		do {
			//入力を促す文字列を出力
			System.out.print("what numser?");
			//回答にキーボードから読み込んだ整数値を代入
			answer = standardInput.nextInt();

			//乱数より回答の値が小さい場合、「もっと大きい数」のメッセージを出力
			if (correct < answer) {
				System.out.println("smaller");
			}
			//乱数より回答の値が大きい場合、「もっと小さい数」のメッセージを出力
			if (correct > answer) {
				System.out.println("larger");
			}
		} while (correct != answer); //回答と乱数が等しくなければ繰り返し

		//正解のメッセージを出力
		System.out.print("your answer is correct!");

	}

}
