package week3.day1;

public class ReverseName {

	public static void main(String[] args) {
		String name="Parthasarathy";
		int length=name.length();
		System.out.println(length);
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		
		for (int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]+" ");
			
		}

	}

}
