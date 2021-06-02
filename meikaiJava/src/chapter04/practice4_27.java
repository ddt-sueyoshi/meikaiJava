package chapter04;
/**
 * 演習4-27
 * List4-3の数当てゲームのプレイヤーが入力できる回数に制限を設けたプログラムを作成せよ。
 * 制限回数内にあてられなかった場合には、正解を表示してゲームを終了すること。
 * ※問題文には指定がないが「■ラベル付きcontinue文」の見出しページ中の演習のため、ラベルを使用
 */

import java.util.Random;
import java.util.Scanner;

public class practice4_27 {

	public static void main(String[] args) {
		//読み込み、乱数生成のためのクラスを生成
		Scanner standardInput = new Scanner(System.in);
		Random random = new Random();

		//正解の数を格納する整数型変数を宣言
		//0～99の乱数を正解として代入
		int correct = random.nextInt(100);
		//回答を格納する整数型変数を宣言
		int answer;

		//ゲームの開始メッセージを出力
		System.out.println("game start!\nchoose number in 0~99");

		//繰り返す処理内容
		Outer: do {
			Inner: for (int i = 0; i < 10; i++) {

				//入力を促す文字列を出力
				System.out.print("what number?");
				//回答にキーボードから読み込んだ整数値を代入
				answer = standardInput.nextInt();

				//乱数より回答の値が小さい場合、「もっと小さい数」のメッセージを出力
				if (correct < answer) {
					System.out.println("smaller");
				}
				//乱数より回答の値が大きい場合、「もっと大きい数」のメッセージを出力
				if (correct > answer) {
					System.out.println("larger");
				}

				if (correct == answer) {
					//正解したメッセージを出力しループを抜ける
					System.out.print("your answer is correct!");
					break Outer;
				}
			}
		//10回の回答で正解しなかった場合、正解を出力
			System.out.print("correct:" + correct);
		} while (false);
	}
}
