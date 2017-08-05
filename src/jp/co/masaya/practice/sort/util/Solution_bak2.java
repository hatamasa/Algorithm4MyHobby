package jp.co.masaya.practice.sort.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution_bak2 {
	public int solution(String S) {
		int cnt = 0;
		String strS = "";
		boolean b = false;
		// 文字数
		for (int i = 1; i <= S.length(); i++) {
			// インデックス
			for (int j = 0; j <= S.length() - i; j++) {
				strS = S.substring(j, j + i);
				Pattern p = Pattern.compile("[^0-9][a-z]*[A-Z]+[a-z]*");
				Matcher m = p.matcher(strS);
				b = m.matches();
				if (b) {
					cnt = i;
				}
			}
		}
		System.out.println(cnt);
		if (cnt == 0) {
			return -1;
		} else {
			return cnt;
		}

	}

	public static void main(String[] args) {
		Solution_bak2 sol = new Solution_bak2();
		sol.solution("a0BassFsss");
	}

}
