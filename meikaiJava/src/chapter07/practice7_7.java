package chapter07;

/**
 * 
 * @author システム開発部
 *演習7-7
 *List7-7に示したn個の'*'を連続表示するメソッドputStarsを、内部でList7-8のメソッドputCharsを呼び出すことによって表示を行うように書きかえよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice7_7 {

	//受け取った文字 charactorを受け取った整数 number個表示する
	static void putChars(char charactor, int number) {
		while (number-- >= 0) {
			System.out.print(charactor);
		}
	}

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//段数を示す整数をキーボードから読み込む
		System.out.print("段数：");
		int stepNumber = standardInput.nextInt();

		//段数分繰り返し、
		//段数と同じ数の * を putCharメソッドで出力して改行
		for (int i = 0; i < stepNumber; i++) {
			putChars('*', i);
			System.out.println();
		}
	}

}
