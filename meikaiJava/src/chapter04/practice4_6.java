package chapter04;
/**
 * 
 * @author システム開発部
 *演習4-6
 *読み込んだ値が1未満であれば改行文字を出力しないようにList4-7およびList4-8を書きかえたプログラムをそれぞれ作成せよ。
 *（List4-7：キーボードから読み込んだ個数だけ＊を連続して表示するプログラム）
 *（List4-8 ：4-7のwhile文の制御式を0始まりから1始まりに変更したもの）
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_6 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//List4-7 
		//個数の入力を促すメッセージ出力
		System.out.print("何個*を表示しますか？");
		//個数を保持する整数変数を宣言し、キーボードから読み込んだ値を代入
		int number1 = standardInput.nextInt();
		//入力された個数分処理を繰り返す
		int i = 0;
		while (i < number1) {
			//*を出力する
			//繰り返し回数をカウントアップする
			System.out.print('*');
			i++;
			if (i == number1) {
				//改行する
				System.out.println();
			}
		}

		//List4-8
		//個数の入力を促すメッセージ出力
		System.out.print("何個*を表示しますか？");
		//個数を保持する整数変数を宣言し、キーボードから読み込んだ値を代入
		int number2 = standardInput.nextInt();
		//入力された個数分処理を繰り返す
		int j = 1;
		while (j <= number2) {
			//*を出力する
			//繰り返し回数をカウントアップする
			System.out.print('*');
			if (j == number2) {
				//改行する
				System.out.println();
			}
			j++;
		}

	}

}
