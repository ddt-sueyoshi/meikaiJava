package chapter04;

/**
 *
 * @author システム開発部
 *演習4-24
 *正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ。
 *素数とは2以上n未満のいずれでも割り切ることのできない整数nのことである。、
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice4_24 {

	public static void main(String[] args) {

		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);
		int number;
		do {
			//整数の入力を促すメッセージ出力
			System.out.print("整数：");
			//整数変数をキーボードから読み込み初期化
			number = standardInput.nextInt();
		} while (number <= 0);

		//1から入力された整数まで繰り返し
		for (int i = 1; i <= number; i++) {
			//入力された整数を割り切れたらメッセージを表示しループを抜ける
			if (number <= 3 && i != 1) {
				System.out.print("素数です！");
				break;
			}
			if (number % i == 0 && i != number) {
				System.out.print("素数ではない。");
				break;
			}
			//入力された整数まで繰り返したらメッセージを表示
			if (i == number) {
				System.out.print("素数です！");
			}
		}

	}

}
