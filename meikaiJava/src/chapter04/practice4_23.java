package chapter04;

/**
 * 
 * @author システム開発部
 *演習4-23
 *n段の数字ピラミッドを表示する関数を作成せよ
 *第i段目にはi%10を表示すること。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice4_23 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促すメッセージ出力
		System.out.print("辺の長さ：");
		//段数の整数変数をキーボードから読み込み初期化
		int size = standardInput.nextInt();

		//段数分繰り返し
		for (int i = 1; i <= size; i++) {
			//(段数-現在の行数) 分の空白を出力
			for (int j = i; j < size; j++) {
				System.out.print(" ");
			}
			//(現在の行数*2)-1 分の * を出力
			for (int j = i * 2 - 1; j > 0; j--) {
				System.out.print(i%10);
			}
			//(段数-現在の行数) 分の空白を出力
			for (int j = i; j < size; j++) {
				System.out.print(" ");
			}

			System.out.println();//改行
		}

	}

}
