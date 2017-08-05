package jp.co.masaya.practice.sort.util;

public class Solution_bak1 {
	public void solution(int N) {
		// write your code in Java SE 8
		String str;
		for (int i = 1; i <= N; i++) {
			str = "";
			if (i % 3 == 0) str += "Fizz";
			if (i % 5 == 0) str += "Buzz";
			if (i % 7 == 0) str += "Woof";
			if(str.equals("")){
				System.out.println(i);
			}else{
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		Solution_bak1 sol = new Solution_bak1();
		sol.solution(24);
	}

}
