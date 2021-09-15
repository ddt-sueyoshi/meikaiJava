package chapter07;

/**
 *
 * @author システム開発部
 *演習7-1
 *受け取ったint型因数の値nが負であれば-1を返却し、0であれば0を返却し、正であれば1を返却するメソッドignOfを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_1 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された整数を変数に格納
		System.out.print("整数：");
		int number = standardInput.nextInt();
		//入力された整数を引数としてsignOfメソッドを呼び出して表示
		System.out.print(signOf(number));

	}

	/**
	 * signOfメソッド受け取った整数引数が負であれば-1を返却し、0であれば0を返却し、正であれば1を返却する
	 * @param n: 整数値
	 * @return: 引数nが負であれば-1、0であれば0、正であれば1
	 */
	static int signOf(int n) {
		if (n > 0) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return -1;
		}
	}

}
