package chapter07;

/**
 * 
 * @author システム開発部
 *演習7-15
 *配列aの全要素の合計を求めるメソッドsumOfを作成せよ
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_15 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	// 配列aの全要素の合計を求める
	static int sumOf(int[] a) {
		int sum = 0;	//合計値を格納する整数変数を初期化
		for (int i = 0; i < a.length; i++) {	//配列の要素数分繰り返す
			sum += a[i];	//各要素を加算
		}
		return sum;
	}

	public static void main(String[] args) {
		//配列の個数をキーボードから読み込み、配列を生成
		System.out.print("配列の長さ：");
		int length = standardInput.nextInt();
		int[] numbers=new int[length];
		
		//要素数分繰り返し、要素に値を代入
		for(int i=0;i<length;i++) {
			System.out.print(i+"番目の値：");
			numbers[i]=standardInput.nextInt();
		}
		
		//合計値を表示
		System.out.print("配列の合計値："+sumOf(numbers));
		
	}

}
