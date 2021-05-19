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
		case 1: //1月の場合、冬
			season = "冬";	break;
		case 2: //2月の場合、冬
			season = "冬";	break;
		case 3: //3月の場合、春
			season = "春";	break;
		case 4: //4月の場合、春
			season = "春";	break;
		case 5: //5月の場合、春
			season = "春";	break;
		case 6: //6月の場合、夏
			season = "夏";	break;
		case 7: //7月の場合、夏
			season = "夏";	break;
		case 8: //8月の場合、夏
			season = "夏";	break;
		case 9: //9月の場合、秋
			season = "秋";	break;
		case 10: //10月の場合、秋
			season = "秋";	break;
		case 11: //11月の場合、秋
			season = "秋";	break;
		case 12: //12月の場合、冬
			season = "冬";	break;
		}
		//月と季節を含む文字列を出力
		System.out.print(month + "月は" + season + "です。");

	}

}
