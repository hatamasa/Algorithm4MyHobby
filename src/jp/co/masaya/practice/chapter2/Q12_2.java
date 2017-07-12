package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q12_2 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String str = null;
		boolean flg = true;
		int i = 2;
		List<String> list1;
		// 整数部を含む
		while (flg) {
			str = String.valueOf(Math.sqrt(i)).replace(".", "");
			str = str.substring(0, str.length() < 10 ? str.length() : 10);
			list1 = new ArrayList<String>(Arrays.asList(str.split("")));
			ArrayList<String> list2 = new ArrayList<String>(new HashSet<>(list1));
			if (list2.size() == 10) {
				System.out.println("整数部を含む " + i);
				flg = false;
			}
			i++;
		}

		flg = true;
		i = 2;
		// 整数部を含まない
		while (flg) {
			str = String.valueOf(Math.sqrt(i)).replaceFirst(".*\\.", "");
			str = str.substring(0, str.length() < 10 ? str.length() : 10);
			list1 = new ArrayList<String>(Arrays.asList(str.split("")));
			ArrayList<String> list2 = new ArrayList<String>(new HashSet<>(list1));
			if (list2.size() == 10) {
				System.out.println("整数部を含まない " + i);
				flg = false;
			}
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

}
