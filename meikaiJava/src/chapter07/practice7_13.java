package chapter07;

/**
 *
 * @author システム開発部
 *演習7-13
 *整数のposビット目（最下位から0,1,2…と数える）を、1にした値を返すメソッドset、0にした値を返すメソッドreset、
 *反転した値を返すメソッドinverseを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_13 {
	//読み込みクラスの生成
	static Scanner standardInput = new Scanner(System.in);
	//指定のビット目が持つ値を初期化
	static int power = 1;

	/**
	 * 特定のビット目が0か1か判定する
	 * @param x 対象の整数
	 * @param pos 判定するビットの桁
	 * @return 0か1を返却する
	 */
	static int checkBit(int x, int pos) {
		int remainder = x % (power * 2);
		if (remainder != 0 && remainder >= power) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 特定のビット目を1にする
	 * @param x 対象の整数
	 * @param pos 変更するビットの桁
	 * @return 特定の桁のビットを変更した整数を返却
	 */
	static int set(int x, int pos) {
		if (checkBit(x, pos) == 0) { //特定の桁が0ならば1にする、1ならば何もしない
			return x + power;
		}
		return x;
	}

	/**
	 * 特定のビット目を0にする
	 * @param x 対象の整数
	 * @param pos 変更するビットの桁
	 * @return 特定の桁のビットを変更した整数を返却
	 */
	static int reset(int x, int pos) {
		if (checkBit(x, pos) == 1) { //特定の桁が1ならば0にする、0ならば何もしない
			return x - power;
		}
		return x;
	}

	/**
	 * 特定のビット目を反転する
	 * @param x 対象の整数
	 * @param pos 変更するビットの桁
	 * @return 特定の桁のビットを変更した整数を返却
	 */
	static int inverse(int x, int pos) { //特定の桁が0ならば1にする
		if (checkBit(x, pos) == 0) {
			return x + power;
		} else if (checkBit(x, pos) == 1) { //特定の桁が1ならば0にする
			return x - power;
		}
		return x;
	}

	/**
	 * ビット構成を表示する
	 * @param x 対象の整数
	 */
	static void printBits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
	}

	public static void main(String[] args) {
		// キーボードから読み込んだ整数を格納
		System.out.print("整数：");
		int number = standardInput.nextInt();
		System.out.print("何個目を操作するか：");
		int posNumber = standardInput.nextInt();

		//指定のビット目が持つ値を計算
		for (int i = 0; i < posNumber; i++) {
			power *= 2;
		}
		//指定の桁数ビット構成を左右に回転した整数
		int setBits = set(number, posNumber);
		int resetBits = reset(number, posNumber);
		int inverseBits = inverse(number, posNumber);

		//操作前のビット構成を表示
		System.out.println("操作前");
		printBits(number);
		System.out.println();
		//指定のけたを0にした時の整数とビット構成を表示
		System.out.println("set：" + setBits);
		printBits(setBits);
		System.out.println();
		//指定のけたを1にした時の整数とビット構成を表示
		System.out.println("reset：" + resetBits);
		printBits(resetBits);
		System.out.println();
		//指定のけたを反転した時の整数とビット構成を表示
		System.out.println("inverseBits：" + inverseBits);
		printBits(inverseBits);
		System.out.println();

	}

}
