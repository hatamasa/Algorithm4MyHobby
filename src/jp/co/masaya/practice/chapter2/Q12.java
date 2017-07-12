package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;

public class Q12 {

	static int idx1 = 0;
	static int idx2 = 0;
	static int tmp1 = 0;
	static int tmp2 = 0;
	static int num1 = 0;
	static int num2 = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<String> sqrt1 = null;
		ArrayList<String> sqrt2 = null;

		for (int n = 2; n < 10000; n++) {
			String str = String.valueOf(Math.sqrt(n));
			int length = 11;
			// lengthの長さに分割→length+1で分割
			while (length <= str.length()) {
				// 小数点含むsqrt1, 小数点含まないsqrt2
				sqrt1 = new ArrayList<String>();
				sqrt2 = new ArrayList<String>();
				for (int i = 0; i < length; i++) {
					if (!str.substring(i, i + 1).equals("."))
						sqrt1.add(str.substring(i, i + 1));
					if (i > str.indexOf("."))
						sqrt2.add(str.substring(i, i + 1));
				}
				tmp1 = delList(sqrt1);
				tmp2 = delList(sqrt2);
				// 0-9がすべて出現した場合の処理
				if (idx1 != 11 && tmp1 != 0 && (idx1 == 0 || idx1 > tmp1)) {
					idx1 = tmp1;
					num1 = n;
				}
				if (idx2 != 11 && tmp2 != 0 && (idx2 == 0 || idx2 > tmp2)) {
					idx2 = tmp2;
					num2 = n;
				}
				length++;
			}
		}
		System.out.println(num1 + " が " + idx1 + " 桁で満たす（小数点含む）");
		System.out.println(num2 + " が " + idx2 + " 桁で満たす（小数点含まない）");
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	static int delList(ArrayList<String> list) {
		int size = list.size();
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (Integer.parseInt(list.get(j)) == i) {
					list.remove(j);
					cnt++;
					break;
				}
			}
		}
		return (cnt == 10) ? size + 1 : 0;
	}

}
