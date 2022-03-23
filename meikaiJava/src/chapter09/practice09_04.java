package chapter09;

import java.util.Scanner;

/**
 * 
 * @author user
 * 演習8-1（p.293）で作成した《人間クラス》に、誕生日のフィールドとtoStringメソッドを追加せよ。
 * ※コンストラクタを変更したり、誕生日のゲッタなどのメソッドを追加したりすること。
 * 
 */

/** 人間クラス */
class Human {
	/** 苗字 */
	private String familyName;
	/** 名前 */
	private String firstName;
	/** 生まれ年 */
	private int birthYear;
	/** 生まれ月 */
	private int birthMonth;
	/** 生まれ日 */
	private int birthDate;
	/** 出身地 */
	private String birthPlace;

	// コンストラクタ
	Human(String familyName, String firstName, int birthYear, int birthMonth, int birthDate, String birthplace) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDate = birthDate;
		this.birthPlace = birthplace;
	}

	/** 自己紹介を行う。氏名、出身地、年齢を表示する */
	void selfIntroduction() {
		System.out.println("こんにちは。私は" + familyName + " " + firstName + "です。" + birthPlace + "生まれです。よろしくお願いします。");
	}

	/**
	 * プロパティの生まれ年・生まれ月・生まれ日から生年月日を文字列で表示する
	 * 
	 * @return 生年月日
	 */
	public String toString() {
		String birthday = birthYear + "年" + birthMonth + "月" + birthDate + "日";
		return birthday;
	}
}

public class practice09_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("◆ 氏：");
		String familyName = stdIn.next();
		System.out.print("◆ 名：");
		String firstName = stdIn.next();
		System.out.print("◆ 生年月日　年：");
		int birthYear = stdIn.nextInt();
		System.out.print("　　　　　　月：");
		int birthMonth = stdIn.nextInt();
		System.out.print("　　　　　　日：");
		int birthDate = stdIn.nextInt();
		System.out.print("■出身地：");
		String birthPlace = stdIn.next();

		// 人間クラスの実態を生成する
		Human tanaka = new Human(familyName, firstName, birthYear, birthMonth, birthDate, birthPlace);
		// 自己紹介を行うメソッドを呼び出す
		tanaka.selfIntroduction();
		// 生年月日を文字列で取得して表示する
		System.out.println("生年月日：" + tanaka.toString());
	}

}
