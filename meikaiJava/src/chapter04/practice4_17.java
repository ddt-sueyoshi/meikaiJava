package chapter04;
/**
 *
 * @author システム開発部
 *演習4-17
 *読み込んだ整数値のすべての約数を表示するList4-13（p.118）を書きかえて、
 *約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_17 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促すメッセージ出力
		System.out.print("整数：");
		//整数変数をキーボードから読み込み初期化
		int number = standardInput.nextInt();

		//約数の個数を格納する整数変数
		int count = 0;
		//1から入力された整数まで繰り返し
		for (int i = 1; i <= number; i++) {
			//入力された整数を割り切れたら表示し、個数をカウントアップ
			if (number % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		//約数の個数を表示
		System.out.print("約数の個数は" + count+"個です。");

	}

}
