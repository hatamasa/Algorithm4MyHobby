package jp.co.masaya.practice.paiza;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nT[] = sc.nextLine().split(" ");
		int n = Integer.parseInt(nT[0]);// 暗号回数
		String T = nT[1];// 置換リスト
		String S = sc.nextLine();// 暗号化文字列
		String abc = "abcdefghijklmnopqrstuvwxyz";
		String tmp = "";
		for (int i = 0; i < n; i++) {
			String ans = "";
			for (int j = 0; j < S.length(); j++) {
				tmp = String.valueOf(S.charAt(j));
				if (!tmp.trim().isEmpty())
					tmp = String.valueOf(abc.charAt(T.indexOf(tmp)));
				ans += tmp;
			}
			S = ans;
		}
		System.out.println(S);
		sc.close();
	}
}
