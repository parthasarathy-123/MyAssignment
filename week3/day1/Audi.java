package week3.day1;

public class Audi extends Car {
	public void AudiInfo() {
		System.out.println("Audi");
	}

	public static void main(String[] args) {
		Vehicle Info = new Vehicle();
		Car category = new Car();
		Audi Details = new Audi();
		
		Details.AudiInfo();
		category.CarClass();
		Info.applybreak();
		Info.soundhorn();

	}

}
