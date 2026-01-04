package DesignMethods;

public class Fourth_Design_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourth_Design_Method.test1();
		System.out.println("Main");
		
		Fourth_Design_Method fdm = new Fourth_Design_Method();
		fdm.test2();
		System.out.println("Main End");
	}
	
	public static void test1() {
		System.out.println("Test1 Static method");
	}
	
	public void test2() {
		System.out.println("Test2 Method");
	}

}
