package biginner014;

import java.util.Scanner;

public class A_014 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ここにコードを書く

		int a = sc.nextInt();
		int b = sc.nextInt();

		int answer  = 0;

		if(a-b < 0)
		    answer = b-a;
		else if(a != b)
		    answer = b - (a % b);

		System.out.println(answer);

		sc.close();
	}
}
