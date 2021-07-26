package chapter07;

/**
 *
 * @author システム開発部
 *演習7-16
 *配列の要素の最小値を求めるメソッドminOfを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_16 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	/**
	 * 配列aの全要素の最小値を求める
	 * @param a 整数配列
	 * @return 配列の最小値
	 */
	static int minOf(int[] a) {
		int min = a[0]; //最小値を格納する整数変数を先頭の要素で初期化
		for (int i = 1; i < a.length; i++) { //配列の要素数分繰り返す
			if (min > a[i]) { //これまでの最小値より小さい値なら代入
				min = a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		//配列の個数をキーボードから読み込み、配列を生成
		System.out.print("配列の長さ：");
		int length = standardInput.nextInt();
		int[] numbers = new int[length];

		//要素数分繰り返し、要素に値を代入
		for (int i = 0; i < length; i++) {
			System.out.print(i + "番目の値：");
			numbers[i] = standardInput.nextInt();
		}

		//最小値を表示
		System.out.print("配列の最小値：" + minOf(numbers));

	}

}
