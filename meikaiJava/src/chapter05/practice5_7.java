package chapter05;

/**
 *
 * @author システム開発部
 *演習5-7
 *0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ。
 */
public class practice5_7 {

	public static void main(String[] args) {
		//0から1000まで繰り返し
		for (int i = 0; i <= 1000; i++) {
			double number = (i / 1000.0) * (i / 1000.0); //1000で割った数を2乗
			System.out.printf("%9.6f", number); //9桁以上、小数部6桁のフォーマットで表示
			System.out.println(); //改行
		}
	}

}
