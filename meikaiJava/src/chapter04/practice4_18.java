package chapter04;
/**
 *
 * @author システム開発部
 *演習4-18
 *右に示すように、1からnまでの整数値の2乗を表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_18 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促すメッセージ出力
		System.out.print("整数：");
		//整数変数をキーボードから読み込み初期化
		int number = standardInput.nextInt();

		//1から入力された整数まで繰り返し
		for (int i = 1; i <= number; i++) {
			//2乗値を含むメッセージ出力
			System.out.println(i + "の2乗は" + (i * i));
		}

	}

}
