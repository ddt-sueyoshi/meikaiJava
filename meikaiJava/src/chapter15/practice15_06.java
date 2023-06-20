package chapter15;

/**
 * 演習15-6
 * コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示するプログラムを作成せよ。
 */

public class practice15_06 {
	public static void main(String[] args) {
		System.out.println("■コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示します");
		
		for(int i=0; i<args.length; i++) {
			System.out.println();
			Double radius = Double.parseDouble(args[i]);
			System.out.println("　　半径　　　："+radius);
			System.out.println("　　円周の長さ："+radius*2*3.14);
			System.out.println("　　面積　　　："+radius*radius*3.14);
		}
	}

}
