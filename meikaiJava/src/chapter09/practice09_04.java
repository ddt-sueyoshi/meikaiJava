package chapter09;

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
	private String birthplace;

	// コンストラクタ
	Human(String familyName, String firstName, int birthYear, int birthMonth, int birthDate, String birthplace) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDate = birthDate;
		this.birthplace = birthplace;
	}

	/** 自己紹介を行う。氏名、出身地、年齢を表示する */
	void selfIntroduction() {
		System.out.println("こんにちは。私は" + familyName + " " + firstName + "です。" + birthplace + "生まれです。よろしくお願いします。");
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
		// 人間クラスの実態を生成する
		Human tanaka = new Human("田中", "辰五郎", 1999, 12, 12, "富山");
		// 事故章を行うメソッドを呼び出す
		tanaka.selfIntroduction();
		// 生年月日を文字列で取得して表示する
		System.out.println("生年月日：" + tanaka.toString());
	}

}
