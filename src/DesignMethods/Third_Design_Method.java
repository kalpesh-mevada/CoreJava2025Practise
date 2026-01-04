package DesignMethods;

public class Third_Design_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third_Design_Method tdm1 = new Third_Design_Method();
		System.out.println("Main");
		tdm1.test1();
		
	}
	public void test1() {
		Third_Design_Method tdm2 = new Third_Design_Method();
		tdm2.test2();
		System.out.println("Test1");
	}
	public void test2() {
		System.out.println("Test2");		
	}

}
