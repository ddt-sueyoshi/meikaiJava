package chapter04;
/**
 *
 * @author システム開発部
 *演習4-9
 *右に示すように、正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_9 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された整数を格納する変数
		int number;
		do {
			//入力を促すメッセージ出力
			System.out.print("正の整数：");
			//キーボードから読み込んだ値を代入
			number = standardInput.nextInt();
			//入力された整数が0以下なら繰り返し
		} while (number <= 0);

		//カウント用の整数変数を入力された整数で初期化
		int count = number;

		//カウント変数が1以上の場合繰り返し
		while (count >= 1) {
			//入力された整数にカウント変数を1減算した整数との積を代入
			number *= (--count);
		}

		//積を含むメッセージ出力
		System.out.print("1からの積は" + number + "です。");
	}

}
