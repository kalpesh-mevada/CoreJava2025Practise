package ContructorMethod;

public class ConstMethod_C {

	public ConstMethod_C() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstMethod_C cstmthd = new ConstMethod_C();
		cstmthd.test1();
		System.out.println("Main");
		

	}	
	public void test1() {
		System.out.println("Method");
	}
}
