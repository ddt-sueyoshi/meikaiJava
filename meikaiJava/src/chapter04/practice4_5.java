package chapter04;
/**
 *
 * @author システム開発部
 *演習4-5
 *List4-5（p.102）のx--が--xとなっていたら、どのような出力が得られるかを検討せよ。
 *プログラムを作成して実行結果を確認すること。
 *（List4-5：入力された整数をデクリメントを使用してカウントダウンするプログラム）
 */

//参照するクラスを宣言
import java.util.Scanner;

public class practice4_5 {

	public static void main(String[] args) {
		//読み込みようのクラスを生成
		Scanner standardInput =new Scanner(System.in);
		//カウントダウンのメッセージを出力
		System.out.println("");
		//入力された整数を格納する変数
		int number;
		//正の整数が入力されるまで繰り返し
		do {
		//入力を促すメッセージ出力
		System.out.print("");
		//入力された整数を代入
		number=standardInput.nextInt();
		}while(number > 0);

		//整数を表示してデクリメント
		//入力された整数より1小さい整数から-1までカウントダウンされる
		while(number>=0) {
			System.out.print(--number);
		}

	}

}

