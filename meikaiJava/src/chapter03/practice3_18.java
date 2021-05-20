package chapter03;
/**
 *
 * @author システム開発部
 *演習3-18
 *月を1～12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice3_18 {

	public static void main(String[] args) {
		//読み込みのためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("月：");
		//整数の変数を宣言し、キーボードから読み込んだ値を代入
		int month = standardInput.nextInt();

		//季節を格納する文字列型を宣言
		String season = "";
		//入力された整数に応じて分岐し、季節の文字列を代入
		switch (month) {
		//3~5月の場合、春
		case 3:
		case 4:
		case 5:
			season = "春";
			break;
		//6~8月の場合、夏
		case 6:
		case 7:
		case 8:
			season = "夏";
			break;
		//9~11月の場合、秋
		case 9:
		case 10:
		case 11:
			season = "秋";
			break;
		//12,1,2月の場合、冬
		case 12:
		case 1:
		case 2:
			season = "冬";
			break;
			//1~12以外はエラー
			default:season="暦に存在しない";
		}
		//月と季節を含む文字列を出力
		System.out.print(month + "月は" + season + "です。");

	}

}
