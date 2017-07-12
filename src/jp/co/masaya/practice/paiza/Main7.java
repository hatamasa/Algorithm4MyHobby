package jp.co.masaya.practice.paiza;

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();// 人参個数
		int S = sc.nextInt();// 質量基準値
		int p = sc.nextInt();// 質量誤差
		int maxM = 0;
		int tmpM, tmpS;
		int maxNo = 0;
		for (int i = 1; i <= N; i++) {
			tmpM = sc.nextInt();
			tmpS = sc.nextInt();
			// 糖分が範囲内、かつ質量が大きい
			if (S - p <= tmpS && S + p >= tmpS && tmpM > maxM) {
				maxM = tmpM;
				maxNo = i;
			}
		}
		if (maxNo == 0) {
			System.out.println("not found");
		} else {
			System.out.println(maxNo);
		}
	}
}
