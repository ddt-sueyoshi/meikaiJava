package chapter05;

/**
 *
 * @author システム開発部
 *演習5-3
 *論理型の変数にtrueやfalseを代入して、その値を表示するプログラムを作成せよ。
 */
public class practice5_3 {

	public static void main(String[] args) {

		//論理型の変数を宣言しtrueを代入
		boolean ok = true;
		//論理型の変数を宣言しfalseを代入
		boolean ng = false;

		//論理変数を含むメッセージ出力
		System.out.print("正しければ" + ok + "、間違っていたら" + ng + "が表示される。\n");

	}

}
