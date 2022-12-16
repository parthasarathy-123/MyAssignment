package week3.day1;

public class Students {

	public  void getStudentinfo(int i) {
		System.out.println("Student Id="+ i);
	}
	public  void getStudentinfo(int id,String Name) {
		System.out.println("Student Id+"+ id);
		System.out.println("Student Name+"+ Name);
		
	}
	public  void getStudentinfo(String email, String Phone) {
		System.out.println("Student email="+ email);
		System.out.println("Student Phone="+ Phone);
		
	}
	public static void main(String[] args)  {
	     Students Info = new Students();
	     Info.getStudentinfo(1234);
	     Info.getStudentinfo(1234 , "sarathy");
	     Info.getStudentinfo("sarathy@gmail.com", "7397638217");
	}
}
