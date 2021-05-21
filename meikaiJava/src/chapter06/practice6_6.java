package chapter06;

/**
 * 
 * @author システム開発部
 *演習6-6
 *テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ。人数と点数は、キーボードから読み込んむこと。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_6 {

	public static void main(String[] args) {
		//読み込み用のクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//キーボードから読み込んだ整数値を要素数とする整数配列を宣言
		System.out.print("人数：");
		int examinees = standardInput.nextInt();
		int[] scores = new int[examinees];

		//人数分繰り返し
		for (int i = 0; i < scores.length; i++) {
			//入力された点数を配列に格納
			System.out.print("score[" + i + "]=");
			scores[i] = standardInput.nextInt();
		}

		//合計点・最高点・最低点を格納する整数変数を初期化
		int summery = 0;
		int max = scores[0];
		int min = scores[0];

		//人数分繰り返し
		for(int i=0;i<scores.length;i++) {
		//合計点に点数を加算
			summery+=scores[i];
		//最高点より大きい値なら、最高点に代入
			if(scores[i]>max) {max=scores[i];}
		//最低点より小さい値なら、最低点に代入
			if(scores[i]<min) {min=scores[i];}
		}
		
		//合計点・平均点・最高点・最低点を表示
		System.out.print("合計点："+summery+"　　平均点："+(summery/scores.length)+"\n最高点："+max+"　　最低点："+min);
	}

}
