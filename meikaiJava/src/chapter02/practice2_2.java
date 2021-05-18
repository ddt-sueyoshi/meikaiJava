package chapter02;

public class practice2_2 {

	public static void main(String[] args) {
		//演習2-2
		//三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。

		//三つのint型変数を宣言
		int number1, number2, number3;

		//整数の値を代入
		number1 = 153;
		number2 = 7582;
		number3 = 84;

		//三つの変数を含む文字列を出力
		System.out.println("number1 : " + number1 + ", number2 : " + number2 + ", number3 : " + number3);

		//三つの変数の合計を含む文字列を出力
		System.out.println("三つの合計は、" + (number1 + number2 + number3));
		//三つの変数の平均を含む文字列を出力
		System.out.println("三つの平均は、" + (number1 + number2 + number3) / 3);

	}

}
