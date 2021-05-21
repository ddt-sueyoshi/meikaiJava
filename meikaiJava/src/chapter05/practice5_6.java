package chapter05;

/**
 *
 * @author システム開発部
 *演習5-6
 *List5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 *List5-10のように、int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、横に並べて表示するプログラムを作成せよ。
 */
public class practice5_6 {

	public static void main(String[] args) {
		//float型の変数を初期化
		float number = 0.0F;

		//ヘッダを表示
		System.out.println("  float   int  \n----------------");

		//整数が0から1000まで1ずつ増える分繰り返す
		for (int i = 0; i <= 1000; i++) {
			System.out.printf("%7.3f", number); //フォーマットを指定し（7桁以上、小数部は3桁）float型の表示
			System.out.printf("%7.3f", ((double) i / 1000)); //フォーマットを指定し（7桁以上、小数部は3桁）double型の表示
			System.out.println(); //改行
			number += 0.001; //double型をfloat型に合わせて加算
		}

	}

}
