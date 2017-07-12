package jp.co.masaya.practice.chapter2;

public class Q15_2 {

	static int stairCnt = 10;
	static int cnt = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		Q15_2 q = new Q15_2();
		q.move(0, stairCnt);
		System.out.println(cnt);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	void move(int idxA, int idxB) {
		// AがBを超えたら終了
		if (idxA > idxB) {
			return;
		} else if (idxA == idxB) {
			cnt++;
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				// 移動を行う
				move(idxA + i, idxB - j);
			}
		}
	}
}
