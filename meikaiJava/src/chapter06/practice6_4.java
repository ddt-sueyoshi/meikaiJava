package chapter06;
/**
 * 
 * @author システム開発部
 *演習6-4
 *List6-5を書きかえて、右に示すように縦向きの棒グラフで表示するプログラムを作成せよ。
 *最下段には、インデックスを10で割った剰余を表示すること。
 */

//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice6_4 {

	public static void main(String[] args) {
		// 乱数生成・読み込みのためのクラスを生成
		Random random = new Random();
		Scanner standardInput = new Scanner(System.in);

		//キーボードから読み込んだ整数値を要素数とする整数配列を宣言
		System.out.print("要素数：");
		int number = standardInput.nextInt();
		int[] numbers = new int[number];

		//要素数分繰り返し、1～10の乱数を生成して要素として代入
		for (int i = 0; i < number; i++) {
			numbers[i] = 1 + random.nextInt(10);
		}

		//10回繰り返す
		for (int i = 10; i > 0; i--) {
			//要素数分繰り返し
			for (int j = 0; j < number; j++) {
				//外側のループ回数より配列の要素が大きいときは * を出力
				if (i <= numbers[j]) {
					System.out.print('*');
				}
				//外側のループ回数より配列の要素が小さいときは空白を出力
				else {
					System.out.print(" ");
				}
				System.out.print(" "); //スペース
			}
			System.out.println(); //改行
		}
		//区切り線とインデックスの下1桁を表示
		for (int i = 0; i < number; i++) {
			System.out.print("--");
		}
		System.out.println(); //改行
		for (int i = 0; i < number; i++) {
			System.out.print(i % 10 + " ");
		}

	}

}
