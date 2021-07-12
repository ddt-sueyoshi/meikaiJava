package chapter05;

/**
 *
 * @author システム開発部
 *演習5-5
 *三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 *平均はキャスト演算子を利用して求め、実数として表示すること。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice5_5 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促すメッセージ出力
		//キーボードから入力された整数を読み込み変数に格納
		System.out.print("整数：");
		int number1 = standardInput.nextInt();
		System.out.print("整数：");
		int number2 = standardInput.nextInt();
		System.out.print("整数：");
		int number3 = standardInput.nextInt();

		//入力された整数の合計（整数）と平均（実数）を表示
		System.out.print("合計：" + (number1 + number2 + number3)
				+ "\n平均:" + (double) (number1 + number2 + number3) / 3);

	}

}
