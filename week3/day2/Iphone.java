package week3.day2;

public class Iphone extends Abstract implements Mobile,Mobilecost {

	public static void main(String[] args) {
		Iphone Details=new Iphone();
		Details.SendSMS();
		Details.Switchon();
		Details.Dialno();
		Details.touchpad();
		Details.makeCall();
		Details.cost();
		Details.Tax();

	}

	public void cost() {
		System.out.println("multi interface class checked==55k cost");
		
	}

	public void Tax() {
		System.out.println("multi interface class checked==12%");		
	}

	public void SendSMS() {
		System.out.println("SMS Sent");
		
	}

	public void Dialno() {
		System.out.println("No is Dialled");
	}

	public void Switchon() {
		System.out.println("Switch On");	
	}

	@Override
	public void touchpad() {
		System.out.println("Touchpad is working");
		
		
	}

}
