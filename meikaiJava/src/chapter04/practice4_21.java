package chapter04;

/**
 * 
 * @author システム開発部
 *演習4-21
 *List4-16 は左下側が直角の直角三角形を表示するプログラムであった。
 *直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice4_21 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促すメッセージ出力
		System.out.print("辺の長さ：");
		//１辺の長さの整数変数をキーボードから読み込み初期化
		int size = standardInput.nextInt();

		//右上が直角
		//読み込んだ整数分繰り返し
		for (int i = 0; i < size; i++) {
			//現在の行数より1少なく空白を出力
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			//1辺から空白を除いた分*を出力
			for (int j = i; j < size; j++) {
				System.out.print(" *");
			}
			System.out.println();//改行
		}

		System.out.println();//改行
		
		//右下が直角
		//読み込んだ整数分繰り返し
		for (int i = 1; i <= size; i++) {
			//現在の行数分空白を出力
			for (int j = size - 1; j >= i; j--) {
				System.out.print("  ");
			}
			//1辺から空白を除いた分*を出力
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();//改行
		}

		System.out.println();//改行

		//左上が直角
		for (int i = 0; i < size; i++) {
			//現在の行数分*を出力
			for (int j = size-i; j > 0; j--) {
				System.out.print(" *");
			}
			System.out.println();//改行
		}
	}

}
