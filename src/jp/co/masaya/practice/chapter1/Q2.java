package jp.co.masaya.practice.chapter1;

import java.util.ArrayList;

public class Q2 {
	public static void main(String[] args) {
		int n = 1000;
		int m = 10000;
		String[] op = { "*", "" };
		ArrayList<String> list = new ArrayList<String>();
		String num1, num2 = null;
		int ans, idx;
		StringBuffer sb = null;
		ArrayList<String> tmpList = new ArrayList<String>();
		for (int i = n; i < m; i++) {
			num1 = String.valueOf(i);
			for (int a = 0; a < op.length; a++) {
				for (int b = 0; b < op.length; b++) {
					for (int c = 0; c < op.length; c++) {
						ans = 0;
						idx = 0;
						tmpList.clear();
						num2 = num1.charAt(0) + op[a] + num1.charAt(1) + op[b] + num1.charAt(2) + op[c] + num1.charAt(3)
								+ "*";
						for (int j = 0; j < num2.length(); j++) {
							if (String.valueOf(num2.charAt(j)).equals("*")) {
								tmpList.add(num2.substring(idx, j));
								idx = j + 1;
							}
						}
						for (String string : tmpList) {
							if (ans == 0) {
								ans = Integer.parseInt(string);
							} else {
								ans = ans * Integer.parseInt(string);
							}
						}
						sb = new StringBuffer(String.valueOf(num1));
						if (sb.reverse().toString().equals(String.valueOf(ans)) && tmpList.size() > 1) {
							list.add(num1);
						}
					}
				}
			}
		}
		for (String string : list) {
			System.out.println(string);
		}
	}
}