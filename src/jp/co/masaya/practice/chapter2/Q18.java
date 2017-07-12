package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;

public class Q18 {

	static boolean flg = false;
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		// 切る個数
		int n = 1;
		while (!flg) {
			n++;
			list.add(1);
			check(n);
			list.clear();
		}
		System.out.println(n);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	static void check(int n) {
		if (list.size() == n) {
			int a = (int) Math.sqrt(list.get(list.size() - 1) + list.get(0));
			double b = Math.sqrt(list.get(list.size() - 1) + list.get(0));
			if (a == b)
				flg = true;
			return;
		}
		for (int i = 2; i <= n; i++) {
			int a = (int) Math.sqrt(list.get(list.size() - 1) + i);
			double b = Math.sqrt(list.get(list.size() - 1) + i);
			if (a == b && !list.contains(i)) {
				list.add(i);
				check(n);
			}
		}
		list.remove(list.size() - 1);
	}
}
