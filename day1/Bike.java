package week1.day1;


public class Bike {
	public void applybreak() {
		System.out.println("apply Break");
	}
	public void soundhorn() {
		System.out.println("soundhorn");
	}

	public static void main(String[] args) {
		Car1 working=new Car1();
		
		working.applybreak();
		working.soundhorn();
		
		Bike function=new Bike();
		
		function.applybreak();
		function.soundhorn();

	}

}
