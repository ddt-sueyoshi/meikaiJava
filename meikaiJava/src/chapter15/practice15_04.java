package chapter15;

import java.util.Scanner;

/**
 * 演習15-4
 * 浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッドprintDoubleを作成せよ。
 */
public class practice15_04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示します。");
		System.out.print("浮動小数点数値x：");
		double x = stdIn.nextDouble();
		System.out.print("p：");
		int p = stdIn.nextInt();
		System.out.print("w：");
		int w = stdIn.nextInt();
		
		printDouble(x,p,w);
	}
	
	public static void printDouble(double x,int p,int w) {
		System.out.printf("%"+w+"."+p+"f", x);
	}
}
