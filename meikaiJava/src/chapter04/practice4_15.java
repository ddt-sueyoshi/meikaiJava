package chapter04;
/**
 *
 * @author システム開発部
 *演習4-15
 *身長と標準体重の対応表を表示するプログラムを作成せよ。
 *表示する身長の範囲（開始値／終了値／増分）は、整数値として読み込むこと。
 *※標準体重は（身長-100）×0.9によって求められる。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_15 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//開始値の入力を促すメッセージ出力
		System.out.print("何cmから：");
		//開始値の整数変数をキーボードから読み込み初期化
		int start = standardInput.nextInt();

		//終了値の入力を促すメッセージ出力
		System.out.print("何cmまで：");
		//終了値の整数変数をキーボードから読み込み初期化
		int end = standardInput.nextInt();

		//増分の入力を促すメッセージ出力
		System.out.print("何cmごと：");
		//増分の整数変数をキーボードから読み込み初期化
		int difference = standardInput.nextInt();

		//列ヘッダにあたるメッセージ出力
		System.out.println("身長　標準体重");

		//開始値から終了値まで増分刻みで繰り返し
		for (int i = start; i <= end; i += difference) {
			//身長と標準体重を含むメッセージ出力
			System.out.println(i + "   " + ((i - 100) * 0.9));

		}

	}

}
