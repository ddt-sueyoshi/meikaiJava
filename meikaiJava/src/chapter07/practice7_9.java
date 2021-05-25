package chapter07;

/**
 * 
 * @author システム開発部
 *演習問題7-9
 *『正の整数値：』と表示してキーボードから制の整数値を読み込んで、その値を返却するメソッドreadPlusIntを作成せよ。
 *0や負の値が入力されたら再入力させること。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_9 {
	//読み込みクラスを生成

	static Scanner standardInput = new Scanner(System.in);

	static int readPlusInt() {
		int integer; //入力された整数を格納する
		do {
			System.out.print("正の整数値：");
			integer = standardInput.nextInt();
		} while (integer <= 0); //0以下なら繰り返し

		return integer; //正の整数を返却
	}

	public static void main(String[] args) {
		//正の整数を入力させ返却する
		System.out.print(readPlusInt());

	}

}
