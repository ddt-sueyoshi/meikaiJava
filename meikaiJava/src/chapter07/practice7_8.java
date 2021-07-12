package chapter07;

/**
 *
 * @author システム開発部
 *演習7-8
 *a以上b未満の乱数を生成して、その値を返却するメソッドandomを作成せよ。
 *内部で乱数を生成する標準ライブラリ（p.45）を呼び出すこと。
 *なお、bの値がaより小さい場合には、aの値をそのまま返却すること。
 */
//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice7_8 {
	/**
	 * 最小値と最大値の整数を受け取り、その間の乱数を返す
	 * @param min: 最小値
	 * @param max: 最大値
	 * @return: min以上max以下の乱数
	 */
	static int random(int min, int max) {
		//最小最大が正しくない場合最小値を返す
		if (min > max)
			return min;

		//乱数クラスを生成
		Random random = new Random();
		//最小と最大の間の乱数を返す
		return (random.nextInt(max - min + 1) + min);
	}

	public static void main(String[] args) {
		//
		Scanner standardInput = new Scanner(System.in);
		//最小値をキーボードから読み込む
		System.out.print("最小値：");
		int minimum = standardInput.nextInt();
		//最大値をキーボードから読み込む
		System.out.print("最大値：");
		int maximum = standardInput.nextInt();

		//2値の間の乱数を表示
		System.out.println("2値の間の乱数：" + random(minimum, maximum));
	}

}
