package chapter02;

/**
 *
 * @author システム開発部
 *
 *演習2-9
 *以下に示すプログラムを作成せよ（実数値の乱数の生成にはnextDouble()を使うこと：Columm2-3参照）。
 *・0.0以上1.0未満の実数値をランダムに生成して表示。
 *・0.0以上10.0未満の実数値をランダムに生成して表示。
 *・-1.0以上1.0未満の実数値をランダムに生成して表示。
 */

//参照するクラスを宣言
import java.util.Random;

public class practice2_9 {

	public static void main(String[] args) {
		//ランダムクラスの生成
		Random random = new Random();

		//小数部を含む実数の変数を宣言
		//0.0以上1.0未満でランダムに生成した実数を代入する
		double number1 = random.nextDouble();
		//小数部を含む実数の変数を宣言
		//0から9の間でランダムに生成した整数、0.0以上1.0未満でランダムに生成した実数を加算
		//0.0以上10.0未満のランダムな実数値として代入する
		double number2 = (random.nextInt(10)) + (random.nextDouble());
		//小数部を含む実数の変数を宣言し、
		//0から1の間でランダムに生成した整数と、0.0以上1.0未満でランダムに生成した実数を加算
		//-1.0以上1.0未満のランダムな実数値として代入する
		double number3 = (random.nextInt(2)) + (random.nextDouble()) - 1;
		//それぞれの値を含む文字列を表示する
		System.out.print("0.0以上1.0未満の実数値" + number1 +
				"\n0.0以上10.0未満の実数値" + number2 +
				"\n-1.0以上1.0未満の実数値" + number3);

	}

}
