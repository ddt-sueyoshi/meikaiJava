package chapter04;
/**
 *
 * @author システム開発部
 *演習4-4
 *List4-4のwhile文終了時にxの値がｰ1になることを確認するプログラムを作成せよ。
 *（List4-4：正の整数値を読み込んで、その値を0までカウントダウンする過程を表示するプロラム）
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_4 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//カウントダウンを行うメッセージを出力
		System.out.print("countdown");
		//入力用の整数型変数を宣言
		int number;

		//正の整数が入力されるまで繰り返し
		do {
			//入力を促すメッセージを出力
			System.out.print("positive integer​:");
			//入力された整数を格納
			number = standardInput.nextInt();
		} while (number <= 0);

		//カウントダウン表示処理
		//整数が0以上の時、整数を表示して1減算を繰り返し
		while (number >= 0) {
			System.out.print(number + " ");
			number--;
		}

		//処理終了後の整数を表示（-1になっている）
		System.out.print("\nafter countdown number:" + number);
	}

}
