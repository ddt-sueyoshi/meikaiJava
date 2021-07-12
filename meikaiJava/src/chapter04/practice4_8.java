package chapter04;

/**
 * 
 * @author システム開発部
 *演習4-8
 *右に示すように、正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice4_8 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された整数を格納する整数変数
		int number;
		do {
			//入力を促すメッセージ
			System.out.print("正の整数を入力：");
			//入力された整数を値として代入
			number = standardInput.nextInt();
			//正の整数でないときは繰り返す
		} while (number <= 0);

		//桁数を格納する変数を初期化
		int digits = 0;
		//入力された整数が0以上の時繰り返す
		while (number > 0) {
			//桁数をカウントアップ
			digits++;
			//入力された整数を10で乗算する
			number /= 10;
		}

		//桁数を含むメッセージ出力
		System.out.print("桁数：" + digits);

	}

}
