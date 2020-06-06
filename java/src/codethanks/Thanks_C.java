package codethanks;

import java.util.Scanner;

public class Thanks_C {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ここにコードを書く

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] scores = new int[N];
		for(int i=0; i<N; i++){
			scores[i] = sc.nextInt();
		}
		
		int[] correct = new int[M];
		for(int i=0; i<M; i++){
			correct[i] = sc.nextInt();
		}
		
		int total = 0;
		for(int i = 0; i < correct.length; i++){
			total += scores[correct[i] - 1];
		}
		
		System.out.println(total);
		
		sc.close();
	}
}
