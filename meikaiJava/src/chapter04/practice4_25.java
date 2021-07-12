package chapter04;

/**
 * 
 * @author システム開発部
 *演習4-25
 *合計だけでなく平均も求めるようにList4-17 （p.126）およびList4-18（p.127）のプログラムを書きかえよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice4_25 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//加算する個数の入力を促すメッセージ出力
		System.out.println("整数を加算します");
		System.out.print("何個加算しますか？：");
		//個数をキーボードから読み込む
		int n = standardInput.nextInt();

		//合計を格納する変数を初期化
		int sum = 0;
		//実際に加算した回数をカウントする変数
		int i;

		for (i = 0; i < n; i++) {
			//整数の入力を促すメッセージ出力
			System.out.print("整数（0で終了）：");
			//整数変数をキーボードから読み込み初期化
			int t = standardInput.nextInt();

			//整数が0ならループを終了する
			if (t == 0) {
				break;
			}
			//0でなければ合計値に加算する
			sum += t;
		}

		//合計値と平均値を含むメッセージ出力
		System.out.print("合計：" + sum + "平均：" + (sum / i));
	}

}
