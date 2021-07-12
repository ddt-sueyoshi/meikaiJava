package chapter04;
/**
 * 
 * @author システム開発部
 *演習4-10
 *読み込んだ値が1未満であれば改行文字を出力しないようにList4-11（p.114）を書きかえたプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_10 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//個数の入力を促すメッセージ出力
		System.out.print("How many?");
		//個数をキーボードから読み込んだ値を代入子初期化
		int number = standardInput.nextInt();

		//個数の分繰り返す
		for (int i = 1; i <= number; i++) {
			//*を文字出力
			System.out.print('*');
			//カウント変数が個数と等しければ改行する
			if (i == number) {
				System.out.println();
			}

		}
	}

}
