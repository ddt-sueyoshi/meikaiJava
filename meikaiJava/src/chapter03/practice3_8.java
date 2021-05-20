package chapter03;
/**
 *
 * @author システム開発部
 *演習3-8
 *キーボードから読み込んだ点数に応じて、優／良／可／不可を判定して表示するプログラムを作成せよ。
 *判定は以下のように行うこと。
 *0～59 → 不可／60～69 → 可／70～79 → 良／80～100 → 優
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_8 {

	public static void main(String[] args) {
		//Scannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("整数：");
		//整数型の変数を宣言
		//キーボードから読み込んだ整数値を代入
		int number = standardInput.nextInt();

		//入力された整数が60より小さい場合
		if (number < 60) {
			//文字列を出力
			System.out.print("不可");
		}
		//入力された整数が70より小さい場合
		else if (number < 70) {
			//文字列を出力
			System.out.print("可");
		}
		//入力された整数が80より小さい場合
		else if (number < 80) {
			//文字列を出力
			System.out.print("良");
		}
		//入力された整数が100以下の場合
		else if (number <= 100) {
			//文字列を出力
			System.out.print("優");
		}

	}

}
