package chapter09;

/**
 * 演習9-1
 * 演習8-1で作成した《人間クラス》の配列を生成するプログラムを作成せよ。
 * 生成時に要素を初期化するもの、生成後の要素に値を代入するものなど、複数のパターンを作成すること。
 */

import java.util.Calendar;
import java.util.Date;

class Human {
	// 苗字
	private String familyName;
	// 名前
	private String firstName;
	// 生まれ年
	private int birthYear;
	// 出身地
	private String birthplace;

	// コンストラクタ
	Human(String familyName, String firstName, int birthYear, String birthplace) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.birthplace = birthplace;
	}

	// 自己紹介を行う。氏名、出身地、年齢を表示する。
	void selfIntroduction() {
		System.out.println("こんにちは。私は" + familyName + " " + firstName + "です。"
				+ birthplace + "生まれです。よろしくお願いします。");
	}

	// プロパティの年齢と現在日付から生まれた年を計算する
	void displayAge() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		year -= birthYear;
		System.out.println("今年で" + year + "歳です。");
	}
}

public class practice09_01 {
	public static void main(String[] args) {
		//生成後の要素に値を代入
		Human[] humans1;
		humans1 = new Human[] {
				new Human("タナカ", "タロウ", 1970, "北海道"),
				new Human("サトウ", "シオリ", 1995, "神奈川県")
		};

		System.out.println("《生成後の要素に値を代入した人間クラスの出力》");
		for (int i = 0; i < humans1.length; i++) {
			humans1[i].selfIntroduction();
			humans1[i].displayAge();
			System.out.println();
		}


		//生成時に要素を初期化
		Human[] humans2 = new Human[] {
				new Human("スズキ", "トモカ", 1979, "埼玉県"),
				new Human("マエダ", "マコト", 1999, "滋賀県")
		};

		System.out.println("《生成時に要素を初期化した人間クラスの出力》");
		for (int i = 0; i < humans2.length; i++) {
			humans2[i].selfIntroduction();
			humans2[i].displayAge();
			System.out.println();
		}

		//生成時に要素を初期化、要素は事前に変数として生成
		Human sasaki = new Human("ササキ", "ジロウ", 1980, "三重県");
		Human yagi = new Human("ヤギ", "アキラ", 2003, "鹿児島県");
		Human[] humans3 = new Human[] { sasaki, yagi };

		System.out.println("《生成時に要素を初期化、要素は事前に変数として生成した人間クラスの出力》");
		for (int i = 0; i < humans3.length; i++) {
			humans3[i].selfIntroduction();
			humans3[i].displayAge();
			System.out.println();
		}
	}
}
