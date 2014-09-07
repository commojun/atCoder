package com.commojun.biginner013;

import java.util.Scanner;

public class Biginner013_C {

	private static int date = 0;
	private static int hungry = 0;
	private static int[] cost = new int[]{0,0,0};
	private static int[] cal = new int[]{0,0,0};


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		date = sc.nextInt();
		hungry = sc.nextInt();
		cost[0] = sc.nextInt();
		cal[0] = sc.nextInt();
		cost[1] = sc.nextInt();
		cal[1] = sc.nextInt();
		cal[2] = sc.nextInt();

		Long minCost = Long.MAX_VALUE;

		for(int num_eat =0; num_eat<=date; num_eat++){
			int num_fast = date - num_eat;
			for(int num_cheap=num_eat; num_cheap>=0; num_cheap--){
				int num_normal = num_eat - num_cheap;
				int survive = hungry + (num_normal*cal[0])
						+ (num_cheap*cal[1])
						- (num_fast*cal[2]);

//				System.out.println(num_eat +":"+ num_normal + ":" + survive);
				if(survive > 0){
					int tmpCost = num_normal*cost[0] + num_cheap*cost[1];
					minCost = Math.min(minCost, tmpCost);
				}
			}
		}

		System.out.println(minCost);


		sc.close();
	}
}
