package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習問題7-28
 *行列xとyの和を格納した二次元配列を返すメソッドを作成せよ。（行数および列数が同一であることを前提としてよい。）
 */
public class practice7_28 {

	public static void main(String[] args) {
		//三つの配列をキーボードから読み込む
		int[][] numbersX = makeAry();
		int[][] numbersY = makeAry();
		//配列の要素数の和を表示
		int[][] sumAry = addMatrix(numbersX, numbersY);
		showAry(sumAry);
	}

	//２つの配列の加算
	static int[][] addMatrix(int[][] x, int[][] y) {
		//要素数が等しい場合、三つの二次元配列を加算した配列を生成
		int[][] sum = new int[x.length][x[0].length];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = x[i][j] + y[i][j];
			}
		}
		//和の配列を返却し終了
		return sum;
	}

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

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
