package jp.co.masaya.practice.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q13 {

	static int A, D, E, I, K, L, R, S, T, W, x1, x2, x3, x4;
	static int cnt = 0;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<String> list1, list2;
		// D E Kの取り得る値
		for (int n = 12; n <= 987; n++) {
			list1 = new ArrayList<String>(Arrays.asList(String.format("%03d", n).split("")));
			list2 = new ArrayList<String>(new HashSet<>(list1));
			if (list1.size() != list2.size())
				continue;
			D = Integer.parseInt(list1.get(0));
			E = Integer.parseInt(list1.get(1));
			K = Integer.parseInt(list1.get(2));
			// D+E+K = x1*10 + L
			L = (D + E + K) % 10;
			if ((D != L || E != L || K != L)) {
				x1 = (D + E + K) / 10;
				// A T の取り得る値
				for (int i = 1; i <= 98; i++) {
					list1 = new ArrayList<String>(Arrays.asList(String.format("%02d", i).split("")));
					list2 = new ArrayList<String>(new HashSet<>(list1));
					if (list1.size() != list2.size())
						continue;
					A = Integer.parseInt(list1.get(0));
					T = Integer.parseInt(list1.get(1));
					if (A == D || A == E || A == K || A == L || T == 0 || T == D || T == E || T == K || T == L)
						continue;
					// X1+A+T+L = X2*10+L
					x2 = (x1 + A + T + L) / 10;
					if ((x1 + A + T + L == x2 * 10 + L)) {
						// I の取り得る値
						for (int j = 0; j < 10; j++) {
							I = j;
							if (I == D || I == E || I == K || I == L || I == A || I == T)
								continue;
							// X2+E+I+A = X3*10+I
							x3 = (x2 + E + I + A) / 10;
							if (x2 + E + I + A == x3 * 10 + I) {
								// R の取り得る値
								for (int p = 1; p < 10; p++) {
									R = p;
									if (R == D || R == E || R == K || R == L || R == A || R == T || R == I)
										continue;
									// X3+R+R+T = x4*10+K
									x4 = (x3 + R + R + T) / 10;
									if (x3 + R + R + T == x4 * 10 + K) {
										// W の取り得る値
										for (int q = 1; q < 9; q++) {
											W = q;
											S = x4 + W;
											if (!(W == D || W == E || W == K || W == L || W == A || W == T || W == I
													|| W == R || S == 0 || S == 10 || S == D || S == E || S == K
													|| S == L || S == A || S == T || S == I || S == R || S == W)) {
//												int read = Integer.parseInt(R + "" + E + "" + A + "" + D);
//												int write = Integer.parseInt(W + "" + R + "" + I + "" + T + "" + E);
//												int talk = Integer.parseInt(T + "" + A + "" + L + "" + K);
//												int skill = Integer.parseInt(S + "" + K + "" + I + "" + L + "" + L);
//												if (read + write + talk == skill)
//													System.out.println(read + "+" + write + "+" + talk + "=" + skill);
												cnt++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(cnt + "通り");
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}
}
