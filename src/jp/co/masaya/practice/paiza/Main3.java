package jp.co.masaya.practice.paiza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pCnt = sc.nextInt();
		int days = sc.nextInt();
		// 商品の価格リスト
		List pPrices = new ArrayList<Integer>();
		for (int i = 0; i < pCnt; i++) {
			pPrices.add(sc.nextInt());
		}
		// 日別キャンペーン価格リスト
		List dayPrices = new ArrayList<Integer>();
		for (int i = 0; i < days; i++) {
			dayPrices.add(sc.nextInt());
		}
		// P_N 2品の組合わせリスト
		List p2Prices = new ArrayList<Integer>();
		for (int i = 0; i < pCnt; i++) {
			for (int n = i + 1; n < pCnt; n++) {
				p2Prices.add((int) pPrices.get(i) + (int) pPrices.get(n));
			}
		}
		int answerPrice;
		for (int i = 0; i < dayPrices.size(); i++) {
			answerPrice = 0;
			for (int n = 0; n < p2Prices.size(); n++) {
				// その日のキャンペーン価格と比較
				if ((int) dayPrices.get(i) >= (int) p2Prices.get(n) && answerPrice <= (int) p2Prices.get(n)) {
					answerPrice = (int) p2Prices.get(n);
				}
			}
			System.out.println(answerPrice);
		}
	}
}
