package chapter15;

import java.util.Scanner;

/**
 * 演習15-3 文字列探索のプログラムを書き換えて、右のように表示するプログラムを作成せよ。 一致する部分が上下で揃うように表示すること。
 * 
 */
public class practice15_03 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s1：");
		String s1 = stdIn.next();
		System.out.print("文字列s2：");
		String s2 = stdIn.next();

		int idx = s1.indexOf(s2);
		if (idx == -1) {
			System.out.println("s1の中にs2は含まれません。");
		} else {
			System.out.println("s1にs2は含まれます。");
			
			System.out.println("s1:"+s1);
			
			System.out.print("s2:");
			for(int i = 0; i < idx; i++) {
				System.out.print(" ");
			}
			System.out.println(s2);
		}
	}

}
