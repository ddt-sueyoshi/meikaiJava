package chapter04;

/**
 *
 * @author システム開発部
 *演習4-1
 *読み込んだ整数値の符号を判定するList3-5のプログラム（p.58）を、
 *好きなだけ何度でも繰り返しyr入力・表示できるようにしたプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_1 {

	public static void main(String[] args) {
		//入力にためクラスを生成
		Scanner standardInput = new Scanner(System.in);
		//繰り返しフラグの整数型変数を宣言、0を初期値として代入
		int retry = 0;

		//繰り返す処理内容
		do {
			//入力を促す文字列を出力
			System.out.print("整数を入力してください：");
			//整数値を宣言し、キーボードから読み込んだ整数値を代入
			int number = standardInput.nextInt();

			//入力された整数が0より大きい場合、正の数のメッセージを出力
			if (number > 0)
				System.out.println("その値は正の数です。");
			//入力された整数が0より小さい場合、負の数のメッセージを出力
			if (number < 0)
				System.out.println("その値は負の数です。");
			//入力された整数が0の場合、0のメッセージを出力
			if (number == 0)
				System.out.println("その値は0です。");

			//繰り返し要否を確認するメッセージを出力
			System.out.println("もう一度？　1…Yes／2…No");
			//繰り返しフラグに、キーボードから読み込んだ整数値を代入
			retry = standardInput.nextInt();
		} while (retry == 1); //フラグが1であれば繰り返す

	}

}
