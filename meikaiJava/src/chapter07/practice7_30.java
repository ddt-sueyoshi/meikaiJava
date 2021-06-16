package chapter07;

import java.util.Scanner;

/**
 * 
 * @author システム開発部
 *演習7-30
 *二つのint型整数a, bの最小値、三つのint型整数a,b,cの最小値、配列aの要素の最小値を求める、多重定義されたメソッド群を作成せよ。
 */
public class practice7_30 {

	public static void main(String[] args) {
		//整数a,b,c,整数配列をキーボードから読み込む
		System.out.print("整数a：");
		int numberA = standardInput.nextInt();
		System.out.print("整数a：");
		int numberB = standardInput.nextInt();
		System.out.print("整数a：");
		int numberC = standardInput.nextInt();
		System.out.print("整数配列a[]：");
		int[] numbers = makeAry();
		
		//各最小値を表示
		System.out.print("a, b の最小値：" + min(numberA, numberB));
		System.out.print("a, b, c の最小値：" + min(numberA, numberB, numberC));
		System.out.print("整数配列a[]の最小値：" + min(numbers));
	}

	static int min(int a, int b) {
		int min = a; //最小値をaで初期化
		if (b < min) { //bのほうが現最小値より小さければbを最小値にする
			min = b;
		}
		return min;
	}

	static int min(int a, int b, int c) {
		int min = a; //最小値をaで初期化
		if (b < min) { //bのほうが現最小値より小さければbを最小値にする
			min = b;
		}
		if (c < min) { //cのほうが現最小値より小さければbを最小値にする
			min = c;
		}
		return min;
	}

	static int min(int[] a) {
		int min = a[0]; //最小値をa[0]で初期化
		for (int number : a) {
			if (number < min) //配列の要素とそれぞれ比較し、小さいほうに入れ替える
				min = number;
		}
		return min;
	}

	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

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
}
