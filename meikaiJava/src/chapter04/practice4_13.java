package chapter04;
/**
 *
 * @author システム開発部
 *演習4-13
 *1からnまでの和を求めるList4-10（p.112）をfor文で実現せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_13 {

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

		for(int i=n-1;i>0;i--) {
			n+=i;
		}

		//nから1の和を出力
		System.out.print(n);

	}

}
