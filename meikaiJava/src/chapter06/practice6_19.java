package chapter06;

/**
 *
 * @author システム開発部
 *演習6-19
 *クラス数・各カラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求めるプログラムを作成せよ。
 *合計点と平均点は、クラスごとのものと全体のものを表示すること。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_19 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		int examScores[][]; //各クラスの生徒の点数を格納する2重の整数配列
		int classSummery[]; //各クラスの合計点を格納する整数配列
		int totalStudents = 0; //全クラスの生徒数を格納する整数

		//キーボードからクラス数を読み込む
		System.out.print("何クラスありますか？：");
		int classes = standardInput.nextInt();
		examScores = new int[classes][]; //点数配列の生成
		classSummery = new int[classes]; //合計点配列を生成

		//入力された行数分繰り返し
		for (int i = 0; i < classes; i++) {
			//キーボードから生徒数を読み込む
			System.out.print(i + "組の生徒は何人ですか？：");
			int students = standardInput.nextInt();
			examScores[i] = new int[students]; //点数配列の行を生成
			totalStudents += students; //全クラス生徒数に加算

			//入力された列数分繰り返し
			for (int j = 0; j < students; j++) {
				//キーボードから要素の値を読み込む
				System.out.print((i + 1) + "組" + j + "番の点数は？：");
				examScores[i][j] = standardInput.nextInt();
				classSummery[i] += examScores[i][j];
			}
		}

		int totalSummery = 0;//全クラス合計点の整数変数
		System.out.println(" 組 |  合計  平均\n" +
				"-----+------------");//表のヘッダを出力
		//クラス数分繰り返し
		for (int i = 0; i < examScores.length; i++) {
			System.out.print( (i + 1) + "組 |");
			System.out.printf("%6d", classSummery[i]);
			System.out.printf("%6.1f", (double) classSummery[i] / examScores[i].length);
			System.out.println();
			totalSummery += classSummery[i];
		}
		System.out.print("-----+------------\n" + " 計 |");
		System.out.printf("%6d", totalSummery);
		System.out.printf("%6.1f", (double) totalSummery / totalStudents);
		System.out.println();

	}

}
