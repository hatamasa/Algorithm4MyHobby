package jp.co.masaya.practice.sort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {// ソート対象のリストを初期化
			list.add(sc.nextInt());
		}

		for (int i = 0; i < n - 1; i++) {
			int m = list.get(i);// 先頭を最大値;
			int t = 0;
			boolean flg = false;
			for (int a = i; a < n; a++) {
				if (m < list.get(a)) {
					m = list.get(a);// 最大値設定;
					t = a;// 最大値の場所
					flg = true;
				}
			}
			if (flg) {
				list.set(t, list.get(i));// 先頭を最大値の位置に
				list.set(i, m);// 最大値を先頭に
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
		sc.close();
	}
}