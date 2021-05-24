package chapter06;

/**
 *
 * @author システム開発部
 *演習問題6-17
 *6人の2科目（国語・数学）の点数を読み込んで、科目ごとの平均点、学生ごとの平均点を求めるプログラムを作成せよ。
 */
//参照するクラスを宣言
import java.util.Scanner;

public class practice6_17 {

	public static void main(String[] args) {
		//読み込みクラスを生成
		Scanner standardInput = new Scanner(System.in);

		//6人の2科目（国語・数学）の点数を格納する6行2列の配列
		int[][] examScores = new int[6][2];
		int[] subjectsAverages = new int[2];//科目ごとの平均を格納する
		int[] studentsAverages = new int[6];//学生ごとの平均を格納する
		String[] subjectNames= {"国語","数学"};
		String[] studentNames=new String[6];

		for (int i = 0; i < examScores.length; i++) {
			//i人目の名前をキーボードから読み込む
			System.out.print("受験者名：");
			studentNames[i] = standardInput.next();

			//i人目の国語の点数をキーボードから読み込む
			System.out.print(studentNames[i] + "さんの国語の点数は？：");
			examScores[i][0] = standardInput.nextInt();
			//i人の数学の点数をキーボードから読み込む
			System.out.print(studentNames[i] + "さんの数学の点数は？：");
			examScores[i][1] = standardInput.nextInt();

			//学生ごとの平均
			studentsAverages[i] = (examScores[i][0] + examScores[i][1]) / 2;
		}

		//科目ごとの平均
		for (int i = 0; i < examScores.length; i++) { //学生数分繰り返し
			for (int j = 0; j < examScores[i].length; j++) {
				subjectsAverages[j] += examScores[i][j]; //科目ごとに点数を集計
				if (i == examScores.length - 1) {
					subjectsAverages[j] /= examScores.length;	//最後の学生の点数加算後は人数で割る
				}
			}
		}
		
		for(int i = 0; i < studentsAverages.length; i++) {
			System.out.println(studentNames[i]+"さんの平均は"+studentsAverages[i]+"点です。");
		}
		for (int j = 0; j < subjectsAverages.length; j++) {
			System.out.println(subjectNames[j]+"の平均は"+subjectsAverages[j]+"点です。");
		}

	}

}
