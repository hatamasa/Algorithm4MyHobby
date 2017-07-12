package jp.co.masaya.practice.paiza;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();// 足合計
		int b = sc.nextInt();// 頭合計
		int c = sc.nextInt();// パイザ鶴足数
		int d = sc.nextInt();// パイザ亀足数
		int tsuru = 0;
		int kame = 0;
		int cnt = 0;
		for (int x = 1; x < b; x++) {
			if (c * x + d * (b - x) == a && x > 0 && b - x > 0) {
				cnt++;
				tsuru = x;
				kame = b - tsuru;
			}
		}
		if (cnt == 1) {
			System.out.println(tsuru + " " + kame);
		} else {
			System.out.println("miss");
		}
	}
}
