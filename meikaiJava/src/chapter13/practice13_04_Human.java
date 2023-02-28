package chapter13;

/**
 * 
 * 演習13-4 演習9-4(p.329)で作成した《人間クラス》に対して、
 * javadocコメントを与えると共に、javadocツールによってドキュメントを作成せよ。
 * 
 */

/** 人間クラス */
class practice13_04_Human {
	/** 苗字（例："田中"） */
	private String familyName;
	/** 名前（例："太郎"） */
	private String firstName;
	/** 生まれ年（例：1999）年 */
	private int birthYear;
	/** 生まれ月（例：3） 月 */
	private int birthMonth;
	/** 生まれ日（例：3）日 */
	private int birthDate;
	/** 出身地（例："埼玉県浦和市"） */
	private String birthPlace;

	/**
	 * フィールドに同じ引数名・同じ型の値を設定する。
	 * @param familyName 苗字に設定する値（例："田中"）
	 * @param firstName 名前に設定する値（例："太郎"）
	 * @param birthYear 生まれ年に設定する値（例：1999）
	 * @param birthMonth 生まれ月に設定する値（例：3） 
	 * @param birthDate 生まれ日に設定する値（例：3）
	 * @param birthplace 出身地に設定する値（例："埼玉県浦和市"）
	 */
	practice13_04_Human(String familyName, String firstName, int birthYear, int birthMonth, int birthDate, String birthplace) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDate = birthDate;
		this.birthPlace = birthplace;
	}

	/** 自己紹介を行う。氏名、出身地、年齢を表示する。
	 * （例："こんにちは。私は田中 太郎です。埼玉県浦和市生まれです。よろしくお願いします。）"
	 * */
	void selfIntroduction() {
		System.out.println("こんにちは。私は" + familyName + " " + firstName + "です。" + birthPlace + "生まれです。よろしくお願いします。");
	}

	/**
	 * プロパティの生まれ年・生まれ月・生まれ日から生年月日を文字列で表示する。
	 * 
	 * @return 生年月日を表すString　（例 "1999年3月3日"）
	 */
	public String toString() {
		String birthday = birthYear + "年" + birthMonth + "月" + birthDate + "日";
		return birthday;
	}
}
