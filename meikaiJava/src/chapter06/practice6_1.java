package chapter06;
/**
 * 
 * @author システム開発部
 *演習6-1
 *要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice6_1 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//要素型がdouble型で要素数が5の配列を生成
		double[] numbers = new double[5];

		//入力を促すメッセージ出力
		//入力された値を配列に格納
		System.out.print("整数1：");
		numbers[0] = standardInput.nextDouble();
		System.out.print("整数2：");
		numbers[1] = standardInput.nextDouble();
		System.out.print("整数3：");
		numbers[2] = standardInput.nextDouble();
		System.out.print("整数4：");
		numbers[3] = standardInput.nextDouble();
		System.out.print("整数5：");
		numbers[4] = standardInput.nextDouble();

		//配列の中身を表示
		System.out.print("numbers[" + 0 + "]" + numbers[0] + "  ");
		System.out.print("numbers[" + 1 + "]" +numbers[1] + " ");
		System.out.print("numbers[" + 2 + "]" +numbers[2] + " ");
		System.out.print("numbers[" + 3 + "]" +numbers[3] + " ");
		System.out.print("numbers[" + 4 + "]" +numbers[4] + " ");
	}

}
