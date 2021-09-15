package chapter05;
/**
 *
 * @author システム開発部
 *演習5-1
 *10進整数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice5_1 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);
		//読み込んだ整数を格納
		int number = standardInput.nextInt();

		//8進法と16進法で表示
		System.out.print("8");
		System.out.printf("number=%o\n", number);
		System.out.print("16");
		System.out.printf("number=%x\n", number);

	}

}
