package biginner013;

import java.util.Scanner;

public class Biginner013_B {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int numA = sc.nextInt();
		int numB = sc.nextInt();

		int diff = Math.abs(numA - numB);

		int dist = 0;
		if(diff > 5) dist = 10 -  diff ;
		else dist = diff;

		System.out.println(dist);

		sc.close();
//		helloB
	}
}
