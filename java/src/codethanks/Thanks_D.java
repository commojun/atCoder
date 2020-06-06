package codethanks;

import java.util.Scanner;

public class Thanks_D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ここにコードを書く

		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] shitumon = new int[4];

		for (int i = 0; i < Q; i++) {
			shitumon[0] = sc.nextInt();
			shitumon[1] = sc.nextInt();
			shitumon[2] = sc.nextInt();
			shitumon[3] = sc.nextInt();
			System.out.println(outPut(shitumon));
		}
		
		
		sc.close();
	}

	
	public static int outPut(int[] shitumon){
		//全部金かかる
		if(shitumon[1] <= shitumon[2] || shitumon[3] <= shitumon[0]){
			return (shitumon[3] - shitumon[2])*100;
		}
		//金かからない
//		else if(shitumon[0] <= shitumon[2] && shitumon[3] <= shitumon[1]){
//			return 0;
//		}
		//ちょいかかる
		else{
			int total = 0;
			if(shitumon[1] < shitumon[3]) total += (shitumon[3] - shitumon[1]);
			if(shitumon[2] < shitumon[0]) total += (shitumon[0] - shitumon[2]);
			return total*100;
		}
		
	}
}
