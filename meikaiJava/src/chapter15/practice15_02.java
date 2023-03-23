package chapter15;

import java.util.Scanner;

/**
 * 演習15-02 文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ。
 */

public class practice15_02 {
	static final Scanner stdIn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("■何か言葉を入力してください：");
		String sentence = stdIn.next();

		System.out.println("■文字コードを表示します");
		for (int i = 0; i < sentence.length(); i++) {
			System.out.println("[" + sentence.charAt(i) + "]の文字コード：" + sentence.codePointAt(i));
		}
	}

}
