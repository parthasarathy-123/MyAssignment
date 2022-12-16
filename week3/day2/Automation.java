package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation Details=new Automation();
		Details.ruby();
		Details.java();
		Details.python();

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");

	}

}
