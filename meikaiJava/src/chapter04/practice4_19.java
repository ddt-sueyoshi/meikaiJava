package chapter04;
/**
 *
 * @author システム開発部
 *演習4-19
 *季節を求めるList4-1（p.95）の月の読み込みについて、1~12以外の値が入力された場合は、
 *再入力させるように修正したプログラムを作成せよ。（do文の中にdo文が入る二重ループとなる）。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_19 {

	public static void main(String[] args) {
		Scanner standardInput = new Scanner(System.in); //読み込み用のクラスを生成

		int retry = 0; //繰り返しフラグの整数変数

		//繰り返しフラグが1なら繰り返す処理
		do {
			//月を格納する整数変数
			int month;

			//1~12の整数が入力されるまで繰り返す処理
			do {
				System.out.print("何月？："); //月の入力を促すメッセージ出力
				month = standardInput.nextInt(); //整数変数をキーボードから読み込み初期化
			} while (month < 1 || month > 12);

			if (month >= 3 && month <= 5) {
				System.out.println("春"); //3～5月なら春と出力
			}
			else if (month >= 6 && month <= 8) {
				System.out.println("夏"); //6～8月なら夏と出力
			}
			else if (month >= 9 && month <= 11) {
				System.out.println("秋"); //9～11月なら秋と出力
			}
			else {
				System.out.println("冬"); //12・1・2月なら冬と出力
			}

			System.out.println("もう一度？　1…Yes　0…No"); //繰り返しの要否入力を促すメッセージ出力
			retry = standardInput.nextInt(); //入力される繰り返し要否を格納
		} while (retry == 1);
	}

}
