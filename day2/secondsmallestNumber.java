package week1.day2;

import java.util.Arrays;

public class secondsmallestNumber {

	public static void main(String[] args) {
		int[] arr = {23,10,45,67,32,89,22};
		
		Arrays.sort(arr);
		
		System.out.println("second smallest number in the array is:" +arr[1]);

	}

}
