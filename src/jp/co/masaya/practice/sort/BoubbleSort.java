package jp.co.masaya.practice.sort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BoubbleSort {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {// ソート対象のリストを初期化
			list.add(sc.nextInt());
		}

		int t = 0;
		for (int a = 0; a < n; a++) {
			for (int i = a + 1; i < n; i++) {
				if (list.get(a) < list.get(i)) {
					t = list.get(i);
					list.set(i, list.get(a));
					list.set(a, t);// 比較対象を先頭に
				}
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}