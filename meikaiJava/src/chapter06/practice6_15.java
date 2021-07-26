package chapter06;
/**
 * 
 * @author システム開発部
 *演習6-15
 *曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 *・出題する曜日は乱数で生成する。
 *・学習者が望む限り、何度も繰り返せる。
 *・同一曜日を連続して出題しない。
 */
//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice6_15 {

	public static void main(String[] args) {
		// 乱数生成・読み込みのためのクラスを生成
		Random random = new Random();
		Scanner standardInput = new Scanner(System.in);

		//曜日の英語表現・日本語表現をそれぞれ格納する配列
		String[] english = new String[] { "Sunday", "Mondey", "Tuesday", "wednessday", "Thursday", "Friday","Saturday" };
		String[] japanese = new String[] { "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日","土曜日" };

		System.out.println("英語の曜日を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。");

		String correct = ""; //出題した曜日の英語表現の正解を格納する
		int retry; //繰り返しフラグ
		do {
			retry = 0; //繰り返しフラグ初期化
			int week = 0;//出題する曜日を格納する

			//0～6の乱数を、直前の出題と重複しなくなるまで生成
			do {
				week = random.nextInt(7);
			} while (english[week] == correct);
			//乱数に対応する月の英語表現の正解を代入
			correct = english[week];
			//出題のメッセージを出力し、キーボードから回答を読み込む
			System.out.print(japanese[week] + "：");
			String answer = standardInput.next();
			//回答が正解と一致しているか否かでメッセージを分岐させる
			//繰り返しの要否を確認し、キーボードから読み込む
			System.out.println((answer.equals(correct) ? "正解です。" : "違います。正解は "+correct+" です。") +
					"もう一度？　1…Yes／0…No：");
			retry = standardInput.nextInt();

		} while (retry == 1);


	}

}
