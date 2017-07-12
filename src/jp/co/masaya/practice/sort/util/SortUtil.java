package jp.co.masaya.practice.sort.util;
import java.util.ArrayList;

public class SortUtil {
	/**
	 * listのaの値とbの値を交換する
	 *
	 * @param list
	 * @param a
	 *            交換対象のインデックス1
	 * @param b
	 *            交換対象のインデックス2
	 */
	public static void swap(ArrayList<Integer> list, int a, int b) {
		int t = list.get(a);// 交換する値を記憶
		list.set(a, list.get(b)); //
		list.set(b, t);// 比較対象を先頭に
	}
}
