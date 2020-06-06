package biginner011;

import java.util.Scanner;

public class B_011 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	// ここにコードを書く
	String S = sc.next();

	S = S.substring(0, 1).toUpperCase() + S.substring(1).toLowerCase();

	System.out.println(S);

	sc.close();
    }
}
