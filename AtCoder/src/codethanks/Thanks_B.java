package codethanks;

import java.util.Scanner;

public class Thanks_B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ここにコードを書く

		int N = sc.nextInt();
		int[] kikai = new int[3];
		kikai[0] = sc.nextInt();
		kikai[1] = sc.nextInt();
		kikai[2] = sc.nextInt();
		
		kikai = sort(kikai);
		
		int total = 0;
		int pointer = 0;
		int jikan = 0;
		while(total < N){
			total += kikai[pointer];
			pointer = (pointer+1)%3;
			jikan++;
		}
		
		System.out.println(jikan);
		
		sc.close();
	}

	public static int[] sort(int[] a) {

		// 最後の要素を除いて、すべての要素を並べ替えます
		for (int i = 0; i < a.length - 1; i++) {

			// 下から上に順番に比較します
			for (int j = a.length - 1; j > i; j--) {

				// 上の方が大きいときは互いに入れ替えます
				if (a[j] > a[j - 1]) {
					int t = a[j];
					a[j] = a[j - 1];
					a[j - 1] = t;
				}
			}
		}
		return a;
	}
}
