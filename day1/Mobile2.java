package week1.day1;

public class Mobile2 {

		String Mobilemodel="Vivo";
		Float MobileWeight=50.70f;
		Boolean Fullchared= true;
		int Mobilecost= 18000 ;
		
   public void makecall() {
		System.out.println("Make call");
		}
   public void sendsms() {
	   System.out.println("sendsms");
   }
   
   public static void main(String[] args) {
	   Mobile2 details=new Mobile2();
	     details.makecall();
	     details.sendsms();
	     System.out.println(details.Mobilemodel);
	     System.out.println(details.MobileWeight);
	     System.out.println(details.Fullchared);
	     System.out.println(details.Mobilecost);
	     System.out.println("This is My mobile");
	     
	   
   }

	

		
	}


