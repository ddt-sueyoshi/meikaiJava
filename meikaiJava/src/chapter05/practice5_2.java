package chapter05;

/**
 *
 * @author システム開発部
 *演習5-2
 *float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice5_2 {
	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//変数xはfloat型、yはdouble型であり、キーボードから入力された実数を格納する
		System.out.println("変数xはfloat型、yはdouble型");
		System.out.print("x:");
		float x = standardInput.nextFloat();
		System.out.print("y:");
		double y = standardInput.nextDouble();

		//入力された実数を表示
		System.out.print("x:" + x + "\ny:" + y);

	}
}