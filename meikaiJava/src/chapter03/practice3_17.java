package chapter03;
/**
 *
 * @author システム開発部
 *演習3-17
 *0,1,2のいずれかの値の乱数を生成し、
 *0であれば"グー“を、1であれっば”チョキ”を、2であれば”パー”を表示するプログラムを作成せよ。
 */

//参照するクラスを宣言
import java.util.Random;

public class practice3_17 {

	public static void main(String[] args) {
		//乱数を生成するクラスを生成
		Random random = new Random();

		//整数型の変数を宣言
		//0から2の整数の乱数を生成して代入
		int hand = random.nextInt(2);

		//乱数を格納した変数で分岐させる
		switch (hand) {
		//0ならば”グー”の文字列を出力
		case 0:
			System.out.print("グー");
			break;
		//1ならば”チョキ”の文字列を出力
		case 1:
			System.out.print("チョキ");
			break;
		//2ならば”パー”の文字列を出力
		case 2:
			System.out.print("パー");
			break;
		}
	}

}
