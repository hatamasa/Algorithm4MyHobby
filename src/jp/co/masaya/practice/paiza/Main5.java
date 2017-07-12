package jp.co.masaya.practice.paiza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String NM[] = sc.nextLine().split(" ");
		int N = Integer.parseInt(NM[0]);// 茂み数
		int M = Integer.parseInt(NM[1]);// ウサギ
		int K = Integer.parseInt(NM[2]);// 回数
		// ウサギ位置初期化
		List list = new ArrayList<Integer>(N);
		for (int i = 0; i < N; i++) {
			list.add(0);
		}
		for (int i = 0; i < M; i++) {
			list.set(sc.nextInt() -1 , i + 1);
		}
		int index = 0;
		// K回目のジャンプ
		for (int i = 0; i < K; i++) {
			for (int a = 1; a <= M; a++) {
				// ウサギごとにジャンプ
				// a番のウサギがいる位置 list.indexOf(a)
				for (int b = 1; b <= list.size(); b++) {
					if (list.indexOf(a)+b < list.size() && (int) list.get(list.indexOf(a) + b) == 0) {
						// a番のウサギをジャンプ
						list.set(list.indexOf(a) + b, a);
						list.set(list.indexOf(a), 0);
						break;
					}else if(list.indexOf(a)+b  >= list.size()){
						int idx = 0;
						for(int c = 0;c < list.indexOf(a); c++){
							if((int)list.get(c) == 0){
								// a番のウサギをジャンプ
								idx = list.indexOf(a);
								list.set(c, a);
								list.set(idx, 0);
								break;
							}
						}
						break;
					}
				}
			}
		}
		for (int i = 1; i <= M; i++) {
			System.out.println(list.indexOf(i)+1);
		}
	}
}