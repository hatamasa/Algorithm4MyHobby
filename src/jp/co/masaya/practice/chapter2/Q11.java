package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;

public class Q11 {

	static long tmp = 0;
	static int cnt = 10;

	public static void main(String[] args) {
		ArrayList<Long> fList = new ArrayList<>();
		ArrayList<Long> ansList = new ArrayList<>();

		// フィボナッチ数列の初期値を追加
		fList.add((long) 1);
		fList.add((long) 1);

		addList(fList, ansList, 2);

		for (Long l : ansList) {
			System.out.println(l + " ");
		}
	}

	public static void addList(ArrayList<Long> fList, ArrayList<Long> ansList, int i) {
		if (ansList.size() > cnt) {
			return;
		} else {
			// 数列の先を求める
			fList.add(fList.get(i - 1) + fList.get(i - 2));
			tmp = 0;
			// 求めた数字の各行の数字の和を求める
			for (int j = 0; j < String.valueOf(fList.get(i)).length(); j++) {
				tmp += Integer.parseInt(String.valueOf(fList.get(i)).substring(j, j + 1));
			}
			// 割り切れる場合ansListに格納
			if (fList.get(i) % tmp == 0) {
				ansList.add(fList.get(i));
			}
			// 添え字+1で再帰呼び出し
			addList(fList, ansList, i + 1);
		}
	}
}
