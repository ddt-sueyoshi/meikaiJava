package chapter06;

/**
 *
 * @author システム開発部
 *演習6-12
 *配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）プログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Random;
import java.util.Scanner;

public class practice6_12 {

	public static void main(String[] args) {
		// 乱数生成・読み込みのためのクラスを生成
		Random random = new Random();
		Scanner standardInput = new Scanner(System.in);

		//要素数をキーボードから読み込む
		System.out.print("要素数：");
		int length = standardInput.nextInt();

		int[] before = new int[length]; //並び替え前の配列
		int[] after = new int[length]; //並び替え後の配列
		int[] keys = new int[length]; //インデックスの配列

		System.out.print("並び替え前{ "); //並び替え前の配列の出力
		for (int i = 0; i < length; i++) { //要素数分繰り返し
			before[i] = random.nextInt(99); //0～99の乱数を、並び替え前の配列の値として格納
			System.out.print(before[i] + " "); //並び替え前の配列の出力

			//インデックス配列に重複が無いように、0～要素数までの乱数を格納
			int number; //乱数を格納する変数
			boolean retry; //やり直しフラグ（既出の整数であればtrueにする）
			do {
				retry = false; //やり直しフラグの初期化
				number = random.nextInt(length); //0～要素数までの乱数
				for (int j = 0; j < i; j++) { //1つ前までの全要素を確認
					if (number == keys[j]) { //既出の場合
						retry = true;
						break; //確認ループを抜けdo文に戻る
					}
				}
			} while (retry == true);
			keys[i] = number; //乱数を配列の値として格納
		}
		System.out.println("}");

		System.out.print("並び替え後{ "); //並び替え後の配列の出力
		//インデックス配列の要素数分繰り返し
		for (int i = 0; i < length; i++) {
		//並び替え後の配列[i]に、並び替え前の配列[インデックス配列の値]のを格納
			after[i]=before[keys[i]];
		//並び替え後の配列を表示
			System.out.print(after[i] + " "); //並び替え後の配列の出力
		}
		System.out.println("}");
	}

}
