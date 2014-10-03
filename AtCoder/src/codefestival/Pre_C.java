package codefestival;

import java.util.Scanner;

public class Pre_C {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ここにコードを書く

		double A = sc.nextLong();
		double B = sc.nextLong();

		long num_4m = baisuuCount(A, B, 4);
		long num_100m = baisuuCount(A, B, 100);
		long num_400m = baisuuCount(A, B, 400);

		System.out.println( num_4m - num_100m + num_400m );
		sc.close();
	}

	private static long baisuuCount(double A, double B, int baisuu){
		double A_cail = Math.ceil(A/baisuu);
		double B_floor = Math.floor(B/baisuu);

		return (long)(B_floor - A_cail +1);

	}
}
