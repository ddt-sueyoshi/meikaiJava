package chapter15;

import java.util.Scanner;

/**
 * 演習15-01 文字列を読み込んで、その文字列を逆順位表示するプログラムを作成せよ。
 */

public class practice15_01 {
	static final Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("■何か言葉を入力してください：");
		String sentence = stdIn.next();

		System.out.println("■逆さまに表示します");
		for (int i = 1; i <= sentence.length(); i++) {
			System.out.print(sentence.charAt(sentence.length() - i));
		}
	}

}
