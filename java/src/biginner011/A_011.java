package biginner011;

import java.util.Scanner;

public class A_011 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	// ここにコードを書く

	int N = sc.nextInt();
	if (N == 12)
	    N = 1;
	else
	    N++;

	System.out.println(N);

	sc.close();
    }
}
