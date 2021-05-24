package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-14
 *月を1～12の数値として表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 *・出題する月の値は乱数で生成する。
 *・学習者が望む限り、何度も繰り返せる。
 *・同一好きを連続して出題しない。
 */
//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice6_14 {

	public static void main(String[] args) {
		// 乱数生成・読み込みのためのクラスを生成
		Random random = new Random();
		Scanner standardInput = new Scanner(System.in);

		//1～12月の英語表現を格納する配列
		String[] months = new String[] { "January", "February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December" };

		System.out.println("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。");

		String correct = ""; //出題した月の英語表現の正解を格納する
		int retry; //繰り返しフラグ
		do {
			retry = 0; //繰り返しフラグ初期化
			int month = 0;//出題する月を格納する

			//0～11の乱数を、直前の出題と重複しなくなるまで生成
			do {
				month = random.nextInt(12);
			} while (months[month] == correct);
			//乱数に対応する月の英語表現の正解を代入
			correct = months[month];
			//出題のメッセージを出力し、キーボードから回答を読み込む
			System.out.print((month+1) + "月：");
			String answer = standardInput.next();
			//回答が正解と一致しているか否かでメッセージを分岐させる
			//繰り返しの要否を確認し、キーボードから読み込む
			System.out.println((answer.equals(correct) ? "正解です。" : "違います。正解は "+correct+" です。") +
					"もう一度？　1…Yes／0…No：");
			retry = standardInput.nextInt();

		} while (retry == 1);

	}

}
