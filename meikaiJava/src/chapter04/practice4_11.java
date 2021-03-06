package chapter04;
/**
 * 
 * @author システム開発部
 *演習4-11
 *正の整数値を0までカウントダウンするList4-4（p.100）をfor文で実現せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_11 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//カウントダウンを行うメッセージを出力
		System.out.println("countdown");
		//入力用の整数型変数を宣言
		int number;

		//正の整数が入力されるまで繰り返し
		do {
			//入力を促すメッセージを出力
			System.out.print("positive integer​:");
			//入力された整数を格納
			number = standardInput.nextInt();
		} while (number <= 0);

		//入力された整数分繰り返し
		for (int i = number; i >= 0; i--) {
			//ループごとに1減るカウント変数を表示
			System.out.print(i);
		}

	}

}
