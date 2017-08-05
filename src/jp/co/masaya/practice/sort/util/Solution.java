package jp.co.masaya.practice.sort.util;

import java.util.ArrayList;

public class Solution {
	int solution(int[] A) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : A) {
			list.add(i);
		}
		int N = A.length;
		int result = 0;
		int first, last;
		for (int i = 0; i < N; i++) {
			first = list.indexOf(i);
			last = list.lastIndexOf(i);
			result = Math.max(result, Math.abs(first - last));
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = { 4, 6, 2, 2, 6, 6, 1 };
		s.solution(A);
	}
}
