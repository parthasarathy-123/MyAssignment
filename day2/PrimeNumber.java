package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 1120;
		Boolean flag = false;;
		int num=input/2;
		
		for(int i=2;i<=num;i++) {
			if(input%1==0) {
				flag = true;
				
				System.out.println("The flag is "+flag);
				System.out.println("The Number is not a Prime" + input);
				
				break;
			}
		     else {
				flag = false;
				System.out.println("The flag is"+ flag);
				System.out.println("The Number is Prime" + input);
				break;
					
				}
			}
		
			

	}

}
