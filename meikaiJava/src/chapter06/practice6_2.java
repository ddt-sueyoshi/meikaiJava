package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-2
 *要素型がint型で要素数が5の配列の要素に対して、先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ。
 */
public class practice6_2 {
	public static void main(String[] args) {
		//int型の配列（要素数：5）を宣言
		int[] numbers = new int[5];

		//配列の要素数分繰り返し
		for (int i = 0; i < numbers.length; i++) {
			//（要素数 - ループ回数）を配列の要素として格納
			numbers[i] = numbers.length - i;
		}

		//配列の要素を先頭から表示
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("numbers[" + i + "]" + numbers[i] + "  ");
		}

	}
}
