package jp.co.masaya.practice.chapter2;

public class Q15 {

	static int stairCnt = 10;
	static int stairs[] = new int[stairCnt + 1];
	static int cnt = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < stairs.length; i++) {
			stairs[i] = 0;
		}
		// 上下に配置
		stairs[0] = 1;
		stairs[stairs.length - 1] = 1;

		upStairsA(0, stairs.length - 1);
		System.out.println(cnt);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

	static void upStairsA(int idxA, int idxB) {
		// AがBを超えたら終了
		if (idxA > idxB)
			return;
		int nextIdxA;
		for (int i = 1; i <= 4; i++) {
			// 移動を行う
			stairs[idxA] -= 1;
			nextIdxA = (idxA + i <= stairs.length - 1) ? idxA + i : stairs.length - 1;
			stairs[nextIdxA] += 1;
			downStairsB(nextIdxA, idxB);
			// 移動前に戻す
			stairs[nextIdxA] -= 1;
			stairs[idxA] += 1;
		}
	}

	static void downStairsB(int idxA, int idxB) {
		if (idxA > idxB)
			return;
		int nextIdxB;
		for (int i = 1; i <= 4; i++) {
			stairs[idxB] -= 1;
			nextIdxB = (idxB - i >= 0) ? idxB - i : 0;
			stairs[nextIdxB] += 1;
			if (stairs[nextIdxB] == 2) {
				cnt++;
			} else {
				upStairsA(idxA, nextIdxB);
			}
			stairs[nextIdxB] -= 1;
			stairs[idxB] += 1;
		}
	}

}
