package chapter07;

/**
 *
 * @author システム開発部
 *演習7-6
 *引数で指定された月の季節を表示するメソッドprintSeasonを表示せよ。
 *mが3～5であれば『春』、6～8であれば『夏』、9～11であれば『秋』、12・1・2であれば『冬』と表示し、それ以外の値であれば何も表示しないこと。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_6 {

	/**
	 * 引数の整数に応じて季節を表示する
	 * @param m: 月を表す整数値
	 */
	static void printSeason(int m) {
		switch (m) {
		//3～5であれば『春』
		case 3:
		case 4:
		case 5:
			System.out.print("春");
			break;
		//6～8であれば『夏』
		case 6:
		case 7:
		case 8:
			System.out.print("夏");
			break;
		//9～11であれば『秋』
		case 9:
		case 10:
		case 11:
			System.out.print("秋");
			break;
		//12・1・2であれば『冬』
		case 12:
		case 1:
		case 2:
			System.out.print("冬");
			break;
		//それ以外の値であれば何も表示しない
		default:
			break;
		}
	}

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された月を変数に格納
		System.out.print("何月？：");
		int month = standardInput.nextInt();
		//月変数でprintSeasonメソッドを呼び出す
		printSeason(month);
	}

}
