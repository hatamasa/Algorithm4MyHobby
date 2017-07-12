package jp.co.masaya.practice.chapter1;

public class Q4 {

	public static void main(String[] args) {

		int n = 100;// 元棒の長さ
		int m = 5;// 人数
		int current = 1;// 現在の棒の本数
		int cnt = 0;// 切った回数累計
		while (current < n) {
			if (current < m) {
				current = current * 2;
			} else {
				current = current + m;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}