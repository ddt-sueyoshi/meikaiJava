package chapter04;
/**
 * 
 * @author システム開発部
 *演習4-20
 *n段の正方形を表示するプログラムを作成せよ。右に示すのは、nが3の時の実行結果である。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_20 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//整数の入力を促すメッセージ出力
		System.out.print("整数：");
		//整数変数をキーボードから読み込み初期化
		int size = standardInput.nextInt();

		//読み込んだ整数（=行数）分繰り返し
		for (int i = 0; i < size; i++) {
			//読み込んだ整数（=列数）分繰り返し
			for (int j = 0; j < size; j++) {
				System.out.print(" *"); //*を出力
			}
			System.out.println();//改行
		}

	}

}
