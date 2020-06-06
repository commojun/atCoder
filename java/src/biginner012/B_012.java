package biginner012;

import java.util.Scanner;

public class B_012 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();


		int sec = input % 60;
		int min = input % (60*60) / 60;
		int hour = input / (60*60);

		System.out.println(String.format("%1$02d:%2$02d:%3$02d", hour, min, sec));

		sc.close();
	}
}
