package chapter08_01;

import java.util.Calendar;

/**
 *
 * @author システム開発部
 *
 *演習8-1
 *名前・身長・体重等をメンバとして持つ《人間クラス》を作成せよ。
 *（フィールドやメソッドなどは自分で自由に設計すること。）
 */

import java.util.Date;

class Human {
	// 苗字
	private String familyName;
	// 名前
	private String firstName;
	// 年齢
	private int age;
	// 出身地
	private String birthplace;

	// コンストラクタ
	Human(String familyName, String firstName, int age, String birthplace) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.age = age;
		this.birthplace = birthplace;
	}

	// 自己紹介を行う。氏名、出身地、年齢を表示する。
	void selfIntroduction() {
		System.out.println("こんにちは。私は" + familyName + " " + firstName + "です。"
				+ birthplace + "生まれの" + age + "歳です。よろしくお願いします。");
	}

	// プロパティの年齢と現在日付から生まれた年を計算する
	int birthYear() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, (-1 * age));
		int year = calendar.get(Calendar.YEAR);
		return year;
	}
}

public class chapter08_01 {

	public static void main(String[] args) {
		//各インスタンスを生成
		Human oono = new Human("大野", "花子", 62, "山梨");
		Human nakano = new Human("中野", "靖子", 59, "岐阜");
		Human onodera = new Human("小野寺", "喜久", 70, "山形");

		//自己紹介を行う
		//生まれ年を取得する
		//生まれ年を表示する
		oono.selfIntroduction();
		int oonoBirthYear=oono.birthYear();
		System.out.println(oonoBirthYear+"年生まれです。");

		//自己紹介を行う
		//生まれ年を取得する
		//生まれ年を表示する
		nakano.selfIntroduction();
		int nakanoBirthYear = nakano.birthYear();
		System.out.println(nakanoBirthYear+"年生まれです。");

		//自己紹介を行う
		//生まれ年を取得する
		//生まれ年を表示する
		onodera.selfIntroduction();
		int onoderaBirhYear=onodera.birthYear();
		System.out.println(onoderaBirhYear+"年生まれです。");
	}

}
