package jp.co.masaya.practice.paiza;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ポケット数
		int m = sc.nextInt();// 指定の数
		int i = (m - 1) / (2 * n);// 指定の数の前に何ページあるか
		System.out.println((2 * n + 1) + 4 * n * i - m);
		sc.close();
	}
}
