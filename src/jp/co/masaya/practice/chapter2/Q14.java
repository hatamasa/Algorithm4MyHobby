package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;

public class Q14 {

	// ワールドカップ出場国を配列にセット
	static String country[] = { "Brazil", "Croatia", "Mexico", "Cameroon", "Spain", "Netherlands", "Chile", "Australia",
			"Colombia", "Greece", "Cote d'Ivoire", "Japan", "Uruguay", "Costa Rica", "England", "Italy", "Switzerland",
			"Ecuador", "France", "Honduras", "Argentina", "Bosnia and Herzegovina", "Iran", "Nigeria", "Germany",
			"Portugal", "Ghana", "USA", "Belgium", "Algeria", "Russia", "Korea Republic" };
	static ArrayList<String> tmpList = new ArrayList<String>();
	static int size = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		char last;
		// 大文字にして再格納
		for (int i = 0; i < country.length; i++) {
			country[i] = country[i].toUpperCase();
		}
		for (int i = 0; i < country.length; i++) {
			tmpList.add(country[i]);
			// しりの文字を取得
			last = country[i].charAt(country[i].length() - 1);
			nextString(last);
		}
		System.out.println(size);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	static void nextString(char last) {
		char last2;
		// 先頭一文字を比較し、一致したら、かつtmpListになければ格納
		for (int j = 0; j < country.length; j++) {
			if (String.valueOf(last).equals(country[j].substring(0, 1)) && !tmpList.contains(country[j])) {
				tmpList.add(country[j]);
				// 次のしりの文字を取得
				last2 = country[j].charAt(country[j].length() - 1);
				nextString(last2);
			}
		}
		if (tmpList.size() > size) {
			size = tmpList.size();
			for (String s : tmpList) {
				System.out.print(s + ", ");
			}
			System.out.println("");
		}
		// 末尾を取り消し
		tmpList.remove(tmpList.size() - 1);
	}
}
