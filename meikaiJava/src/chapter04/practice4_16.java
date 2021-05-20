package chapter04;
/**
 *
 * @author システム開発部
 *演習4-16
 *読み込んだ個数だけ*を表示するList4-11 （p.114）を書きかえて、5個表示するごとに改行するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_16 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//個数の入力を促すメッセージ出力
		System.out.print("個数：");
		//個数の整数変数をキーボードから読み込み初期化
		int number = standardInput.nextInt();

		//入力された個数分繰り返し
		for (int i = 1; i <= number; i++) {
			//*を出力
			System.out.print('*');
			//ループ回数が5の倍数の時改行
			if (i % 5 == 0) {
				System.out.println();
			}
		}

	}

}
