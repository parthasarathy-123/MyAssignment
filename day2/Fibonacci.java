package week1.day2;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int inputrange =8;
		
		int firstno=3;
		int secondno=0;
		int sum;
		System.out.println(firstno);
		
		for (int i=1; i<inputrange-1; i++) {
			sum=firstno+secondno;
			secondno = sum;
			System.out.println(sum);
		}
		

	}

}
