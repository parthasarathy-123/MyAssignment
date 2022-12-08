package week1.day2;

import java.util.Arrays;

public class Findminmax { 

	public static void main(String[] args) {
	   int[] numbers= {22,3981,-19,82,0,45,37};
	   int length=numbers.length;
	   
	Arrays.sort(numbers);
	for(int i=0;i<=length;i++) {
		if(i==numbers[0]);
		System.out.println(numbers[0]+" min");
	    System.out.println(numbers[length-1]+" max");
		}

	
	}
}
