package chapter07;

/**
 *
 * @author システム開発部
 *演習7-12
 *整数xを右にnビット回転した値を返すメソッドrRotateと、左にnビット回転した値を返すメソッドlRotateを作成せよ
 *※回転とは、最下位ビットと最上位ビットがつながっているとみなしてシフトすることである。
 *　たとえば右に5ビット開店した場合は、シフトによってはじき出されることになる以下5ビットを上位に持ってこなければならない。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_12 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);

	/**
	 * /ビット数をカウントする
	 * @param x: 整数値
	 * @return: xのビット数
	 */
	static int countBits(int x) {
		int bits = 0;
		while (x != 0) {
			if ((x & 1) == 1)
				bits++;
			x >>>= 1;
		}
		return bits;
	}

	/**
	 * ビット構成を表示する
	 * @param x: 整数値
	 */
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	/**
	 * ビット構成を右に回転
	 * @param x: ビットを回転させる整数値
	 * @param n: 回転数
	 * @return: 整数xを右にnビット回転した値
	 */
	static int rRotate(int x, int n) {
		//右からずらす桁数分を、元のビット数分左シフトした変数
		int y = x << (32 - n);
		//元の整数を指定の桁数分右シフト
		x = x >> n;
		//論理和
		x = x | y;
		return x;
	}

	/**
	 * 左に回転
	 * @param x: ビットを回転させる整数値
	 * @param n: 回転数
	 * @return: 整数xを左にnビット回転した値
	 */
	static int lRotate(int x, int n) {
		//左からずらす桁数分を、元のビット数分右シフトした変数
		int y = x >>> (32 - n);
		//元の整数を指定の桁数分左シフト
		x = x << n;
		x = x | y;//論理和
		return x;
	}

	public static void main(String[] args) {
		// キーボードから読み込んだ整数を格納
		System.out.print("整数：");
		int number = standardInput.nextInt();
		System.out.print("いくつシフトするか：");
		int shiftRange = standardInput.nextInt();

		//指定の桁数ビット構成を左右に回転した整数
		int rightRotate = rRotate(number, shiftRange);
		int leftRotate = lRotate(number, shiftRange);

		//回転前のビット構成を表示
		System.out.println("回転前");
		printBits(number);
		System.out.println();
		//右回転した時の整数とビット構成を表示
		System.out.println("右回転：" + rightRotate);
		printBits(rightRotate);
		System.out.println();
		//左回転した時の整数とビット構成を表示
		System.out.println("左回転：" + leftRotate);
		printBits(leftRotate);
		System.out.println();

	}

}
