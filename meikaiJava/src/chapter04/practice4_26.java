package chapter04;

/**
 *
 * @author システム開発部
 *演習4-26
 *合計だけでなく平均も求めるようにList4-19のプログラムを書きかえよ。
 *なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice4_26 {

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
		int count = 0;

		for (int i = 0; i < n; i++) {
			//整数の入力を促すメッセージ出力
			System.out.print("整数：");
			//整数変数をキーボードから読み込み初期化
			int t = standardInput.nextInt();

			//整数が負ならメッセージを出力し、ループ内の以降の処理をしない
			if (t < 0) {
				System.out.println("負の数は加算しません。");
				continue;
			}
			//0でなければ合計値に加算する
			sum += t;
			count++;
		}

		if (count != 0) {
			//合計値と平均値を含むメッセージ出力
			System.out.print("合計：" + sum + "平均：" + (sum / count));
		} else {
			System.out.println("0以上の整数が入力されませんでした。");
		}

	}

}
