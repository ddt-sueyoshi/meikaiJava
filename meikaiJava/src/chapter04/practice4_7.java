package chapter04;
/**
 * 
 * @author システム開発部
 *演習4-7
 *読み込んだ値の個数だけ記号文字を憑依するプログラムを作成せよ。表示は*と+を交互に行うこと。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_7 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//個数の入力を促すメッセージ出力
		System.out.print("how many?");
		//個数の整数型変数を宣言し、キーボードから読み込んだ値を代入
		int number = standardInput.nextInt();

		//カウントアップ用の整数型変数を初期化
		int i = 0;
		//個数の分繰り返す
		while (i < number) {

			if (i % 2 == 0) { //カウントが偶数の場合'*'を出力
				System.out.print('*');
			} else { //カウントが奇数の場合’+’を出力
				System.out.print('+');
			}
			i++;
		}
	}

}
