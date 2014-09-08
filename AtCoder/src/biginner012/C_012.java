package biginner012;

import java.util.Scanner;

public class C_012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int diff = 2025 - N;

		for(int i=1; i<10; i++){
		    if(diff % i == 0 && diff / i < 10) System.out.println(String.valueOf(i) + " x " + String.valueOf(diff / i));
		}


		sc.close();
	}
}
