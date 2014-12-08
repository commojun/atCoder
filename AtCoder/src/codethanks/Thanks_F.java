package codethanks;

import java.util.ArrayList;
import java.util.Scanner;

public class Thanks_F {
	public static ArrayList<Integer> sup;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ここにコードを書く

		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] info = new int[M][2];
		sup = new ArrayList<Integer>();
		for (int i=0; i<M; i++){
			info[i][0] = sc.nextInt();
			info[i][1] = sc.nextInt();
		}
		
		chk(info, 1);
		
		System.out.println(sup.size() + 1);

		
		sc.close();
	}
	
	public static int chk(int[][] info, int num){
		for(int i=0; i<info.length; i++){
			if(info[i][1] == num &&
					!sup.contains(Integer.valueOf(info[i][0]))){
				sup.add(info[i][0]);
				//System.out.println("add" + info[i][0]);
				chk(info, info[i][0]);
			}
		}
		return 0;
	}
}
