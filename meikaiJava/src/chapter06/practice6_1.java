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
		for(int i=0;i<5;i++) {
			System.out.print("整数"+i+"：");
			numbers[i] = standardInput.nextDouble();
		}

		//配列の中身を表示
		for(int i=0;i<5;i++) {
			System.out.print("numbers[" + i + "]" + numbers[i] + "  ");
		}
	}

}
