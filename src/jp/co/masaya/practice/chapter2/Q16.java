package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;
import java.util.List;

public class Q16 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n = 1;
		int cnt = 0;
		ArrayList<Integer> large;
		ArrayList<List> ratioLog = new ArrayList<List>();
		ArrayList<Double> tmp;
		ArrayList<Double> tmpLog;
		// 正方形を作れる長さのみ捜査。
		// n=1辺の長さ
		while (4 * n <= 500) {
			// 長方形の面積パターンを格納するリスト
			large = new ArrayList<Integer>();
			tmp = new ArrayList<Double>();
			tmpLog = new ArrayList<Double>();
			for (int i = 1; i < n; i++) {
				large.add((n - i) * (n + i));
				tmp.add((double) (n - i) / (n + i));
			}
			// 正方形の面積と、2つの長方形の面積の和を比較
			for (int i = 0; i < large.size(); i++) {
				for (int j = 0; j < large.size(); j++) {
					if (n * n == large.get(i) + large.get(j)) {
						// 組み合わせが過去にあったか確認
						boolean flg = true;
						for (List list : ratioLog) {
							if (list.contains(tmp.get(i)) && list.contains(tmp.get(j))) {
								flg = false;
								break;
							}
						}
						if (flg) {
							cnt++;
							tmpLog.add(tmp.get(i));
							tmpLog.add(tmp.get(j));
							ratioLog.add(tmpLog);
						}
					}
				}
			}
			n++;
		}
		System.out.println(cnt);
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}
}
