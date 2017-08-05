package jp.co.masaya.practice.sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import jp.co.masaya.practice.sort.util.SortUtil;

public class InsertSort {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {// ソート対象のリストを初期化
			list.add(sc.nextInt());
		}

		int m;
		for (int i = 1; i < list.size(); i++) {// 移動対象のインデックス
			m = i;
			while (0 < m && list.get(m) > list.get(m - 1)) {
				SortUtil.swap(list, m, m - 1);
				m--;
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
		sc.close();
	}
}