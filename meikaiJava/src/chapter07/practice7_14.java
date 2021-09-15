package chapter07;

/**
 *
 * @author システム開発部
 *演習7-14
 *整数xのposビット目を最下位として連続するn個のビットを、1にした値を返すメソッドsetN、0にした値を返すメソッドresetN、
 *反転した値を返すメソッドnverseNを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_14 {

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
	//特定のビット目が0か1か判定する
	static int checkBit(int x, int pos) {
		power = (int) Math.pow(2, pos);
		int remainder=x % (power * 2);
		if (remainder!=0 && remainder >= power) {
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
	static int setN(int x, int pos,int count) {
		for (int i = pos; i <= pos+count-1; i++) {
			if (checkBit(x, i) == 0) { //特定の桁が0ならば1にする、1ならば何もしない
				x += power;
			}
		}
		return x;
	}

	/**
	 * 特定のビット目を0にする
	 * @param x 対象の整数
	 * @param pos 変更するビットの桁
	 * @return 特定の桁のビットを変更した整数を返却
	 */
	//特定のビット目から特定の桁数を0にする
	static int resetN(int x, int pos,int count) {
		for (int i = pos; i <= pos+count-1; i++) {
			if (checkBit(x, i) == 1) { //特定の桁が1ならば0にする、0ならば何もしない
				x -= power;
			}
		}
		return x;
	}

	/**
	 * 特定のビット目を反転する
	 * @param x 対象の整数
	 * @param pos 変更するビットの桁
	 * @return 特定の桁のビットを変更した整数を返却
	 */
	static int inverseN(int x, int pos,int count) { //特定の桁が0ならば1にする
		for (int i = pos; i <= pos+count-1; i++) {
			if (checkBit(x, i) == 0) {
				x += power;
			} else { //特定の桁が1ならば0にする
				x -= power;
			}
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
		System.out.print("何個目から操作するか：");
		int posNumber = standardInput.nextInt();
		System.out.print("何個を操作するか：");
		int posCount = standardInput.nextInt();

		//指定の桁数ビット構成を左右に回転した整数
		int setBits = setN(number, posNumber,posCount);
		int resetBits = resetN(number, posNumber,posCount);
		int inverseBits = inverseN(number, posNumber,posCount);

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
