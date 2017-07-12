package jp.co.masaya.practice.chapter1;

import java.util.ArrayList;
import java.util.List;

public class Q9 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		int boys = 20;
		int girls = 10;

		ArrayList<List> girlsList = new ArrayList<List>();
		for (int i = 0; i <= girls; i++) {
			ArrayList tmpList = new ArrayList<Integer>();
			for (int j = 0; j <= boys; j++) {
				tmpList.add(0);
			}
			girlsList.add(tmpList);
		}

		girlsList.get(0).set(0,1);// 始点に1
		for (int i = 0; i < girls + 1; i++) {
			for (int j = 0; j < boys + 1; j++) {
				if (i != j && girls - i != boys - j) {
					if (i > 0) {
						girlsList.get(i).set(j,
								(Integer) girlsList.get(i).get(j) + (Integer) girlsList.get(i - 1).get(j));// 下の要素を追加
					}
					if (j > 0) {
						girlsList.get(i).set(j,
								(Integer) girlsList.get(i).get(j) + (Integer) girlsList.get(i).get(j - 1));// 左の要素を追加
					}
				}
			}
		}
		System.out.println((Integer) girlsList.get(girls).get(boys - 1) + (Integer) girlsList.get(girls - 1).get(boys));
	}
}
