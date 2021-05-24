package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-8
 *double型の配列全要素の合計値と経院金地を求めるプログラムを作成せよ。
 *要素数と全要素の値はキーボードから読み込むこと。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_8 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促すメッセージ出力
		//要素数になる整数をキーボードから読み込む
		System.out.print("要素数：");
		final int length = standardInput.nextInt();
		//入力された整数を要素数とするdouble型の配列を宣言
		double[] numbers = new double[length];
		//合計値を格納するdouble型変数を初期化
		double summery = 0.0;

		//配列の全要素を走査
		for (double number : numbers) {
			//入力を促すメッセージ出力
			//double型の値をキーボードから読み込み配列の値として格納
			System.out.print("実数：");
			number = standardInput.nextDouble();

			//合計値の変数に配列の要素の値を加算
			summery += number;
		}

		//合計値・平均値を含むメッセージ出力
		System.out.print("合計値：" + summery + "\n平均値" + (summery / length));

	}

}
