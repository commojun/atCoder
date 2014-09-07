package com.commojun.biginner013;

import java.util.Scanner;




public class Biginner013_D {

	private static int vart;
	private static int horz;
	private static int loop;
	private static int[] amida;

	private static int goAmida(int start, int loopNum){
		int curLine = start;
		for(int i=0; i< horz; i++){
			if(curLine == amida[i]){
				curLine++;
			}else if(curLine == amida[i]+1){
				curLine--;
			}
		}
		if(loopNum >1) return goAmida(curLine, loopNum-1);
		else return curLine;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		vart = sc.nextInt();
		horz = sc.nextInt();
		loop = sc.nextInt();
		amida = new int[horz];
		for(int i=0; i<horz; i++){
			amida[i] = sc.nextInt();
		}

		for(int i=0; i<vart; i++){
			System.out.println(goAmida(i+1, loop));
		}

//		hello

		sc.close();
	}
}
