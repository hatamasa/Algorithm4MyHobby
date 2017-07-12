package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;

public class Q19 {

	static int N = 30;
	static ArrayList<Integer> list;
	static ArrayList<Integer> tmpList;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		boolean flg = true;
		int step = 0;
		while (flg) {
			list = new ArrayList<Integer>();
			// listを初期化。素数以外をつめる
			init();
			tmpList = (ArrayList<Integer>) list.clone();
			// 合成数の公約数を削除
			for (int i = 0; i < list.size(); i++) {
				boolean sFlg = false;
				for (int j = 2; j < i; j++) {
					// 公約数の倍数を削除
					if (list.get(i) % j == 0) {
						for (int n = 1; j * n <= N; n++) {
							if (tmpList.remove((Integer) (j * n)))
								sFlg = true;
						}
					}
				}
				// 1つでも削除されたら1step
				if (sFlg)
					step++;
				// すべて登場したら抜ける
				if (tmpList.size() == 0)
					break;
			}
			if (step >= 6)
				flg = false;
			N++;
		}
		System.out.println(N);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	static void init() {
		// 素数以外をリストにつめる
		for (int i = 2; i <= N; i++) {
			for (int j = 2; j <= N; j++) {
				if (i % j == 0) {
					if (i != j) {
						list.add(i);
						break;
					}
				}
			}
		}
	}

}
