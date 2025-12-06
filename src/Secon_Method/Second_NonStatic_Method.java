package Secon_Method;

public class Second_NonStatic_Method {

	public void test1() {
		System.out.println("Method will execute only when we call it.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second_NonStatic_Method a1 = new Second_NonStatic_Method();
		a1.test1(); //method will execute only when we call it.
		
	}
}

