package chapter07;

/**
 *
 * @author システム開発部
 *演習7-11
 *整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを確認するグラムを作成せよ
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_11 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された整数を変数に格納する
		System.out.print("整数：");
		int number = standardInput.nextInt();
		System.out.print("いくつシフトするか：");
		int shiftRange = standardInput.nextInt();

		//2のshiftRange乗
		int power = 1;
		for (int i = 0; i < shiftRange; i++) {
			power *= 2;
		}

		//左にシフトした整数が（元の整数*2のn乗）と一致するか
		System.out.println(number + " << " + shiftRange + " = " + (number << shiftRange));
		System.out.print(number + " << " + shiftRange + " = " + number + " * ( 2の" + shiftRange + "乗 ) か？：");
		System.out.println((number << shiftRange == number * power) ? "Yes" : "No");

		//右にシフトした整数が（元の整数*2の-n乗）と一致するか
		System.out.println(number + " >> " + shiftRange + " = " + (number >> shiftRange));
		System.out.print(number + " >> " + shiftRange + " = " + number + " * ( 2の-" + shiftRange + "乗 ) か？：");
		System.out.println((number >> shiftRange == number / power) ? "Yes" : "No");

	}

}
