package jp.co.masaya.practice.paiza;

import java.util.Scanner;

public class BeamRefrection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tmp = sc.nextLine().split(" ");
		int H = Integer.parseInt(tmp[0]);// 縦
		int W = Integer.parseInt(tmp[1]);// 横
		String[][] hLine = new String[H][W];
		for (int i = 0; i < H; i++) {
			hLine[i] = sc.nextLine().split("");
		}
		boolean flg = true;
		boolean swichFlg = true;
		String swich = "x";
		int xy[] = { 0, 0 };
		int cnt = 1;
		while (flg) {
			if (hLine[xy[1]][xy[0]].equals("_")) {
				if (swich.equals("x")) {
					xy[0] = (swichFlg) ? xy[0] + 1 : xy[0] - 1;// x方向へ移動
				} else if (swich.equals("y")) {
					xy[1] = (swichFlg) ? xy[1] + 1 : xy[1] - 1;// y方向へ移動
				}
			} else if (hLine[xy[1]][xy[0]].equals("\\")) {
				if (swich.equals("x")) {
					swich = "y";
					xy[1] = (swichFlg) ? xy[1] + 1 : xy[1] - 1;
				} else if (swich.equals("y")) {
					swich = "x";
					xy[0] = (swichFlg) ? xy[0] + 1 : xy[0] - 1;
				}
			} else if (hLine[xy[1]][xy[0]].equals("/")) {
				if (swich.equals("x")) {
					swich = "y";
					xy[1] = (swichFlg) ? xy[1] - 1 : xy[1] + 1;
				} else if (swich.equals("y")) {
					swich = "x";
					xy[0] = (swichFlg) ? xy[0] - 1 : xy[0] + 1;
				}
				swichFlg = !swichFlg;
			}
			// 枠外に出た
			if (xy[0] < 0 || xy[1] < 0 || xy[0] > W - 1 || xy[1] > H - 1) {
				flg = false;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
