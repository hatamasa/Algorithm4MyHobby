package jp.co.masaya.practice.chapter1;

public class Q1 {
	public static void main(String[] args) {
		int n10 = 11;
		StringBuffer sb = new StringBuffer(String.valueOf(n10));
		StringBuffer sb1 = new StringBuffer(Integer.toBinaryString(n10));
		StringBuffer sb2 = new StringBuffer(Integer.toOctalString(n10));
		while (true) {
			if(String.valueOf(n10).equals(sb.reverse().toString()) && sb1.toString().equals(sb1.reverse().toString())
					&& sb2.toString().equals(sb2.reverse().toString())){
				break;
			}
			n10 += 2;
			sb = new StringBuffer(String.valueOf(n10));
			sb1 = new StringBuffer(Integer.toBinaryString(n10));// 2進数
			sb2 = new StringBuffer(Integer.toOctalString(n10));// 8進数
		}
		System.out.println(n10);
	}
}