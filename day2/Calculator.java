package week1.day2;

public class Calculator {
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double sub (double d,double e) {
		return d-e;
	}
	public double mul (double p,double q) {
		return p*q;
	}
	public double div (double x,double y) {
		return x/y;
		
	}
	
	public static void main(String[] args) {
		Calculator fun=new Calculator();
		int add = fun.add(33, 30, 39);
		System.out.println(add);
		System.out.println(fun.sub(3, 2));
		System.out.println(fun.mul(40, 30));
		System.out.println(fun.div(100, 10));
		
		

	}

}
