package jp.co.masaya.practice.paiza;
import java.util.Scanner;

/**
 * @author hatamasa 素因数分解アルゴリズム
 */
public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//
		int[] sosu = new int[n];
		setSosu(n, sosu);

		int resultIdx = 0;
		int[] result = new int[n];
		int sosuIdx = 0;
		while (sosuIdx < n) { // 素数で割り切れるかどうか
			if (n % sosu[sosuIdx] == 0) {
				result[resultIdx] = sosu[sosuIdx];
				resultIdx = resultIdx + 1;
				n = n / sosu[sosuIdx]; // 素数で割った結果をnに格納
			} else {
				sosuIdx = sosuIdx + 1; // 割りきれない場合次の素数へ
			}
		}
		for (int i = 0; i < resultIdx; i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}

	static void setSosu(int n, int[] sosu) {
		int[] data = new int[n];
		// 配列を初期化
		for (int i = 0; i < data.length; i++) {
			data[i] = 1;
			sosu[i] = 0;
		}
		int m = 2;
		int s = 0;
		while (m < n) {
			for (int i = 2 * m; i < n;) {
				data[i] = 0; // iの倍数をすべて除去する
				i = i + m; // 次の倍数
			}
			// 結果配列に挿入
			if (data[m] == 1) {
				sosu[s] = m;
				s = s + 1;
			}
			m = m + 1;
		}
	}
}