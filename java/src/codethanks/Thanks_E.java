package codethanks;

import java.util.Arrays;
import java.util.Scanner;

public class Thanks_E {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ここにコードを書く
		int R = sc.nextInt();
		int C = sc.nextInt();
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] st = new int[R][C];
		//初期化
		for(int i=0; i<st.length; i++){
			Arrays.fill(st[i], 0);
		}
		
		int[][] tejun = new int[N][4];
		for(int i=0; i<N; i++){
			tejun[i][0] = sc.nextInt();
			tejun[i][1] = sc.nextInt();
			tejun[i][2] = sc.nextInt();
			tejun[i][3] = sc.nextInt();
			st = move(st, tejun[i]);
			//System.out.println(count(st));
		}
		
		//System.out.println(count(st));
		
		for(int i=0; i<N; i++){
			int count = count(back(st, tejun[i]));
			//System.out.println("tejun" + i + ":" + count);
			if(count == M){
				System.out.println(i+1);
			}
			move(st, tejun[i]);
		}
		
		sc.close();
	}
	
	public static int[][] move(int[][] st, int[] tejun){
		for(int i=tejun[0]-1; i<tejun[1]; i++){
			for(int j=tejun[2]-1; j<tejun[3]; j++){
				st[i][j] = (st[i][j]+1)%4;
			}
		}
		return st;
	}
	
	public static int[][] back(int[][] st, int[] tejun){
		for(int i=tejun[0]-1; i<tejun[1]; i++){
			for(int j=tejun[2]-1; j<tejun[3]; j++){
				st[i][j] = (st[i][j]-1)%4;
			}
		}
		return st;
	}
	
	public static int count(int[][] st){
		int count = 0;
		for(int i=0; i<st.length; i++){
			for(int j=0; j<st[i].length; j++){
				if(st[i][j] == 0) count++;
			}
		}
		return count;
	}
}
