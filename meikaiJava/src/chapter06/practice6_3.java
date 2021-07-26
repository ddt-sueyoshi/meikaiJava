package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-3
 *要素型がdouble型で要素数が5の配列の要素に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示するプログラムを作成せよ。
 */
public class practice6_3 {

	public static void main(String[] args) {
		//double型で要素数が5の配列
		double[] numbers = new double[5];

		//配列の要素数分繰り返し
		for (int i = 0; i < numbers.length; i++) {
			//（ループ回数*1.1）を配列の要素として格納
			numbers[i] = (i + 1) * 1.1;
		}

		//配列の要素数分繰り返し
		for (int i = 0; i < numbers.length; i++) {
			//配列の要素の出力
			System.out.printf("numbers[" + i + "]" + "%4.1f", numbers[i]);
		}

	}

}
