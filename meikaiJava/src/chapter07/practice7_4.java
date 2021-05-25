package chapter07;
/**
 * 
 * @author システム開発部
 *演習7-4
 *1からnまでの全整数の和を求めて返却するメソッドを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_4 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力された整数を変数に格納
		System.out.print("整数1からnまでの和を求める　n：");
		int number = standardInput.nextInt();
		
		System.out.print(sumUp(number));
	}
	
	static int sumUp(int a) {
		int summery=0;
		do {
			summery+=a;
		}while(a-->0);
		return summery;
	}

}
