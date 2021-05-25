package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-3
 *三つのint型引数a,b,cの中央値を求めるメソッドmedを作成せよ。
 */
public class practice7_3 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された整数を変数に格納
		System.out.print("整数：");
		int number1 = standardInput.nextInt();
		System.out.print("整数：");
		int number2 = standardInput.nextInt();
		System.out.print("整数：");
		int number3 = standardInput.nextInt();

		//minメソッドに入力された整数を渡して中央値を出力
		System.out.print("中央値は" + med(number1, number2, number3) + "です。");

	}

	//3つの整数を引数として受け取り、中央値の整数を返す
	static int med(int a, int b, int c) {
		//昇順に b,a,c または c,a,b なら a を返却
		if ((b <= a && a <= c) || (c <= a && a <= b))
			return a;
		//昇順に a,b,c または c,b,a なら b を返却
		else if ((a <= b && b <= c) || (c <= b && b <= a))
			return b;
		//超順に a,c,b または b,a,c なら c を返却
		else
			return c;
	}

}
