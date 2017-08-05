package jp.co.masaya.practice.sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import jp.co.masaya.practice.sort.util.SortUtil;

public class ShellSort {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {// ソート対象のリストを初期化
			list.add(sc.nextInt());
		}

		int m;
		int x;
		for (int y = 2; y <= list.size(); y = 2 * y) {
			x = list.size() / y; // 組数
			for (int i = 0; i < list.size() - x; i++) {// 移動対象のインデックス
				m = i;
				while (0 <= m && list.get(m) > list.get(m + x)) {
					SortUtil.swap(list, m, m + x);
					m--;
				}
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
		sc.close();
	}
}