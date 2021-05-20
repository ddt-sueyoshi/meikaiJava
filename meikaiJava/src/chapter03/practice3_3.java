package chapter03;

/**
 *
 * @author システム開発部
 *演習3-3
 *List3-5の最後のelseを、else if(n == 0)に変更したらどうなるかを検討せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_3 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number = standardInput.nextInt();

		//入力された整数が0より大きい場合
		if (number > 0) {
			//文字列を出力（正）
			System.out.print("その値は正です。");
		} //入力された整数が0より小さい場合
		else if (number < 0) {
			//文字列を出力（負）
			System.out.print("その値は負です。");
		} //入力された整数が0と等しい場合
		else if (number == 0) {
			//文字列を出力（0）
			System.out.print("その値は0です。");
		}
		//「else if (number == 0)」は「else」だった時と全く同じ結果になる

	}

}
