package jp.co.masaya.practice.chapter1;

public class Q6 {

	public static void main(String[] args) {
		int max = 10000;
		int a = 0;
		int cnt = 0;
		boolean flg;
		for (int i = 2; i <= max; i += 2) {
			a = i * 3 + 1;
			flg = true;
			while (flg) {
				if (a == i) {
					flg = false;
					cnt++;
				} else if (a == 1) {
					flg = false;
				} else if (a != 1) {
					a = (a % 2 == 0) ? a / 2 : a * 3 + 1;
				}
			}
		}
		System.out.println(cnt);
	}
}