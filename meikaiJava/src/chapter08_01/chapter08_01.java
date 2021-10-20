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
import java.util.Scanner;

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

public class chapter08_01 {

	public static void main(String[] args) {
		//各インスタンスを生成
		Human oono = new Human("大野", "花子", 1962, "山梨");
		Human nakano = new Human("中野", "靖子", 1959, "岐阜");
		Human onodera = new Human("小野寺", "喜久", 1950, "山形");

		//自己紹介を行う
		//生まれ年を取得する
		//生まれ年を表示する
		oono.selfIntroduction();
		oono.displayAge();

		//自己紹介を行う
		//生まれ年を取得する
		//生まれ年を表示する
		nakano.selfIntroduction();
		nakano.displayAge();

		//自己紹介を行う
		//生まれ年を取得する
		//生まれ年を表示する
		onodera.selfIntroduction();
		onodera.displayAge();

		//入力から自己紹介をおこなう。
		Scanner standardInput = new Scanner(System.in);

		System.out.print("苗字：");
		String familyName = standardInput.next();
		System.out.println();
		System.out.print("名前：");
		String firstName = standardInput.next();
		System.out.println();
		System.out.print("生年：");
		int birthYear = standardInput.nextInt();
		System.out.println();
		System.out.print("出身地：");
		String birthPlace = standardInput.next();
		System.out.println();
		
		Human you =new Human(familyName,firstName,birthYear,birthPlace);
		you.selfIntroduction();
		you.displayAge();

	}

}
