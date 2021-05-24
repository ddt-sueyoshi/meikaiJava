package chapter02;

/**
 *
 * @author システム開発部
 *
 *演習2-7
 *以下に示すプログラムを作成せよ。
 *・1桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
 *・1桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
 *・2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 */

//参照するクラスを宣言
import java.util.Random;

public class practice2_7 {

	public static void main(String[] args) {
		//ランダムクラスの生成
		Random random = new Random();

		//整数の変数を宣言
		//0から8の整数をランダムに生成し1を加算
		//1から9のランダムな値として代入する
		int number1 = (random.nextInt(9)) + 1;
		//整数の変数を宣言
		//0から8の整数をランダムに生成し1を加算、符号を反転
		//-1から-9のランダムな値として代入する
		int number2 = -(random.nextInt(9)+1);
		//整数の変数を宣言し、
		//0から89の整数をランダムに生成したものに10を加算
		//10から99のランダムな値として代入する
		int number3 = (random.nextInt(90)) + 10;

		//生成した整数をそれぞれ表示する
		System.out.print("1桁の正の整数値：" + number1 + "\n1桁の負の整数値：" + number2 + "\n2桁の正の整数値：" + number3);

	}

}
