package jp.co.masaya.practice.paiza;

import java.util.Scanner;

public class Main12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();// 高さ
		int W = sc.nextInt();// 幅
		int N = sc.nextInt();// 個数
		int h_i = 0;// ブロック高さ
		int w_i = 0;// ブロック幅
		int x_i = 0;// ブロック左端からの距離
		String[][] line = new String[H][W];
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				line[i][j] = ".";
			}
		}
		for (int i = 0; i < N; i++) {
			h_i = sc.nextInt();
			w_i = sc.nextInt();
			x_i = sc.nextInt();
			int hCnt = 0;
			int tmpY = 0;
			for (int y = H - 1; y >= 0; y--) {
				for (int x = x_i; x < x_i + w_i; x++) {
					// はまるか確認
					if (line[y][x].equals("#")) {
						tmpY = y + 1;
						y = 0;
						break;
					}
				}
			}
			// ブロックを積み上げる
			for (int y = tmpY; y < H; y++) {
				if (hCnt >= h_i)
					break;
				for (int x = x_i; x < x_i + w_i; x++) {
					line[y][x] = "#";
				}
				hCnt++;
			}
		}
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				System.out.print(line[H - 1 - i][j]);
			}
			System.out.println();
		}
	}
}
