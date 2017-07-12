package jp.co.masaya.practice.chapter2;

public class Q17 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		int n = 30;
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			cnt = (i == 1) ? n : cnt + n - i;
		}
		System.out.println(cnt);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}
}
