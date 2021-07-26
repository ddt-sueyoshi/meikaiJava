package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-18
 *行数・各行の列数・各要素の値をキーボードから読み込むようにList6-18を書きかえたプログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_18 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//2重の整数配列を宣言
		int matrix[][];
		//キーボードから行数を読み込む
		System.out.print("何行にしますか？：");
		int hight = standardInput.nextInt();
		matrix = new int[hight][];
		
		//入力された行数分繰り返し
		for (int i = 0; i < hight; i++) {
			//キーボードから列数を読み込む
			System.out.print(i + "行目は何列にしますか？：");
			int width = standardInput.nextInt();
			matrix[i] = new int[width];
			
			//入力された列数分繰り返し
			for (int j = 0; j < width; j++) {
				//キーボードから要素の値を読み込む
				System.out.print(i + "行目"+j+"列目の値は？：");
				matrix[i][j]=standardInput.nextInt();
			}
		}

		//全要素を表示
		for(int[] row:matrix) {
			for(int number:row) {
				System.out.printf("%3d", number);
			}
			System.out.println();
		}

	}

}
