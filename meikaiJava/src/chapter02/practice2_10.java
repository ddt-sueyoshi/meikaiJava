package chapter02;

/**
 *
 * @author システム開発部
 *
 *演習2-10
 *右に示すように、名前の正と名とを個別にキーボード読み込んで、挨拶を行うプログラムを作成せよ。
 */

//参照するクラスを記述
import java.util.Scanner;

public class practice2_10 {

	public static void main(String[] args) {
		//入力のためのScannerクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//入力を促す文字列を出力
		System.out.print("姓:");
		//string型の変数を宣言し、キーボードから入力された値で初期化
		String familyName = standardInput.nextLine();

		//入力を促す文字列を出力
		System.out.print("名:");
		//string型の変数を宣言し、キーボードから入力された値で初期化
		String firstName = standardInput.nextLine();

		//入力された姓+名にあいさつする文字列を出力
		System.out.println("こんばんは"+familyName+firstName);
	}

}
