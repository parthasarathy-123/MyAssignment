package week1.day2;

public class convertNegativeNOtoPositiveNO {

	public static void main(String[] args) {
	   
		int number= -40;
		int convert;
		if (number<0) {
			System.out.println("Negative Number");
			
		}else {
			System.out.println("Positive Number");
			
		}
      convert = number *(-1);
      System.out.println("Positive Number =" + convert);
      System.out.println("The Number "+ number +" is converted to Positive");
		
		
	}

}
