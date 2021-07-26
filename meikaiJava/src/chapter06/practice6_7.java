package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-7
 *List6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである。
 *最も末尾側に位置する要素を見つけるプログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice6_7 {
	public static void main(String[] args) {

		// 乱数生成・読み込みのためのクラスを生成
		Random random = new Random();
		Scanner standardInput = new Scanner(System.in);

		//整数配列を宣言
		final int n = 12;
		int[] numbers = new int[n];
		//1~10のランダムな数字を配列の要素として格納
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(10);
		}

		//探索対象の整数をキーボードから読み込む
		System.out.print("探す数値：");
		int key = standardInput.nextInt();

		//要素の位置を示す変数
		int index;
		//配列の末尾から順に照合する
		for (index = numbers.length - 1; index >= 0; index--) {
			//探索対象と一致する要素ならループを抜ける
			if (numbers[index] == key) {
				break;
			}
		}
		//要素位置が 0以上なら探索成功した位置を出力
		//要素位置が-1なら探索失敗を出力
		if (index >= 0) {
			System.out.print("それはnumbers[" + index + "]番目にあります");
		} else {
			System.out.print("それはありません。");
		}

	}

}
