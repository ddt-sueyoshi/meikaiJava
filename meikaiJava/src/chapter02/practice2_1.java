package chapter02;

/**
 *
 * @author システム開発部
 *
 *演習2-1
 *List 2-6の2⃣の箇所（int変数 x,y に整数値を代入している）を、小数部を持つ実数値をxとyに代入するように変更して、その結果を考察せよ。
 */

public class practice2_1 {

	public static void main(String[] args) {

		//整数型の変数を宣言
		int x, y;

		//指定の通り小数部を持つ実数を代入
		//代入式のオペランドの方が左右で不一致となりコンパイルエラー
		//x = 3.14;
		//y = 4.86;
		x = 63; //List 2-6の2⃣
		y = 18; //List 2-6の2⃣

		//xの値を含む文字列を出力
		System.out.println("xの値は" + x + "です。");
		//yの値を含む文字列を出力
		System.out.println("yの値は" + y + "です。");
		//xとyの合計値を含む文字列を出力
		System.out.println("xとyの合計は" + (x + y) + "です。");
		//xとyの平均値を含む文字列を出力（ここで再度小数部が切り捨てられる）
		System.out.println("xとyの平均は" + (x + y) / 2 + "です。");

	}

}
