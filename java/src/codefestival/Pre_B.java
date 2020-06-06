package codefestival;

import java.util.Scanner;

public class Pre_B {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ここにコードを書く
		String A = sc.next();
		long B = sc.nextLong();

		int offset = (int)(B%(A.length()));

		if(offset == 0) offset = A.length();

		System.out.println(A.charAt(offset - 1));

		sc.close();
	}
}
