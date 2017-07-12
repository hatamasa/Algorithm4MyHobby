package jp.co.masaya.practice.chapter1;

import java.awt.Point;
import java.util.ArrayList;

public class Q8 {
	static int cnt = 0;
	static ArrayList<Point> choice = new ArrayList<Point>();

	public static void main(String[] args) {
		ArrayList<Point> pList = new ArrayList<Point>();// 通過経路
		choice.add(new Point(0, 1));
		choice.add(new Point(1, 0));
		choice.add(new Point(-1, 0));
		choice.add(new Point(0, -1));
		Point init = new Point(0, 0);
		pList.add(init);
		move(pList, init);
		System.out.println(cnt);
	}

	static void move(ArrayList<Point> pList, Point point) {
		if (pList.size() > 12) {
			cnt++;
			return;
		}
		for (Point p : choice) {
			// 次回位置
			Point nextPoint = (Point) point.clone();
			nextPoint.translate(p.x, p.y);
			if (!pList.contains(nextPoint)) {
				// 通過経路リストを複製して位置を登録
				@SuppressWarnings("unchecked")
				ArrayList<Point> pList2 = (ArrayList<Point>) pList.clone();
				pList2.add(nextPoint);

				move(pList2, nextPoint);
			}
		}
	}
}