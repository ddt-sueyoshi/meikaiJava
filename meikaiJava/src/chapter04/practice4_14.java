package chapter04;
/**
 *
 * @author システム開発部
 *演習4-14
 *前問のプログラムを書きかえて、右のように"式"を表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_14 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力用の整数型変数を宣言
		int n;
		//正の整数が入力されるまで繰り返し
		do {
			//入力を促すメッセージを出力
			System.out.print("positive integer​:");
			//入力された整数を格納
			n = standardInput.nextInt();
		} while (n <= 0);

		//和を格納する整数変数
		int summation = 0;

		//入力された整数分繰り返し
		for (int i = 1; i <= n; i++) {
			//1からnまで1ずつ増えるiを表示
			System.out.print(i);
			//和に加算
			summation += i;
			if (i < n) {
				//ループの最後以外で+を表示
				System.out.print(" + ");
			}
		}

		//式と和を出力
		System.out.print(" = " + summation);

	}

}
