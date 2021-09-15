package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-18
 *配列aから要素[idx]を削除するメソッドaryRmvを作成せよ。
 *削除はa[idx]より薄炉の全要素を一つ前方にずらすことによって行うこと。
 *なお、移動されずに余ってしまう末尾要素a[a.length-1]の値は変更しなくてよい。
 */
public class practice7_18 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	/**
	 * 配列から特定のインデックスの値を削除し、以降を左詰めにする
	 * @param a 整数配列
	 * @param idx 削除するインデックス
	 * return 特定のインデックスの値を削除し、以降を左詰めにした配列
	 */
	static int[] aryRmv(int[] a, int idx) {
		int[] b = new int[a.length];
		//指定の要素番号から配列の末尾の1つ前まで繰り返す
		for (int i = 0; i < a.length ; i++) {
			if (i < idx || i == a.length - 1) {
				b[i] = a[i];
			}
			//１つ末尾側にあった要素の値を代入
			else {
				b[i] = a[i + 1];
			}
		}
		return b;
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

		//削除する要素の位置
		int idx = -1;
		//削除する要素の位置をキーボードから読み込む
		//配列の要素の位置になりうる値でなければ繰り返す
		while (idx <= 0 || idx > length - 1) {
			System.out.print("何番目を削除しますか？：");
			idx = standardInput.nextInt();
		}

		//入力された位置の要素を削除
		int[] removed = aryRmv(numbers, idx);
		//削除後の配列を表示
		System.out.print("numbers { ");
		for (int i = 0; i < removed.length; i++) {
			System.out.print(removed[i] + ", ");
		}
		System.out.print("}");
	}

}
