package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *二次元配列aと同じ配列を生成して返却するメソッドaryClone2を作成せよ。
 */
public class practice7_29 {

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	public static void main(String[] args) {
		//二重配列を定義
		int[][] originalAry = makeAry();
		//配列を複製
		int[][] cloneAry = aryClone2(originalAry);
		//複製を表示		
		showAry(cloneAry);
	}

	//行数・列数・各要素の値が同じ配列を複製し返却する
	static int[][] aryClone2(int[][] original) {
		//行数・列数の同じ配列を生成
		int[][] clone = new int[original.length][original[0].length];
		//各要素の値をコピー
		for (int i = 0; i < clone.length; i++) {
			for (int j = 0; j < clone[0].length; j++) {
				clone[i][j] = original[i][j];
			}
		}
		//複製した配列を返却
		return clone;
	}

	//二次元配列の要素数、全要素の値をキーボードから読み込み配列を作成
	static int[][] makeAry() {
		//行数・列数をキーボードから読み込む
		System.out.print("配列の行数：");
		int rows = standardInput.nextInt();
		System.out.print("配列の列数：");
		int columns = standardInput.nextInt();

		//各要素の値をキーボードから読み込む
		int[][] numbers = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(i + "行目" + j + "番目の値：");
				numbers[i][j] = standardInput.nextInt();
			}
		}
		//二重配列を返却
		return numbers;
	}

	//二次元配列を受けとり全要素を表示する
	static void showAry(int[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.printf("%3d", numbers[i][j]);
			}
			System.out.println();
		}
	}
}
