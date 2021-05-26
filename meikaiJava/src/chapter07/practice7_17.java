package chapter07;

/**
 *
 * @author システム開発部
 *目そっこineSearchは、探索するキーと同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるものである。
 *最も末尾側に位置する要素を見つけるメソッドlineSearchRを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_17 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	static int lineSearchR(int[] a, int key) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		//配列の個数をキーボードから読み込み、配列を生成
		System.out.print("配列の長さ：");
		int length = standardInput.nextInt();
		int[] numbers = new int[length];

		//要素数分繰り返し、要素に値を代入
		for (int i = 0; i < length; i++) {
			System.out.print(i + "番目の値：");
			numbers[i] = standardInput.nextInt();
		}

		//検索値をキーボードから読み込む
		System.out.print("検索値：");
		int key = standardInput.nextInt();

		//探索結果
		int searchResult = lineSearchR(numbers, key);

		if (searchResult >= 0) { //要素が見つかっていればインデックスを表示
			System.out.println(searchResult);
		} else { //要素が見つからなければメッセージを表示
			System.out.println("その値は存在しません。");
		}

	}

}
