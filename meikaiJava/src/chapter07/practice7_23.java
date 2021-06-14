package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-23
 *配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッドarraySrchIdxを作成せよ。
 */
public class practice7_23 {

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		//配列を生成
		int[] ary=makeAry();
		//検索値を読み込む
		System.out.print("検索値：");
		int key = standardInput.nextInt();
		//配列の中で検索値と一致する要素のインデックスを配列化する
		int[] indexAry=arraySrchIdx(ary,key);
		//インデックス配列を表示
		System.out.print("検索値と一致する要素のインデックス：");
		showAry(indexAry);
	}

	//配列の中で検索値と一致する要素のインデックスを配列化
	static int[] arraySrchIdx(int[] a, int x) {
		//インデックス配列の要素数を調べる
		int length = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				length++;
			}
		}
		//インデックス配列を初期化
		int[] idxs=new int[length];
		//インデックス配列の要素数分繰り返し
		for(int i=0;i<length;i++) {
			//引数配列の先頭から検索値と一致する要素を見つけ次第インデックスを格納
			//格納したインデックスの要素は値を変更し、次のインデックス配列要素を探しに行く
			for (int j = 0; j < a.length; j++) {
				if (a[j] == x) {
					idxs[i]=j;
					a[j]=a[j]-1;
					break;
				}
			}
		}
		
		return idxs;
	}

	//配列の要素数、全要素の値をキーボードから読み込み配列を作成
	static int[] makeAry() {
		System.out.print("配列の長さ：");
		int length = standardInput.nextInt();
		int[] numbers = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.print(i + "番目の値：");
			numbers[i] = standardInput.nextInt();
		}
		return numbers;
	}

	//配列を受けとり全要素を表示する
	static void showAry(int[] numbers) {
		System.out.print("{ ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.print("}");
	}

}
