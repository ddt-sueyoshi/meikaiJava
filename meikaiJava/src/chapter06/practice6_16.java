package chapter06;

/**
 *
 * @author システム開発部
 *演習6-16
 *4行3列の行列と3行4列の行列の積を求めるプログラムを作成せよ。
 *各要素の値はキーボードから読み込むこと。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_16 {

	public static void main(String[] args) {
		// 乱数生成・読み込みのためのクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//4行3列の行列と3行4列の行列を宣言
		int[][] numbersA = new int[4][3];
		int[][] numbersB = new int[3][4];
		//二つの整数の積を格納する配列
		int[][] numbersProducts = new int[4][4];

		//Aの行分繰り返す
		for (int i = 0; i < numbersA.length; i++) {
			//Aの列分繰り返す
			for (int j = 0; j < numbersA[i].length; j++) {
				System.out.print("numbersA[" + i + "][" + j + "]：");
				numbersA[i][j] = standardInput.nextInt(); //キーボードから値を読み込んで代入
			}
		}

		//Bの行分繰り返す
		for (int i = 0; i < numbersB.length; i++) {
			//Bの列分繰り返す
			for (int j = 0; j < numbersB[i].length; j++) {
				System.out.print("numbersB[" + i + "][" + j + "]：");
				numbersB[i][j] = standardInput.nextInt(); //キーボードから値を読み込んで代入
			}
		}

		//積の行分繰り返す
		for (int i = 0; i < numbersProducts.length; i++) {
		//積の列分繰り返す
			for (int j = 0; j < numbersProducts[i].length; j++) {
				//Aの1行分繰り返す
				for (int k = 0; k < numbersA[i].length; k++) {
						//積[i][j]にA[i行][j列]*B[j][k]を加算
						numbersProducts[i][j]+=(numbersA[i][k]*numbersB[k][j]);
				}

			}
		}

		//積の行分繰り返す
				for (int i = 0; i < numbersProducts.length; i++) {
				//積の列分繰り返す
					System.out.print("{ ");
					for (int j = 0; j < numbersProducts[i].length; j++) {
						//積を表示
						System.out.print(numbersProducts[i][j]+(j==numbersProducts[i].length-1?" }\n":","));
					}
				}
	}

}
