package jp.co.masaya.practice.chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10 {
	public static void main(String[] args) {
		ArrayList<Integer> euro = new ArrayList<Integer>(Arrays.asList(0, 32, 15, 19, 4, 21, 2, 25, 17, 34, 6, 27, 13,
				36, 11, 30, 8, 23, 10, 5, 24, 16, 33, 1, 20, 14, 31, 9, 22, 18, 29, 7, 28, 12, 35, 3, 26));

		ArrayList<Integer> american = new ArrayList<Integer>(Arrays.asList(0, 28, 9, 26, 30, 11, 7, 20, 32, 17, 5, 22,
				34, 15, 3, 24, 36, 13, 1, 00, 27, 10, 25, 29, 12, 8, 19, 31, 18, 6, 21, 33, 16, 4, 23, 35, 14, 2));

		int euroSum, ameSum, maxEuro, maxAme;
		int cnt = 0;
		for (int n = 2; n <= 36; n++) {
			maxEuro = 0;
			maxAme = 0;
			for (int i = 0; i < 38; i++) {
				euroSum = 0;
				ameSum = 0;
				for (int j = i; j < i + n; j++) {
					// 合計値を計算
					if (j < euro.size()) {
						euroSum += euro.get(j);
					} else if (j >= euro.size()) {
						euroSum += euro.get(j - euro.size());
					}
					if (j < american.size()) {
						ameSum += american.get(j);
					} else if (j >= american.size()) {
						ameSum += american.get(j - american.size());
					}
				}
				// 最大値を入れ替え
				maxEuro = (maxEuro < euroSum) ? euroSum : maxEuro;
				maxAme = (maxAme < ameSum) ? ameSum : maxAme;
			}
			cnt += (maxEuro < maxAme) ? 1 : 0;
		}
		System.out.println("和が小さくなるnの数: " + cnt);
	}
}
