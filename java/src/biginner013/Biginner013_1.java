package biginner013;
import java.util.Scanner;

public class Biginner013_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		String[] alphabets = new String[]{"A", "B", "C", "D", "E"};

		//出力する番号
		int num = -1;

		for(int i=0; i<alphabets.length; i++){
			if(s.equals(alphabets[i])){
				num = i+1;
				break;
			}
		}
		System.out.println(num);

		sc.close();
	}
}
