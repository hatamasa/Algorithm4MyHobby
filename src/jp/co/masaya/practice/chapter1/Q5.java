package jp.co.masaya.practice.chapter1;

import java.util.ArrayList;

public class Q5 {

	static int cnt = 0;

	public static void main(String[] args) {
		int money = 1000;
		int coinsInt[] = { 500, 100, 50, 10 };
		int maxCoins = 15;
		ArrayList<Integer> coinslist = new ArrayList<Integer>();
		for (int i = 0; i < coinsInt.length; i++) {
			coinslist.add(coinsInt[i]);
		}

		change(money, coinslist, maxCoins);

		// int cnt = 0;
		// for (int a = 0; a <= maxCoins; a++) {
		// for (int b = 0; b <= maxCoins; b++) {
		// for (int c = 0; c <= maxCoins; c++) {
		// for (int d = 0; d <= maxCoins; d++) {
		// if (a + b + c + d <= maxCoins
		// && coins[0] * a + coins[1] * b + coins[2] * c + coins[3] * d ==
		// money) {
		// cnt++;
		// } else if (a + b + c + d > maxCoins) {
		// break;
		// }
		// }
		// }
		// }
		// }
		System.out.println(cnt);
	}

	static void change(int money, ArrayList<Integer> coins, int maxCoins) {
		int coin = coins.get(0);
		coins.remove(0);
		if (coins.size() == 0) {
			if (money / coin <= maxCoins)
				cnt++;
		} else {
			for (int i = 0; i <= money/coin; i++) {
				change(money - coin * i, (ArrayList<Integer>) coins.clone(), maxCoins - i);
			}
		}
	}
}