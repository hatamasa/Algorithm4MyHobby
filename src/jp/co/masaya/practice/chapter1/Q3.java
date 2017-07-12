package jp.co.masaya.practice.chapter1;

public class Q3 {
	public static void main(String[] args) {
		int[] card = new int[100];
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j < 100;) {
				if (card[j] == 0) {
					card[j] = 1;
				} else {
					card[j] = 0;
				}
				j = j + (i + 1);
			}
		}
		for (int i = 0; i < 100; i++) {
			if (card[i] == 0) {
				System.out.println(i + 1);
			}
		}
	}
}