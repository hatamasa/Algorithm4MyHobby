package jp.co.masaya.practice.paiza;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String NM[] = sc.nextLine().split(" ");
		int N = Integer.parseInt(NM[0]);// 会員数
		int M = Integer.parseInt(NM[1]);// 開催回数
		int sumDayCost = 0;
		int dayCost;
		if (N * M != 0) {
			for (int i = 0; i < M; i++) {
				// 会員毎コストリスト
				String nCosts[] = sc.nextLine().split(" ");
				dayCost = 0;
				for (int b = 0; b < nCosts.length; b++) {
					dayCost = dayCost + Integer.parseInt(nCosts[b]);
				}
				if (dayCost > 0) {
					sumDayCost = sumDayCost + dayCost;
				}
			}
		}
		System.out.println(sumDayCost);
	}
}